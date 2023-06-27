// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.resourcemanager.managednetworkfabric.models.AdministrativeState;
import com.azure.resourcemanager.managednetworkfabric.models.UpdateAdministrativeState;
import java.util.Arrays;

/** Samples for InternalNetworks UpdateBfdForStaticRouteAdministrativeState. */
public final class InternalNetworksUpdateBfdForStaticRouteAdministrativeStateSamples {
    /*
     * x-ms-original-file: specification/managednetworkfabric/resource-manager/Microsoft.ManagedNetworkFabric/preview/2023-02-01-preview/examples/InternalNetworks_updateBfdForStaticRouteAdministrativeState_MaximumSet_Gen.json
     */
    /**
     * Sample code: InternalNetworks_updateBfdForStaticRouteAdministrativeState_MaximumSet_Gen.
     *
     * @param manager Entry point to ManagedNetworkFabricManager.
     */
    public static void internalNetworksUpdateBfdForStaticRouteAdministrativeStateMaximumSetGen(
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager) {
        manager
            .internalNetworks()
            .updateBfdForStaticRouteAdministrativeState(
                "resourceGroupName",
                "example-l3domain",
                "example-internalnetwork",
                new UpdateAdministrativeState()
                    .withResourceIds(
                        Arrays
                            .asList(
                                "/subscriptions/xxxxxx/resourceGroups/resourcegroupname/providers/Microsoft.ManagedNetworkFabric/example-l3domain/internalNetworks/example-internalnetwork"))
                    .withState(AdministrativeState.ENABLE),
                com.azure.core.util.Context.NONE);
    }
}
