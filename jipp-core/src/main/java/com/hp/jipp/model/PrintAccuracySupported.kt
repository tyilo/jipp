// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-06-10
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "print-accuracy-supported" collection as defined in:
 * [PWG5100.21](https://ftp.pwg.org/pub/pwg/candidates/cs-ipp3d11-20190329-5100.21.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class PrintAccuracySupported
constructor(
    /** May contain any keyword from [AccuracyUnit]. */
    var accuracyUnits: String? = null,
    var xAccuracy: Int? = null,
    var yAccuracy: Int? = null,
    var zAccuracy: Int? = null
) : AttributeCollection {

    /** Construct an empty [PrintAccuracySupported]. */
    constructor() : this(null, null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            accuracyUnits?.let { PrintAccuracySupported.accuracyUnits.of(it) },
            xAccuracy?.let { PrintAccuracySupported.xAccuracy.of(it) },
            yAccuracy?.let { PrintAccuracySupported.yAccuracy.of(it) },
            zAccuracy?.let { PrintAccuracySupported.zAccuracy.of(it) }
        )

    /** Defines types for each member of [PrintAccuracySupported]. */
    companion object : AttributeCollection.Converter<PrintAccuracySupported> {
        override fun convert(attributes: List<Attribute<*>>): PrintAccuracySupported =
            PrintAccuracySupported(
                extractOne(attributes, accuracyUnits),
                extractOne(attributes, xAccuracy),
                extractOne(attributes, yAccuracy),
                extractOne(attributes, zAccuracy)
            )
        @Deprecated("Remove this symbol")
        @JvmField
        val Types = this
        @JvmField val accuracyUnits = KeywordType("accuracy-units")
        @JvmField val xAccuracy = IntType("x-accuracy")
        @JvmField val yAccuracy = IntType("y-accuracy")
        @JvmField val zAccuracy = IntType("z-accuracy")
    }
    override fun toString() = "PrintAccuracySupported(${attributes.joinToString()})"
}
