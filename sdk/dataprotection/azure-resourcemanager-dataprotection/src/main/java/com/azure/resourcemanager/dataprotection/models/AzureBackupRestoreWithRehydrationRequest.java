// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** AzureBackupRestoreWithRehydrationRequest AzureBackup Restore with Rehydration Request. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("AzureBackupRestoreWithRehydrationRequest")
@Fluent
public final class AzureBackupRestoreWithRehydrationRequest extends AzureBackupRecoveryPointBasedRestoreRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureBackupRestoreWithRehydrationRequest.class);

    /*
     * Priority to be used for rehydration. Values High or Standard
     */
    @JsonProperty(value = "rehydrationPriority", required = true)
    private RehydrationPriority rehydrationPriority;

    /*
     * Retention duration in ISO 8601 format i.e P10D .
     */
    @JsonProperty(value = "rehydrationRetentionDuration", required = true)
    private String rehydrationRetentionDuration;

    /**
     * Get the rehydrationPriority property: Priority to be used for rehydration. Values High or Standard.
     *
     * @return the rehydrationPriority value.
     */
    public RehydrationPriority rehydrationPriority() {
        return this.rehydrationPriority;
    }

    /**
     * Set the rehydrationPriority property: Priority to be used for rehydration. Values High or Standard.
     *
     * @param rehydrationPriority the rehydrationPriority value to set.
     * @return the AzureBackupRestoreWithRehydrationRequest object itself.
     */
    public AzureBackupRestoreWithRehydrationRequest withRehydrationPriority(RehydrationPriority rehydrationPriority) {
        this.rehydrationPriority = rehydrationPriority;
        return this;
    }

    /**
     * Get the rehydrationRetentionDuration property: Retention duration in ISO 8601 format i.e P10D .
     *
     * @return the rehydrationRetentionDuration value.
     */
    public String rehydrationRetentionDuration() {
        return this.rehydrationRetentionDuration;
    }

    /**
     * Set the rehydrationRetentionDuration property: Retention duration in ISO 8601 format i.e P10D .
     *
     * @param rehydrationRetentionDuration the rehydrationRetentionDuration value to set.
     * @return the AzureBackupRestoreWithRehydrationRequest object itself.
     */
    public AzureBackupRestoreWithRehydrationRequest withRehydrationRetentionDuration(
        String rehydrationRetentionDuration) {
        this.rehydrationRetentionDuration = rehydrationRetentionDuration;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBackupRestoreWithRehydrationRequest withRecoveryPointId(String recoveryPointId) {
        super.withRecoveryPointId(recoveryPointId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBackupRestoreWithRehydrationRequest withRestoreTargetInfo(RestoreTargetInfoBase restoreTargetInfo) {
        super.withRestoreTargetInfo(restoreTargetInfo);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBackupRestoreWithRehydrationRequest withSourceDataStoreType(SourceDataStoreType sourceDataStoreType) {
        super.withSourceDataStoreType(sourceDataStoreType);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (rehydrationPriority() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property rehydrationPriority in model"
                            + " AzureBackupRestoreWithRehydrationRequest"));
        }
        if (rehydrationRetentionDuration() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property rehydrationRetentionDuration in model"
                            + " AzureBackupRestoreWithRehydrationRequest"));
        }
    }
}
