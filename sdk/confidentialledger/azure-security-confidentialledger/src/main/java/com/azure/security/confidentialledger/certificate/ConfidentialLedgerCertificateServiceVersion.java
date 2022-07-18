// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.confidentialledger.certificate;

import com.azure.core.util.ServiceVersion;

/** Service version of ConfidentialLedgerCertificateClient. */
public enum ConfidentialLedgerCertificateServiceVersion implements ServiceVersion {
    /** Enum value 2022-05-13. */
    V2022_05_13("2022-05-13");

    private final String version;

    ConfidentialLedgerCertificateServiceVersion(String version) {
        this.version = version;
    }

    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     *
     * @return The latest {@link ConfidentialLedgerCertificateServiceVersion}.
     */
    public static ConfidentialLedgerCertificateServiceVersion getLatest() {
        return V2022_05_13;
    }
}