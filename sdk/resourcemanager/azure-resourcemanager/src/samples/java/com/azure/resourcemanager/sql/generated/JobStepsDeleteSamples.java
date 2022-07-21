// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for JobSteps Delete. */
public final class JobStepsDeleteSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2017-03-01-preview/examples/DeleteJobStep.json
     */
    /**
     * Sample code: Delete a job step.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteAJobStep(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getJobSteps()
            .deleteWithResponse("group1", "server1", "agent1", "job1", "step1", Context.NONE);
    }
}