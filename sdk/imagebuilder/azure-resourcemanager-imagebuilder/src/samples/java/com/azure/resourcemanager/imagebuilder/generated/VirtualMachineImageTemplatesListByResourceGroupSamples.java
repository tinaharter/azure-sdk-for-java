// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachineImageTemplates ListByResourceGroup. */
public final class VirtualMachineImageTemplatesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/imagebuilder/resource-manager/Microsoft.VirtualMachineImages/stable/2020-02-14/examples/ListImageTemplatesByRg.json
     */
    /**
     * Sample code: List images by resource group.
     *
     * @param manager Entry point to ImageBuilderManager.
     */
    public static void listImagesByResourceGroup(com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager) {
        manager.virtualMachineImageTemplates().listByResourceGroup("myResourceGroup", Context.NONE);
    }
}
