// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.IpCommunityInner;
import com.azure.resourcemanager.managednetworkfabric.models.CommunityActionTypes;
import com.azure.resourcemanager.managednetworkfabric.models.WellKnownCommunities;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IpCommunityInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IpCommunityInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"action\":\"Deny\",\"wellKnownCommunities\":[\"NoAdvertise\"],\"communityMembers\":[\"o\",\"vqwhbmdgbbjfd\",\"gmbmbexppbh\",\"q\"],\"provisioningState\":\"Canceled\",\"annotation\":\"fpfpsalgbquxigj\"},\"location\":\"gzjaoyfhrtxilne\",\"tags\":{\"juvf\":\"jysvl\",\"jkcpr\":\"awrlyx\"},\"id\":\"nwbxgjvtbvpyssz\",\"name\":\"nruj\",\"type\":\"guhmuouqfpr\"}")
                .toObject(IpCommunityInner.class);
        Assertions.assertEquals("gzjaoyfhrtxilne", model.location());
        Assertions.assertEquals("jysvl", model.tags().get("juvf"));
        Assertions.assertEquals(CommunityActionTypes.DENY, model.action());
        Assertions.assertEquals(WellKnownCommunities.NO_ADVERTISE, model.wellKnownCommunities().get(0));
        Assertions.assertEquals("o", model.communityMembers().get(0));
        Assertions.assertEquals("fpfpsalgbquxigj", model.annotation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IpCommunityInner model =
            new IpCommunityInner()
                .withLocation("gzjaoyfhrtxilne")
                .withTags(mapOf("juvf", "jysvl", "jkcpr", "awrlyx"))
                .withAction(CommunityActionTypes.DENY)
                .withWellKnownCommunities(Arrays.asList(WellKnownCommunities.NO_ADVERTISE))
                .withCommunityMembers(Arrays.asList("o", "vqwhbmdgbbjfd", "gmbmbexppbh", "q"))
                .withAnnotation("fpfpsalgbquxigj");
        model = BinaryData.fromObject(model).toObject(IpCommunityInner.class);
        Assertions.assertEquals("gzjaoyfhrtxilne", model.location());
        Assertions.assertEquals("jysvl", model.tags().get("juvf"));
        Assertions.assertEquals(CommunityActionTypes.DENY, model.action());
        Assertions.assertEquals(WellKnownCommunities.NO_ADVERTISE, model.wellKnownCommunities().get(0));
        Assertions.assertEquals("o", model.communityMembers().get(0));
        Assertions.assertEquals("fpfpsalgbquxigj", model.annotation());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
