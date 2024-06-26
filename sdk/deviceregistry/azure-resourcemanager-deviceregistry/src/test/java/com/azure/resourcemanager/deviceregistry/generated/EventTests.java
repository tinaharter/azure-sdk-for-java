// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.deviceregistry.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deviceregistry.models.Event;
import com.azure.resourcemanager.deviceregistry.models.EventsObservabilityMode;
import org.junit.jupiter.api.Assertions;

public final class EventTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Event model = BinaryData.fromString(
            "{\"name\":\"itnwuizgazxufi\",\"eventNotifier\":\"uckyf\",\"capabilityId\":\"rfidfvzwdz\",\"observabilityMode\":\"none\",\"eventConfiguration\":\"mwisdkfthwxmnt\"}")
            .toObject(Event.class);
        Assertions.assertEquals("itnwuizgazxufi", model.name());
        Assertions.assertEquals("uckyf", model.eventNotifier());
        Assertions.assertEquals("rfidfvzwdz", model.capabilityId());
        Assertions.assertEquals(EventsObservabilityMode.NONE, model.observabilityMode());
        Assertions.assertEquals("mwisdkfthwxmnt", model.eventConfiguration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Event model = new Event().withName("itnwuizgazxufi")
            .withEventNotifier("uckyf")
            .withCapabilityId("rfidfvzwdz")
            .withObservabilityMode(EventsObservabilityMode.NONE)
            .withEventConfiguration("mwisdkfthwxmnt");
        model = BinaryData.fromObject(model).toObject(Event.class);
        Assertions.assertEquals("itnwuizgazxufi", model.name());
        Assertions.assertEquals("uckyf", model.eventNotifier());
        Assertions.assertEquals("rfidfvzwdz", model.capabilityId());
        Assertions.assertEquals(EventsObservabilityMode.NONE, model.observabilityMode());
        Assertions.assertEquals("mwisdkfthwxmnt", model.eventConfiguration());
    }
}
