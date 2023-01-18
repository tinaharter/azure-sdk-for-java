// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.purview.models.AccountPropertiesEndpoints;
import com.azure.resourcemanager.purview.models.AccountPropertiesManagedResources;
import com.azure.resourcemanager.purview.models.AccountSku;
import com.azure.resourcemanager.purview.models.CloudConnectors;
import com.azure.resourcemanager.purview.models.Identity;
import com.azure.resourcemanager.purview.models.ProvisioningState;
import com.azure.resourcemanager.purview.models.PublicNetworkAccess;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Account resource. */
@Fluent
public final class AccountInner extends Resource {
    /*
     * Gets or sets the properties.
     */
    @JsonProperty(value = "properties")
    private AccountProperties innerProperties;

    /*
     * Gets or sets the Sku.
     */
    @JsonProperty(value = "sku", access = JsonProperty.Access.WRITE_ONLY)
    private AccountSku sku;

    /*
     * Identity Info on the tracked resource
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of AccountInner class. */
    public AccountInner() {
    }

    /**
     * Get the innerProperties property: Gets or sets the properties.
     *
     * @return the innerProperties value.
     */
    private AccountProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the sku property: Gets or sets the Sku.
     *
     * @return the sku value.
     */
    public AccountSku sku() {
        return this.sku;
    }

    /**
     * Get the identity property: Identity Info on the tracked resource.
     *
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Identity Info on the tracked resource.
     *
     * @param identity the identity value to set.
     * @return the AccountInner object itself.
     */
    public AccountInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public AccountInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AccountInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the cloudConnectors property: Cloud connectors. External cloud identifier used as part of scanning
     * configuration.
     *
     * @return the cloudConnectors value.
     */
    public CloudConnectors cloudConnectors() {
        return this.innerProperties() == null ? null : this.innerProperties().cloudConnectors();
    }

    /**
     * Set the cloudConnectors property: Cloud connectors. External cloud identifier used as part of scanning
     * configuration.
     *
     * @param cloudConnectors the cloudConnectors value to set.
     * @return the AccountInner object itself.
     */
    public AccountInner withCloudConnectors(CloudConnectors cloudConnectors) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccountProperties();
        }
        this.innerProperties().withCloudConnectors(cloudConnectors);
        return this;
    }

    /**
     * Get the createdAt property: Gets the time at which the entity was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.innerProperties() == null ? null : this.innerProperties().createdAt();
    }

    /**
     * Get the createdBy property: Gets the creator of the entity.
     *
     * @return the createdBy value.
     */
    public String createdBy() {
        return this.innerProperties() == null ? null : this.innerProperties().createdBy();
    }

    /**
     * Get the createdByObjectId property: Gets the creators of the entity's object id.
     *
     * @return the createdByObjectId value.
     */
    public String createdByObjectId() {
        return this.innerProperties() == null ? null : this.innerProperties().createdByObjectId();
    }

    /**
     * Get the endpoints property: The URIs that are the public endpoints of the account.
     *
     * @return the endpoints value.
     */
    public AccountPropertiesEndpoints endpoints() {
        return this.innerProperties() == null ? null : this.innerProperties().endpoints();
    }

    /**
     * Get the friendlyName property: Gets or sets the friendly name.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.innerProperties() == null ? null : this.innerProperties().friendlyName();
    }

    /**
     * Get the managedResourceGroupName property: Gets or sets the managed resource group name.
     *
     * @return the managedResourceGroupName value.
     */
    public String managedResourceGroupName() {
        return this.innerProperties() == null ? null : this.innerProperties().managedResourceGroupName();
    }

    /**
     * Set the managedResourceGroupName property: Gets or sets the managed resource group name.
     *
     * @param managedResourceGroupName the managedResourceGroupName value to set.
     * @return the AccountInner object itself.
     */
    public AccountInner withManagedResourceGroupName(String managedResourceGroupName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccountProperties();
        }
        this.innerProperties().withManagedResourceGroupName(managedResourceGroupName);
        return this;
    }

    /**
     * Get the managedResources property: Gets the resource identifiers of the managed resources.
     *
     * @return the managedResources value.
     */
    public AccountPropertiesManagedResources managedResources() {
        return this.innerProperties() == null ? null : this.innerProperties().managedResources();
    }

    /**
     * Get the privateEndpointConnections property: Gets the private endpoint connections information.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointConnections();
    }

    /**
     * Get the provisioningState property: Gets or sets the state of the provisioning.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the publicNetworkAccess property: Gets or sets the public network access.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Gets or sets the public network access.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the AccountInner object itself.
     */
    public AccountInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccountProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
