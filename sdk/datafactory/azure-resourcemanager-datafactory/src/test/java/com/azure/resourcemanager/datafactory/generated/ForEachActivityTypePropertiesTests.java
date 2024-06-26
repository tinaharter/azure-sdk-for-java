// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ForEachActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.Activity;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.Expression;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ForEachActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ForEachActivityTypeProperties model = BinaryData.fromString(
            "{\"isSequential\":true,\"batchCount\":1961751824,\"items\":{\"value\":\"rigyg\"},\"activities\":[{\"type\":\"puqilpdzby\",\"name\":\"rvkx\",\"description\":\"fzs\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Skipped\",\"dependsOn\":[{\"activity\":\"ucvq\",\"dependencyConditions\":[\"Succeeded\",\"Succeeded\"],\"\":{\"ktmsphcrn\":\"datad\",\"spykcreu\":\"datavxtz\",\"crdrdkexcyw\":\"datapigsulejukack\"}},{\"activity\":\"riddcnljllypchqh\",\"dependencyConditions\":[\"Skipped\",\"Succeeded\"],\"\":{\"mmpgczxi\":\"datatdzpeliktk\"}},{\"activity\":\"qyvwzxqmvestnr\",\"dependencyConditions\":[\"Skipped\",\"Completed\"],\"\":{\"rxvnjjim\":\"datagyttfzo\",\"huuezxcpxwqg\":\"datacgbdupslw\",\"osipl\":\"datanqueqeabedf\",\"hrgeymspvgatzru\":\"dataygpsahupmmsh\"}}],\"userProperties\":[{\"name\":\"rjswrptxr\",\"value\":\"datacwdleivmuqmzx\"}],\"\":{\"xazkqiqzaead\":\"datahlpnyehhqytjr\"}},{\"type\":\"hpokflxivhozhr\",\"name\":\"bvfljxljgtirn\",\"description\":\"zrbkhyzufkzqtv\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Succeeded\",\"dependsOn\":[{\"activity\":\"uupeflk\",\"dependencyConditions\":[\"Skipped\",\"Succeeded\",\"Skipped\"],\"\":{\"ydntupbrvdgtblx\":\"datahdkeayuowivpne\",\"ztlsnkwullvu\":\"datamdabpifygxuaidr\"}},{\"activity\":\"wymosjzmandjjq\",\"dependencyConditions\":[\"Succeeded\"],\"\":{\"udjrotqdiaxf\":\"dataq\",\"vjaw\":\"dataiwrfocbetlljqkgl\",\"jlcj\":\"dataxvl\",\"c\":\"dataseqmejerjyz\"}},{\"activity\":\"zbjieeivdrqtlcx\",\"dependencyConditions\":[\"Completed\",\"Skipped\"],\"\":{\"vgroewhsnpcwy\":\"datamfxlturx\"}}],\"userProperties\":[{\"name\":\"berxnljtvu\",\"value\":\"datasnzuebyznkd\"},{\"name\":\"hzc\",\"value\":\"dataamnzt\"}],\"\":{\"rrneorb\":\"datasbgksfjqfeeqhjc\"}}]}")
            .toObject(ForEachActivityTypeProperties.class);
        Assertions.assertEquals(true, model.isSequential());
        Assertions.assertEquals(1961751824, model.batchCount());
        Assertions.assertEquals("rigyg", model.items().value());
        Assertions.assertEquals("rvkx", model.activities().get(0).name());
        Assertions.assertEquals("fzs", model.activities().get(0).description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.activities().get(0).state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SKIPPED, model.activities().get(0).onInactiveMarkAs());
        Assertions.assertEquals("ucvq", model.activities().get(0).dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED,
            model.activities().get(0).dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("rjswrptxr", model.activities().get(0).userProperties().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ForEachActivityTypeProperties model
            = new ForEachActivityTypeProperties().withIsSequential(true)
                .withBatchCount(1961751824)
                .withItems(new Expression().withValue("rigyg"))
                .withActivities(
                    Arrays
                        .asList(
                            new Activity().withName("rvkx")
                                .withDescription("fzs")
                                .withState(ActivityState.ACTIVE)
                                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SKIPPED)
                                .withDependsOn(
                                    Arrays.asList(
                                        new ActivityDependency().withActivity("ucvq")
                                            .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED,
                                                DependencyCondition.SUCCEEDED))
                                            .withAdditionalProperties(mapOf()),
                                        new ActivityDependency().withActivity("riddcnljllypchqh")
                                            .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED,
                                                DependencyCondition.SUCCEEDED))
                                            .withAdditionalProperties(mapOf()),
                                        new ActivityDependency().withActivity("qyvwzxqmvestnr")
                                            .withDependencyConditions(Arrays
                                                .asList(DependencyCondition.SKIPPED, DependencyCondition.COMPLETED))
                                            .withAdditionalProperties(mapOf())))
                                .withUserProperties(Arrays
                                    .asList(new UserProperty().withName("rjswrptxr").withValue("datacwdleivmuqmzx")))
                                .withAdditionalProperties(mapOf("type", "puqilpdzby")),
                            new Activity().withName("bvfljxljgtirn")
                                .withDescription("zrbkhyzufkzqtv")
                                .withState(ActivityState.ACTIVE)
                                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SUCCEEDED)
                                .withDependsOn(Arrays.asList(
                                    new ActivityDependency().withActivity("uupeflk")
                                        .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED,
                                            DependencyCondition.SUCCEEDED, DependencyCondition.SKIPPED))
                                        .withAdditionalProperties(mapOf()),
                                    new ActivityDependency().withActivity("wymosjzmandjjq")
                                        .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED))
                                        .withAdditionalProperties(mapOf()),
                                    new ActivityDependency().withActivity("zbjieeivdrqtlcx")
                                        .withDependencyConditions(
                                            Arrays.asList(DependencyCondition.COMPLETED, DependencyCondition.SKIPPED))
                                        .withAdditionalProperties(mapOf())))
                                .withUserProperties(Arrays.asList(
                                    new UserProperty().withName("berxnljtvu").withValue("datasnzuebyznkd"),
                                    new UserProperty().withName("hzc").withValue("dataamnzt")))
                                .withAdditionalProperties(mapOf("type", "hpokflxivhozhr"))));
        model = BinaryData.fromObject(model).toObject(ForEachActivityTypeProperties.class);
        Assertions.assertEquals(true, model.isSequential());
        Assertions.assertEquals(1961751824, model.batchCount());
        Assertions.assertEquals("rigyg", model.items().value());
        Assertions.assertEquals("rvkx", model.activities().get(0).name());
        Assertions.assertEquals("fzs", model.activities().get(0).description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.activities().get(0).state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SKIPPED, model.activities().get(0).onInactiveMarkAs());
        Assertions.assertEquals("ucvq", model.activities().get(0).dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED,
            model.activities().get(0).dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("rjswrptxr", model.activities().get(0).userProperties().get(0).name());
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
