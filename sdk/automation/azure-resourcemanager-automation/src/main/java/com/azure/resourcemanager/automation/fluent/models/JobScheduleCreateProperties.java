// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.models.RunbookAssociationProperty;
import com.azure.resourcemanager.automation.models.ScheduleAssociationProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The parameters supplied to the create job schedule operation. */
@Fluent
public final class JobScheduleCreateProperties {
    /*
     * Gets or sets the schedule.
     */
    @JsonProperty(value = "schedule", required = true)
    private ScheduleAssociationProperty schedule;

    /*
     * Gets or sets the runbook.
     */
    @JsonProperty(value = "runbook", required = true)
    private RunbookAssociationProperty runbook;

    /*
     * Gets or sets the hybrid worker group that the scheduled job should run on.
     */
    @JsonProperty(value = "runOn")
    private String runOn;

    /*
     * Gets or sets a list of job properties.
     */
    @JsonProperty(value = "parameters")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> parameters;

    /**
     * Get the schedule property: Gets or sets the schedule.
     *
     * @return the schedule value.
     */
    public ScheduleAssociationProperty schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: Gets or sets the schedule.
     *
     * @param schedule the schedule value to set.
     * @return the JobScheduleCreateProperties object itself.
     */
    public JobScheduleCreateProperties withSchedule(ScheduleAssociationProperty schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get the runbook property: Gets or sets the runbook.
     *
     * @return the runbook value.
     */
    public RunbookAssociationProperty runbook() {
        return this.runbook;
    }

    /**
     * Set the runbook property: Gets or sets the runbook.
     *
     * @param runbook the runbook value to set.
     * @return the JobScheduleCreateProperties object itself.
     */
    public JobScheduleCreateProperties withRunbook(RunbookAssociationProperty runbook) {
        this.runbook = runbook;
        return this;
    }

    /**
     * Get the runOn property: Gets or sets the hybrid worker group that the scheduled job should run on.
     *
     * @return the runOn value.
     */
    public String runOn() {
        return this.runOn;
    }

    /**
     * Set the runOn property: Gets or sets the hybrid worker group that the scheduled job should run on.
     *
     * @param runOn the runOn value to set.
     * @return the JobScheduleCreateProperties object itself.
     */
    public JobScheduleCreateProperties withRunOn(String runOn) {
        this.runOn = runOn;
        return this;
    }

    /**
     * Get the parameters property: Gets or sets a list of job properties.
     *
     * @return the parameters value.
     */
    public Map<String, String> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Gets or sets a list of job properties.
     *
     * @param parameters the parameters value to set.
     * @return the JobScheduleCreateProperties object itself.
     */
    public JobScheduleCreateProperties withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (schedule() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property schedule in model JobScheduleCreateProperties"));
        } else {
            schedule().validate();
        }
        if (runbook() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property runbook in model JobScheduleCreateProperties"));
        } else {
            runbook().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(JobScheduleCreateProperties.class);
}
