// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.resourceconnector {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.resourceconnector;
    exports com.azure.resourcemanager.resourceconnector.fluent;
    exports com.azure.resourcemanager.resourceconnector.fluent.models;
    exports com.azure.resourcemanager.resourceconnector.models;

    opens com.azure.resourcemanager.resourceconnector.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.resourceconnector.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}