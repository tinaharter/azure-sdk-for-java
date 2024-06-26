// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.eventgrid.models.PrivateLinkResourcesListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourcesListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResourcesListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"groupId\":\"xkym\",\"displayName\":\"anxrj\",\"requiredMembers\":[\"tw\",\"taoypnyghshxc\"],\"requiredZoneNames\":[\"kgmnsghpxyc\",\"hdrwjjkh\"]},\"id\":\"omacluzvxnqmhr\",\"name\":\"pd\",\"type\":\"mkoisqcssf\"},{\"properties\":{\"groupId\":\"ifmcsypobkdqzr\",\"displayName\":\"sylollgtr\",\"requiredMembers\":[\"ydmxzj\",\"jpvuaurkihcirld\",\"fx\",\"dcoxnbk\"],\"requiredZoneNames\":[\"nurnnq\",\"nqbpi\"]},\"id\":\"qltgrd\",\"name\":\"ypxrx\",\"type\":\"fihwu\"},{\"properties\":{\"groupId\":\"tafsrbxrblmliowx\",\"displayName\":\"spnxwqagnepzw\",\"requiredMembers\":[\"sbs\"],\"requiredZoneNames\":[\"qagwwrxaomz\",\"sgl\"]},\"id\":\"czezkhhlt\",\"name\":\"adhqoa\",\"type\":\"qoyueayfbpcmsplb\"},{\"properties\":{\"groupId\":\"ueq\",\"displayName\":\"wmgn\",\"requiredMembers\":[\"cbbxigdhxi\",\"d\"],\"requiredZoneNames\":[\"edbw\",\"pyqy\",\"bxubmdna\"]},\"id\":\"bqwremjela\",\"name\":\"cigeleohdbvqvw\",\"type\":\"jopwbeonrlkwz\"}],\"nextLink\":\"ybxc\"}")
            .toObject(PrivateLinkResourcesListResult.class);
        Assertions.assertEquals("omacluzvxnqmhr", model.value().get(0).id());
        Assertions.assertEquals("pd", model.value().get(0).name());
        Assertions.assertEquals("mkoisqcssf", model.value().get(0).type());
        Assertions.assertEquals("xkym", model.value().get(0).groupId());
        Assertions.assertEquals("anxrj", model.value().get(0).displayName());
        Assertions.assertEquals("tw", model.value().get(0).requiredMembers().get(0));
        Assertions.assertEquals("kgmnsghpxyc", model.value().get(0).requiredZoneNames().get(0));
        Assertions.assertEquals("ybxc", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkResourcesListResult model = new PrivateLinkResourcesListResult().withValue(Arrays.asList(
            new PrivateLinkResourceInner().withId("omacluzvxnqmhr").withName("pd").withType("mkoisqcssf")
                .withGroupId("xkym").withDisplayName("anxrj").withRequiredMembers(Arrays.asList("tw", "taoypnyghshxc"))
                .withRequiredZoneNames(Arrays.asList("kgmnsghpxyc", "hdrwjjkh")),
            new PrivateLinkResourceInner().withId("qltgrd").withName("ypxrx").withType("fihwu")
                .withGroupId("ifmcsypobkdqzr").withDisplayName("sylollgtr")
                .withRequiredMembers(Arrays.asList("ydmxzj", "jpvuaurkihcirld", "fx", "dcoxnbk"))
                .withRequiredZoneNames(Arrays.asList("nurnnq", "nqbpi")),
            new PrivateLinkResourceInner().withId("czezkhhlt").withName("adhqoa").withType("qoyueayfbpcmsplb")
                .withGroupId("tafsrbxrblmliowx").withDisplayName("spnxwqagnepzw")
                .withRequiredMembers(Arrays.asList("sbs")).withRequiredZoneNames(Arrays.asList("qagwwrxaomz", "sgl")),
            new PrivateLinkResourceInner().withId("bqwremjela").withName("cigeleohdbvqvw").withType("jopwbeonrlkwz")
                .withGroupId("ueq").withDisplayName("wmgn").withRequiredMembers(Arrays.asList("cbbxigdhxi", "d"))
                .withRequiredZoneNames(Arrays.asList("edbw", "pyqy", "bxubmdna"))))
            .withNextLink("ybxc");
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourcesListResult.class);
        Assertions.assertEquals("omacluzvxnqmhr", model.value().get(0).id());
        Assertions.assertEquals("pd", model.value().get(0).name());
        Assertions.assertEquals("mkoisqcssf", model.value().get(0).type());
        Assertions.assertEquals("xkym", model.value().get(0).groupId());
        Assertions.assertEquals("anxrj", model.value().get(0).displayName());
        Assertions.assertEquals("tw", model.value().get(0).requiredMembers().get(0));
        Assertions.assertEquals("kgmnsghpxyc", model.value().get(0).requiredZoneNames().get(0));
        Assertions.assertEquals("ybxc", model.nextLink());
    }
}
