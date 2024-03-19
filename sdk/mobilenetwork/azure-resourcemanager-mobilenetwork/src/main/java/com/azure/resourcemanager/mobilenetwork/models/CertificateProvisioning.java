// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Certificate provisioning state.
 */
@Immutable
public final class CertificateProvisioning {
    /*
     * The certificate's provisioning state
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateProvisioningState state;

    /*
     * Reason for certificate provisioning failure.
     */
    @JsonProperty(value = "reason", access = JsonProperty.Access.WRITE_ONLY)
    private String reason;

    /**
     * Creates an instance of CertificateProvisioning class.
     */
    public CertificateProvisioning() {
    }

    /**
     * Get the state property: The certificate's provisioning state.
     * 
     * @return the state value.
     */
    public CertificateProvisioningState state() {
        return this.state;
    }

    /**
     * Get the reason property: Reason for certificate provisioning failure.
     * 
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
