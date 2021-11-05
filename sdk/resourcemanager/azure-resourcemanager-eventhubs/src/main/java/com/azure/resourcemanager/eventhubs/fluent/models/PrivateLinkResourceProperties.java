// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of PrivateLinkResource. */
@Fluent
public final class PrivateLinkResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkResourceProperties.class);

    /*
     * The private link resource group id.
     */
    @JsonProperty(value = "groupId")
    private String groupId;

    /*
     * The private link resource required member names.
     */
    @JsonProperty(value = "requiredMembers")
    private List<String> requiredMembers;

    /*
     * The private link resource Private link DNS zone name.
     */
    @JsonProperty(value = "requiredZoneNames")
    private List<String> requiredZoneNames;

    /**
     * Get the groupId property: The private link resource group id.
     *
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Set the groupId property: The private link resource group id.
     *
     * @param groupId the groupId value to set.
     * @return the PrivateLinkResourceProperties object itself.
     */
    public PrivateLinkResourceProperties withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get the requiredMembers property: The private link resource required member names.
     *
     * @return the requiredMembers value.
     */
    public List<String> requiredMembers() {
        return this.requiredMembers;
    }

    /**
     * Set the requiredMembers property: The private link resource required member names.
     *
     * @param requiredMembers the requiredMembers value to set.
     * @return the PrivateLinkResourceProperties object itself.
     */
    public PrivateLinkResourceProperties withRequiredMembers(List<String> requiredMembers) {
        this.requiredMembers = requiredMembers;
        return this;
    }

    /**
     * Get the requiredZoneNames property: The private link resource Private link DNS zone name.
     *
     * @return the requiredZoneNames value.
     */
    public List<String> requiredZoneNames() {
        return this.requiredZoneNames;
    }

    /**
     * Set the requiredZoneNames property: The private link resource Private link DNS zone name.
     *
     * @param requiredZoneNames the requiredZoneNames value to set.
     * @return the PrivateLinkResourceProperties object itself.
     */
    public PrivateLinkResourceProperties withRequiredZoneNames(List<String> requiredZoneNames) {
        this.requiredZoneNames = requiredZoneNames;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
