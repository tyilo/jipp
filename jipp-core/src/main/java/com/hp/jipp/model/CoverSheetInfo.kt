// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-06-10
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "cover-sheet-info" collection as defined in:
 * [PWG5100.15](https://ftp.pwg.org/pub/pwg/candidates/cs-ippfaxout10-20131115-5100.15.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class CoverSheetInfo
constructor(
    var fromName: String? = null,
    var logo: java.net.URI? = null,
    var message: String? = null,
    var organizationName: String? = null,
    var subject: String? = null,
    var toName: String? = null
) : AttributeCollection {

    /** Construct an empty [CoverSheetInfo]. */
    constructor() : this(null, null, null, null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            fromName?.let { CoverSheetInfo.fromName.of(it) },
            logo?.let { CoverSheetInfo.logo.of(it) },
            message?.let { CoverSheetInfo.message.of(it) },
            organizationName?.let { CoverSheetInfo.organizationName.of(it) },
            subject?.let { CoverSheetInfo.subject.of(it) },
            toName?.let { CoverSheetInfo.toName.of(it) }
        )

    /** Defines types for each member of [CoverSheetInfo]. */
    companion object : AttributeCollection.Converter<CoverSheetInfo> {
        override fun convert(attributes: List<Attribute<*>>): CoverSheetInfo =
            CoverSheetInfo(
                extractOne(attributes, fromName)?.value,
                extractOne(attributes, logo),
                extractOne(attributes, message)?.value,
                extractOne(attributes, organizationName)?.value,
                extractOne(attributes, subject)?.value,
                extractOne(attributes, toName)?.value
            )
        @Deprecated("Remove this symbol")
        @JvmField
        val Types = this
        @JvmField val fromName = TextType("from-name")
        @JvmField val logo = UriType("logo")
        @JvmField val message = TextType("message")
        @JvmField val organizationName = TextType("organization-name")
        @JvmField val subject = TextType("subject")
        @JvmField val toName = TextType("to-name")
    }
    override fun toString() = "CoverSheetInfo(${attributes.joinToString()})"
}
