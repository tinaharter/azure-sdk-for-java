// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** A counterfactual evaluation. */
@Fluent
public final class EvaluationContract {
    /*
     * True if the evaluation should explore for a more optimal learning
     * settings.
     */
    @JsonProperty(value = "enableOfflineExperimentation")
    private Boolean enableOfflineExperimentation;

    /*
     * The name of the evaluation.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The start time of the evaluation.
     */
    @JsonProperty(value = "startTime", required = true)
    private OffsetDateTime startTime;

    /*
     * The end time of the evaluation.
     */
    @JsonProperty(value = "endTime", required = true)
    private OffsetDateTime endTime;

    /*
     * Additional learning settings to evaluate.
     */
    @JsonProperty(value = "policies", required = true)
    private List<PolicyContract> policies;

    /**
     * Get the enableOfflineExperimentation property: True if the evaluation should explore for a more optimal learning
     * settings.
     *
     * @return the enableOfflineExperimentation value.
     */
    public Boolean isEnableOfflineExperimentation() {
        return this.enableOfflineExperimentation;
    }

    /**
     * Set the enableOfflineExperimentation property: True if the evaluation should explore for a more optimal learning
     * settings.
     *
     * @param enableOfflineExperimentation the enableOfflineExperimentation value to set.
     * @return the EvaluationContract object itself.
     */
    public EvaluationContract setEnableOfflineExperimentation(Boolean enableOfflineExperimentation) {
        this.enableOfflineExperimentation = enableOfflineExperimentation;
        return this;
    }

    /**
     * Get the name property: The name of the evaluation.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the evaluation.
     *
     * @param name the name value to set.
     * @return the EvaluationContract object itself.
     */
    public EvaluationContract setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the startTime property: The start time of the evaluation.
     *
     * @return the startTime value.
     */
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The start time of the evaluation.
     *
     * @param startTime the startTime value to set.
     * @return the EvaluationContract object itself.
     */
    public EvaluationContract setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The end time of the evaluation.
     *
     * @return the endTime value.
     */
    public OffsetDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The end time of the evaluation.
     *
     * @param endTime the endTime value to set.
     * @return the EvaluationContract object itself.
     */
    public EvaluationContract setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the policies property: Additional learning settings to evaluate.
     *
     * @return the policies value.
     */
    public List<PolicyContract> getPolicies() {
        return this.policies;
    }

    /**
     * Set the policies property: Additional learning settings to evaluate.
     *
     * @param policies the policies value to set.
     * @return the EvaluationContract object itself.
     */
    public EvaluationContract setPolicies(List<PolicyContract> policies) {
        this.policies = policies;
        return this;
    }
}