// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridnetwork.models.SecretDeploymentResourceReference;
import org.junit.jupiter.api.Assertions;

public final class SecretDeploymentResourceReferenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecretDeploymentResourceReference model = BinaryData.fromString("{\"idType\":\"Secret\",\"id\":\"vibr\"}")
            .toObject(SecretDeploymentResourceReference.class);
        Assertions.assertEquals("vibr", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecretDeploymentResourceReference model = new SecretDeploymentResourceReference().withId("vibr");
        model = BinaryData.fromObject(model).toObject(SecretDeploymentResourceReference.class);
        Assertions.assertEquals("vibr", model.id());
    }
}
