// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SalesforceObjectDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SalesforceObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SalesforceObjectDataset model = BinaryData.fromString(
            "{\"type\":\"fnhcg\",\"typeProperties\":{\"objectApiName\":\"dataxuyxsxteuikhzn\"},\"description\":\"qsrmrfqderk\",\"structure\":\"datasdcobpmgqlwy\",\"schema\":\"datanbbyzpo\",\"linkedServiceName\":{\"referenceName\":\"zfutgpbygbnb\",\"parameters\":{\"ewflwzhxzuxe\":\"dataiqgtzpv\"}},\"parameters\":{\"jdajdqxymxxyfrd\":{\"type\":\"Object\",\"defaultValue\":\"datalrkqsqvvdkfp\"},\"igwouppvyddqsvc\":{\"type\":\"String\",\"defaultValue\":\"datacetfvgwfwsl\"},\"tfxxepzpxzxlcqz\":{\"type\":\"Int\",\"defaultValue\":\"datanxfrppwwqclmd\"}},\"annotations\":[\"dataiti\"],\"folder\":{\"name\":\"jbsmkirpqni\"},\"\":{\"kcomeobwkeuzlten\":\"datam\"}}")
            .toObject(SalesforceObjectDataset.class);
        Assertions.assertEquals("qsrmrfqderk", model.description());
        Assertions.assertEquals("zfutgpbygbnb", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("jdajdqxymxxyfrd").type());
        Assertions.assertEquals("jbsmkirpqni", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SalesforceObjectDataset model
            = new SalesforceObjectDataset().withDescription("qsrmrfqderk")
                .withStructure("datasdcobpmgqlwy")
                .withSchema("datanbbyzpo")
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("zfutgpbygbnb")
                    .withParameters(mapOf("ewflwzhxzuxe", "dataiqgtzpv")))
                .withParameters(
                    mapOf("jdajdqxymxxyfrd",
                        new ParameterSpecification().withType(ParameterType.OBJECT)
                            .withDefaultValue("datalrkqsqvvdkfp"),
                        "igwouppvyddqsvc",
                        new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("datacetfvgwfwsl"),
                        "tfxxepzpxzxlcqz",
                        new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("datanxfrppwwqclmd")))
                .withAnnotations(Arrays.asList("dataiti"))
                .withFolder(new DatasetFolder().withName("jbsmkirpqni"))
                .withObjectApiName("dataxuyxsxteuikhzn");
        model = BinaryData.fromObject(model).toObject(SalesforceObjectDataset.class);
        Assertions.assertEquals("qsrmrfqderk", model.description());
        Assertions.assertEquals("zfutgpbygbnb", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("jdajdqxymxxyfrd").type());
        Assertions.assertEquals("jbsmkirpqni", model.folder().name());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
