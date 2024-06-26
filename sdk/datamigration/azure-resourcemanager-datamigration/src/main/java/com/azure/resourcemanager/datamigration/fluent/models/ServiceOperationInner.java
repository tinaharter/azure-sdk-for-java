// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datamigration.models.ServiceOperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Description of an action supported by the Database Migration Service. */
@Fluent
public final class ServiceOperationInner {
    /*
     * The fully qualified action name, e.g. Microsoft.DataMigration/services/read
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Localized display text
     */
    @JsonProperty(value = "display")
    private ServiceOperationDisplay display;

    /** Creates an instance of ServiceOperationInner class. */
    public ServiceOperationInner() {
    }

    /**
     * Get the name property: The fully qualified action name, e.g. Microsoft.DataMigration/services/read.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The fully qualified action name, e.g. Microsoft.DataMigration/services/read.
     *
     * @param name the name value to set.
     * @return the ServiceOperationInner object itself.
     */
    public ServiceOperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display property: Localized display text.
     *
     * @return the display value.
     */
    public ServiceOperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: Localized display text.
     *
     * @param display the display value to set.
     * @return the ServiceOperationInner object itself.
     */
    public ServiceOperationInner withDisplay(ServiceOperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
    }
}
