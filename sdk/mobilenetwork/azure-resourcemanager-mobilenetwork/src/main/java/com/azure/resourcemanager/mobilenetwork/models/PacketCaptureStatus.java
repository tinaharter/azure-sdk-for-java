// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The status of the packet capture session.
 */
public final class PacketCaptureStatus extends ExpandableStringEnum<PacketCaptureStatus> {
    /**
     * Static value NotStarted for PacketCaptureStatus.
     */
    public static final PacketCaptureStatus NOT_STARTED = fromString("NotStarted");

    /**
     * Static value Running for PacketCaptureStatus.
     */
    public static final PacketCaptureStatus RUNNING = fromString("Running");

    /**
     * Static value Stopped for PacketCaptureStatus.
     */
    public static final PacketCaptureStatus STOPPED = fromString("Stopped");

    /**
     * Static value Error for PacketCaptureStatus.
     */
    public static final PacketCaptureStatus ERROR = fromString("Error");

    /**
     * Creates a new instance of PacketCaptureStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PacketCaptureStatus() {
    }

    /**
     * Creates or finds a PacketCaptureStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PacketCaptureStatus.
     */
    @JsonCreator
    public static PacketCaptureStatus fromString(String name) {
        return fromString(name, PacketCaptureStatus.class);
    }

    /**
     * Gets known PacketCaptureStatus values.
     * 
     * @return known PacketCaptureStatus values.
     */
    public static Collection<PacketCaptureStatus> values() {
        return values(PacketCaptureStatus.class);
    }
}
