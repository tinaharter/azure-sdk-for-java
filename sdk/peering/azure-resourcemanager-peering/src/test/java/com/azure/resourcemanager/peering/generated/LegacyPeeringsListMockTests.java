// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.peering.PeeringManager;
import com.azure.resourcemanager.peering.models.DirectPeeringType;
import com.azure.resourcemanager.peering.models.Family;
import com.azure.resourcemanager.peering.models.Kind;
import com.azure.resourcemanager.peering.models.LegacyPeeringsKind;
import com.azure.resourcemanager.peering.models.Peering;
import com.azure.resourcemanager.peering.models.Size;
import com.azure.resourcemanager.peering.models.Tier;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class LegacyPeeringsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"sku\":{\"name\":\"zapvhelx\",\"tier\":\"Premium\",\"family\":\"Direct\",\"size\":\"Unlimited\"},\"kind\":\"Direct\",\"properties\":{\"direct\":{\"connections\":[],\"useForPeeringService\":true,\"directPeeringType\":\"Voice\"},\"exchange\":{\"connections\":[]},\"peeringLocation\":\"gciqibrh\",\"provisioningState\":\"Failed\"},\"location\":\"sdqrhzoymibmrq\",\"tags\":{\"ofyyvoqacpi\":\"ahwfluszdtmhrk\",\"nwashrtd\":\"xpbtgiwbwo\"},\"id\":\"kcnqxwbpo\",\"name\":\"ulpiuj\",\"type\":\"aasipqi\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        PeeringManager manager =
            PeeringManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Peering> response =
            manager
                .legacyPeerings()
                .list("fqvm", LegacyPeeringsKind.EXCHANGE, 1181340997, com.azure.core.util.Context.NONE);

        Assertions.assertEquals("zapvhelx", response.iterator().next().sku().name());
        Assertions.assertEquals(Tier.PREMIUM, response.iterator().next().sku().tier());
        Assertions.assertEquals(Family.DIRECT, response.iterator().next().sku().family());
        Assertions.assertEquals(Size.UNLIMITED, response.iterator().next().sku().size());
        Assertions.assertEquals(Kind.DIRECT, response.iterator().next().kind());
        Assertions.assertEquals("sdqrhzoymibmrq", response.iterator().next().location());
        Assertions.assertEquals("ahwfluszdtmhrk", response.iterator().next().tags().get("ofyyvoqacpi"));
        Assertions.assertEquals(DirectPeeringType.VOICE, response.iterator().next().direct().directPeeringType());
        Assertions.assertEquals("gciqibrh", response.iterator().next().peeringLocation());
    }
}
