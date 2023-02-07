// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.providerhub.models.ProviderRegistrationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ProviderRegistration model. */
@Fluent
public class ProviderRegistrationInner extends ProxyResource {
    /*
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private ProviderRegistrationProperties properties;

    /** Creates an instance of ProviderRegistrationInner class. */
    public ProviderRegistrationInner() {
    }

    /**
     * Get the properties property: The properties property.
     *
     * @return the properties value.
     */
    public ProviderRegistrationProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties property.
     *
     * @param properties the properties value to set.
     * @return the ProviderRegistrationInner object itself.
     */
    public ProviderRegistrationInner withProperties(ProviderRegistrationProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
