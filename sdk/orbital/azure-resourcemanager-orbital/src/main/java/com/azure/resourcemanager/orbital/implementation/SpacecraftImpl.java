// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.orbital.fluent.models.SpacecraftInner;
import com.azure.resourcemanager.orbital.models.AvailableContacts;
import com.azure.resourcemanager.orbital.models.ContactParameters;
import com.azure.resourcemanager.orbital.models.Spacecraft;
import com.azure.resourcemanager.orbital.models.SpacecraftLink;
import com.azure.resourcemanager.orbital.models.SpacecraftsPropertiesProvisioningState;
import com.azure.resourcemanager.orbital.models.TagsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class SpacecraftImpl implements Spacecraft, Spacecraft.Definition, Spacecraft.Update {
    private SpacecraftInner innerObject;

    private final com.azure.resourcemanager.orbital.OrbitalManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public SpacecraftsPropertiesProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String noradId() {
        return this.innerModel().noradId();
    }

    public String titleLine() {
        return this.innerModel().titleLine();
    }

    public String tleLine1() {
        return this.innerModel().tleLine1();
    }

    public String tleLine2() {
        return this.innerModel().tleLine2();
    }

    public List<SpacecraftLink> links() {
        List<SpacecraftLink> inner = this.innerModel().links();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public SpacecraftInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.orbital.OrbitalManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String spacecraftName;

    private TagsObject updateParameters;

    public SpacecraftImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Spacecraft create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSpacecrafts()
                .createOrUpdate(resourceGroupName, spacecraftName, this.innerModel(), Context.NONE);
        return this;
    }

    public Spacecraft create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSpacecrafts()
                .createOrUpdate(resourceGroupName, spacecraftName, this.innerModel(), context);
        return this;
    }

    SpacecraftImpl(String name, com.azure.resourcemanager.orbital.OrbitalManager serviceManager) {
        this.innerObject = new SpacecraftInner();
        this.serviceManager = serviceManager;
        this.spacecraftName = name;
    }

    public SpacecraftImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public Spacecraft apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSpacecrafts()
                .updateTags(resourceGroupName, spacecraftName, updateParameters, Context.NONE);
        return this;
    }

    public Spacecraft apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSpacecrafts()
                .updateTags(resourceGroupName, spacecraftName, updateParameters, context);
        return this;
    }

    SpacecraftImpl(SpacecraftInner innerObject, com.azure.resourcemanager.orbital.OrbitalManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.spacecraftName = Utils.getValueFromIdByName(innerObject.id(), "spacecrafts");
    }

    public Spacecraft refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSpacecrafts()
                .getByResourceGroupWithResponse(resourceGroupName, spacecraftName, Context.NONE)
                .getValue();
        return this;
    }

    public Spacecraft refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSpacecrafts()
                .getByResourceGroupWithResponse(resourceGroupName, spacecraftName, context)
                .getValue();
        return this;
    }

    public PagedIterable<AvailableContacts> listAvailableContacts(ContactParameters parameters) {
        return serviceManager.spacecrafts().listAvailableContacts(resourceGroupName, spacecraftName, parameters);
    }

    public PagedIterable<AvailableContacts> listAvailableContacts(ContactParameters parameters, Context context) {
        return serviceManager
            .spacecrafts()
            .listAvailableContacts(resourceGroupName, spacecraftName, parameters, context);
    }

    public SpacecraftImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public SpacecraftImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public SpacecraftImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public SpacecraftImpl withProvisioningState(SpacecraftsPropertiesProvisioningState provisioningState) {
        this.innerModel().withProvisioningState(provisioningState);
        return this;
    }

    public SpacecraftImpl withNoradId(String noradId) {
        this.innerModel().withNoradId(noradId);
        return this;
    }

    public SpacecraftImpl withTitleLine(String titleLine) {
        this.innerModel().withTitleLine(titleLine);
        return this;
    }

    public SpacecraftImpl withTleLine1(String tleLine1) {
        this.innerModel().withTleLine1(tleLine1);
        return this;
    }

    public SpacecraftImpl withTleLine2(String tleLine2) {
        this.innerModel().withTleLine2(tleLine2);
        return this;
    }

    public SpacecraftImpl withLinks(List<SpacecraftLink> links) {
        this.innerModel().withLinks(links);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}