// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-06-10
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "system-configured-printers" collection as defined in:
 * [PWG5100.22](https://ftp.pwg.org/pub/pwg/candidates/cs-ippsystem10-20191122-5100.22.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class SystemConfiguredPrinters
constructor(
    var printerId: Int? = null,
    var printerInfo: String? = null,
    var printerIsAcceptingJobs: Boolean? = null,
    var printerName: String? = null,
    /** May contain any keyword from [PrinterServiceType]. */
    var printerServiceType: String? = null,
    var printerState: PrinterState? = null,
    /** May contain any keyword from [PrinterStateReason]. */
    var printerStateReasons: List<String>? = null,
    var printerXriSupported: PrinterXriSupported? = null
) : AttributeCollection {

    /** Construct an empty [SystemConfiguredPrinters]. */
    constructor() : this(null, null, null, null, null, null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            printerId?.let { SystemConfiguredPrinters.printerId.of(it) },
            printerInfo?.let { SystemConfiguredPrinters.printerInfo.of(it) },
            printerIsAcceptingJobs?.let { SystemConfiguredPrinters.printerIsAcceptingJobs.of(it) },
            printerName?.let { SystemConfiguredPrinters.printerName.of(it) },
            printerServiceType?.let { SystemConfiguredPrinters.printerServiceType.of(it) },
            printerState?.let { SystemConfiguredPrinters.printerState.of(it) },
            printerStateReasons?.let { SystemConfiguredPrinters.printerStateReasons.of(it) },
            printerXriSupported?.let { SystemConfiguredPrinters.printerXriSupported.of(it) }
        )

    /** Defines types for each member of [SystemConfiguredPrinters]. */
    companion object : AttributeCollection.Converter<SystemConfiguredPrinters> {
        override fun convert(attributes: List<Attribute<*>>): SystemConfiguredPrinters =
            SystemConfiguredPrinters(
                extractOne(attributes, printerId),
                extractOne(attributes, printerInfo)?.value,
                extractOne(attributes, printerIsAcceptingJobs),
                extractOne(attributes, printerName)?.value,
                extractOne(attributes, printerServiceType),
                extractOne(attributes, printerState),
                extractAll(attributes, printerStateReasons),
                extractOne(attributes, printerXriSupported)
            )
        @Deprecated("Remove this symbol")
        @JvmField
        val Types = this
        @JvmField val printerId = IntType("printer-id")
        @JvmField val printerInfo = TextType("printer-info")
        @JvmField val printerIsAcceptingJobs = BooleanType("printer-is-accepting-jobs")
        @JvmField val printerName = NameType("printer-name")
        @JvmField val printerServiceType = KeywordType("printer-service-type")
        /**
         * "printer-state" member type.
         */
        @JvmField val printerState = PrinterState.Type("printer-state")
        @JvmField val printerStateReasons = KeywordType.Set("printer-state-reasons")
        @JvmField val printerXriSupported = AttributeCollection.Type("printer-xri-supported", PrinterXriSupported)
    }
    override fun toString() = "SystemConfiguredPrinters(${attributes.joinToString()})"
}
