// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.DiscoveredSecuritySolutionProperties;
import com.azure.resourcemanager.security.models.SecurityFamily;
import org.junit.jupiter.api.Assertions;

public final class DiscoveredSecuritySolutionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiscoveredSecuritySolutionProperties model = BinaryData
            .fromString(
                "{\"securityFamily\":\"SaasWaf\",\"offer\":\"lujkhn\",\"publisher\":\"cmrnkfmkhcq\",\"sku\":\"wmlmh\"}")
            .toObject(DiscoveredSecuritySolutionProperties.class);
        Assertions.assertEquals(SecurityFamily.SAAS_WAF, model.securityFamily());
        Assertions.assertEquals("lujkhn", model.offer());
        Assertions.assertEquals("cmrnkfmkhcq", model.publisher());
        Assertions.assertEquals("wmlmh", model.sku());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiscoveredSecuritySolutionProperties model
            = new DiscoveredSecuritySolutionProperties().withSecurityFamily(SecurityFamily.SAAS_WAF).withOffer("lujkhn")
                .withPublisher("cmrnkfmkhcq").withSku("wmlmh");
        model = BinaryData.fromObject(model).toObject(DiscoveredSecuritySolutionProperties.class);
        Assertions.assertEquals(SecurityFamily.SAAS_WAF, model.securityFamily());
        Assertions.assertEquals("lujkhn", model.offer());
        Assertions.assertEquals("cmrnkfmkhcq", model.publisher());
        Assertions.assertEquals("wmlmh", model.sku());
    }
}
