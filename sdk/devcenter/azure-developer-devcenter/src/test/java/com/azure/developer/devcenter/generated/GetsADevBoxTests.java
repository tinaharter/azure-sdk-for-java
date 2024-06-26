// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.developer.devcenter.generated;

import com.azure.developer.devcenter.models.DevBox;
import com.azure.developer.devcenter.models.DevBoxHardwareProfile;
import com.azure.developer.devcenter.models.DevBoxImageReference;
import com.azure.developer.devcenter.models.DevBoxOsType;
import com.azure.developer.devcenter.models.DevBoxProvisioningState;
import com.azure.developer.devcenter.models.DevBoxStorageProfile;
import com.azure.developer.devcenter.models.HibernateSupport;
import com.azure.developer.devcenter.models.OsDisk;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public final class GetsADevBoxTests extends DevCenterClientTestBase {
    @Test
    @Disabled
    public void testGetsADevBoxTests() {
        // method invocation
        DevBox response = devBoxesClient.getDevBox("myProject", "me", "MyDevBox");

        // response assertion
        Assertions.assertNotNull(response);
        // verify property "name"
        Assertions.assertEquals("MyDevBox", response.getName());
        // verify property "projectName"
        Assertions.assertEquals("ContosoProject", response.getProjectName());
        // verify property "poolName"
        Assertions.assertEquals("LargeDevWorkStationPool", response.getPoolName());
        // verify property "hibernateSupport"
        Assertions.assertEquals(HibernateSupport.ENABLED, response.getHibernateSupport());
        // verify property "provisioningState"
        Assertions.assertEquals(DevBoxProvisioningState.SUCCEEDED, response.getProvisioningState());
        // verify property "location"
        Assertions.assertEquals("centralus", response.getLocation());
        // verify property "osType"
        Assertions.assertEquals(DevBoxOsType.WINDOWS, response.getOsType());
        // verify property "userId"
        Assertions.assertEquals("b08e39b4-2ac6-4465-a35e-48322efb0f98", response.getUserId());
        // verify property "hardwareProfile"
        DevBoxHardwareProfile responseHardwareProfile = response.getHardwareProfile();
        Assertions.assertNotNull(responseHardwareProfile);
        Assertions.assertEquals(8, responseHardwareProfile.getVCpus());
        Assertions.assertEquals(32, responseHardwareProfile.getMemoryGb());
        // verify property "storageProfile"
        DevBoxStorageProfile responseStorageProfile = response.getStorageProfile();
        Assertions.assertNotNull(responseStorageProfile);
        OsDisk responseStorageProfileOsDisk = responseStorageProfile.getOsDisk();
        Assertions.assertNotNull(responseStorageProfileOsDisk);
        Assertions.assertEquals(1024, responseStorageProfileOsDisk.getDiskSizeGb());
        // verify property "imageReference"
        DevBoxImageReference responseImageReference = response.getImageReference();
        Assertions.assertNotNull(responseImageReference);
        Assertions.assertEquals("DevImage", responseImageReference.getName());
        Assertions.assertEquals("1.0.0", responseImageReference.getVersion());
        Assertions.assertNotNull(responseImageReference.getPublishedDate());
    }
}
