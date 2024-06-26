// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.GalleryImageVersion;
import com.azure.resourcemanager.azurestackhci.models.GalleryImageVersionStorageProfile;
import com.azure.resourcemanager.azurestackhci.models.GalleryOSDiskImage;
import org.junit.jupiter.api.Assertions;

public final class GalleryImageVersionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GalleryImageVersion model =
            BinaryData
                .fromString(
                    "{\"name\":\"ogknygjofjdd\",\"properties\":{\"storageProfile\":{\"osDiskImage\":{\"sizeInMB\":3233201824029317370}}}}")
                .toObject(GalleryImageVersion.class);
        Assertions.assertEquals("ogknygjofjdd", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GalleryImageVersion model =
            new GalleryImageVersion()
                .withName("ogknygjofjdd")
                .withStorageProfile(new GalleryImageVersionStorageProfile().withOsDiskImage(new GalleryOSDiskImage()));
        model = BinaryData.fromObject(model).toObject(GalleryImageVersion.class);
        Assertions.assertEquals("ogknygjofjdd", model.name());
    }
}
