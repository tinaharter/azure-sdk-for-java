// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DayOfWeek;
import com.azure.resourcemanager.datafactory.models.DaysOfWeek;
import com.azure.resourcemanager.datafactory.models.RecurrenceFrequency;
import com.azure.resourcemanager.datafactory.models.RecurrenceSchedule;
import com.azure.resourcemanager.datafactory.models.RecurrenceScheduleOccurrence;
import com.azure.resourcemanager.datafactory.models.ScheduleTriggerRecurrence;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ScheduleTriggerRecurrenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScheduleTriggerRecurrence model = BinaryData.fromString(
            "{\"frequency\":\"Minute\",\"interval\":1449790272,\"startTime\":\"2021-01-15T17:32:17Z\",\"endTime\":\"2021-02-22T01:40:59Z\",\"timeZone\":\"mqbcitlyyphtdwhm\",\"schedule\":{\"minutes\":[758989911],\"hours\":[2057988261],\"weekDays\":[\"Saturday\",\"Wednesday\",\"Saturday\",\"Thursday\"],\"monthDays\":[406785212,1599563071,1148299002],\"monthlyOccurrences\":[{\"day\":\"Monday\",\"occurrence\":1137923293,\"\":{\"ej\":\"dataynsqxyowwrb\"}},{\"day\":\"Wednesday\",\"occurrence\":1214619883,\"\":{\"gidkgsjivdtrtkq\":\"datakswfpqrusxy\"}}],\"\":{\"rdx\":\"dataxslbrttlwaskt\",\"okjnbcdnjexcyhs\":\"datasbbd\"}},\"\":{\"qgimwivqphddewfa\":\"datairaubxfb\",\"zzak\":\"dataajpojz\",\"sqdzivvy\":\"datantwnhpc\",\"uq\":\"dataysavevnerpyz\"}}")
            .toObject(ScheduleTriggerRecurrence.class);
        Assertions.assertEquals(RecurrenceFrequency.MINUTE, model.frequency());
        Assertions.assertEquals(1449790272, model.interval());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-15T17:32:17Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-22T01:40:59Z"), model.endTime());
        Assertions.assertEquals("mqbcitlyyphtdwhm", model.timeZone());
        Assertions.assertEquals(758989911, model.schedule().minutes().get(0));
        Assertions.assertEquals(2057988261, model.schedule().hours().get(0));
        Assertions.assertEquals(DaysOfWeek.SATURDAY, model.schedule().weekDays().get(0));
        Assertions.assertEquals(406785212, model.schedule().monthDays().get(0));
        Assertions.assertEquals(DayOfWeek.MONDAY, model.schedule().monthlyOccurrences().get(0).day());
        Assertions.assertEquals(1137923293, model.schedule().monthlyOccurrences().get(0).occurrence());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScheduleTriggerRecurrence model = new ScheduleTriggerRecurrence().withFrequency(RecurrenceFrequency.MINUTE)
            .withInterval(1449790272)
            .withStartTime(OffsetDateTime.parse("2021-01-15T17:32:17Z"))
            .withEndTime(OffsetDateTime.parse("2021-02-22T01:40:59Z"))
            .withTimeZone("mqbcitlyyphtdwhm")
            .withSchedule(new RecurrenceSchedule().withMinutes(Arrays.asList(758989911))
                .withHours(Arrays.asList(2057988261))
                .withWeekDays(
                    Arrays.asList(DaysOfWeek.SATURDAY, DaysOfWeek.WEDNESDAY, DaysOfWeek.SATURDAY, DaysOfWeek.THURSDAY))
                .withMonthDays(Arrays.asList(406785212, 1599563071, 1148299002))
                .withMonthlyOccurrences(Arrays.asList(
                    new RecurrenceScheduleOccurrence().withDay(DayOfWeek.MONDAY)
                        .withOccurrence(1137923293)
                        .withAdditionalProperties(mapOf()),
                    new RecurrenceScheduleOccurrence().withDay(DayOfWeek.WEDNESDAY)
                        .withOccurrence(1214619883)
                        .withAdditionalProperties(mapOf())))
                .withAdditionalProperties(mapOf()))
            .withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(ScheduleTriggerRecurrence.class);
        Assertions.assertEquals(RecurrenceFrequency.MINUTE, model.frequency());
        Assertions.assertEquals(1449790272, model.interval());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-15T17:32:17Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-22T01:40:59Z"), model.endTime());
        Assertions.assertEquals("mqbcitlyyphtdwhm", model.timeZone());
        Assertions.assertEquals(758989911, model.schedule().minutes().get(0));
        Assertions.assertEquals(2057988261, model.schedule().hours().get(0));
        Assertions.assertEquals(DaysOfWeek.SATURDAY, model.schedule().weekDays().get(0));
        Assertions.assertEquals(406785212, model.schedule().monthDays().get(0));
        Assertions.assertEquals(DayOfWeek.MONDAY, model.schedule().monthlyOccurrences().get(0).day());
        Assertions.assertEquals(1137923293, model.schedule().monthlyOccurrences().get(0).occurrence());
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
