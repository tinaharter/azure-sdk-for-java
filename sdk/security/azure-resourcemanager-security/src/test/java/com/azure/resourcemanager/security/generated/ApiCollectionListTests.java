// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.ApiCollectionList;

public final class ApiCollectionListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApiCollectionList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Updating\",\"displayName\":\"bnvt\",\"discoveredVia\":\"fwalzyxwhoeamo\",\"baseUrl\":\"bdoeysf\",\"numberOfApiEndpoints\":115379259988907308,\"numberOfInactiveApiEndpoints\":7484851955086967801,\"numberOfUnauthenticatedApiEndpoints\":3366388187827395703,\"numberOfExternalApiEndpoints\":7830352962326984124,\"numberOfApiEndpointsWithSensitiveDataExposed\":8378557630391449357,\"sensitivityLabel\":\"nfeubt\"},\"id\":\"jyrkwfug\",\"name\":\"phrrkuum\",\"type\":\"qdurhzzfopue\"},{\"properties\":{\"provisioningState\":\"Failed\",\"displayName\":\"wlujopwnibit\",\"discoveredVia\":\"zt\",\"baseUrl\":\"qumqvfmwcaddt\",\"numberOfApiEndpoints\":8767171436635436930,\"numberOfInactiveApiEndpoints\":7380863156780808017,\"numberOfUnauthenticatedApiEndpoints\":4975828083407736565,\"numberOfExternalApiEndpoints\":8067064004219740265,\"numberOfApiEndpointsWithSensitiveDataExposed\":2106505080710426185,\"sensitivityLabel\":\"nzzryizwbxgde\"},\"id\":\"xlayunomir\",\"name\":\"p\",\"type\":\"abenqlamwmg\"},{\"properties\":{\"provisioningState\":\"Updating\",\"displayName\":\"f\",\"discoveredVia\":\"bcpjstbhem\",\"baseUrl\":\"u\",\"numberOfApiEndpoints\":6017386433288132745,\"numberOfInactiveApiEndpoints\":5146126814763670107,\"numberOfUnauthenticatedApiEndpoints\":7542800372695799838,\"numberOfExternalApiEndpoints\":529089491409372777,\"numberOfApiEndpointsWithSensitiveDataExposed\":4372036630985893515,\"sensitivityLabel\":\"zyvbsuadulpodk\"},\"id\":\"x\",\"name\":\"f\",\"type\":\"bkzhmhjd\"},{\"properties\":{\"provisioningState\":\"Succeeded\",\"displayName\":\"luqrojadhfztlray\",\"discoveredVia\":\"kg\",\"baseUrl\":\"yh\",\"numberOfApiEndpoints\":2057358610917241814,\"numberOfInactiveApiEndpoints\":7350009010593224176,\"numberOfUnauthenticatedApiEndpoints\":6755335094340323068,\"numberOfExternalApiEndpoints\":8268371656304029577,\"numberOfApiEndpointsWithSensitiveDataExposed\":3693645217655410540,\"sensitivityLabel\":\"ecjvxf\"},\"id\":\"qufqizj\",\"name\":\"ppwooaj\",\"type\":\"yyjmjjxiz\"}],\"nextLink\":\"xhnzlslekcttgzkj\"}")
            .toObject(ApiCollectionList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApiCollectionList model = new ApiCollectionList();
        model = BinaryData.fromObject(model).toObject(ApiCollectionList.class);
    }
}
