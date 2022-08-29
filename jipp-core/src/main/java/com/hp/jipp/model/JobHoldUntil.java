// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2022-08-02
//
// (Note: Uses Java, not Kotlin, to define public static values in the most efficient manner.)

package com.hp.jipp.model;

/**
 * Values applicable for "job-hold-until" keywords (or names).
 *
 * Also used by: "job-hold-until-default", "job-hold-until-supported".
 *
 * @see <a href="http://www.iana.org/go/rfc8011">RFC8011</a>
 */
public class JobHoldUntil {
    public static final String dayTime = "day-time";
    public static final String evening = "evening";
    public static final String indefinite = "indefinite";
    public static final String night = "night";
    public static final String noHold = "no-hold";
    public static final String secondShift = "second-shift";
    public static final String thirdShift = "third-shift";
    public static final String weekend = "weekend";
}