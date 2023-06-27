// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.fluent.RoutePoliciesClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.RoutePolicyInner;
import com.azure.resourcemanager.managednetworkfabric.models.RoutePolicies;
import com.azure.resourcemanager.managednetworkfabric.models.RoutePolicy;

public final class RoutePoliciesImpl implements RoutePolicies {
    private static final ClientLogger LOGGER = new ClientLogger(RoutePoliciesImpl.class);

    private final RoutePoliciesClient innerClient;

    private final com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager;

    public RoutePoliciesImpl(
        RoutePoliciesClient innerClient,
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<RoutePolicy> getByResourceGroupWithResponse(
        String resourceGroupName, String routePolicyName, Context context) {
        Response<RoutePolicyInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, routePolicyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RoutePolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RoutePolicy getByResourceGroup(String resourceGroupName, String routePolicyName) {
        RoutePolicyInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, routePolicyName);
        if (inner != null) {
            return new RoutePolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String routePolicyName) {
        this.serviceClient().delete(resourceGroupName, routePolicyName);
    }

    public void delete(String resourceGroupName, String routePolicyName, Context context) {
        this.serviceClient().delete(resourceGroupName, routePolicyName, context);
    }

    public PagedIterable<RoutePolicy> listByResourceGroup(String resourceGroupName) {
        PagedIterable<RoutePolicyInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new RoutePolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<RoutePolicy> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<RoutePolicyInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new RoutePolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<RoutePolicy> list() {
        PagedIterable<RoutePolicyInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new RoutePolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<RoutePolicy> list(Context context) {
        PagedIterable<RoutePolicyInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new RoutePolicyImpl(inner1, this.manager()));
    }

    public RoutePolicy getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String routePolicyName = Utils.getValueFromIdByName(id, "routePolicies");
        if (routePolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'routePolicies'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, routePolicyName, Context.NONE).getValue();
    }

    public Response<RoutePolicy> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String routePolicyName = Utils.getValueFromIdByName(id, "routePolicies");
        if (routePolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'routePolicies'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, routePolicyName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String routePolicyName = Utils.getValueFromIdByName(id, "routePolicies");
        if (routePolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'routePolicies'.", id)));
        }
        this.delete(resourceGroupName, routePolicyName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String routePolicyName = Utils.getValueFromIdByName(id, "routePolicies");
        if (routePolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'routePolicies'.", id)));
        }
        this.delete(resourceGroupName, routePolicyName, context);
    }

    private RoutePoliciesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager() {
        return this.serviceManager;
    }

    public RoutePolicyImpl define(String name) {
        return new RoutePolicyImpl(name, this.manager());
    }
}
