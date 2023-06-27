// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.resourcemanager.managednetworkfabric.models.ActionIpCommunityProperties;
import com.azure.resourcemanager.managednetworkfabric.models.ActionIpExtendedCommunityProperties;
import com.azure.resourcemanager.managednetworkfabric.models.CommunityActionTypes;
import com.azure.resourcemanager.managednetworkfabric.models.IpCommunityIdList;
import com.azure.resourcemanager.managednetworkfabric.models.IpExtendedCommunityIdList;
import com.azure.resourcemanager.managednetworkfabric.models.RoutePolicyStatementProperties;
import com.azure.resourcemanager.managednetworkfabric.models.StatementActionProperties;
import com.azure.resourcemanager.managednetworkfabric.models.StatementConditionProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for RoutePolicies Create. */
public final class RoutePoliciesCreateSamples {
    /*
     * x-ms-original-file: specification/managednetworkfabric/resource-manager/Microsoft.ManagedNetworkFabric/preview/2023-02-01-preview/examples/RoutePolicies_Create_MaximumSet_Gen.json
     */
    /**
     * Sample code: RoutePolicies_Create_MaximumSet_Gen.
     *
     * @param manager Entry point to ManagedNetworkFabricManager.
     */
    public static void routePoliciesCreateMaximumSetGen(
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager) {
        manager
            .routePolicies()
            .define("routePolicyName")
            .withRegion("EastUS")
            .withExistingResourceGroup("rgRoutePolicies")
            .withStatements(
                Arrays
                    .asList(
                        new RoutePolicyStatementProperties()
                            .withAnnotation("annotationValue")
                            .withSequenceNumber(7L)
                            .withCondition(
                                new StatementConditionProperties()
                                    .withIpCommunityIds(
                                        Arrays
                                            .asList(
                                                "/subscriptions/subscriptionId/resourceGroups/resourceGroupName/providers/Microsoft.ManagedNetworkFabric/ipCommunities/ipCommunityName"))
                                    .withIpPrefixId(
                                        "subscriptions/xxxxxx/resourceGroups/resourcegroupname/providers/Microsoft.ManagedNetworkFabric/ipPrefixes/example-ipPrefix")
                                    .withIpExtendedCommunityIds(
                                        Arrays
                                            .asList(
                                                "/subscriptions/subscriptionId/resourceGroups/resourceGroupName/providers/Microsoft.ManagedNetworkFabric/ipExtendedCommunities/ipExtendedCommunityName")))
                            .withAction(
                                new StatementActionProperties()
                                    .withLocalPreference(20L)
                                    .withActionType(CommunityActionTypes.PERMIT)
                                    .withIpCommunityProperties(
                                        new ActionIpCommunityProperties()
                                            .withAdd(
                                                new IpCommunityIdList()
                                                    .withIpCommunityIds(
                                                        Arrays
                                                            .asList(
                                                                "/subscriptions/subscriptionId/resourceGroups/resourceGroupName/providers/Microsoft.ManagedNetworkFabric/ipCommunities/ipCommunityName")))
                                            .withDelete(
                                                new IpCommunityIdList()
                                                    .withIpCommunityIds(
                                                        Arrays
                                                            .asList(
                                                                "/subscriptions/subscriptionId/resourceGroups/resourceGroupName/providers/Microsoft.ManagedNetworkFabric/ipCommunities/ipCommunityName")))
                                            .withSet(
                                                new IpCommunityIdList()
                                                    .withIpCommunityIds(
                                                        Arrays
                                                            .asList(
                                                                "/subscriptions/subscriptionId/resourceGroups/resourceGroupName/providers/Microsoft.ManagedNetworkFabric/ipCommunities/ipCommunityName"))))
                                    .withIpExtendedCommunityProperties(
                                        new ActionIpExtendedCommunityProperties()
                                            .withAdd(
                                                new IpExtendedCommunityIdList()
                                                    .withIpExtendedCommunityIds(
                                                        Arrays
                                                            .asList(
                                                                "/subscriptions/subscriptionId/resourceGroups/resourceGroupName/providers/Microsoft.ManagedNetworkFabric/ipExtendedCommunities/ipExtendedCommunityName")))
                                            .withDelete(
                                                new IpExtendedCommunityIdList()
                                                    .withIpExtendedCommunityIds(
                                                        Arrays
                                                            .asList(
                                                                "/subscriptions/subscriptionId/resourceGroups/resourceGroupName/providers/Microsoft.ManagedNetworkFabric/ipExtendedCommunities/ipExtendedCommunityName")))
                                            .withSet(
                                                new IpExtendedCommunityIdList()
                                                    .withIpExtendedCommunityIds(
                                                        Arrays
                                                            .asList(
                                                                "/subscriptions/subscriptionId/resourceGroups/resourceGroupName/providers/Microsoft.ManagedNetworkFabric/ipExtendedCommunities/ipExtendedCommunityName")))))))
            .withTags(mapOf("key8254", ""))
            .withAnnotation("annotationValue")
            .create();
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
