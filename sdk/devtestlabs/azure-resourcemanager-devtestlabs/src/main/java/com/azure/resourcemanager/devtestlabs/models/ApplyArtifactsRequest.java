// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Request body for applying artifacts to a virtual machine. */
@Fluent
public final class ApplyArtifactsRequest {
    /*
     * The list of artifacts to apply.
     */
    @JsonProperty(value = "artifacts")
    private List<ArtifactInstallProperties> artifacts;

    /** Creates an instance of ApplyArtifactsRequest class. */
    public ApplyArtifactsRequest() {
    }

    /**
     * Get the artifacts property: The list of artifacts to apply.
     *
     * @return the artifacts value.
     */
    public List<ArtifactInstallProperties> artifacts() {
        return this.artifacts;
    }

    /**
     * Set the artifacts property: The list of artifacts to apply.
     *
     * @param artifacts the artifacts value to set.
     * @return the ApplyArtifactsRequest object itself.
     */
    public ApplyArtifactsRequest withArtifacts(List<ArtifactInstallProperties> artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (artifacts() != null) {
            artifacts().forEach(e -> e.validate());
        }
    }
}
