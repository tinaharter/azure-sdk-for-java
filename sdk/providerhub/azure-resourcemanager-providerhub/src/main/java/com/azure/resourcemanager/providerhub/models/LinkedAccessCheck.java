// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LinkedAccessCheck model. */
@Fluent
public final class LinkedAccessCheck {
    /*
     * The actionName property.
     */
    @JsonProperty(value = "actionName")
    private String actionName;

    /*
     * The linkedProperty property.
     */
    @JsonProperty(value = "linkedProperty")
    private String linkedProperty;

    /*
     * The linkedAction property.
     */
    @JsonProperty(value = "linkedAction")
    private String linkedAction;

    /*
     * The linkedActionVerb property.
     */
    @JsonProperty(value = "linkedActionVerb")
    private String linkedActionVerb;

    /*
     * The linkedType property.
     */
    @JsonProperty(value = "linkedType")
    private String linkedType;

    /** Creates an instance of LinkedAccessCheck class. */
    public LinkedAccessCheck() {
    }

    /**
     * Get the actionName property: The actionName property.
     *
     * @return the actionName value.
     */
    public String actionName() {
        return this.actionName;
    }

    /**
     * Set the actionName property: The actionName property.
     *
     * @param actionName the actionName value to set.
     * @return the LinkedAccessCheck object itself.
     */
    public LinkedAccessCheck withActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * Get the linkedProperty property: The linkedProperty property.
     *
     * @return the linkedProperty value.
     */
    public String linkedProperty() {
        return this.linkedProperty;
    }

    /**
     * Set the linkedProperty property: The linkedProperty property.
     *
     * @param linkedProperty the linkedProperty value to set.
     * @return the LinkedAccessCheck object itself.
     */
    public LinkedAccessCheck withLinkedProperty(String linkedProperty) {
        this.linkedProperty = linkedProperty;
        return this;
    }

    /**
     * Get the linkedAction property: The linkedAction property.
     *
     * @return the linkedAction value.
     */
    public String linkedAction() {
        return this.linkedAction;
    }

    /**
     * Set the linkedAction property: The linkedAction property.
     *
     * @param linkedAction the linkedAction value to set.
     * @return the LinkedAccessCheck object itself.
     */
    public LinkedAccessCheck withLinkedAction(String linkedAction) {
        this.linkedAction = linkedAction;
        return this;
    }

    /**
     * Get the linkedActionVerb property: The linkedActionVerb property.
     *
     * @return the linkedActionVerb value.
     */
    public String linkedActionVerb() {
        return this.linkedActionVerb;
    }

    /**
     * Set the linkedActionVerb property: The linkedActionVerb property.
     *
     * @param linkedActionVerb the linkedActionVerb value to set.
     * @return the LinkedAccessCheck object itself.
     */
    public LinkedAccessCheck withLinkedActionVerb(String linkedActionVerb) {
        this.linkedActionVerb = linkedActionVerb;
        return this;
    }

    /**
     * Get the linkedType property: The linkedType property.
     *
     * @return the linkedType value.
     */
    public String linkedType() {
        return this.linkedType;
    }

    /**
     * Set the linkedType property: The linkedType property.
     *
     * @param linkedType the linkedType value to set.
     * @return the LinkedAccessCheck object itself.
     */
    public LinkedAccessCheck withLinkedType(String linkedType) {
        this.linkedType = linkedType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
