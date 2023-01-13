// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Indicates whether the name is available. */
public final class Availability extends ExpandableStringEnum<Availability> {
    /** Static value Available for Availability. */
    public static final Availability AVAILABLE = fromString("Available");

    /** Static value Unavailable for Availability. */
    public static final Availability UNAVAILABLE = fromString("Unavailable");

    /**
     * Creates a new instance of Availability value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Availability() {
    }

    /**
     * Creates or finds a Availability from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Availability.
     */
    @JsonCreator
    public static Availability fromString(String name) {
        return fromString(name, Availability.class);
    }

    /**
     * Gets known Availability values.
     *
     * @return known Availability values.
     */
    public static Collection<Availability> values() {
        return values(Availability.class);
    }
}
