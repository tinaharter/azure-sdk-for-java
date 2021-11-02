// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Datasource Datasource to be backed up. */
@Fluent
public final class Datasource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Datasource.class);

    /*
     * DatasourceType of the resource.
     */
    @JsonProperty(value = "datasourceType")
    private String datasourceType;

    /*
     * Type of Datasource object, used to initialize the right inherited type
     */
    @JsonProperty(value = "objectType")
    private String objectType;

    /*
     * Full ARM ID of the resource. For azure resources, this is ARM ID. For
     * non azure resources, this will be the ID created by backup service via
     * Fabric/Vault.
     */
    @JsonProperty(value = "resourceID", required = true)
    private String resourceId;

    /*
     * Location of datasource.
     */
    @JsonProperty(value = "resourceLocation")
    private String resourceLocation;

    /*
     * Unique identifier of the resource in the context of parent.
     */
    @JsonProperty(value = "resourceName")
    private String resourceName;

    /*
     * Resource Type of Datasource.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /*
     * Uri of the resource.
     */
    @JsonProperty(value = "resourceUri")
    private String resourceUri;

    /**
     * Get the datasourceType property: DatasourceType of the resource.
     *
     * @return the datasourceType value.
     */
    public String datasourceType() {
        return this.datasourceType;
    }

    /**
     * Set the datasourceType property: DatasourceType of the resource.
     *
     * @param datasourceType the datasourceType value to set.
     * @return the Datasource object itself.
     */
    public Datasource withDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }

    /**
     * Get the objectType property: Type of Datasource object, used to initialize the right inherited type.
     *
     * @return the objectType value.
     */
    public String objectType() {
        return this.objectType;
    }

    /**
     * Set the objectType property: Type of Datasource object, used to initialize the right inherited type.
     *
     * @param objectType the objectType value to set.
     * @return the Datasource object itself.
     */
    public Datasource withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * Get the resourceId property: Full ARM ID of the resource. For azure resources, this is ARM ID. For non azure
     * resources, this will be the ID created by backup service via Fabric/Vault.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Full ARM ID of the resource. For azure resources, this is ARM ID. For non azure
     * resources, this will be the ID created by backup service via Fabric/Vault.
     *
     * @param resourceId the resourceId value to set.
     * @return the Datasource object itself.
     */
    public Datasource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the resourceLocation property: Location of datasource.
     *
     * @return the resourceLocation value.
     */
    public String resourceLocation() {
        return this.resourceLocation;
    }

    /**
     * Set the resourceLocation property: Location of datasource.
     *
     * @param resourceLocation the resourceLocation value to set.
     * @return the Datasource object itself.
     */
    public Datasource withResourceLocation(String resourceLocation) {
        this.resourceLocation = resourceLocation;
        return this;
    }

    /**
     * Get the resourceName property: Unique identifier of the resource in the context of parent.
     *
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Set the resourceName property: Unique identifier of the resource in the context of parent.
     *
     * @param resourceName the resourceName value to set.
     * @return the Datasource object itself.
     */
    public Datasource withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * Get the resourceType property: Resource Type of Datasource.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: Resource Type of Datasource.
     *
     * @param resourceType the resourceType value to set.
     * @return the Datasource object itself.
     */
    public Datasource withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the resourceUri property: Uri of the resource.
     *
     * @return the resourceUri value.
     */
    public String resourceUri() {
        return this.resourceUri;
    }

    /**
     * Set the resourceUri property: Uri of the resource.
     *
     * @param resourceUri the resourceUri value to set.
     * @return the Datasource object itself.
     */
    public Datasource withResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property resourceId in model Datasource"));
        }
    }
}
