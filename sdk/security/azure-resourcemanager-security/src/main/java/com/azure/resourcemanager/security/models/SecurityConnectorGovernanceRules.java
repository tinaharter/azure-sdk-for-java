// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of SecurityConnectorGovernanceRules. */
public interface SecurityConnectorGovernanceRules {
    /**
     * Get a list of all relevant governanceRules over a security connector level scope.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all relevant governanceRules over a security connector level scope as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<GovernanceRule> list(String resourceGroupName, String securityConnectorName);

    /**
     * Get a list of all relevant governanceRules over a security connector level scope.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all relevant governanceRules over a security connector level scope as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<GovernanceRule> list(String resourceGroupName, String securityConnectorName, Context context);
}