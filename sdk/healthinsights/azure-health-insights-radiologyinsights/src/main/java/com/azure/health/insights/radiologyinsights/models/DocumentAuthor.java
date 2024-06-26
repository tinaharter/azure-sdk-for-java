// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Document author.
 */
@Fluent
public final class DocumentAuthor {

    /*
     * author id
     */
    @Generated
    @JsonProperty(value = "id")
    private String id;

    /*
     * Text representation of the full name
     */
    @Generated
    @JsonProperty(value = "fullName")
    private String fullName;

    /**
     * Creates an instance of DocumentAuthor class.
     */
    @Generated
    public DocumentAuthor() {
    }

    /**
     * Get the id property: author id.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: author id.
     *
     * @param id the id value to set.
     * @return the DocumentAuthor object itself.
     */
    @Generated
    public DocumentAuthor setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the fullName property: Text representation of the full name.
     *
     * @return the fullName value.
     */
    @Generated
    public String getFullName() {
        return this.fullName;
    }

    /**
     * Set the fullName property: Text representation of the full name.
     *
     * @param fullName the fullName value to set.
     * @return the DocumentAuthor object itself.
     */
    @Generated
    public DocumentAuthor setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }
}
