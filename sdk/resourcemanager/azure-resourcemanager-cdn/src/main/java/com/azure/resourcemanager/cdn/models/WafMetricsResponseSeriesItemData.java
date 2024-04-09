// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The WafMetricsResponseSeriesItemData model.
 */
@Fluent
public final class WafMetricsResponseSeriesItemData {
    /*
     * The dateTime property.
     */
    @JsonProperty(value = "dateTime")
    private OffsetDateTime dateTime;

    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private Float value;

    /**
     * Creates an instance of WafMetricsResponseSeriesItemData class.
     */
    public WafMetricsResponseSeriesItemData() {
    }

    /**
     * Get the dateTime property: The dateTime property.
     * 
     * @return the dateTime value.
     */
    public OffsetDateTime dateTime() {
        return this.dateTime;
    }

    /**
     * Set the dateTime property: The dateTime property.
     * 
     * @param dateTime the dateTime value to set.
     * @return the WafMetricsResponseSeriesItemData object itself.
     */
    public WafMetricsResponseSeriesItemData withDateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    /**
     * Get the value property: The value property.
     * 
     * @return the value value.
     */
    public Float value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     * 
     * @param value the value value to set.
     * @return the WafMetricsResponseSeriesItemData object itself.
     */
    public WafMetricsResponseSeriesItemData withValue(Float value) {
        this.value = value;
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
