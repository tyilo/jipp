// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-06-10
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "power-calendar-policy-col" collection as defined in:
 * [PWG5100.22](https://ftp.pwg.org/pub/pwg/candidates/cs-ippsystem10-20191122-5100.22.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class PowerCalendarPolicyCol
constructor(
    var calendarId: Int? = null,
    var dayOfMonth: Int? = null,
    var dayOfWeek: Int? = null,
    var hour: Int? = null,
    var minute: Int? = null,
    var month: Int? = null,
    var requestPowerState: String? = null,
    var runOnce: Boolean? = null
) : AttributeCollection {

    /** Construct an empty [PowerCalendarPolicyCol]. */
    constructor() : this(null, null, null, null, null, null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            calendarId?.let { PowerCalendarPolicyCol.calendarId.of(it) },
            dayOfMonth?.let { PowerCalendarPolicyCol.dayOfMonth.of(it) },
            dayOfWeek?.let { PowerCalendarPolicyCol.dayOfWeek.of(it) },
            hour?.let { PowerCalendarPolicyCol.hour.of(it) },
            minute?.let { PowerCalendarPolicyCol.minute.of(it) },
            month?.let { PowerCalendarPolicyCol.month.of(it) },
            requestPowerState?.let { PowerCalendarPolicyCol.requestPowerState.of(it) },
            runOnce?.let { PowerCalendarPolicyCol.runOnce.of(it) }
        )

    /** Defines types for each member of [PowerCalendarPolicyCol]. */
    companion object : AttributeCollection.Converter<PowerCalendarPolicyCol> {
        override fun convert(attributes: List<Attribute<*>>): PowerCalendarPolicyCol =
            PowerCalendarPolicyCol(
                extractOne(attributes, calendarId),
                extractOne(attributes, dayOfMonth),
                extractOne(attributes, dayOfWeek),
                extractOne(attributes, hour),
                extractOne(attributes, minute),
                extractOne(attributes, month),
                extractOne(attributes, requestPowerState),
                extractOne(attributes, runOnce)
            )
        @Deprecated("Remove this symbol")
        @JvmField
        val Types = this
        @JvmField val calendarId = IntType("calendar-id")
        @JvmField val dayOfMonth = IntType("day-of-month")
        @JvmField val dayOfWeek = IntType("day-of-week")
        @JvmField val hour = IntType("hour")
        @JvmField val minute = IntType("minute")
        @JvmField val month = IntType("month")
        @JvmField val requestPowerState = KeywordType("request-power-state")
        @JvmField val runOnce = BooleanType("run-once")
    }
    override fun toString() = "PowerCalendarPolicyCol(${attributes.joinToString()})"
}
