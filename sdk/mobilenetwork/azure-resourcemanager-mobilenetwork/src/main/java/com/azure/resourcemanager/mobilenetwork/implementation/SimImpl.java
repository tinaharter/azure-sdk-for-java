// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mobilenetwork.fluent.models.SimInner;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import com.azure.resourcemanager.mobilenetwork.models.Sim;
import com.azure.resourcemanager.mobilenetwork.models.SimPolicyResourceId;
import com.azure.resourcemanager.mobilenetwork.models.SimState;
import com.azure.resourcemanager.mobilenetwork.models.SimStaticIpProperties;
import com.azure.resourcemanager.mobilenetwork.models.SiteProvisioningState;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class SimImpl implements Sim, Sim.Definition, Sim.Update {
    private SimInner innerObject;

    private final com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String authenticationKey() {
        return this.innerModel().authenticationKey();
    }

    public String operatorKeyCode() {
        return this.innerModel().operatorKeyCode();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public SimState simState() {
        return this.innerModel().simState();
    }

    public Map<String, SiteProvisioningState> siteProvisioningState() {
        Map<String, SiteProvisioningState> inner = this.innerModel().siteProvisioningState();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String internationalMobileSubscriberIdentity() {
        return this.innerModel().internationalMobileSubscriberIdentity();
    }

    public String integratedCircuitCardIdentifier() {
        return this.innerModel().integratedCircuitCardIdentifier();
    }

    public String deviceType() {
        return this.innerModel().deviceType();
    }

    public SimPolicyResourceId simPolicy() {
        return this.innerModel().simPolicy();
    }

    public List<SimStaticIpProperties> staticIpConfiguration() {
        List<SimStaticIpProperties> inner = this.innerModel().staticIpConfiguration();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String vendorName() {
        return this.innerModel().vendorName();
    }

    public String vendorKeyFingerprint() {
        return this.innerModel().vendorKeyFingerprint();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public SimInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String simGroupName;

    private String simName;

    public SimImpl withExistingSimGroup(String resourceGroupName, String simGroupName) {
        this.resourceGroupName = resourceGroupName;
        this.simGroupName = simGroupName;
        return this;
    }

    public Sim create() {
        this.innerObject = serviceManager.serviceClient().getSims().createOrUpdate(resourceGroupName, simGroupName,
            simName, this.innerModel(), Context.NONE);
        return this;
    }

    public Sim create(Context context) {
        this.innerObject = serviceManager.serviceClient().getSims().createOrUpdate(resourceGroupName, simGroupName,
            simName, this.innerModel(), context);
        return this;
    }

    SimImpl(String name, com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerObject = new SimInner();
        this.serviceManager = serviceManager;
        this.simName = name;
    }

    public SimImpl update() {
        return this;
    }

    public Sim apply() {
        this.innerObject = serviceManager.serviceClient().getSims().createOrUpdate(resourceGroupName, simGroupName,
            simName, this.innerModel(), Context.NONE);
        return this;
    }

    public Sim apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getSims().createOrUpdate(resourceGroupName, simGroupName,
            simName, this.innerModel(), context);
        return this;
    }

    SimImpl(SimInner innerObject, com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.simGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "simGroups");
        this.simName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "sims");
    }

    public Sim refresh() {
        this.innerObject = serviceManager.serviceClient().getSims()
            .getWithResponse(resourceGroupName, simGroupName, simName, Context.NONE).getValue();
        return this;
    }

    public Sim refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getSims()
            .getWithResponse(resourceGroupName, simGroupName, simName, context).getValue();
        return this;
    }

    public SimImpl withInternationalMobileSubscriberIdentity(String internationalMobileSubscriberIdentity) {
        this.innerModel().withInternationalMobileSubscriberIdentity(internationalMobileSubscriberIdentity);
        return this;
    }

    public SimImpl withAuthenticationKey(String authenticationKey) {
        this.innerModel().withAuthenticationKey(authenticationKey);
        return this;
    }

    public SimImpl withOperatorKeyCode(String operatorKeyCode) {
        this.innerModel().withOperatorKeyCode(operatorKeyCode);
        return this;
    }

    public SimImpl withIntegratedCircuitCardIdentifier(String integratedCircuitCardIdentifier) {
        this.innerModel().withIntegratedCircuitCardIdentifier(integratedCircuitCardIdentifier);
        return this;
    }

    public SimImpl withDeviceType(String deviceType) {
        this.innerModel().withDeviceType(deviceType);
        return this;
    }

    public SimImpl withSimPolicy(SimPolicyResourceId simPolicy) {
        this.innerModel().withSimPolicy(simPolicy);
        return this;
    }

    public SimImpl withStaticIpConfiguration(List<SimStaticIpProperties> staticIpConfiguration) {
        this.innerModel().withStaticIpConfiguration(staticIpConfiguration);
        return this;
    }
}
