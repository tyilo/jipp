// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-06-10
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "destination-uri-ready" collection as defined in:
 * [PWG5100.17](https://ftp.pwg.org/pub/pwg/candidates/cs-ippscan10-20140918-5100.17.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class DestinationUriReady
constructor(
    var destinationAttributes: List<UntypedCollection>? = null,
    var destinationAttributesSupported: List<String>? = null,
    var destinationInfo: String? = null,
    var destinationIsDirectory: Boolean? = null,
    /** May contain any keyword from [DestinationAccesses.Name]. */
    var destinationMandatoryAccessAttributes: List<String>? = null,
    var destinationName: String? = null,
    var destinationOauthScope: List<ByteArray>? = null,
    var destinationOauthToken: List<ByteArray>? = null,
    var destinationOauthUri: java.net.URI? = null,
    var destinationUri: java.net.URI? = null
) : AttributeCollection {

    /** Construct an empty [DestinationUriReady]. */
    constructor() : this(null, null, null, null, null, null, null, null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            destinationAttributes?.let { DestinationUriReady.destinationAttributes.of(it) },
            destinationAttributesSupported?.let { DestinationUriReady.destinationAttributesSupported.of(it) },
            destinationInfo?.let { DestinationUriReady.destinationInfo.of(it) },
            destinationIsDirectory?.let { DestinationUriReady.destinationIsDirectory.of(it) },
            destinationMandatoryAccessAttributes?.let { DestinationUriReady.destinationMandatoryAccessAttributes.of(it) },
            destinationName?.let { DestinationUriReady.destinationName.of(it) },
            destinationOauthScope?.let { DestinationUriReady.destinationOauthScope.of(it) },
            destinationOauthToken?.let { DestinationUriReady.destinationOauthToken.of(it) },
            destinationOauthUri?.let { DestinationUriReady.destinationOauthUri.of(it) },
            destinationUri?.let { DestinationUriReady.destinationUri.of(it) }
        )

    /** Defines types for each member of [DestinationUriReady]. */
    companion object : AttributeCollection.Converter<DestinationUriReady> {
        override fun convert(attributes: List<Attribute<*>>): DestinationUriReady =
            DestinationUriReady(
                extractAll(attributes, destinationAttributes),
                extractAll(attributes, destinationAttributesSupported),
                extractOne(attributes, destinationInfo)?.value,
                extractOne(attributes, destinationIsDirectory),
                extractAll(attributes, destinationMandatoryAccessAttributes),
                extractOne(attributes, destinationName)?.value,
                extractAll(attributes, destinationOauthScope),
                extractAll(attributes, destinationOauthToken),
                extractOne(attributes, destinationOauthUri),
                extractOne(attributes, destinationUri)
            )
        @Deprecated("Remove this symbol")
        @JvmField
        val Types = this
        @JvmField val destinationAttributes = UntypedCollection.SetType("destination-attributes")
        @JvmField val destinationAttributesSupported = KeywordType.Set("destination-attributes-supported")
        @JvmField val destinationInfo = TextType("destination-info")
        @JvmField val destinationIsDirectory = BooleanType("destination-is-directory")
        @JvmField val destinationMandatoryAccessAttributes = KeywordType.Set("destination-mandatory-access-attributes")
        @JvmField val destinationName = NameType("destination-name")
        @JvmField val destinationOauthScope = OctetsType.Set("destination-oauth-scope")
        @JvmField val destinationOauthToken = OctetsType.Set("destination-oauth-token")
        @JvmField val destinationOauthUri = UriType("destination-oauth-uri")
        @JvmField val destinationUri = UriType("destination-uri")
    }
    override fun toString() = "DestinationUriReady(${attributes.joinToString()})"
}
