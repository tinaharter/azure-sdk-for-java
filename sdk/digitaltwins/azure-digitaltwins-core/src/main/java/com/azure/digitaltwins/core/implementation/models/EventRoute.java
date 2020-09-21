// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.digitaltwins.core.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The EventRoute model. */
@Fluent
public final class EventRoute {
    /*
     * The id of the event route.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The name of the endpoint this event route is bound to.
     */
    @JsonProperty(value = "endpointName", required = true)
    private String endpointName;

    /*
     * An expression which describes the events which are routed to the
     * endpoint.
     */
    @JsonProperty(value = "filter")
    private String filter;

    /** Creates an instance of EventRoute class. */
    @JsonCreator
    public EventRoute(@JsonProperty(value = "endpointName", required = true) String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * Get the id property: The id of the event route.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the endpointName property: The name of the endpoint this event route is bound to.
     *
     * @return the endpointName value.
     */
    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * Get the filter property: An expression which describes the events which are routed to the endpoint.
     *
     * @return the filter value.
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * Set the filter property: An expression which describes the events which are routed to the endpoint.
     *
     * @param filter the filter value to set.
     * @return the EventRoute object itself.
     */
    public EventRoute setFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getEndpointName() == null) {
            throw new IllegalArgumentException("Missing required property endpointName in model EventRoute");
        }
    }
}
