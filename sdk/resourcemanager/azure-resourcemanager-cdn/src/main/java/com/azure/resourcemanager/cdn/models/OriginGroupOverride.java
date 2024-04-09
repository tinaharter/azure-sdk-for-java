// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the parameters for the origin group override configuration.
 */
@Fluent
public final class OriginGroupOverride {
    /*
     * defines the OriginGroup that would override the DefaultOriginGroup on route.
     */
    @JsonProperty(value = "originGroup")
    private ResourceReference originGroup;

    /*
     * Protocol this rule will use when forwarding traffic to backends.
     */
    @JsonProperty(value = "forwardingProtocol")
    private ForwardingProtocol forwardingProtocol;

    /**
     * Creates an instance of OriginGroupOverride class.
     */
    public OriginGroupOverride() {
    }

    /**
     * Get the originGroup property: defines the OriginGroup that would override the DefaultOriginGroup on route.
     * 
     * @return the originGroup value.
     */
    public ResourceReference originGroup() {
        return this.originGroup;
    }

    /**
     * Set the originGroup property: defines the OriginGroup that would override the DefaultOriginGroup on route.
     * 
     * @param originGroup the originGroup value to set.
     * @return the OriginGroupOverride object itself.
     */
    public OriginGroupOverride withOriginGroup(ResourceReference originGroup) {
        this.originGroup = originGroup;
        return this;
    }

    /**
     * Get the forwardingProtocol property: Protocol this rule will use when forwarding traffic to backends.
     * 
     * @return the forwardingProtocol value.
     */
    public ForwardingProtocol forwardingProtocol() {
        return this.forwardingProtocol;
    }

    /**
     * Set the forwardingProtocol property: Protocol this rule will use when forwarding traffic to backends.
     * 
     * @param forwardingProtocol the forwardingProtocol value to set.
     * @return the OriginGroupOverride object itself.
     */
    public OriginGroupOverride withForwardingProtocol(ForwardingProtocol forwardingProtocol) {
        this.forwardingProtocol = forwardingProtocol;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (originGroup() != null) {
            originGroup().validate();
        }
    }
}
