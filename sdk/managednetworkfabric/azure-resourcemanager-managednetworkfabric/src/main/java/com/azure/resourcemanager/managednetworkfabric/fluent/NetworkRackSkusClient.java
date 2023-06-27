// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkRackSkuInner;

/** An instance of this class provides access to all the operations defined in NetworkRackSkusClient. */
public interface NetworkRackSkusClient {
    /**
     * Gets a Network Rack Sku.
     *
     * <p>Get Network Rack SKU resource.
     *
     * @param networkRackSkuName Name of the Network Rack Sku.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network Rack SKU resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NetworkRackSkuInner> getWithResponse(String networkRackSkuName, Context context);

    /**
     * Gets a Network Rack Sku.
     *
     * <p>Get Network Rack SKU resource.
     *
     * @param networkRackSkuName Name of the Network Rack Sku.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network Rack SKU resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkRackSkuInner get(String networkRackSkuName);

    /**
     * List NetworkRackSkus by subscription.
     *
     * <p>List all Network Rack SKUs in the given subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of NetworkRackSkus as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkRackSkuInner> list();

    /**
     * List NetworkRackSkus by subscription.
     *
     * <p>List all Network Rack SKUs in the given subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of NetworkRackSkus as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkRackSkuInner> list(Context context);
}
