// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2022-08-02
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "power-log-col" collection as defined in:
 * [PWG5100.22](https://ftp.pwg.org/pub/pwg/candidates/cs-ippsystem10-20191122-5100.22.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class PowerLogCol
constructor(
    var logId: Int? = null,
    var powerState: String? = null,
    var powerStateDateTime: java.util.Calendar? = null,
    var powerStateMessage: String? = null,
) : AttributeCollection {

    /** Construct an empty [PowerLogCol]. */
    constructor() : this(null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            logId?.let { PowerLogCol.logId.of(it) },
            powerState?.let { PowerLogCol.powerState.of(it) },
            powerStateDateTime?.let { PowerLogCol.powerStateDateTime.of(it) },
            powerStateMessage?.let { PowerLogCol.powerStateMessage.of(it) },
        )

    /** Defines types for each member of [PowerLogCol]. */
    companion object : AttributeCollection.Converter<PowerLogCol> {
        override fun convert(attributes: List<Attribute<*>>): PowerLogCol =
            PowerLogCol(
                extractOne(attributes, logId),
                extractOne(attributes, powerState),
                extractOne(attributes, powerStateDateTime),
                extractOne(attributes, powerStateMessage)?.value,
            )
        override val cls = PowerLogCol::class.java
        @Deprecated("Remove this symbol")
        @JvmField val Types = this
        @JvmField val logId = IntType("log-id")
        @JvmField val powerState = KeywordType("power-state")
        @JvmField val powerStateDateTime = DateTimeType("power-state-date-time")
        @JvmField val powerStateMessage = TextType("power-state-message")
    }
    override fun toString() = "PowerLogCol(${attributes.joinToString()})"
}
