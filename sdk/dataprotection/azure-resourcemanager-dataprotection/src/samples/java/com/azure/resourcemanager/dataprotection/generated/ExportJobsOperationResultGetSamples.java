// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.Context;

/** Samples for ExportJobsOperationResult Get. */
public final class ExportJobsOperationResultGetSamples {
    /*
     * x-ms-original-file: specification/dataprotection/resource-manager/Microsoft.DataProtection/stable/2021-07-01/examples/JobCRUD/GetExportJobsOperationResult.json
     */
    /**
     * Sample code: Get Export Jobs Operation Result.
     *
     * @param manager Entry point to DataProtectionManager.
     */
    public static void getExportJobsOperationResult(
        com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager
            .exportJobsOperationResults()
            .getWithResponse(
                "SwaggerTestRg", "NetSDKTestRsVault", "00000000-0000-0000-0000-000000000000", Context.NONE);
    }
}
