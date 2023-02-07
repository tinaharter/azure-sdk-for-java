// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.providerhub.fluent.models.ProviderRegistrationInner;

/** The DefaultRolloutSpecificationProviderRegistration model. */
@Fluent
public final class DefaultRolloutSpecificationProviderRegistration extends ProviderRegistrationInner {
    /** Creates an instance of DefaultRolloutSpecificationProviderRegistration class. */
    public DefaultRolloutSpecificationProviderRegistration() {
    }

    /** {@inheritDoc} */
    @Override
    public DefaultRolloutSpecificationProviderRegistration withProperties(ProviderRegistrationProperties properties) {
        super.withProperties(properties);
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
