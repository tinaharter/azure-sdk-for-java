// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.models.AnnotationResource;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** NetworkRackProperties define the resource properties. */
@Fluent
public final class NetworkRackProperties extends AnnotationResource {
    /*
     * Network Rack SKU name.
     */
    @JsonProperty(value = "networkRackSku", required = true)
    private String networkRackSku;

    /*
     * Network Fabric ARM resource id.
     */
    @JsonProperty(value = "networkFabricId", required = true)
    private String networkFabricId;

    /*
     * List of network device ARM resource ids.
     */
    @JsonProperty(value = "networkDevices", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> networkDevices;

    /*
     * Gets the provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of NetworkRackProperties class. */
    public NetworkRackProperties() {
    }

    /**
     * Get the networkRackSku property: Network Rack SKU name.
     *
     * @return the networkRackSku value.
     */
    public String networkRackSku() {
        return this.networkRackSku;
    }

    /**
     * Set the networkRackSku property: Network Rack SKU name.
     *
     * @param networkRackSku the networkRackSku value to set.
     * @return the NetworkRackProperties object itself.
     */
    public NetworkRackProperties withNetworkRackSku(String networkRackSku) {
        this.networkRackSku = networkRackSku;
        return this;
    }

    /**
     * Get the networkFabricId property: Network Fabric ARM resource id.
     *
     * @return the networkFabricId value.
     */
    public String networkFabricId() {
        return this.networkFabricId;
    }

    /**
     * Set the networkFabricId property: Network Fabric ARM resource id.
     *
     * @param networkFabricId the networkFabricId value to set.
     * @return the NetworkRackProperties object itself.
     */
    public NetworkRackProperties withNetworkFabricId(String networkFabricId) {
        this.networkFabricId = networkFabricId;
        return this;
    }

    /**
     * Get the networkDevices property: List of network device ARM resource ids.
     *
     * @return the networkDevices value.
     */
    public List<String> networkDevices() {
        return this.networkDevices;
    }

    /**
     * Get the provisioningState property: Gets the provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkRackProperties withAnnotation(String annotation) {
        super.withAnnotation(annotation);
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
        if (networkRackSku() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property networkRackSku in model NetworkRackProperties"));
        }
        if (networkFabricId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property networkFabricId in model NetworkRackProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NetworkRackProperties.class);
}
