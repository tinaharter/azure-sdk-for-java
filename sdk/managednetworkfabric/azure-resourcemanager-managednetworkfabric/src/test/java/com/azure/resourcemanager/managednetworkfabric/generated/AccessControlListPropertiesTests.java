// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.AccessControlListProperties;
import com.azure.resourcemanager.managednetworkfabric.models.AccessControlListConditionProperties;
import com.azure.resourcemanager.managednetworkfabric.models.AddressFamily;
import com.azure.resourcemanager.managednetworkfabric.models.ConditionActionType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AccessControlListPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccessControlListProperties model =
            BinaryData
                .fromString(
                    "{\"addressFamily\":\"ipv6\",\"conditions\":[{\"sequenceNumber\":1199777759,\"action\":\"deny\",\"destinationAddress\":\"m\",\"destinationPort\":\"hfpmrqobmtukknr\",\"sourceAddress\":\"rtihfxtijbpz\",\"sourcePort\":\"gnwzsymglzufc\",\"protocol\":504117688,\"annotation\":\"ohdbihanufh\"}],\"provisioningState\":\"Canceled\",\"annotation\":\"y\"}")
                .toObject(AccessControlListProperties.class);
        Assertions.assertEquals("y", model.annotation());
        Assertions.assertEquals(AddressFamily.IPV6, model.addressFamily());
        Assertions.assertEquals("ohdbihanufh", model.conditions().get(0).annotation());
        Assertions.assertEquals(1199777759, model.conditions().get(0).sequenceNumber());
        Assertions.assertEquals(ConditionActionType.DENY, model.conditions().get(0).action());
        Assertions.assertEquals("m", model.conditions().get(0).destinationAddress());
        Assertions.assertEquals("hfpmrqobmtukknr", model.conditions().get(0).destinationPort());
        Assertions.assertEquals("rtihfxtijbpz", model.conditions().get(0).sourceAddress());
        Assertions.assertEquals("gnwzsymglzufc", model.conditions().get(0).sourcePort());
        Assertions.assertEquals(504117688, model.conditions().get(0).protocol());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccessControlListProperties model =
            new AccessControlListProperties()
                .withAnnotation("y")
                .withAddressFamily(AddressFamily.IPV6)
                .withConditions(
                    Arrays
                        .asList(
                            new AccessControlListConditionProperties()
                                .withAnnotation("ohdbihanufh")
                                .withSequenceNumber(1199777759)
                                .withAction(ConditionActionType.DENY)
                                .withDestinationAddress("m")
                                .withDestinationPort("hfpmrqobmtukknr")
                                .withSourceAddress("rtihfxtijbpz")
                                .withSourcePort("gnwzsymglzufc")
                                .withProtocol(504117688)));
        model = BinaryData.fromObject(model).toObject(AccessControlListProperties.class);
        Assertions.assertEquals("y", model.annotation());
        Assertions.assertEquals(AddressFamily.IPV6, model.addressFamily());
        Assertions.assertEquals("ohdbihanufh", model.conditions().get(0).annotation());
        Assertions.assertEquals(1199777759, model.conditions().get(0).sequenceNumber());
        Assertions.assertEquals(ConditionActionType.DENY, model.conditions().get(0).action());
        Assertions.assertEquals("m", model.conditions().get(0).destinationAddress());
        Assertions.assertEquals("hfpmrqobmtukknr", model.conditions().get(0).destinationPort());
        Assertions.assertEquals("rtihfxtijbpz", model.conditions().get(0).sourceAddress());
        Assertions.assertEquals("gnwzsymglzufc", model.conditions().get(0).sourcePort());
        Assertions.assertEquals(504117688, model.conditions().get(0).protocol());
    }
}
