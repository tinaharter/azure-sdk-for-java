// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.fluent.NetworkRacksClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkRackInner;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkRack;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkRacks;

public final class NetworkRacksImpl implements NetworkRacks {
    private static final ClientLogger LOGGER = new ClientLogger(NetworkRacksImpl.class);

    private final NetworkRacksClient innerClient;

    private final com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager;

    public NetworkRacksImpl(
        NetworkRacksClient innerClient,
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<NetworkRack> getByResourceGroupWithResponse(
        String resourceGroupName, String networkRackName, Context context) {
        Response<NetworkRackInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, networkRackName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NetworkRackImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NetworkRack getByResourceGroup(String resourceGroupName, String networkRackName) {
        NetworkRackInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, networkRackName);
        if (inner != null) {
            return new NetworkRackImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String networkRackName) {
        this.serviceClient().delete(resourceGroupName, networkRackName);
    }

    public void delete(String resourceGroupName, String networkRackName, Context context) {
        this.serviceClient().delete(resourceGroupName, networkRackName, context);
    }

    public PagedIterable<NetworkRack> listByResourceGroup(String resourceGroupName) {
        PagedIterable<NetworkRackInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new NetworkRackImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkRack> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<NetworkRackInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new NetworkRackImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkRack> list() {
        PagedIterable<NetworkRackInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new NetworkRackImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkRack> list(Context context) {
        PagedIterable<NetworkRackInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new NetworkRackImpl(inner1, this.manager()));
    }

    public NetworkRack getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkRackName = Utils.getValueFromIdByName(id, "networkRacks");
        if (networkRackName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'networkRacks'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, networkRackName, Context.NONE).getValue();
    }

    public Response<NetworkRack> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkRackName = Utils.getValueFromIdByName(id, "networkRacks");
        if (networkRackName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'networkRacks'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, networkRackName, context);
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
        String networkRackName = Utils.getValueFromIdByName(id, "networkRacks");
        if (networkRackName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'networkRacks'.", id)));
        }
        this.delete(resourceGroupName, networkRackName, Context.NONE);
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
        String networkRackName = Utils.getValueFromIdByName(id, "networkRacks");
        if (networkRackName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'networkRacks'.", id)));
        }
        this.delete(resourceGroupName, networkRackName, context);
    }

    private NetworkRacksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager() {
        return this.serviceManager;
    }

    public NetworkRackImpl define(String name) {
        return new NetworkRackImpl(name, this.manager());
    }
}
