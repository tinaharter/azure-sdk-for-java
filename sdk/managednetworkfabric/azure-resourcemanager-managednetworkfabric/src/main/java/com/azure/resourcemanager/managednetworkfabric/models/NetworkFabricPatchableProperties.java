// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Network Fabric updatable properties. */
@Immutable
public class NetworkFabricPatchableProperties {
    /*
     * List of NetworkRack resource IDs under the Network Fabric. The number of racks allowed depends on the Network
     * Fabric SKU.
     */
    @JsonProperty(value = "racks", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> racks;

    /*
     * List of L2IsolationDomain resource IDs under the Network Fabric.
     */
    @JsonProperty(value = "l2IsolationDomains", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> l2IsolationDomains;

    /*
     * List of L3IsolationDomain resource IDs under the Network Fabric.
     */
    @JsonProperty(value = "l3IsolationDomains", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> l3IsolationDomains;

    /** Creates an instance of NetworkFabricPatchableProperties class. */
    public NetworkFabricPatchableProperties() {
    }

    /**
     * Get the racks property: List of NetworkRack resource IDs under the Network Fabric. The number of racks allowed
     * depends on the Network Fabric SKU.
     *
     * @return the racks value.
     */
    public List<String> racks() {
        return this.racks;
    }

    /**
     * Get the l2IsolationDomains property: List of L2IsolationDomain resource IDs under the Network Fabric.
     *
     * @return the l2IsolationDomains value.
     */
    public List<String> l2IsolationDomains() {
        return this.l2IsolationDomains;
    }

    /**
     * Get the l3IsolationDomains property: List of L3IsolationDomain resource IDs under the Network Fabric.
     *
     * @return the l3IsolationDomains value.
     */
    public List<String> l3IsolationDomains() {
        return this.l3IsolationDomains;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
