// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.billing.fluent.models.ReservationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of reservations and summary of roll out count of reservations in each state. */
@Fluent
public final class ReservationsListResult {
    /*
     * The list of reservations.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReservationInner> value;

    /*
     * The link (url) to the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /*
     * The roll out count summary of the reservations
     */
    @JsonProperty(value = "summary")
    private ReservationSummary summary;

    /** Creates an instance of ReservationsListResult class. */
    public ReservationsListResult() {
    }

    /**
     * Get the value property: The list of reservations.
     *
     * @return the value value.
     */
    public List<ReservationInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The link (url) to the next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Get the summary property: The roll out count summary of the reservations.
     *
     * @return the summary value.
     */
    public ReservationSummary summary() {
        return this.summary;
    }

    /**
     * Set the summary property: The roll out count summary of the reservations.
     *
     * @param summary the summary value to set.
     * @return the ReservationsListResult object itself.
     */
    public ReservationsListResult withSummary(ReservationSummary summary) {
        this.summary = summary;
        return this;
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
        if (summary() != null) {
            summary().validate();
        }
    }
}
