// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventhubs.models.Encryption;
import com.azure.resourcemanager.eventhubs.models.Identity;
import com.azure.resourcemanager.eventhubs.models.Sku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Single Namespace item in List or Get Operation. */
@Fluent
public final class EHNamespaceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EHNamespaceInner.class);

    /*
     * Properties of sku resource
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Properties of BYOK Identity description
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * The system meta data relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Namespace properties supplied for create namespace operation.
     */
    @JsonProperty(value = "properties")
    private EHNamespaceProperties innerProperties;

    /**
     * Get the sku property: Properties of sku resource.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Properties of sku resource.
     *
     * @param sku the sku value to set.
     * @return the EHNamespaceInner object itself.
     */
    public EHNamespaceInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the identity property: Properties of BYOK Identity description.
     *
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Properties of BYOK Identity description.
     *
     * @param identity the identity value to set.
     * @return the EHNamespaceInner object itself.
     */
    public EHNamespaceInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the innerProperties property: Namespace properties supplied for create namespace operation.
     *
     * @return the innerProperties value.
     */
    private EHNamespaceProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public EHNamespaceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EHNamespaceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the Namespace.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the status property: Status of the Namespace.
     *
     * @return the status value.
     */
    public String status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the createdAt property: The time the Namespace was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.innerProperties() == null ? null : this.innerProperties().createdAt();
    }

    /**
     * Get the updatedAt property: The time the Namespace was updated.
     *
     * @return the updatedAt value.
     */
    public OffsetDateTime updatedAt() {
        return this.innerProperties() == null ? null : this.innerProperties().updatedAt();
    }

    /**
     * Get the serviceBusEndpoint property: Endpoint you can use to perform Service Bus operations.
     *
     * @return the serviceBusEndpoint value.
     */
    public String serviceBusEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceBusEndpoint();
    }

    /**
     * Get the clusterArmId property: Cluster ARM ID of the Namespace.
     *
     * @return the clusterArmId value.
     */
    public String clusterArmId() {
        return this.innerProperties() == null ? null : this.innerProperties().clusterArmId();
    }

    /**
     * Set the clusterArmId property: Cluster ARM ID of the Namespace.
     *
     * @param clusterArmId the clusterArmId value to set.
     * @return the EHNamespaceInner object itself.
     */
    public EHNamespaceInner withClusterArmId(String clusterArmId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EHNamespaceProperties();
        }
        this.innerProperties().withClusterArmId(clusterArmId);
        return this;
    }

    /**
     * Get the metricId property: Identifier for Azure Insights metrics.
     *
     * @return the metricId value.
     */
    public String metricId() {
        return this.innerProperties() == null ? null : this.innerProperties().metricId();
    }

    /**
     * Get the isAutoInflateEnabled property: Value that indicates whether AutoInflate is enabled for eventhub
     * namespace.
     *
     * @return the isAutoInflateEnabled value.
     */
    public Boolean isAutoInflateEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isAutoInflateEnabled();
    }

    /**
     * Set the isAutoInflateEnabled property: Value that indicates whether AutoInflate is enabled for eventhub
     * namespace.
     *
     * @param isAutoInflateEnabled the isAutoInflateEnabled value to set.
     * @return the EHNamespaceInner object itself.
     */
    public EHNamespaceInner withIsAutoInflateEnabled(Boolean isAutoInflateEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EHNamespaceProperties();
        }
        this.innerProperties().withIsAutoInflateEnabled(isAutoInflateEnabled);
        return this;
    }

    /**
     * Get the maximumThroughputUnits property: Upper limit of throughput units when AutoInflate is enabled, value
     * should be within 0 to 20 throughput units. ( '0' if AutoInflateEnabled = true).
     *
     * @return the maximumThroughputUnits value.
     */
    public Integer maximumThroughputUnits() {
        return this.innerProperties() == null ? null : this.innerProperties().maximumThroughputUnits();
    }

    /**
     * Set the maximumThroughputUnits property: Upper limit of throughput units when AutoInflate is enabled, value
     * should be within 0 to 20 throughput units. ( '0' if AutoInflateEnabled = true).
     *
     * @param maximumThroughputUnits the maximumThroughputUnits value to set.
     * @return the EHNamespaceInner object itself.
     */
    public EHNamespaceInner withMaximumThroughputUnits(Integer maximumThroughputUnits) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EHNamespaceProperties();
        }
        this.innerProperties().withMaximumThroughputUnits(maximumThroughputUnits);
        return this;
    }

    /**
     * Get the kafkaEnabled property: Value that indicates whether Kafka is enabled for eventhub namespace.
     *
     * @return the kafkaEnabled value.
     */
    public Boolean kafkaEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().kafkaEnabled();
    }

    /**
     * Set the kafkaEnabled property: Value that indicates whether Kafka is enabled for eventhub namespace.
     *
     * @param kafkaEnabled the kafkaEnabled value to set.
     * @return the EHNamespaceInner object itself.
     */
    public EHNamespaceInner withKafkaEnabled(Boolean kafkaEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EHNamespaceProperties();
        }
        this.innerProperties().withKafkaEnabled(kafkaEnabled);
        return this;
    }

    /**
     * Get the zoneRedundant property: Enabling this property creates a Standard Event Hubs Namespace in regions
     * supported availability zones.
     *
     * @return the zoneRedundant value.
     */
    public Boolean zoneRedundant() {
        return this.innerProperties() == null ? null : this.innerProperties().zoneRedundant();
    }

    /**
     * Set the zoneRedundant property: Enabling this property creates a Standard Event Hubs Namespace in regions
     * supported availability zones.
     *
     * @param zoneRedundant the zoneRedundant value to set.
     * @return the EHNamespaceInner object itself.
     */
    public EHNamespaceInner withZoneRedundant(Boolean zoneRedundant) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EHNamespaceProperties();
        }
        this.innerProperties().withZoneRedundant(zoneRedundant);
        return this;
    }

    /**
     * Get the encryption property: Properties of BYOK Encryption description.
     *
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Set the encryption property: Properties of BYOK Encryption description.
     *
     * @param encryption the encryption value to set.
     * @return the EHNamespaceInner object itself.
     */
    public EHNamespaceInner withEncryption(Encryption encryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EHNamespaceProperties();
        }
        this.innerProperties().withEncryption(encryption);
        return this;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connections.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointConnections();
    }

    /**
     * Set the privateEndpointConnections property: List of private endpoint connections.
     *
     * @param privateEndpointConnections the privateEndpointConnections value to set.
     * @return the EHNamespaceInner object itself.
     */
    public EHNamespaceInner withPrivateEndpointConnections(
        List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EHNamespaceProperties();
        }
        this.innerProperties().withPrivateEndpointConnections(privateEndpointConnections);
        return this;
    }

    /**
     * Get the disableLocalAuth property: This property disables SAS authentication for the Event Hubs namespace.
     *
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.innerProperties() == null ? null : this.innerProperties().disableLocalAuth();
    }

    /**
     * Set the disableLocalAuth property: This property disables SAS authentication for the Event Hubs namespace.
     *
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the EHNamespaceInner object itself.
     */
    public EHNamespaceInner withDisableLocalAuth(Boolean disableLocalAuth) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EHNamespaceProperties();
        }
        this.innerProperties().withDisableLocalAuth(disableLocalAuth);
        return this;
    }

    /**
     * Get the alternateName property: Alternate name specified when alias and namespace names are same.
     *
     * @return the alternateName value.
     */
    public String alternateName() {
        return this.innerProperties() == null ? null : this.innerProperties().alternateName();
    }

    /**
     * Set the alternateName property: Alternate name specified when alias and namespace names are same.
     *
     * @param alternateName the alternateName value to set.
     * @return the EHNamespaceInner object itself.
     */
    public EHNamespaceInner withAlternateName(String alternateName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EHNamespaceProperties();
        }
        this.innerProperties().withAlternateName(alternateName);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
