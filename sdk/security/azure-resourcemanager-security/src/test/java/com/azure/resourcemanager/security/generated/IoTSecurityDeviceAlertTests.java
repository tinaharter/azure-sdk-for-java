// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.IoTSecurityDeviceAlert;

public final class IoTSecurityDeviceAlertTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IoTSecurityDeviceAlert model = BinaryData.fromString(
            "{\"alertDisplayName\":\"ottaw\",\"reportedSeverity\":\"Informational\",\"alertsCount\":6609053466837158122}")
            .toObject(IoTSecurityDeviceAlert.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IoTSecurityDeviceAlert model = new IoTSecurityDeviceAlert();
        model = BinaryData.fromObject(model).toObject(IoTSecurityDeviceAlert.class);
    }
}
