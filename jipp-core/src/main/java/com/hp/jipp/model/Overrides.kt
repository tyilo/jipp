// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2022-08-02
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "overrides" collection as defined in:
 * [PWG5100.6](https://ftp.pwg.org/pub/pwg/candidates/cs-ipppageoverride10-20031031-5100.6.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class Overrides
constructor(
    var documentCopies: List<IntRange>? = null,
    var documentNumbers: List<IntRange>? = null,
    var pages: List<IntRange>? = null,
) : AttributeCollection {

    /** Construct an empty [Overrides]. */
    constructor() : this(null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            documentCopies?.let { Overrides.documentCopies.of(it) },
            documentNumbers?.let { Overrides.documentNumbers.of(it) },
            pages?.let { Overrides.pages.of(it) },
        )

    /** Defines types for each member of [Overrides]. */
    companion object : AttributeCollection.Converter<Overrides> {
        override fun convert(attributes: List<Attribute<*>>): Overrides =
            Overrides(
                extractAll(attributes, documentCopies),
                extractAll(attributes, documentNumbers),
                extractAll(attributes, pages),
            )
        override val cls = Overrides::class.java
        @Deprecated("Remove this symbol")
        @JvmField val Types = this
        @JvmField val documentCopies = IntRangeType.Set("document-copies")
        @JvmField val documentNumbers = IntRangeType.Set("document-numbers")
        @JvmField val pages = IntRangeType.Set("pages")
    }
    override fun toString() = "Overrides(${attributes.joinToString()})"
}
