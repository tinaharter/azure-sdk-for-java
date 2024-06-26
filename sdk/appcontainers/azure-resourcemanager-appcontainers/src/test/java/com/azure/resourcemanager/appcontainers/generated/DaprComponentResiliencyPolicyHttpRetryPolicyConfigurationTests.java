// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration;
import org.junit.jupiter.api.Assertions;

public final class DaprComponentResiliencyPolicyHttpRetryPolicyConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration model = BinaryData.fromString(
            "{\"maxRetries\":1923932304,\"retryBackOff\":{\"initialDelayInMilliseconds\":366697291,\"maxIntervalInMilliseconds\":1294543038}}")
            .toObject(DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration.class);
        Assertions.assertEquals(1923932304, model.maxRetries());
        Assertions.assertEquals(366697291, model.retryBackOff().initialDelayInMilliseconds());
        Assertions.assertEquals(1294543038, model.retryBackOff().maxIntervalInMilliseconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration model
            = new DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration().withMaxRetries(1923932304)
                .withRetryBackOff(new DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration()
                    .withInitialDelayInMilliseconds(366697291).withMaxIntervalInMilliseconds(1294543038));
        model = BinaryData.fromObject(model).toObject(DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration.class);
        Assertions.assertEquals(1923932304, model.maxRetries());
        Assertions.assertEquals(366697291, model.retryBackOff().initialDelayInMilliseconds());
        Assertions.assertEquals(1294543038, model.retryBackOff().maxIntervalInMilliseconds());
    }
}
