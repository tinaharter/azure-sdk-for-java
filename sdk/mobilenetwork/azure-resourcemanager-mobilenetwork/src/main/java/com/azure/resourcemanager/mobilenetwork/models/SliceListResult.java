// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mobilenetwork.fluent.models.SliceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response for network slice API service call.
 */
@Fluent
public final class SliceListResult {
    /*
     * A list of network slices in a mobile network.
     */
    @JsonProperty(value = "value")
    private List<SliceInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of SliceListResult class.
     */
    public SliceListResult() {
    }

    /**
     * Get the value property: A list of network slices in a mobile network.
     * 
     * @return the value value.
     */
    public List<SliceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of network slices in a mobile network.
     * 
     * @param value the value value to set.
     * @return the SliceListResult object itself.
     */
    public SliceListResult withValue(List<SliceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
