// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.costmanagement.models.Status;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The status of the long running operation for cost detailed report. */
@Fluent
public final class GenerateDetailedCostReportOperationStatusesInner {
    /*
     * The ID of the long running operation.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The name of the long running operation.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The status of the long running operation.
     */
    @JsonProperty(value = "status")
    private Status status;

    /*
     * The startTime of the operation.
     */
    @JsonProperty(value = "startTime")
    private String startTime;

    /*
     * The endTime of the operation.
     */
    @JsonProperty(value = "endTime")
    private String endTime;

    /*
     * The type of the long running operation.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The details of the error.
     */
    @JsonProperty(value = "error")
    private ManagementError error;

    /*
     * The properties of the usage file generated.
     */
    @JsonProperty(value = "properties")
    private DownloadUrlInner innerProperties;

    /** Creates an instance of GenerateDetailedCostReportOperationStatusesInner class. */
    public GenerateDetailedCostReportOperationStatusesInner() {
    }

    /**
     * Get the id property: The ID of the long running operation.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the long running operation.
     *
     * @param id the id value to set.
     * @return the GenerateDetailedCostReportOperationStatusesInner object itself.
     */
    public GenerateDetailedCostReportOperationStatusesInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The name of the long running operation.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the long running operation.
     *
     * @param name the name value to set.
     * @return the GenerateDetailedCostReportOperationStatusesInner object itself.
     */
    public GenerateDetailedCostReportOperationStatusesInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the status property: The status of the long running operation.
     *
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the long running operation.
     *
     * @param status the status value to set.
     * @return the GenerateDetailedCostReportOperationStatusesInner object itself.
     */
    public GenerateDetailedCostReportOperationStatusesInner withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Get the startTime property: The startTime of the operation.
     *
     * @return the startTime value.
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The startTime of the operation.
     *
     * @param startTime the startTime value to set.
     * @return the GenerateDetailedCostReportOperationStatusesInner object itself.
     */
    public GenerateDetailedCostReportOperationStatusesInner withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The endTime of the operation.
     *
     * @return the endTime value.
     */
    public String endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The endTime of the operation.
     *
     * @param endTime the endTime value to set.
     * @return the GenerateDetailedCostReportOperationStatusesInner object itself.
     */
    public GenerateDetailedCostReportOperationStatusesInner withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the type property: The type of the long running operation.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the long running operation.
     *
     * @param type the type value to set.
     * @return the GenerateDetailedCostReportOperationStatusesInner object itself.
     */
    public GenerateDetailedCostReportOperationStatusesInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the error property: The details of the error.
     *
     * @return the error value.
     */
    public ManagementError error() {
        return this.error;
    }

    /**
     * Set the error property: The details of the error.
     *
     * @param error the error value to set.
     * @return the GenerateDetailedCostReportOperationStatusesInner object itself.
     */
    public GenerateDetailedCostReportOperationStatusesInner withError(ManagementError error) {
        this.error = error;
        return this;
    }

    /**
     * Get the innerProperties property: The properties of the usage file generated.
     *
     * @return the innerProperties value.
     */
    private DownloadUrlInner innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the expiryTime property: The time at which report URL becomes invalid/expires in UTC e.g.
     * 2020-12-08T05:55:59.4394737Z.
     *
     * @return the expiryTime value.
     */
    public OffsetDateTime expiryTime() {
        return this.innerProperties() == null ? null : this.innerProperties().expiryTime();
    }

    /**
     * Get the validTill property: The time at which report URL becomes invalid/expires in UTC e.g.
     * 2020-12-08T05:55:59.4394737Z.
     *
     * @return the validTill value.
     */
    public OffsetDateTime validTill() {
        return this.innerProperties() == null ? null : this.innerProperties().validTill();
    }

    /**
     * Set the validTill property: The time at which report URL becomes invalid/expires in UTC e.g.
     * 2020-12-08T05:55:59.4394737Z.
     *
     * @param validTill the validTill value to set.
     * @return the GenerateDetailedCostReportOperationStatusesInner object itself.
     */
    public GenerateDetailedCostReportOperationStatusesInner withValidTill(OffsetDateTime validTill) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DownloadUrlInner();
        }
        this.innerProperties().withValidTill(validTill);
        return this;
    }

    /**
     * Get the downloadUrl property: The URL to download the generated report.
     *
     * @return the downloadUrl value.
     */
    public String downloadUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().downloadUrl();
    }

    /**
     * Set the downloadUrl property: The URL to download the generated report.
     *
     * @param downloadUrl the downloadUrl value to set.
     * @return the GenerateDetailedCostReportOperationStatusesInner object itself.
     */
    public GenerateDetailedCostReportOperationStatusesInner withDownloadUrl(String downloadUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DownloadUrlInner();
        }
        this.innerProperties().withDownloadUrl(downloadUrl);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() != null) {
            status().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
