// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.AvailablePatchCountByClassification;

public final class AvailablePatchCountByClassificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AvailablePatchCountByClassification model = BinaryData.fromString(
            "{\"security\":1857239406,\"critical\":1149857481,\"definition\":525052628,\"updateRollup\":1405653076,\"featurePack\":1012286032,\"servicePack\":858824887,\"tools\":751467546,\"updates\":2035107412,\"other\":1122692891}")
            .toObject(AvailablePatchCountByClassification.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AvailablePatchCountByClassification model = new AvailablePatchCountByClassification();
        model = BinaryData.fromObject(model).toObject(AvailablePatchCountByClassification.class);
    }
}
