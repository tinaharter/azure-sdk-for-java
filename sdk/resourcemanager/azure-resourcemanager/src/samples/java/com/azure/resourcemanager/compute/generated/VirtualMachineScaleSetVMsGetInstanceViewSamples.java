// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for VirtualMachineScaleSetVMs GetInstanceView.
 */
public final class VirtualMachineScaleSetVMsGetInstanceViewSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/
     * virtualMachineScaleSetExamples/VirtualMachineScaleSetVM_Get_InstanceViewAutoPlacedOnDedicatedHostGroup.json
     */
    /**
     * Sample code: Get instance view of a virtual machine from a VM scale set placed on a dedicated host group through
     * automatic placement.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        getInstanceViewOfAVirtualMachineFromAVMScaleSetPlacedOnADedicatedHostGroupThroughAutomaticPlacement(
            com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getVirtualMachineScaleSetVMs().getInstanceViewWithResponse(
            "myResourceGroup", "myVirtualMachineScaleSet", "0", com.azure.core.util.Context.NONE);
    }
}
