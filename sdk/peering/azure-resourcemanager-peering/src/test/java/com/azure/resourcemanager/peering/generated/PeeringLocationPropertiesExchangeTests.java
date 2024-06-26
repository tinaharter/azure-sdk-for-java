// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.peering.models.ExchangePeeringFacility;
import com.azure.resourcemanager.peering.models.PeeringLocationPropertiesExchange;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PeeringLocationPropertiesExchangeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PeeringLocationPropertiesExchange model =
            BinaryData
                .fromString(
                    "{\"peeringFacilities\":[{\"exchangeName\":\"i\",\"bandwidthInMbps\":1236632858,\"microsoftIPv4Address\":\"epcyvahfnlj\",\"microsoftIPv6Address\":\"qxj\",\"facilityIPv4Prefix\":\"ujqgidok\",\"facilityIPv6Prefix\":\"ljyoxgvcltb\",\"peeringDBFacilityId\":1745548413,\"peeringDBFacilityLink\":\"ghkjeszzhbi\"},{\"exchangeName\":\"txfvgx\",\"bandwidthInMbps\":557104558,\"microsoftIPv4Address\":\"xnehmpvec\",\"microsoftIPv6Address\":\"odebfqkkrbmpu\",\"facilityIPv4Prefix\":\"riwflzlfb\",\"facilityIPv6Prefix\":\"puz\",\"peeringDBFacilityId\":1610498845,\"peeringDBFacilityLink\":\"pnq\"}]}")
                .toObject(PeeringLocationPropertiesExchange.class);
        Assertions.assertEquals("i", model.peeringFacilities().get(0).exchangeName());
        Assertions.assertEquals(1236632858, model.peeringFacilities().get(0).bandwidthInMbps());
        Assertions.assertEquals("epcyvahfnlj", model.peeringFacilities().get(0).microsoftIPv4Address());
        Assertions.assertEquals("qxj", model.peeringFacilities().get(0).microsoftIPv6Address());
        Assertions.assertEquals("ujqgidok", model.peeringFacilities().get(0).facilityIPv4Prefix());
        Assertions.assertEquals("ljyoxgvcltb", model.peeringFacilities().get(0).facilityIPv6Prefix());
        Assertions.assertEquals(1745548413, model.peeringFacilities().get(0).peeringDBFacilityId());
        Assertions.assertEquals("ghkjeszzhbi", model.peeringFacilities().get(0).peeringDBFacilityLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PeeringLocationPropertiesExchange model =
            new PeeringLocationPropertiesExchange()
                .withPeeringFacilities(
                    Arrays
                        .asList(
                            new ExchangePeeringFacility()
                                .withExchangeName("i")
                                .withBandwidthInMbps(1236632858)
                                .withMicrosoftIPv4Address("epcyvahfnlj")
                                .withMicrosoftIPv6Address("qxj")
                                .withFacilityIPv4Prefix("ujqgidok")
                                .withFacilityIPv6Prefix("ljyoxgvcltb")
                                .withPeeringDBFacilityId(1745548413)
                                .withPeeringDBFacilityLink("ghkjeszzhbi"),
                            new ExchangePeeringFacility()
                                .withExchangeName("txfvgx")
                                .withBandwidthInMbps(557104558)
                                .withMicrosoftIPv4Address("xnehmpvec")
                                .withMicrosoftIPv6Address("odebfqkkrbmpu")
                                .withFacilityIPv4Prefix("riwflzlfb")
                                .withFacilityIPv6Prefix("puz")
                                .withPeeringDBFacilityId(1610498845)
                                .withPeeringDBFacilityLink("pnq")));
        model = BinaryData.fromObject(model).toObject(PeeringLocationPropertiesExchange.class);
        Assertions.assertEquals("i", model.peeringFacilities().get(0).exchangeName());
        Assertions.assertEquals(1236632858, model.peeringFacilities().get(0).bandwidthInMbps());
        Assertions.assertEquals("epcyvahfnlj", model.peeringFacilities().get(0).microsoftIPv4Address());
        Assertions.assertEquals("qxj", model.peeringFacilities().get(0).microsoftIPv6Address());
        Assertions.assertEquals("ujqgidok", model.peeringFacilities().get(0).facilityIPv4Prefix());
        Assertions.assertEquals("ljyoxgvcltb", model.peeringFacilities().get(0).facilityIPv6Prefix());
        Assertions.assertEquals(1745548413, model.peeringFacilities().get(0).peeringDBFacilityId());
        Assertions.assertEquals("ghkjeszzhbi", model.peeringFacilities().get(0).peeringDBFacilityLink());
    }
}
