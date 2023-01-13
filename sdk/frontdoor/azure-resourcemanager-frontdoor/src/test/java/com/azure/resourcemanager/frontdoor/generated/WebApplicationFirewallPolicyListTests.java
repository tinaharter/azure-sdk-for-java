// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.models.WebApplicationFirewallPolicyList;
import org.junit.jupiter.api.Assertions;

public final class WebApplicationFirewallPolicyListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WebApplicationFirewallPolicyList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"frontendEndpointLinks\":[],\"routingRuleLinks\":[],\"securityPolicyLinks\":[],\"provisioningState\":\"wxwlmdjrkvfgb\",\"resourceState\":\"Deleting\"},\"etag\":\"dbodacizsjqlhkrr\",\"sku\":{\"name\":\"Premium_AzureFrontDoor\"},\"location\":\"ibqipqkg\",\"tags\":{\"pjorwkqnyhg\":\"ndzwmkrefa\",\"jivfxzsjabib\":\"ij\"},\"id\":\"ystawfsdjpvkvp\",\"name\":\"jxbkzbzkdvn\",\"type\":\"jabudurgkakmo\"}],\"nextLink\":\"hjjklff\"}")
                .toObject(WebApplicationFirewallPolicyList.class);
        Assertions.assertEquals("hjjklff", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WebApplicationFirewallPolicyList model = new WebApplicationFirewallPolicyList().withNextLink("hjjklff");
        model = BinaryData.fromObject(model).toObject(WebApplicationFirewallPolicyList.class);
        Assertions.assertEquals("hjjklff", model.nextLink());
    }
}
