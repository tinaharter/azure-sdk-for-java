// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

/** Samples for NetworkFabricControllers GetByResourceGroup. */
public final class NetworkFabricControllersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/managednetworkfabric/resource-manager/Microsoft.ManagedNetworkFabric/preview/2023-02-01-preview/examples/NetworkFabricControllers_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: NetworkFabricControllers_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to ManagedNetworkFabricManager.
     */
    public static void networkFabricControllersGetMaximumSetGen(
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager) {
        manager
            .networkFabricControllers()
            .getByResourceGroupWithResponse(
                "resourceGroupName", "networkFabricControllerName", com.azure.core.util.Context.NONE);
    }
}
