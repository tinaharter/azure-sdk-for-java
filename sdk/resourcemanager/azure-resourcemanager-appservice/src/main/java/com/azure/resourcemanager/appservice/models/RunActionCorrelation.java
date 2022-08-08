// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The workflow run action correlation properties. */
@Fluent
public final class RunActionCorrelation extends RunCorrelation {
    /*
     * The action tracking identifier.
     */
    @JsonProperty(value = "actionTrackingId")
    private String actionTrackingId;

    /**
     * Get the actionTrackingId property: The action tracking identifier.
     *
     * @return the actionTrackingId value.
     */
    public String actionTrackingId() {
        return this.actionTrackingId;
    }

    /**
     * Set the actionTrackingId property: The action tracking identifier.
     *
     * @param actionTrackingId the actionTrackingId value to set.
     * @return the RunActionCorrelation object itself.
     */
    public RunActionCorrelation withActionTrackingId(String actionTrackingId) {
        this.actionTrackingId = actionTrackingId;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RunActionCorrelation withClientTrackingId(String clientTrackingId) {
        super.withClientTrackingId(clientTrackingId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RunActionCorrelation withClientKeywords(List<String> clientKeywords) {
        super.withClientKeywords(clientKeywords);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}