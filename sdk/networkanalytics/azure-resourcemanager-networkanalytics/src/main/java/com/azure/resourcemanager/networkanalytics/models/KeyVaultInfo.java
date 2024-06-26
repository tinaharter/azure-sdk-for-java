// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details for KeyVault.
 */
@Fluent
public final class KeyVaultInfo {
    /*
     * key vault url.
     */
    @JsonProperty(value = "keyVaultUrl", required = true)
    private String keyVaultUrl;

    /**
     * Creates an instance of KeyVaultInfo class.
     */
    public KeyVaultInfo() {
    }

    /**
     * Get the keyVaultUrl property: key vault url.
     * 
     * @return the keyVaultUrl value.
     */
    public String keyVaultUrl() {
        return this.keyVaultUrl;
    }

    /**
     * Set the keyVaultUrl property: key vault url.
     * 
     * @param keyVaultUrl the keyVaultUrl value to set.
     * @return the KeyVaultInfo object itself.
     */
    public KeyVaultInfo withKeyVaultUrl(String keyVaultUrl) {
        this.keyVaultUrl = keyVaultUrl;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyVaultUrl() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property keyVaultUrl in model KeyVaultInfo"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(KeyVaultInfo.class);
}
