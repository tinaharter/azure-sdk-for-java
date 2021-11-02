// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** BaseBackupPolicy BackupPolicy base. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "objectType",
    defaultImpl = BaseBackupPolicy.class)
@JsonTypeName("BaseBackupPolicy")
@JsonSubTypes({@JsonSubTypes.Type(name = "BackupPolicy", value = BackupPolicy.class)})
@Fluent
public class BaseBackupPolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BaseBackupPolicy.class);

    /*
     * Type of datasource for the backup management
     */
    @JsonProperty(value = "datasourceTypes", required = true)
    private List<String> datasourceTypes;

    /**
     * Get the datasourceTypes property: Type of datasource for the backup management.
     *
     * @return the datasourceTypes value.
     */
    public List<String> datasourceTypes() {
        return this.datasourceTypes;
    }

    /**
     * Set the datasourceTypes property: Type of datasource for the backup management.
     *
     * @param datasourceTypes the datasourceTypes value to set.
     * @return the BaseBackupPolicy object itself.
     */
    public BaseBackupPolicy withDatasourceTypes(List<String> datasourceTypes) {
        this.datasourceTypes = datasourceTypes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (datasourceTypes() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property datasourceTypes in model BaseBackupPolicy"));
        }
    }
}
