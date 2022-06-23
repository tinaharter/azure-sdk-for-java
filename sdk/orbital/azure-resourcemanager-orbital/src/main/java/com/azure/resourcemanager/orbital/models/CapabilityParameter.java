// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CapabilityParameter. */
public final class CapabilityParameter extends ExpandableStringEnum<CapabilityParameter> {
    /** Static value EarthObservation for CapabilityParameter. */
    public static final CapabilityParameter EARTH_OBSERVATION = fromString("EarthObservation");

    /** Static value Communication for CapabilityParameter. */
    public static final CapabilityParameter COMMUNICATION = fromString("Communication");

    /**
     * Creates or finds a CapabilityParameter from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CapabilityParameter.
     */
    @JsonCreator
    public static CapabilityParameter fromString(String name) {
        return fromString(name, CapabilityParameter.class);
    }

    /**
     * Gets known CapabilityParameter values.
     *
     * @return known CapabilityParameter values.
     */
    public static Collection<CapabilityParameter> values() {
        return values(CapabilityParameter.class);
    }
}