// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.costmanagement.CostManagementManager;
import com.azure.resourcemanager.costmanagement.models.Alert;
import com.azure.resourcemanager.costmanagement.models.AlertCategory;
import com.azure.resourcemanager.costmanagement.models.AlertCriteria;
import com.azure.resourcemanager.costmanagement.models.AlertOperator;
import com.azure.resourcemanager.costmanagement.models.AlertSource;
import com.azure.resourcemanager.costmanagement.models.AlertStatus;
import com.azure.resourcemanager.costmanagement.models.AlertTimeGrainType;
import com.azure.resourcemanager.costmanagement.models.AlertType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AlertsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"definition\":{\"type\":\"Quota\",\"category\":\"System\",\"criteria\":\"CrossCloudCollectionError\"},\"description\":\"uruocbgo\",\"source\":\"Preset\",\"details\":{\"timeGrainType\":\"None\",\"periodStartDate\":\"bfhjxakvvjgsl\",\"triggeredBy\":\"dilmyww\",\"resourceGroupFilter\":[],\"resourceFilter\":[],\"meterFilter\":[],\"tagFilter\":\"datanye\",\"operator\":\"EqualTo\",\"unit\":\"udtjuewbc\",\"contactEmails\":[],\"contactGroups\":[],\"contactRoles\":[],\"overridingAlert\":\"hcjyxc\",\"departmentName\":\"bvpa\",\"companyName\":\"kkudzp\",\"enrollmentNumber\":\"wjplma\",\"enrollmentStartDate\":\"tcyohpfkyrk\",\"enrollmentEndDate\":\"dg\"},\"costEntityId\":\"sjkmnwqj\",\"status\":\"None\",\"creationTime\":\"iyhddvi\",\"closeTime\":\"egfnmntfpmvmemfn\",\"modificationTime\":\"dwvvba\",\"statusModificationUserName\":\"lllchpodb\",\"statusModificationTime\":\"vwrdnhfukuvsj\"},\"eTag\":\"wsmystuluqypf\",\"id\":\"vlerchpqbmfpjba\",\"name\":\"widf\",\"type\":\"xsspuunnoxyhk\"}";

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

        CostManagementManager manager =
            CostManagementManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        Alert response =
            manager.alerts().getWithResponse("opidkqqfkuv", "cxkdmligovi", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("wsmystuluqypf", response.etag());
        Assertions.assertEquals(AlertType.QUOTA, response.definition().type());
        Assertions.assertEquals(AlertCategory.SYSTEM, response.definition().category());
        Assertions.assertEquals(AlertCriteria.CROSS_CLOUD_COLLECTION_ERROR, response.definition().criteria());
        Assertions.assertEquals("uruocbgo", response.description());
        Assertions.assertEquals(AlertSource.PRESET, response.source());
        Assertions.assertEquals(AlertTimeGrainType.NONE, response.details().timeGrainType());
        Assertions.assertEquals("bfhjxakvvjgsl", response.details().periodStartDate());
        Assertions.assertEquals("dilmyww", response.details().triggeredBy());
        Assertions.assertEquals(AlertOperator.EQUAL_TO, response.details().operator());
        Assertions.assertEquals("udtjuewbc", response.details().unit());
        Assertions.assertEquals("hcjyxc", response.details().overridingAlert());
        Assertions.assertEquals("bvpa", response.details().departmentName());
        Assertions.assertEquals("kkudzp", response.details().companyName());
        Assertions.assertEquals("wjplma", response.details().enrollmentNumber());
        Assertions.assertEquals("tcyohpfkyrk", response.details().enrollmentStartDate());
        Assertions.assertEquals("dg", response.details().enrollmentEndDate());
        Assertions.assertEquals("sjkmnwqj", response.costEntityId());
        Assertions.assertEquals(AlertStatus.NONE, response.status());
        Assertions.assertEquals("iyhddvi", response.creationTime());
        Assertions.assertEquals("egfnmntfpmvmemfn", response.closeTime());
        Assertions.assertEquals("dwvvba", response.modificationTime());
        Assertions.assertEquals("lllchpodb", response.statusModificationUsername());
        Assertions.assertEquals("vwrdnhfukuvsj", response.statusModificationTime());
    }
}
