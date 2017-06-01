package com.hp.jipp.model

import com.hp.jipp.encoding.AttributeGroup
import com.hp.jipp.encoding.AttributeType
import com.hp.jipp.encoding.NameCode
import com.hp.jipp.encoding.NameCodeType
import com.hp.jipp.util.Bytes
import com.hp.jipp.util.ParseError
import com.hp.jipp.encoding.Tag
import com.hp.jipp.util.Pretty
import org.jetbrains.annotations.Nullable

import java.io.DataInputStream
import java.io.DataOutputStream
import java.io.IOException
import java.util.ArrayList
import java.util.HashMap

/**
 * A request packet as specified in RFC2910.
 * @param data Extra data to appear after the packet
 *
 */
data class Packet(val versionNumber: Int = DEFAULT_VERSION_NUMBER, val code: Int, val requestId: Int,
                  val attributeGroups: List<AttributeGroup> = listOf(), @Nullable val data: ByteArray? = null,
                  @Nullable val inputStreamFactory: InputStreamFactory? = null) {

    constructor(code: Code, requestId: Int, vararg groups: AttributeGroup): this(code = code.code, requestId = requestId,
            attributeGroups = listOf(*groups))


    // TODO: Override equals (necessary?)

    /**
     * Return this response packet's Status code
     */
    val status: Status
        get() = getCode(Status.ENCODER)

    /**
     * Return this request packet's Operation code
     */
    val operation: Operation
        get() = getCode(Operation.ENCODER)

    /**
     * Return a NameCode corresponding to this packet's code.
     */
    private fun <T : NameCode> getCode(encoder: NameCodeType.Encoder<T>): T = encoder[code]

    /** Returns the first attribute with the specified delimiter  */
    fun getAttributeGroup(delimiter: Tag): AttributeGroup? {
        return attributeGroups.firstOrNull { it.tag === delimiter }
    }

    /** Return a value from the specified group if present  */
    fun <T> getValue(groupDelimiter: Tag, attributeType: AttributeType<T>): T? =
        getAttributeGroup(groupDelimiter)?.getValue(attributeType)

    fun <T> getValues(groupDelimiter: Tag, attributeType: AttributeType<T>): List<T> =
        getAttributeGroup(groupDelimiter)?.getValues(attributeType) ?: emptyList()

    /** Write the contents of this object to the output stream as per RFC2910  */
    @Throws(IOException::class)
    fun write(out: DataOutputStream) {
        out.writeShort(versionNumber)
        out.writeShort(code)
        out.writeInt(requestId)
        for (group in attributeGroups) {
            group.write(out)
        }
        Tag.EndOfAttributes.write(out)
        if (data != null) {
            out.write(data)
        }

        val factory = inputStreamFactory
        if (factory != null) {
            factory.createInputStream().use { `in` -> Bytes.copy(`in`, out) }
        }
    }

    /** Parses packets  */
    interface Parser {
        @Throws(IOException::class)
        fun parse(`in`: DataInputStream): Packet
    }

    private fun prefix(): String {
        return "Packet(v=x" + Integer.toHexString(versionNumber) +
                " code=" + getCode(Code.ENCODER) +
                " rId=x" + Integer.toHexString(requestId) +
                (if (data == null) "" else ", dLen=" + data.size) +
                (if (inputStreamFactory != null) " stream" else "") +
                ")"
    }

    fun prettyPrint(maxWidth: Int, indent: String): String {
        val printer = Pretty.printer(prefix(), Pretty.OBJECT, indent, maxWidth)
        printer.addAll(attributeGroups)
        return printer.print()
    }

    override fun toString(): String {
        return prefix() + " " + attributeGroups
    }

    fun builder(): Builder = Builder(this)

    class Builder(var code: Int, var requestId: Int) {
        constructor(code: Code, requestId: Int) : this(code.code, requestId)
        constructor(code: Code, requestId: Int, vararg groups: AttributeGroup) : this(code.code, requestId) {
            attributeGroups = listOf(*groups)
        }

        constructor(packet: Packet) : this(packet.code, packet.requestId) {
            versionNumber = packet.versionNumber
            attributeGroups = packet.attributeGroups
            data = packet.data
            inputStreamFactory = packet.inputStreamFactory
        }

        var versionNumber: Int = DEFAULT_VERSION_NUMBER
        var attributeGroups: List<AttributeGroup> = listOf()
        @Nullable var data: ByteArray? = null
        @Nullable var inputStreamFactory: InputStreamFactory? = null

        fun setCode(code: Code) {
            this.code = code.code
        }

        fun setAttributeGroups(vararg groups: AttributeGroup) {
            attributeGroups = listOf(*groups)
        }

        fun build() = Packet(versionNumber, code, requestId, attributeGroups, data, inputStreamFactory)
    }

    companion object {
        /** Default version number to be sent in a packet (0x0101 for IPP 1.1)  */
        val DEFAULT_VERSION_NUMBER = 0x0101

        /** Return a parser with knowledge of specified attribute types  */
        @JvmStatic fun parserOf(attributeTypes: List<AttributeType<*>>): Parser {

            val attributeTypeMap = HashMap<String, AttributeType<*>>()
            for (attributeType in attributeTypes) {
                attributeTypeMap.put(attributeType.name, attributeType)
            }
            return object : Parser {
                @Throws(IOException::class)
                override fun parse(`in`: DataInputStream): Packet {
                    return Packet.read(`in`, attributeTypeMap)
                }
            }
        }

        /**
         * Read the contents of the input stream, returning a parsed Packet or throwing an exception.*
         * Note: the input stream is not closed.
         */
        @Throws(IOException::class)
        private fun read(input: DataInputStream, attributeTypes: Map<String, AttributeType<*>>): Packet {

            val versionNumber = input.readShort().toInt()
            val code = input.readShort().toInt()
            val requestId = input.readInt()

            val builder = Builder(code, requestId)
            builder.versionNumber = versionNumber

            val attributeGroups = ArrayList<AttributeGroup>()
            while (true) {
                val tag = Tag.read(input)
                if (tag === Tag.EndOfAttributes) {
                    if (input.available() > 0) {
                        val data = ByteArray(input.available())
                        input.read(data)
                        builder.data = data
                    }
                    break
                } else if (tag.isDelimiter) {
                    attributeGroups.add(AttributeGroup.read(tag, attributeTypes, input))
                } else {
                    throw ParseError("Illegal delimiter " + tag)
                }
            }
            builder.attributeGroups = attributeGroups
            return builder.build()
        }
    }
}
