// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.purview.models.CheckNameAvailabilityRequest;
import org.junit.jupiter.api.Assertions;

public final class CheckNameAvailabilityRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CheckNameAvailabilityRequest model =
            BinaryData
                .fromString("{\"name\":\"exq\",\"type\":\"fadmws\"}")
                .toObject(CheckNameAvailabilityRequest.class);
        Assertions.assertEquals("exq", model.name());
        Assertions.assertEquals("fadmws", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CheckNameAvailabilityRequest model = new CheckNameAvailabilityRequest().withName("exq").withType("fadmws");
        model = BinaryData.fromObject(model).toObject(CheckNameAvailabilityRequest.class);
        Assertions.assertEquals("exq", model.name());
        Assertions.assertEquals("fadmws", model.type());
    }
}
