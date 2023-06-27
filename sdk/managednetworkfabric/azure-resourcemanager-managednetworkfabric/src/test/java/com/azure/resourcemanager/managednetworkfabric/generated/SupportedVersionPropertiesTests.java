// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.IsCurrentVersion;
import com.azure.resourcemanager.managednetworkfabric.models.IsTestVersion;
import com.azure.resourcemanager.managednetworkfabric.models.SupportedVersionProperties;
import org.junit.jupiter.api.Assertions;

public final class SupportedVersionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SupportedVersionProperties model =
            BinaryData
                .fromString(
                    "{\"version\":\"vhixbjxy\",\"vendorOsVersion\":\"n\",\"vendorFirmwareVersion\":\"r\",\"isCurrent\":\"true\",\"isTest\":\"true\"}")
                .toObject(SupportedVersionProperties.class);
        Assertions.assertEquals("vhixbjxy", model.version());
        Assertions.assertEquals("n", model.vendorOsVersion());
        Assertions.assertEquals("r", model.vendorFirmwareVersion());
        Assertions.assertEquals(IsCurrentVersion.TRUE, model.isCurrent());
        Assertions.assertEquals(IsTestVersion.TRUE, model.isTest());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SupportedVersionProperties model =
            new SupportedVersionProperties()
                .withVersion("vhixbjxy")
                .withVendorOsVersion("n")
                .withVendorFirmwareVersion("r")
                .withIsCurrent(IsCurrentVersion.TRUE)
                .withIsTest(IsTestVersion.TRUE);
        model = BinaryData.fromObject(model).toObject(SupportedVersionProperties.class);
        Assertions.assertEquals("vhixbjxy", model.version());
        Assertions.assertEquals("n", model.vendorOsVersion());
        Assertions.assertEquals("r", model.vendorFirmwareVersion());
        Assertions.assertEquals(IsCurrentVersion.TRUE, model.isCurrent());
        Assertions.assertEquals(IsTestVersion.TRUE, model.isTest());
    }
}
