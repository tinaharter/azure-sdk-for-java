// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.security.models.State;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Regulatory compliance standard data. */
@Fluent
public final class RegulatoryComplianceStandardProperties {
    /*
     * Aggregative state based on the standard's supported controls states
     */
    @JsonProperty(value = "state")
    private State state;

    /*
     * The number of supported regulatory compliance controls of the given standard with a passed state
     */
    @JsonProperty(value = "passedControls", access = JsonProperty.Access.WRITE_ONLY)
    private Integer passedControls;

    /*
     * The number of supported regulatory compliance controls of the given standard with a failed state
     */
    @JsonProperty(value = "failedControls", access = JsonProperty.Access.WRITE_ONLY)
    private Integer failedControls;

    /*
     * The number of supported regulatory compliance controls of the given standard with a skipped state
     */
    @JsonProperty(value = "skippedControls", access = JsonProperty.Access.WRITE_ONLY)
    private Integer skippedControls;

    /*
     * The number of regulatory compliance controls of the given standard which are unsupported by automated
     * assessments
     */
    @JsonProperty(value = "unsupportedControls", access = JsonProperty.Access.WRITE_ONLY)
    private Integer unsupportedControls;

    /**
     * Get the state property: Aggregative state based on the standard's supported controls states.
     *
     * @return the state value.
     */
    public State state() {
        return this.state;
    }

    /**
     * Set the state property: Aggregative state based on the standard's supported controls states.
     *
     * @param state the state value to set.
     * @return the RegulatoryComplianceStandardProperties object itself.
     */
    public RegulatoryComplianceStandardProperties withState(State state) {
        this.state = state;
        return this;
    }

    /**
     * Get the passedControls property: The number of supported regulatory compliance controls of the given standard
     * with a passed state.
     *
     * @return the passedControls value.
     */
    public Integer passedControls() {
        return this.passedControls;
    }

    /**
     * Get the failedControls property: The number of supported regulatory compliance controls of the given standard
     * with a failed state.
     *
     * @return the failedControls value.
     */
    public Integer failedControls() {
        return this.failedControls;
    }

    /**
     * Get the skippedControls property: The number of supported regulatory compliance controls of the given standard
     * with a skipped state.
     *
     * @return the skippedControls value.
     */
    public Integer skippedControls() {
        return this.skippedControls;
    }

    /**
     * Get the unsupportedControls property: The number of regulatory compliance controls of the given standard which
     * are unsupported by automated assessments.
     *
     * @return the unsupportedControls value.
     */
    public Integer unsupportedControls() {
        return this.unsupportedControls;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}