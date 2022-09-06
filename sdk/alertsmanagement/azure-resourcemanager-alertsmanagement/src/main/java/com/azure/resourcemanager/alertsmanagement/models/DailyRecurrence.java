// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Daily recurrence object. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "recurrenceType")
@JsonTypeName("Daily")
@Fluent
public final class DailyRecurrence extends Recurrence {
    /** {@inheritDoc} */
    @Override
    public DailyRecurrence withStartTime(String startTime) {
        super.withStartTime(startTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DailyRecurrence withEndTime(String endTime) {
        super.withEndTime(endTime);
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
    }
}