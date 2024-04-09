// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cdn.models.WafRankingsResponseDataItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Waf Rankings Response.
 */
@Fluent
public final class WafRankingsResponseInner {
    /*
     * The dateTimeBegin property.
     */
    @JsonProperty(value = "dateTimeBegin")
    private OffsetDateTime dateTimeBegin;

    /*
     * The dateTimeEnd property.
     */
    @JsonProperty(value = "dateTimeEnd")
    private OffsetDateTime dateTimeEnd;

    /*
     * The groups property.
     */
    @JsonProperty(value = "groups")
    private List<String> groups;

    /*
     * The data property.
     */
    @JsonProperty(value = "data")
    private List<WafRankingsResponseDataItem> data;

    /**
     * Creates an instance of WafRankingsResponseInner class.
     */
    public WafRankingsResponseInner() {
    }

    /**
     * Get the dateTimeBegin property: The dateTimeBegin property.
     * 
     * @return the dateTimeBegin value.
     */
    public OffsetDateTime dateTimeBegin() {
        return this.dateTimeBegin;
    }

    /**
     * Set the dateTimeBegin property: The dateTimeBegin property.
     * 
     * @param dateTimeBegin the dateTimeBegin value to set.
     * @return the WafRankingsResponseInner object itself.
     */
    public WafRankingsResponseInner withDateTimeBegin(OffsetDateTime dateTimeBegin) {
        this.dateTimeBegin = dateTimeBegin;
        return this;
    }

    /**
     * Get the dateTimeEnd property: The dateTimeEnd property.
     * 
     * @return the dateTimeEnd value.
     */
    public OffsetDateTime dateTimeEnd() {
        return this.dateTimeEnd;
    }

    /**
     * Set the dateTimeEnd property: The dateTimeEnd property.
     * 
     * @param dateTimeEnd the dateTimeEnd value to set.
     * @return the WafRankingsResponseInner object itself.
     */
    public WafRankingsResponseInner withDateTimeEnd(OffsetDateTime dateTimeEnd) {
        this.dateTimeEnd = dateTimeEnd;
        return this;
    }

    /**
     * Get the groups property: The groups property.
     * 
     * @return the groups value.
     */
    public List<String> groups() {
        return this.groups;
    }

    /**
     * Set the groups property: The groups property.
     * 
     * @param groups the groups value to set.
     * @return the WafRankingsResponseInner object itself.
     */
    public WafRankingsResponseInner withGroups(List<String> groups) {
        this.groups = groups;
        return this;
    }

    /**
     * Get the data property: The data property.
     * 
     * @return the data value.
     */
    public List<WafRankingsResponseDataItem> data() {
        return this.data;
    }

    /**
     * Set the data property: The data property.
     * 
     * @param data the data value to set.
     * @return the WafRankingsResponseInner object itself.
     */
    public WafRankingsResponseInner withData(List<WafRankingsResponseDataItem> data) {
        this.data = data;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (data() != null) {
            data().forEach(e -> e.validate());
        }
    }
}
