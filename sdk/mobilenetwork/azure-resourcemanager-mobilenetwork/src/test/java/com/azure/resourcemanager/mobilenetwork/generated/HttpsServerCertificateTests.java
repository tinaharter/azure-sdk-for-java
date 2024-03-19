// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.models.HttpsServerCertificate;
import org.junit.jupiter.api.Assertions;

public final class HttpsServerCertificateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HttpsServerCertificate model = BinaryData
            .fromString(
                "{\"certificateUrl\":\"hashsfwxosow\",\"provisioning\":{\"state\":\"Provisioned\",\"reason\":\"i\"}}")
            .toObject(HttpsServerCertificate.class);
        Assertions.assertEquals("hashsfwxosow", model.certificateUrl());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HttpsServerCertificate model = new HttpsServerCertificate().withCertificateUrl("hashsfwxosow");
        model = BinaryData.fromObject(model).toObject(HttpsServerCertificate.class);
        Assertions.assertEquals("hashsfwxosow", model.certificateUrl());
    }
}
