// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.Context;

/** Samples for BackupVaults GetByResourceGroup. */
public final class BackupVaultsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/dataprotection/resource-manager/Microsoft.DataProtection/stable/2021-07-01/examples/VaultCRUD/GetBackupVault.json
     */
    /**
     * Sample code: Get BackupVault.
     *
     * @param manager Entry point to DataProtectionManager.
     */
    public static void getBackupVault(com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager.backupVaults().getByResourceGroupWithResponse("SampleResourceGroup", "swaggerExample", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dataprotection/resource-manager/Microsoft.DataProtection/stable/2021-07-01/examples/VaultCRUD/GetBackupVaultWithMSI.json
     */
    /**
     * Sample code: Get BackupVault With MSI.
     *
     * @param manager Entry point to DataProtectionManager.
     */
    public static void getBackupVaultWithMSI(com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager.backupVaults().getByResourceGroupWithResponse("SampleResourceGroup", "swaggerExample", Context.NONE);
    }
}
