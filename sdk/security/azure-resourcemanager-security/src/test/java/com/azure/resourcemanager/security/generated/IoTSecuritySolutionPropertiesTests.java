// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.IoTSecuritySolutionProperties;
import com.azure.resourcemanager.security.models.AdditionalWorkspaceDataType;
import com.azure.resourcemanager.security.models.AdditionalWorkspaceType;
import com.azure.resourcemanager.security.models.AdditionalWorkspacesProperties;
import com.azure.resourcemanager.security.models.DataSource;
import com.azure.resourcemanager.security.models.ExportData;
import com.azure.resourcemanager.security.models.RecommendationConfigStatus;
import com.azure.resourcemanager.security.models.RecommendationConfigurationProperties;
import com.azure.resourcemanager.security.models.RecommendationType;
import com.azure.resourcemanager.security.models.SecuritySolutionStatus;
import com.azure.resourcemanager.security.models.UnmaskedIpLoggingStatus;
import com.azure.resourcemanager.security.models.UserDefinedResourcesProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class IoTSecuritySolutionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IoTSecuritySolutionProperties model = BinaryData.fromString(
            "{\"workspace\":\"vkiwrsiwdyjqu\",\"displayName\":\"ykcrraue\",\"status\":\"Disabled\",\"export\":[\"RawEvents\",\"RawEvents\"],\"disabledDataSources\":[\"TwinData\"],\"iotHubs\":[\"acbcb\"],\"userDefinedResources\":{\"query\":\"dlqidywmhmp\",\"querySubscriptions\":[\"ril\",\"fbnrq\"]},\"autoDiscoveredResources\":[\"ztpb\"],\"recommendationsConfiguration\":[{\"recommendationType\":\"IoT_VulnerableTLSCipherSuite\",\"name\":\"xjtomalswbn\",\"status\":\"Enabled\"},{\"recommendationType\":\"IoT_EdgeLoggingOptions\",\"name\":\"pld\",\"status\":\"Disabled\"},{\"recommendationType\":\"IoT_VulnerableTLSCipherSuite\",\"name\":\"sfzygleexahv\",\"status\":\"Enabled\"},{\"recommendationType\":\"IoT_IPFilter_PermissiveRule\",\"name\":\"sbrcary\",\"status\":\"Enabled\"}],\"unmaskedIpLoggingStatus\":\"Disabled\",\"additionalWorkspaces\":[{\"workspace\":\"oaqa\",\"type\":\"Sentinel\",\"dataTypes\":[\"RawEvents\",\"RawEvents\",\"RawEvents\"]},{\"workspace\":\"mk\",\"type\":\"Sentinel\",\"dataTypes\":[\"Alerts\"]},{\"workspace\":\"ulubefgybp\",\"type\":\"Sentinel\",\"dataTypes\":[\"RawEvents\",\"RawEvents\"]},{\"workspace\":\"mpzkrvfyifkd\",\"type\":\"Sentinel\",\"dataTypes\":[\"RawEvents\",\"Alerts\"]}]}")
            .toObject(IoTSecuritySolutionProperties.class);
        Assertions.assertEquals("vkiwrsiwdyjqu", model.workspace());
        Assertions.assertEquals("ykcrraue", model.displayName());
        Assertions.assertEquals(SecuritySolutionStatus.DISABLED, model.status());
        Assertions.assertEquals(ExportData.RAW_EVENTS, model.export().get(0));
        Assertions.assertEquals(DataSource.TWIN_DATA, model.disabledDataSources().get(0));
        Assertions.assertEquals("acbcb", model.iotHubs().get(0));
        Assertions.assertEquals("dlqidywmhmp", model.userDefinedResources().query());
        Assertions.assertEquals("ril", model.userDefinedResources().querySubscriptions().get(0));
        Assertions.assertEquals(RecommendationType.IO_T_VULNERABLE_TLSCIPHER_SUITE,
            model.recommendationsConfiguration().get(0).recommendationType());
        Assertions.assertEquals(RecommendationConfigStatus.ENABLED,
            model.recommendationsConfiguration().get(0).status());
        Assertions.assertEquals(UnmaskedIpLoggingStatus.DISABLED, model.unmaskedIpLoggingStatus());
        Assertions.assertEquals("oaqa", model.additionalWorkspaces().get(0).workspace());
        Assertions.assertEquals(AdditionalWorkspaceType.SENTINEL, model.additionalWorkspaces().get(0).type());
        Assertions.assertEquals(AdditionalWorkspaceDataType.RAW_EVENTS,
            model.additionalWorkspaces().get(0).dataTypes().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IoTSecuritySolutionProperties model = new IoTSecuritySolutionProperties().withWorkspace("vkiwrsiwdyjqu")
            .withDisplayName("ykcrraue").withStatus(SecuritySolutionStatus.DISABLED)
            .withExport(Arrays.asList(ExportData.RAW_EVENTS, ExportData.RAW_EVENTS))
            .withDisabledDataSources(Arrays.asList(DataSource.TWIN_DATA)).withIotHubs(Arrays.asList("acbcb"))
            .withUserDefinedResources(new UserDefinedResourcesProperties().withQuery("dlqidywmhmp")
                .withQuerySubscriptions(Arrays.asList("ril", "fbnrq")))
            .withRecommendationsConfiguration(Arrays.asList(
                new RecommendationConfigurationProperties()
                    .withRecommendationType(RecommendationType.IO_T_VULNERABLE_TLSCIPHER_SUITE)
                    .withStatus(RecommendationConfigStatus.ENABLED),
                new RecommendationConfigurationProperties()
                    .withRecommendationType(RecommendationType.IO_T_EDGE_LOGGING_OPTIONS)
                    .withStatus(RecommendationConfigStatus.DISABLED),
                new RecommendationConfigurationProperties()
                    .withRecommendationType(RecommendationType.IO_T_VULNERABLE_TLSCIPHER_SUITE)
                    .withStatus(RecommendationConfigStatus.ENABLED),
                new RecommendationConfigurationProperties()
                    .withRecommendationType(RecommendationType.IO_T_IPFILTER_PERMISSIVE_RULE)
                    .withStatus(RecommendationConfigStatus.ENABLED)))
            .withUnmaskedIpLoggingStatus(UnmaskedIpLoggingStatus.DISABLED)
            .withAdditionalWorkspaces(Arrays.asList(
                new AdditionalWorkspacesProperties().withWorkspace("oaqa").withType(AdditionalWorkspaceType.SENTINEL)
                    .withDataTypes(Arrays.asList(AdditionalWorkspaceDataType.RAW_EVENTS,
                        AdditionalWorkspaceDataType.RAW_EVENTS, AdditionalWorkspaceDataType.RAW_EVENTS)),
                new AdditionalWorkspacesProperties().withWorkspace("mk").withType(AdditionalWorkspaceType.SENTINEL)
                    .withDataTypes(Arrays.asList(AdditionalWorkspaceDataType.ALERTS)),
                new AdditionalWorkspacesProperties().withWorkspace("ulubefgybp")
                    .withType(AdditionalWorkspaceType.SENTINEL).withDataTypes(
                        Arrays.asList(AdditionalWorkspaceDataType.RAW_EVENTS, AdditionalWorkspaceDataType.RAW_EVENTS)),
                new AdditionalWorkspacesProperties().withWorkspace("mpzkrvfyifkd")
                    .withType(AdditionalWorkspaceType.SENTINEL).withDataTypes(
                        Arrays.asList(AdditionalWorkspaceDataType.RAW_EVENTS, AdditionalWorkspaceDataType.ALERTS))));
        model = BinaryData.fromObject(model).toObject(IoTSecuritySolutionProperties.class);
        Assertions.assertEquals("vkiwrsiwdyjqu", model.workspace());
        Assertions.assertEquals("ykcrraue", model.displayName());
        Assertions.assertEquals(SecuritySolutionStatus.DISABLED, model.status());
        Assertions.assertEquals(ExportData.RAW_EVENTS, model.export().get(0));
        Assertions.assertEquals(DataSource.TWIN_DATA, model.disabledDataSources().get(0));
        Assertions.assertEquals("acbcb", model.iotHubs().get(0));
        Assertions.assertEquals("dlqidywmhmp", model.userDefinedResources().query());
        Assertions.assertEquals("ril", model.userDefinedResources().querySubscriptions().get(0));
        Assertions.assertEquals(RecommendationType.IO_T_VULNERABLE_TLSCIPHER_SUITE,
            model.recommendationsConfiguration().get(0).recommendationType());
        Assertions.assertEquals(RecommendationConfigStatus.ENABLED,
            model.recommendationsConfiguration().get(0).status());
        Assertions.assertEquals(UnmaskedIpLoggingStatus.DISABLED, model.unmaskedIpLoggingStatus());
        Assertions.assertEquals("oaqa", model.additionalWorkspaces().get(0).workspace());
        Assertions.assertEquals(AdditionalWorkspaceType.SENTINEL, model.additionalWorkspaces().get(0).type());
        Assertions.assertEquals(AdditionalWorkspaceDataType.RAW_EVENTS,
            model.additionalWorkspaces().get(0).dataTypes().get(0));
    }
}
