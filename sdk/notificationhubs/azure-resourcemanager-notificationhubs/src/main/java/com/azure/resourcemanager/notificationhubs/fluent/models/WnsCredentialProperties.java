// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Description of a NotificationHub WnsCredential.
 */
@Fluent
public final class WnsCredentialProperties {
    /*
     * Gets or sets the package ID for this credential.
     */
    @JsonProperty(value = "packageSid")
    private String packageSid;

    /*
     * Gets or sets the secret key.
     */
    @JsonProperty(value = "secretKey")
    private String secretKey;

    /*
     * Gets or sets the Windows Live endpoint.
     */
    @JsonProperty(value = "windowsLiveEndpoint")
    private String windowsLiveEndpoint;

    /*
     * Ges or sets the WNS Certificate Key.
     */
    @JsonProperty(value = "certificateKey")
    private String certificateKey;

    /*
     * Gets or sets the WNS Certificate.
     */
    @JsonProperty(value = "wnsCertificate")
    private String wnsCertificate;

    /**
     * Creates an instance of WnsCredentialProperties class.
     */
    public WnsCredentialProperties() {
    }

    /**
     * Get the packageSid property: Gets or sets the package ID for this credential.
     * 
     * @return the packageSid value.
     */
    public String packageSid() {
        return this.packageSid;
    }

    /**
     * Set the packageSid property: Gets or sets the package ID for this credential.
     * 
     * @param packageSid the packageSid value to set.
     * @return the WnsCredentialProperties object itself.
     */
    public WnsCredentialProperties withPackageSid(String packageSid) {
        this.packageSid = packageSid;
        return this;
    }

    /**
     * Get the secretKey property: Gets or sets the secret key.
     * 
     * @return the secretKey value.
     */
    public String secretKey() {
        return this.secretKey;
    }

    /**
     * Set the secretKey property: Gets or sets the secret key.
     * 
     * @param secretKey the secretKey value to set.
     * @return the WnsCredentialProperties object itself.
     */
    public WnsCredentialProperties withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * Get the windowsLiveEndpoint property: Gets or sets the Windows Live endpoint.
     * 
     * @return the windowsLiveEndpoint value.
     */
    public String windowsLiveEndpoint() {
        return this.windowsLiveEndpoint;
    }

    /**
     * Set the windowsLiveEndpoint property: Gets or sets the Windows Live endpoint.
     * 
     * @param windowsLiveEndpoint the windowsLiveEndpoint value to set.
     * @return the WnsCredentialProperties object itself.
     */
    public WnsCredentialProperties withWindowsLiveEndpoint(String windowsLiveEndpoint) {
        this.windowsLiveEndpoint = windowsLiveEndpoint;
        return this;
    }

    /**
     * Get the certificateKey property: Ges or sets the WNS Certificate Key.
     * 
     * @return the certificateKey value.
     */
    public String certificateKey() {
        return this.certificateKey;
    }

    /**
     * Set the certificateKey property: Ges or sets the WNS Certificate Key.
     * 
     * @param certificateKey the certificateKey value to set.
     * @return the WnsCredentialProperties object itself.
     */
    public WnsCredentialProperties withCertificateKey(String certificateKey) {
        this.certificateKey = certificateKey;
        return this;
    }

    /**
     * Get the wnsCertificate property: Gets or sets the WNS Certificate.
     * 
     * @return the wnsCertificate value.
     */
    public String wnsCertificate() {
        return this.wnsCertificate;
    }

    /**
     * Set the wnsCertificate property: Gets or sets the WNS Certificate.
     * 
     * @param wnsCertificate the wnsCertificate value to set.
     * @return the WnsCredentialProperties object itself.
     */
    public WnsCredentialProperties withWnsCertificate(String wnsCertificate) {
        this.wnsCertificate = wnsCertificate;
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
