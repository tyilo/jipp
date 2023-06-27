// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2023-03-07
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "job-triggers-supported" collection as defined in:
 * [PWG5100.13](https://ftp.pwg.org/pub/pwg/candidates/cs-ippnodriver20-20230301-5100.13.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class JobTriggersSupported
constructor(
    /** May contain any keyword from [PresetName] or a name. */
    var presetName: KeywordOrName? = null,
) : AttributeCollection {

    /** Construct an empty [JobTriggersSupported]. */
    constructor() : this(null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            presetName?.let { JobTriggersSupported.presetName.of(it) },
        )

    /** Defines types for each member of [JobTriggersSupported]. */
    companion object : AttributeCollection.Converter<JobTriggersSupported> {
        override fun convert(attributes: List<Attribute<*>>): JobTriggersSupported =
            JobTriggersSupported(
                extractOne(attributes, presetName),
            )
        override val cls = JobTriggersSupported::class.java
        @Deprecated("Remove this symbol")
        @JvmField val Types = this
        @JvmField val presetName = KeywordOrNameType("preset-name")
    }
    override fun toString() = "JobTriggersSupported(${attributes.joinToString()})"
}
