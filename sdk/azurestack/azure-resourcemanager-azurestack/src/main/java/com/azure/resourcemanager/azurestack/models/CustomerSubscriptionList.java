// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.azurestack.fluent.models.CustomerSubscriptionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Pageable list of customer subscriptions. */
@Fluent
public final class CustomerSubscriptionList {
    /*
     * URI to the next page.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * List of customer subscriptions.
     */
    @JsonProperty(value = "value")
    private List<CustomerSubscriptionInner> value;

    /** Creates an instance of CustomerSubscriptionList class. */
    public CustomerSubscriptionList() {
    }

    /**
     * Get the nextLink property: URI to the next page.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URI to the next page.
     *
     * @param nextLink the nextLink value to set.
     * @return the CustomerSubscriptionList object itself.
     */
    public CustomerSubscriptionList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: List of customer subscriptions.
     *
     * @return the value value.
     */
    public List<CustomerSubscriptionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of customer subscriptions.
     *
     * @param value the value value to set.
     * @return the CustomerSubscriptionList object itself.
     */
    public CustomerSubscriptionList withValue(List<CustomerSubscriptionInner> value) {
        this.value = value;
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
    }
}
