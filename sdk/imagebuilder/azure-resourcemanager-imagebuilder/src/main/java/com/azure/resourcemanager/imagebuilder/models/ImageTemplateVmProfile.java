// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the virtual machine used to build, customize and capture images. */
@Fluent
public final class ImageTemplateVmProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImageTemplateVmProfile.class);

    /*
     * Size of the virtual machine used to build, customize and capture images.
     * Omit or specify empty string to use the default (Standard_D1_v2 for Gen1
     * images and Standard_D2ds_v4 for Gen2 images).
     */
    @JsonProperty(value = "vmSize")
    private String vmSize;

    /*
     * Size of the OS disk in GB. Omit or specify 0 to use Azure's default OS
     * disk size.
     */
    @JsonProperty(value = "osDiskSizeGB")
    private Integer osDiskSizeGB;

    /*
     * Optional configuration of the virtual network to use to deploy the build
     * virtual machine in. Omit if no specific virtual network needs to be
     * used.
     */
    @JsonProperty(value = "vnetConfig")
    private VirtualNetworkConfig vnetConfig;

    /**
     * Get the vmSize property: Size of the virtual machine used to build, customize and capture images. Omit or specify
     * empty string to use the default (Standard_D1_v2 for Gen1 images and Standard_D2ds_v4 for Gen2 images).
     *
     * @return the vmSize value.
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize property: Size of the virtual machine used to build, customize and capture images. Omit or specify
     * empty string to use the default (Standard_D1_v2 for Gen1 images and Standard_D2ds_v4 for Gen2 images).
     *
     * @param vmSize the vmSize value to set.
     * @return the ImageTemplateVmProfile object itself.
     */
    public ImageTemplateVmProfile withVmSize(String vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the osDiskSizeGB property: Size of the OS disk in GB. Omit or specify 0 to use Azure's default OS disk size.
     *
     * @return the osDiskSizeGB value.
     */
    public Integer osDiskSizeGB() {
        return this.osDiskSizeGB;
    }

    /**
     * Set the osDiskSizeGB property: Size of the OS disk in GB. Omit or specify 0 to use Azure's default OS disk size.
     *
     * @param osDiskSizeGB the osDiskSizeGB value to set.
     * @return the ImageTemplateVmProfile object itself.
     */
    public ImageTemplateVmProfile withOsDiskSizeGB(Integer osDiskSizeGB) {
        this.osDiskSizeGB = osDiskSizeGB;
        return this;
    }

    /**
     * Get the vnetConfig property: Optional configuration of the virtual network to use to deploy the build virtual
     * machine in. Omit if no specific virtual network needs to be used.
     *
     * @return the vnetConfig value.
     */
    public VirtualNetworkConfig vnetConfig() {
        return this.vnetConfig;
    }

    /**
     * Set the vnetConfig property: Optional configuration of the virtual network to use to deploy the build virtual
     * machine in. Omit if no specific virtual network needs to be used.
     *
     * @param vnetConfig the vnetConfig value to set.
     * @return the ImageTemplateVmProfile object itself.
     */
    public ImageTemplateVmProfile withVnetConfig(VirtualNetworkConfig vnetConfig) {
        this.vnetConfig = vnetConfig;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vnetConfig() != null) {
            vnetConfig().validate();
        }
    }
}
