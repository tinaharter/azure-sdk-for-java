// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Whether a reinstall of the packet core is required to pick up the latest configuration changes.
 */
public final class ReinstallRequired extends ExpandableStringEnum<ReinstallRequired> {
    /**
     * Static value Required for ReinstallRequired.
     */
    public static final ReinstallRequired REQUIRED = fromString("Required");

    /**
     * Static value NotRequired for ReinstallRequired.
     */
    public static final ReinstallRequired NOT_REQUIRED = fromString("NotRequired");

    /**
     * Creates a new instance of ReinstallRequired value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ReinstallRequired() {
    }

    /**
     * Creates or finds a ReinstallRequired from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ReinstallRequired.
     */
    @JsonCreator
    public static ReinstallRequired fromString(String name) {
        return fromString(name, ReinstallRequired.class);
    }

    /**
     * Gets known ReinstallRequired values.
     * 
     * @return known ReinstallRequired values.
     */
    public static Collection<ReinstallRequired> values() {
        return values(ReinstallRequired.class);
    }
}
