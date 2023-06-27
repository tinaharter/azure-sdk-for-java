// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.fluent.NetworkFabricsClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkFabricInner;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkFabric;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkFabrics;

public final class NetworkFabricsImpl implements NetworkFabrics {
    private static final ClientLogger LOGGER = new ClientLogger(NetworkFabricsImpl.class);

    private final NetworkFabricsClient innerClient;

    private final com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager;

    public NetworkFabricsImpl(
        NetworkFabricsClient innerClient,
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<NetworkFabric> getByResourceGroupWithResponse(
        String resourceGroupName, String networkFabricName, Context context) {
        Response<NetworkFabricInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, networkFabricName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NetworkFabricImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NetworkFabric getByResourceGroup(String resourceGroupName, String networkFabricName) {
        NetworkFabricInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, networkFabricName);
        if (inner != null) {
            return new NetworkFabricImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String networkFabricName) {
        this.serviceClient().delete(resourceGroupName, networkFabricName);
    }

    public void delete(String resourceGroupName, String networkFabricName, Context context) {
        this.serviceClient().delete(resourceGroupName, networkFabricName, context);
    }

    public PagedIterable<NetworkFabric> listByResourceGroup(String resourceGroupName) {
        PagedIterable<NetworkFabricInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new NetworkFabricImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkFabric> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<NetworkFabricInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new NetworkFabricImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkFabric> list() {
        PagedIterable<NetworkFabricInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new NetworkFabricImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkFabric> list(Context context) {
        PagedIterable<NetworkFabricInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new NetworkFabricImpl(inner1, this.manager()));
    }

    public void provision(String resourceGroupName, String networkFabricName) {
        this.serviceClient().provision(resourceGroupName, networkFabricName);
    }

    public void provision(String resourceGroupName, String networkFabricName, Context context) {
        this.serviceClient().provision(resourceGroupName, networkFabricName, context);
    }

    public void deprovision(String resourceGroupName, String networkFabricName) {
        this.serviceClient().deprovision(resourceGroupName, networkFabricName);
    }

    public void deprovision(String resourceGroupName, String networkFabricName, Context context) {
        this.serviceClient().deprovision(resourceGroupName, networkFabricName, context);
    }

    public NetworkFabric getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkFabricName = Utils.getValueFromIdByName(id, "networkFabrics");
        if (networkFabricName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkFabrics'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, networkFabricName, Context.NONE).getValue();
    }

    public Response<NetworkFabric> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkFabricName = Utils.getValueFromIdByName(id, "networkFabrics");
        if (networkFabricName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkFabrics'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, networkFabricName, context);
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
        String networkFabricName = Utils.getValueFromIdByName(id, "networkFabrics");
        if (networkFabricName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkFabrics'.", id)));
        }
        this.delete(resourceGroupName, networkFabricName, Context.NONE);
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
        String networkFabricName = Utils.getValueFromIdByName(id, "networkFabrics");
        if (networkFabricName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkFabrics'.", id)));
        }
        this.delete(resourceGroupName, networkFabricName, context);
    }

    private NetworkFabricsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager() {
        return this.serviceManager;
    }

    public NetworkFabricImpl define(String name) {
        return new NetworkFabricImpl(name, this.manager());
    }
}
