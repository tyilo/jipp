// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-06-10
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "job-impressions-col" collection as defined in:
 * [APRIL2015F2F](https://ftp.pwg.org/pub/pwg/ipp/minutes/ippv2-f2f-minutes-20150429.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class JobImpressionsCol
constructor(
    var blank: Int? = null,
    var blankTwoSided: Int? = null,
    var fullColor: Int? = null,
    var fullColorTwoSided: Int? = null,
    var highlightColor: Int? = null,
    var highlightColorTwoSided: Int? = null,
    var monochrome: Int? = null,
    var monochromeTwoSided: Int? = null
) : AttributeCollection {

    /** Construct an empty [JobImpressionsCol]. */
    constructor() : this(null, null, null, null, null, null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            blank?.let { JobImpressionsCol.blank.of(it) },
            blankTwoSided?.let { JobImpressionsCol.blankTwoSided.of(it) },
            fullColor?.let { JobImpressionsCol.fullColor.of(it) },
            fullColorTwoSided?.let { JobImpressionsCol.fullColorTwoSided.of(it) },
            highlightColor?.let { JobImpressionsCol.highlightColor.of(it) },
            highlightColorTwoSided?.let { JobImpressionsCol.highlightColorTwoSided.of(it) },
            monochrome?.let { JobImpressionsCol.monochrome.of(it) },
            monochromeTwoSided?.let { JobImpressionsCol.monochromeTwoSided.of(it) }
        )

    /** Defines types for each member of [JobImpressionsCol]. */
    companion object : AttributeCollection.Converter<JobImpressionsCol> {
        override fun convert(attributes: List<Attribute<*>>): JobImpressionsCol =
            JobImpressionsCol(
                extractOne(attributes, blank),
                extractOne(attributes, blankTwoSided),
                extractOne(attributes, fullColor),
                extractOne(attributes, fullColorTwoSided),
                extractOne(attributes, highlightColor),
                extractOne(attributes, highlightColorTwoSided),
                extractOne(attributes, monochrome),
                extractOne(attributes, monochromeTwoSided)
            )
        @Deprecated("Remove this symbol")
        @JvmField
        val Types = this
        @JvmField val blank = IntType("blank")
        @JvmField val blankTwoSided = IntType("blank-two-sided")
        @JvmField val fullColor = IntType("full-color")
        @JvmField val fullColorTwoSided = IntType("full-color-two-sided")
        @JvmField val highlightColor = IntType("highlight-color")
        @JvmField val highlightColorTwoSided = IntType("highlight-color-two-sided")
        @JvmField val monochrome = IntType("monochrome")
        @JvmField val monochromeTwoSided = IntType("monochrome-two-sided")
    }
    override fun toString() = "JobImpressionsCol(${attributes.joinToString()})"
}
