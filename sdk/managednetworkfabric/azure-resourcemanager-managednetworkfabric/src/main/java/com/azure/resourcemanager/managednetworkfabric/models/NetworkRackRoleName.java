// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The role of the Network Rack: Aggregate or Compute. */
public final class NetworkRackRoleName extends ExpandableStringEnum<NetworkRackRoleName> {
    /** Static value ComputeRack for NetworkRackRoleName. */
    public static final NetworkRackRoleName COMPUTE_RACK = fromString("ComputeRack");

    /** Static value AggregateRack for NetworkRackRoleName. */
    public static final NetworkRackRoleName AGGREGATE_RACK = fromString("AggregateRack");

    /**
     * Creates a new instance of NetworkRackRoleName value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NetworkRackRoleName() {
    }

    /**
     * Creates or finds a NetworkRackRoleName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NetworkRackRoleName.
     */
    @JsonCreator
    public static NetworkRackRoleName fromString(String name) {
        return fromString(name, NetworkRackRoleName.class);
    }

    /**
     * Gets known NetworkRackRoleName values.
     *
     * @return known NetworkRackRoleName values.
     */
    public static Collection<NetworkRackRoleName> values() {
        return values(NetworkRackRoleName.class);
    }
}
