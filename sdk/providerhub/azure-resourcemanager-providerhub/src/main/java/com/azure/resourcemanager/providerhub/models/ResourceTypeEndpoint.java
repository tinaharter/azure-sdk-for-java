// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.util.List;

/** The ResourceTypeEndpoint model. */
@Fluent
public final class ResourceTypeEndpoint {
    /*
     * The enabled property.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * The apiVersions property.
     */
    @JsonProperty(value = "apiVersions")
    private List<String> apiVersions;

    /*
     * The locations property.
     */
    @JsonProperty(value = "locations")
    private List<String> locations;

    /*
     * The requiredFeatures property.
     */
    @JsonProperty(value = "requiredFeatures")
    private List<String> requiredFeatures;

    /*
     * The featuresRule property.
     */
    @JsonProperty(value = "featuresRule")
    private ResourceTypeEndpointFeaturesRule featuresRule;

    /*
     * The extensions property.
     */
    @JsonProperty(value = "extensions")
    private List<ResourceTypeExtension> extensions;

    /*
     * The timeout property.
     */
    @JsonProperty(value = "timeout")
    private Duration timeout;

    /** Creates an instance of ResourceTypeEndpoint class. */
    public ResourceTypeEndpoint() {
    }

    /**
     * Get the enabled property: The enabled property.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: The enabled property.
     *
     * @param enabled the enabled value to set.
     * @return the ResourceTypeEndpoint object itself.
     */
    public ResourceTypeEndpoint withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the apiVersions property: The apiVersions property.
     *
     * @return the apiVersions value.
     */
    public List<String> apiVersions() {
        return this.apiVersions;
    }

    /**
     * Set the apiVersions property: The apiVersions property.
     *
     * @param apiVersions the apiVersions value to set.
     * @return the ResourceTypeEndpoint object itself.
     */
    public ResourceTypeEndpoint withApiVersions(List<String> apiVersions) {
        this.apiVersions = apiVersions;
        return this;
    }

    /**
     * Get the locations property: The locations property.
     *
     * @return the locations value.
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Set the locations property: The locations property.
     *
     * @param locations the locations value to set.
     * @return the ResourceTypeEndpoint object itself.
     */
    public ResourceTypeEndpoint withLocations(List<String> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the requiredFeatures property: The requiredFeatures property.
     *
     * @return the requiredFeatures value.
     */
    public List<String> requiredFeatures() {
        return this.requiredFeatures;
    }

    /**
     * Set the requiredFeatures property: The requiredFeatures property.
     *
     * @param requiredFeatures the requiredFeatures value to set.
     * @return the ResourceTypeEndpoint object itself.
     */
    public ResourceTypeEndpoint withRequiredFeatures(List<String> requiredFeatures) {
        this.requiredFeatures = requiredFeatures;
        return this;
    }

    /**
     * Get the featuresRule property: The featuresRule property.
     *
     * @return the featuresRule value.
     */
    public ResourceTypeEndpointFeaturesRule featuresRule() {
        return this.featuresRule;
    }

    /**
     * Set the featuresRule property: The featuresRule property.
     *
     * @param featuresRule the featuresRule value to set.
     * @return the ResourceTypeEndpoint object itself.
     */
    public ResourceTypeEndpoint withFeaturesRule(ResourceTypeEndpointFeaturesRule featuresRule) {
        this.featuresRule = featuresRule;
        return this;
    }

    /**
     * Get the extensions property: The extensions property.
     *
     * @return the extensions value.
     */
    public List<ResourceTypeExtension> extensions() {
        return this.extensions;
    }

    /**
     * Set the extensions property: The extensions property.
     *
     * @param extensions the extensions value to set.
     * @return the ResourceTypeEndpoint object itself.
     */
    public ResourceTypeEndpoint withExtensions(List<ResourceTypeExtension> extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * Get the timeout property: The timeout property.
     *
     * @return the timeout value.
     */
    public Duration timeout() {
        return this.timeout;
    }

    /**
     * Set the timeout property: The timeout property.
     *
     * @param timeout the timeout value to set.
     * @return the ResourceTypeEndpoint object itself.
     */
    public ResourceTypeEndpoint withTimeout(Duration timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (featuresRule() != null) {
            featuresRule().validate();
        }
        if (extensions() != null) {
            extensions().forEach(e -> e.validate());
        }
    }
}
