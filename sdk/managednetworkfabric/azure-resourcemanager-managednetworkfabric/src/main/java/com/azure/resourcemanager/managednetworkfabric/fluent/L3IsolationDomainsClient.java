// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.L3IsolationDomainInner;
import com.azure.resourcemanager.managednetworkfabric.models.EnableDisableOnResources;
import com.azure.resourcemanager.managednetworkfabric.models.L3IsolationDomainPatch;
import com.azure.resourcemanager.managednetworkfabric.models.UpdateAdministrativeState;

/** An instance of this class provides access to all the operations defined in L3IsolationDomainsClient. */
public interface L3IsolationDomainsClient {
    /**
     * Create L3 Isolation Domain.
     *
     * <p>Create isolation domain resources for layer 3 connectivity between compute nodes and for communication with
     * external services .This configuration is applied on the devices only after the creation of networks is completed
     * and isolation domain is enabled.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3 Isolation Domain.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the L3IsolationDomain resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<L3IsolationDomainInner>, L3IsolationDomainInner> beginCreate(
        String resourceGroupName, String l3IsolationDomainName, L3IsolationDomainInner body);

    /**
     * Create L3 Isolation Domain.
     *
     * <p>Create isolation domain resources for layer 3 connectivity between compute nodes and for communication with
     * external services .This configuration is applied on the devices only after the creation of networks is completed
     * and isolation domain is enabled.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3 Isolation Domain.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the L3IsolationDomain resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<L3IsolationDomainInner>, L3IsolationDomainInner> beginCreate(
        String resourceGroupName, String l3IsolationDomainName, L3IsolationDomainInner body, Context context);

    /**
     * Create L3 Isolation Domain.
     *
     * <p>Create isolation domain resources for layer 3 connectivity between compute nodes and for communication with
     * external services .This configuration is applied on the devices only after the creation of networks is completed
     * and isolation domain is enabled.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3 Isolation Domain.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the L3IsolationDomain resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    L3IsolationDomainInner create(String resourceGroupName, String l3IsolationDomainName, L3IsolationDomainInner body);

    /**
     * Create L3 Isolation Domain.
     *
     * <p>Create isolation domain resources for layer 3 connectivity between compute nodes and for communication with
     * external services .This configuration is applied on the devices only after the creation of networks is completed
     * and isolation domain is enabled.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3 Isolation Domain.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the L3IsolationDomain resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    L3IsolationDomainInner create(
        String resourceGroupName, String l3IsolationDomainName, L3IsolationDomainInner body, Context context);

    /**
     * Gets a L3 Isolation Domain.
     *
     * <p>Retrieves details of this L3 Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3 Isolation Domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the L3IsolationDomain resource definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<L3IsolationDomainInner> getByResourceGroupWithResponse(
        String resourceGroupName, String l3IsolationDomainName, Context context);

    /**
     * Gets a L3 Isolation Domain.
     *
     * <p>Retrieves details of this L3 Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3 Isolation Domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the L3IsolationDomain resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    L3IsolationDomainInner getByResourceGroup(String resourceGroupName, String l3IsolationDomainName);

    /**
     * Updates a L3 Isolation Domain.
     *
     * <p>API to update certain properties of the L3 Isolation Domain resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3 Isolation Domain.
     * @param body API to update certain properties of the L3 Isolation Domain resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the L3IsolationDomain resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<L3IsolationDomainInner>, L3IsolationDomainInner> beginUpdate(
        String resourceGroupName, String l3IsolationDomainName, L3IsolationDomainPatch body);

    /**
     * Updates a L3 Isolation Domain.
     *
     * <p>API to update certain properties of the L3 Isolation Domain resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3 Isolation Domain.
     * @param body API to update certain properties of the L3 Isolation Domain resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the L3IsolationDomain resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<L3IsolationDomainInner>, L3IsolationDomainInner> beginUpdate(
        String resourceGroupName, String l3IsolationDomainName, L3IsolationDomainPatch body, Context context);

    /**
     * Updates a L3 Isolation Domain.
     *
     * <p>API to update certain properties of the L3 Isolation Domain resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3 Isolation Domain.
     * @param body API to update certain properties of the L3 Isolation Domain resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the L3IsolationDomain resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    L3IsolationDomainInner update(String resourceGroupName, String l3IsolationDomainName, L3IsolationDomainPatch body);

    /**
     * Updates a L3 Isolation Domain.
     *
     * <p>API to update certain properties of the L3 Isolation Domain resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3 Isolation Domain.
     * @param body API to update certain properties of the L3 Isolation Domain resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the L3IsolationDomain resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    L3IsolationDomainInner update(
        String resourceGroupName, String l3IsolationDomainName, L3IsolationDomainPatch body, Context context);

    /**
     * Deletes a L3 Isolation Domain.
     *
     * <p>Deletes layer 3 connectivity between compute nodes by managed by named L3 Isolation name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3 Isolation Domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String l3IsolationDomainName);

    /**
     * Deletes a L3 Isolation Domain.
     *
     * <p>Deletes layer 3 connectivity between compute nodes by managed by named L3 Isolation name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3 Isolation Domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String l3IsolationDomainName, Context context);

    /**
     * Deletes a L3 Isolation Domain.
     *
     * <p>Deletes layer 3 connectivity between compute nodes by managed by named L3 Isolation name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3 Isolation Domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String l3IsolationDomainName);

    /**
     * Deletes a L3 Isolation Domain.
     *
     * <p>Deletes layer 3 connectivity between compute nodes by managed by named L3 Isolation name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3 Isolation Domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String l3IsolationDomainName, Context context);

    /**
     * List L3IsolationDomains by resource group.
     *
     * <p>Displays L3IsolationDomains list by resource group GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of L3IsolationDomains as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<L3IsolationDomainInner> listByResourceGroup(String resourceGroupName);

    /**
     * List L3IsolationDomains by resource group.
     *
     * <p>Displays L3IsolationDomains list by resource group GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of L3IsolationDomains as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<L3IsolationDomainInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List L3IsolationDomains by subscription.
     *
     * <p>Displays L3IsolationDomains list by subscription GET method.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of L3IsolationDomains as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<L3IsolationDomainInner> list();

    /**
     * List L3IsolationDomains by subscription.
     *
     * <p>Displays L3IsolationDomains list by subscription GET method.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of L3IsolationDomains as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<L3IsolationDomainInner> list(Context context);

    /**
     * executes enable operation to the underlying resources.
     *
     * <p>Enables racks for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginUpdateAdministrativeState(
        String resourceGroupName, String l3IsolationDomainName, UpdateAdministrativeState body);

    /**
     * executes enable operation to the underlying resources.
     *
     * <p>Enables racks for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginUpdateAdministrativeState(
        String resourceGroupName, String l3IsolationDomainName, UpdateAdministrativeState body, Context context);

    /**
     * executes enable operation to the underlying resources.
     *
     * <p>Enables racks for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void updateAdministrativeState(
        String resourceGroupName, String l3IsolationDomainName, UpdateAdministrativeState body);

    /**
     * executes enable operation to the underlying resources.
     *
     * <p>Enables racks for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void updateAdministrativeState(
        String resourceGroupName, String l3IsolationDomainName, UpdateAdministrativeState body, Context context);

    /**
     * Update route targets on CE devices. List the CE network device ARM resource IDs in the request body payload.
     *
     * <p>Update administrative state of option B on CE devices.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginUpdateOptionBAdministrativeState(
        String resourceGroupName, String l3IsolationDomainName, UpdateAdministrativeState body);

    /**
     * Update route targets on CE devices. List the CE network device ARM resource IDs in the request body payload.
     *
     * <p>Update administrative state of option B on CE devices.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginUpdateOptionBAdministrativeState(
        String resourceGroupName, String l3IsolationDomainName, UpdateAdministrativeState body, Context context);

    /**
     * Update route targets on CE devices. List the CE network device ARM resource IDs in the request body payload.
     *
     * <p>Update administrative state of option B on CE devices.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void updateOptionBAdministrativeState(
        String resourceGroupName, String l3IsolationDomainName, UpdateAdministrativeState body);

    /**
     * Update route targets on CE devices. List the CE network device ARM resource IDs in the request body payload.
     *
     * <p>Update administrative state of option B on CE devices.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void updateOptionBAdministrativeState(
        String resourceGroupName, String l3IsolationDomainName, UpdateAdministrativeState body, Context context);

    /**
     * executes clear ARP operation to the underlying resources.
     *
     * <p>Clears ARP tables for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginClearArpTable(
        String resourceGroupName, String l3IsolationDomainName, EnableDisableOnResources body);

    /**
     * executes clear ARP operation to the underlying resources.
     *
     * <p>Clears ARP tables for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginClearArpTable(
        String resourceGroupName, String l3IsolationDomainName, EnableDisableOnResources body, Context context);

    /**
     * executes clear ARP operation to the underlying resources.
     *
     * <p>Clears ARP tables for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void clearArpTable(String resourceGroupName, String l3IsolationDomainName, EnableDisableOnResources body);

    /**
     * executes clear ARP operation to the underlying resources.
     *
     * <p>Clears ARP tables for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void clearArpTable(
        String resourceGroupName, String l3IsolationDomainName, EnableDisableOnResources body, Context context);

    /**
     * executes ipv6 clear neighbor tables operation to the underlying resources.
     *
     * <p>Clears IPv6 neighbor tables for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginClearNeighborTable(
        String resourceGroupName, String l3IsolationDomainName, EnableDisableOnResources body);

    /**
     * executes ipv6 clear neighbor tables operation to the underlying resources.
     *
     * <p>Clears IPv6 neighbor tables for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginClearNeighborTable(
        String resourceGroupName, String l3IsolationDomainName, EnableDisableOnResources body, Context context);

    /**
     * executes ipv6 clear neighbor tables operation to the underlying resources.
     *
     * <p>Clears IPv6 neighbor tables for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void clearNeighborTable(String resourceGroupName, String l3IsolationDomainName, EnableDisableOnResources body);

    /**
     * executes ipv6 clear neighbor tables operation to the underlying resources.
     *
     * <p>Clears IPv6 neighbor tables for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void clearNeighborTable(
        String resourceGroupName, String l3IsolationDomainName, EnableDisableOnResources body, Context context);
}
