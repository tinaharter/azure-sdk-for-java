// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iotfirmwaredefense.models.WorkspaceList;
import org.junit.jupiter.api.Assertions;

public final class WorkspaceListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkspaceList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Failed\"},\"location\":\"siebtfhvpesapskr\",\"tags\":{\"ncwscwsvlxoto\":\"hjjdhtldwkyzxuut\",\"cykvceo\":\"twrupqsxvnm\",\"vnotyfjfcnj\":\"eil\",\"nxdhbt\":\"k\"},\"id\":\"kphywpnvjto\",\"name\":\"nermcl\",\"type\":\"plpho\"},{\"properties\":{\"provisioningState\":\"Succeeded\"},\"location\":\"pabgyeps\",\"tags\":{\"wfqkquj\":\"azqugxywpmueefj\",\"cq\":\"dsuyonobgla\",\"g\":\"tcc\",\"wfudwpzntxhdzhl\":\"udxytlmoyrx\"},\"id\":\"qj\",\"name\":\"hckfrlhrx\",\"type\":\"bkyvp\"},{\"properties\":{\"provisioningState\":\"Accepted\"},\"location\":\"z\",\"tags\":{\"hhseyv\":\"kafkuwbcrnwbm\"},\"id\":\"us\",\"name\":\"tslhspkdeem\",\"type\":\"ofmxagkvtmelmqkr\"}],\"nextLink\":\"hvljuahaquh\"}")
            .toObject(WorkspaceList.class);
        Assertions.assertEquals("hvljuahaquh", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkspaceList model = new WorkspaceList().withNextLink("hvljuahaquh");
        model = BinaryData.fromObject(model).toObject(WorkspaceList.class);
        Assertions.assertEquals("hvljuahaquh", model.nextLink());
    }
}
