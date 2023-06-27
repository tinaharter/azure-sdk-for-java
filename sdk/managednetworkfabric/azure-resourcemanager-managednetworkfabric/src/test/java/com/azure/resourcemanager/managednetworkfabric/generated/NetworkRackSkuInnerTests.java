// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkRackSkuInner;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkDeviceRackRoleType;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkDeviceRoleProperties;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkRackRoleName;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkRackSkuInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkRackSkuInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"roleName\":\"ComputeRack\",\"maximumServerCount\":1129885411,\"maximumStorageCount\":1728557454,\"maximumUplinks\":423729747,\"networkDevices\":[{\"networkDeviceSkuName\":\"ylhjlm\",\"roleType\":\"ToR\",\"rackSlot\":1274087303},{\"networkDeviceSkuName\":\"imrsopteecjmei\",\"roleType\":\"CE\",\"rackSlot\":749085962}],\"provisioningState\":\"Failed\"},\"id\":\"lwxdzaum\",\"name\":\"eoohguufuzboyj\",\"type\":\"thwtzol\"}")
                .toObject(NetworkRackSkuInner.class);
        Assertions.assertEquals(NetworkRackRoleName.COMPUTE_RACK, model.roleName());
        Assertions.assertEquals(1129885411, model.maximumServerCount());
        Assertions.assertEquals(1728557454, model.maximumStorageCount());
        Assertions.assertEquals(423729747, model.maximumUplinks());
        Assertions.assertEquals("ylhjlm", model.networkDevices().get(0).networkDeviceSkuName());
        Assertions.assertEquals(NetworkDeviceRackRoleType.TOR, model.networkDevices().get(0).roleType());
        Assertions.assertEquals(1274087303, model.networkDevices().get(0).rackSlot());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkRackSkuInner model =
            new NetworkRackSkuInner()
                .withRoleName(NetworkRackRoleName.COMPUTE_RACK)
                .withMaximumServerCount(1129885411)
                .withMaximumStorageCount(1728557454)
                .withMaximumUplinks(423729747)
                .withNetworkDevices(
                    Arrays
                        .asList(
                            new NetworkDeviceRoleProperties()
                                .withNetworkDeviceSkuName("ylhjlm")
                                .withRoleType(NetworkDeviceRackRoleType.TOR)
                                .withRackSlot(1274087303),
                            new NetworkDeviceRoleProperties()
                                .withNetworkDeviceSkuName("imrsopteecjmei")
                                .withRoleType(NetworkDeviceRackRoleType.CE)
                                .withRackSlot(749085962)));
        model = BinaryData.fromObject(model).toObject(NetworkRackSkuInner.class);
        Assertions.assertEquals(NetworkRackRoleName.COMPUTE_RACK, model.roleName());
        Assertions.assertEquals(1129885411, model.maximumServerCount());
        Assertions.assertEquals(1728557454, model.maximumStorageCount());
        Assertions.assertEquals(423729747, model.maximumUplinks());
        Assertions.assertEquals("ylhjlm", model.networkDevices().get(0).networkDeviceSkuName());
        Assertions.assertEquals(NetworkDeviceRackRoleType.TOR, model.networkDevices().get(0).roleType());
        Assertions.assertEquals(1274087303, model.networkDevices().get(0).rackSlot());
    }
}
