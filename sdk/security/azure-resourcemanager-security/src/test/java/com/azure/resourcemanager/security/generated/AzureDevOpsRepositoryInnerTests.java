// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.AzureDevOpsRepositoryInner;
import com.azure.resourcemanager.security.models.ActionableRemediation;
import com.azure.resourcemanager.security.models.ActionableRemediationState;
import com.azure.resourcemanager.security.models.AnnotateDefaultBranchState;
import com.azure.resourcemanager.security.models.AzureDevOpsRepositoryProperties;
import com.azure.resourcemanager.security.models.CategoryConfiguration;
import com.azure.resourcemanager.security.models.DevOpsProvisioningState;
import com.azure.resourcemanager.security.models.InheritFromParentState;
import com.azure.resourcemanager.security.models.OnboardingState;
import com.azure.resourcemanager.security.models.RuleCategory;
import com.azure.resourcemanager.security.models.TargetBranchConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureDevOpsRepositoryInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureDevOpsRepositoryInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningStatusMessage\":\"uelyetndn\",\"provisioningStatusUpdateTimeUtc\":\"2021-02-21T10:59:07Z\",\"provisioningState\":\"Pending\",\"parentOrgName\":\"agfl\",\"parentProjectName\":\"gm\",\"repoId\":\"wahzjmucftbyr\",\"repoUrl\":\"rohkpigqfusu\",\"visibility\":\"zmkw\",\"onboardingState\":\"Onboarded\",\"actionableRemediation\":{\"state\":\"Enabled\",\"categoryConfigurations\":[{\"minimumSeverityLevel\":\"qe\",\"category\":\"Code\"},{\"minimumSeverityLevel\":\"hjnhgwydyynfsvk\",\"category\":\"Dependencies\"}],\"branchConfiguration\":{\"branchNames\":[\"anarfdlpukhpyrne\"],\"annotateDefaultBranch\":\"Enabled\"},\"inheritFromParentState\":\"Disabled\"}},\"id\":\"eogkhnmgbro\",\"name\":\"xddbhfhpfpaz\",\"type\":\"zoyw\"}")
            .toObject(AzureDevOpsRepositoryInner.class);
        Assertions.assertEquals(DevOpsProvisioningState.PENDING, model.properties().provisioningState());
        Assertions.assertEquals("agfl", model.properties().parentOrgName());
        Assertions.assertEquals("gm", model.properties().parentProjectName());
        Assertions.assertEquals(OnboardingState.ONBOARDED, model.properties().onboardingState());
        Assertions.assertEquals(ActionableRemediationState.ENABLED, model.properties().actionableRemediation().state());
        Assertions.assertEquals("qe",
            model.properties().actionableRemediation().categoryConfigurations().get(0).minimumSeverityLevel());
        Assertions.assertEquals(RuleCategory.CODE,
            model.properties().actionableRemediation().categoryConfigurations().get(0).category());
        Assertions.assertEquals("anarfdlpukhpyrne",
            model.properties().actionableRemediation().branchConfiguration().branchNames().get(0));
        Assertions.assertEquals(AnnotateDefaultBranchState.ENABLED,
            model.properties().actionableRemediation().branchConfiguration().annotateDefaultBranch());
        Assertions.assertEquals(InheritFromParentState.DISABLED,
            model.properties().actionableRemediation().inheritFromParentState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureDevOpsRepositoryInner model = new AzureDevOpsRepositoryInner()
            .withProperties(new AzureDevOpsRepositoryProperties().withProvisioningState(DevOpsProvisioningState.PENDING)
                .withParentOrgName("agfl").withParentProjectName("gm").withOnboardingState(OnboardingState.ONBOARDED)
                .withActionableRemediation(new ActionableRemediation().withState(ActionableRemediationState.ENABLED)
                    .withCategoryConfigurations(Arrays.asList(
                        new CategoryConfiguration().withMinimumSeverityLevel("qe").withCategory(RuleCategory.CODE),
                        new CategoryConfiguration().withMinimumSeverityLevel("hjnhgwydyynfsvk")
                            .withCategory(RuleCategory.DEPENDENCIES)))
                    .withBranchConfiguration(
                        new TargetBranchConfiguration().withBranchNames(Arrays.asList("anarfdlpukhpyrne"))
                            .withAnnotateDefaultBranch(AnnotateDefaultBranchState.ENABLED))
                    .withInheritFromParentState(InheritFromParentState.DISABLED)));
        model = BinaryData.fromObject(model).toObject(AzureDevOpsRepositoryInner.class);
        Assertions.assertEquals(DevOpsProvisioningState.PENDING, model.properties().provisioningState());
        Assertions.assertEquals("agfl", model.properties().parentOrgName());
        Assertions.assertEquals("gm", model.properties().parentProjectName());
        Assertions.assertEquals(OnboardingState.ONBOARDED, model.properties().onboardingState());
        Assertions.assertEquals(ActionableRemediationState.ENABLED, model.properties().actionableRemediation().state());
        Assertions.assertEquals("qe",
            model.properties().actionableRemediation().categoryConfigurations().get(0).minimumSeverityLevel());
        Assertions.assertEquals(RuleCategory.CODE,
            model.properties().actionableRemediation().categoryConfigurations().get(0).category());
        Assertions.assertEquals("anarfdlpukhpyrne",
            model.properties().actionableRemediation().branchConfiguration().branchNames().get(0));
        Assertions.assertEquals(AnnotateDefaultBranchState.ENABLED,
            model.properties().actionableRemediation().branchConfiguration().annotateDefaultBranch());
        Assertions.assertEquals(InheritFromParentState.DISABLED,
            model.properties().actionableRemediation().inheritFromParentState());
    }
}
