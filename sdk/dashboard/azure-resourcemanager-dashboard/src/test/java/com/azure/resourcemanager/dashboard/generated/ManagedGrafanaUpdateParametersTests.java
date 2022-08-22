// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dashboard.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dashboard.models.ApiKey;
import com.azure.resourcemanager.dashboard.models.DeterministicOutboundIp;
import com.azure.resourcemanager.dashboard.models.GrafanaIntegrations;
import com.azure.resourcemanager.dashboard.models.ManagedGrafanaPropertiesUpdateParameters;
import com.azure.resourcemanager.dashboard.models.ManagedGrafanaUpdateParameters;
import com.azure.resourcemanager.dashboard.models.ManagedServiceIdentity;
import com.azure.resourcemanager.dashboard.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.dashboard.models.PublicNetworkAccess;
import com.azure.resourcemanager.dashboard.models.UserAssignedIdentity;
import com.azure.resourcemanager.dashboard.models.ZoneRedundancy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ManagedGrafanaUpdateParametersTests {
    @Test
    public void testDeserialize() {
        ManagedGrafanaUpdateParameters model =
            BinaryData
                .fromString(
                    "{\"identity\":{\"type\":\"None\",\"userAssignedIdentities\":{\"mzinpvswjdk\":{},\"oodqxhcrm\":{},\"jtckwhdso\":{}}},\"tags\":{\"xsqwpgrjbznorc\":\"yip\"},\"properties\":{\"zoneRedundancy\":\"Disabled\",\"apiKey\":\"Disabled\",\"deterministicOutboundIP\":\"Enabled\",\"publicNetworkAccess\":\"Disabled\",\"grafanaIntegrations\":{\"azureMonitorWorkspaceIntegrations\":[]}}}")
                .toObject(ManagedGrafanaUpdateParameters.class);
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, model.identity().type());
        Assertions.assertEquals("yip", model.tags().get("xsqwpgrjbznorc"));
        Assertions.assertEquals(ZoneRedundancy.DISABLED, model.properties().zoneRedundancy());
        Assertions.assertEquals(ApiKey.DISABLED, model.properties().apiKey());
        Assertions.assertEquals(DeterministicOutboundIp.ENABLED, model.properties().deterministicOutboundIp());
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.properties().publicNetworkAccess());
    }

    @Test
    public void testSerialize() {
        ManagedGrafanaUpdateParameters model =
            new ManagedGrafanaUpdateParameters()
                .withIdentity(
                    new ManagedServiceIdentity()
                        .withType(ManagedServiceIdentityType.NONE)
                        .withUserAssignedIdentities(
                            mapOf(
                                "mzinpvswjdk",
                                new UserAssignedIdentity(),
                                "oodqxhcrm",
                                new UserAssignedIdentity(),
                                "jtckwhdso",
                                new UserAssignedIdentity())))
                .withTags(mapOf("xsqwpgrjbznorc", "yip"))
                .withProperties(
                    new ManagedGrafanaPropertiesUpdateParameters()
                        .withZoneRedundancy(ZoneRedundancy.DISABLED)
                        .withApiKey(ApiKey.DISABLED)
                        .withDeterministicOutboundIp(DeterministicOutboundIp.ENABLED)
                        .withPublicNetworkAccess(PublicNetworkAccess.DISABLED)
                        .withGrafanaIntegrations(
                            new GrafanaIntegrations().withAzureMonitorWorkspaceIntegrations(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(ManagedGrafanaUpdateParameters.class);
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, model.identity().type());
        Assertions.assertEquals("yip", model.tags().get("xsqwpgrjbznorc"));
        Assertions.assertEquals(ZoneRedundancy.DISABLED, model.properties().zoneRedundancy());
        Assertions.assertEquals(ApiKey.DISABLED, model.properties().apiKey());
        Assertions.assertEquals(DeterministicOutboundIp.ENABLED, model.properties().deterministicOutboundIp());
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.properties().publicNetworkAccess());
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