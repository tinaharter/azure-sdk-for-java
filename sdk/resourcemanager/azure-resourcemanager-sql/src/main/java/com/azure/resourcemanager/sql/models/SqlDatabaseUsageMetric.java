// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.resources.fluentcore.arm.models.HasName;
import com.azure.resourcemanager.resources.fluentcore.model.HasInnerModel;
import com.azure.resourcemanager.sql.fluent.models.DatabaseUsageInner;

/** The result of SQL server usages per SQL Database. */
@Fluent
public interface SqlDatabaseUsageMetric extends HasName, HasInnerModel<DatabaseUsageInner> {

    /** @return a user-readable name of the metric */
    String displayName();

    /** @return the current value of the metric */
    double currentValue();

    /** @return the boundary value of the metric */
    double limit();

    /** @return the unit of the metric */
    String unit();
}
