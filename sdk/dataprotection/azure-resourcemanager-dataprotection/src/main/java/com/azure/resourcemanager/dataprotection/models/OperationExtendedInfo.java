// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dataprotection.fluent.models.OperationJobExtendedInfoInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** OperationExtendedInfo Operation Extended Info. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "objectType",
    defaultImpl = OperationExtendedInfo.class)
@JsonTypeName("OperationExtendedInfo")
@JsonSubTypes({@JsonSubTypes.Type(name = "OperationJobExtendedInfo", value = OperationJobExtendedInfoInner.class)})
@Immutable
public class OperationExtendedInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationExtendedInfo.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
