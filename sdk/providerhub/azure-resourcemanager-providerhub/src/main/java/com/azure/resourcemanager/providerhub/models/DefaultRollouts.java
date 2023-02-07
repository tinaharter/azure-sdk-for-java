// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of DefaultRollouts. */
public interface DefaultRollouts {
    /**
     * Gets the default rollout details.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param rolloutName The rollout name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default rollout details along with {@link Response}.
     */
    Response<DefaultRollout> getWithResponse(String providerNamespace, String rolloutName, Context context);

    /**
     * Gets the default rollout details.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param rolloutName The rollout name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default rollout details.
     */
    DefaultRollout get(String providerNamespace, String rolloutName);

    /**
     * Deletes the rollout resource. Rollout must be in terminal state.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param rolloutName The rollout name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByResourceGroupWithResponse(String providerNamespace, String rolloutName, Context context);

    /**
     * Deletes the rollout resource. Rollout must be in terminal state.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param rolloutName The rollout name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String providerNamespace, String rolloutName);

    /**
     * Gets the list of the rollouts for the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the rollouts for the given provider as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DefaultRollout> listByProviderRegistration(String providerNamespace);

    /**
     * Gets the list of the rollouts for the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the rollouts for the given provider as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DefaultRollout> listByProviderRegistration(String providerNamespace, Context context);

    /**
     * Stops or cancels the rollout, if in progress.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param rolloutName The rollout name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> stopWithResponse(String providerNamespace, String rolloutName, Context context);

    /**
     * Stops or cancels the rollout, if in progress.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param rolloutName The rollout name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String providerNamespace, String rolloutName);

    /**
     * Gets the default rollout details.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default rollout details along with {@link Response}.
     */
    DefaultRollout getById(String id);

    /**
     * Gets the default rollout details.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default rollout details along with {@link Response}.
     */
    Response<DefaultRollout> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the rollout resource. Rollout must be in terminal state.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the rollout resource. Rollout must be in terminal state.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new DefaultRollout resource.
     *
     * @param name resource name.
     * @return the first stage of the new DefaultRollout definition.
     */
    DefaultRollout.DefinitionStages.Blank define(String name);
}
