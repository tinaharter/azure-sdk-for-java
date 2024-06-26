// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.azurearcdata.AzureArcDataManager;
import com.azure.resourcemanager.azurearcdata.models.ArcSqlServerLicenseType;
import com.azure.resourcemanager.azurearcdata.models.ConnectionStatus;
import com.azure.resourcemanager.azurearcdata.models.DefenderStatus;
import com.azure.resourcemanager.azurearcdata.models.EditionType;
import com.azure.resourcemanager.azurearcdata.models.SqlServerInstance;
import com.azure.resourcemanager.azurearcdata.models.SqlVersion;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SqlServerInstancesGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"version\":\"SQL Server"
                + " 2019\",\"edition\":\"Express\",\"containerResourceId\":\"vnhdldwmgxcxr\",\"createTime\":\"pmutwuo\",\"vCore\":\"rpkhjwn\",\"status\":\"Connected\",\"patchLevel\":\"sluicpdggkzz\",\"collation\":\"mbmpaxmodfvuefy\",\"currentVersion\":\"bpfvm\",\"instanceName\":\"hrfou\",\"tcpDynamicPorts\":\"taakc\",\"tcpStaticPorts\":\"iyzvqtmnub\",\"productId\":\"kpzksmondjmq\",\"licenseType\":\"Undefined\",\"azureDefenderStatusLastUpdated\":\"2021-02-28T11:46:10Z\",\"azureDefenderStatus\":\"Protected\",\"provisioningState\":\"kopkwhojvpajqgx\"},\"location\":\"mocmbqfqvmk\",\"tags\":{\"rgly\":\"zapvhelx\"},\"id\":\"tddckcb\",\"name\":\"uejrjxgc\",\"type\":\"qibrhosxsdqrhzoy\"}";

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

        AzureArcDataManager manager =
            AzureArcDataManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        SqlServerInstance response =
            manager
                .sqlServerInstances()
                .getByResourceGroupWithResponse("rhvoods", "tbobz", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("mocmbqfqvmk", response.location());
        Assertions.assertEquals("zapvhelx", response.tags().get("rgly"));
        Assertions.assertEquals(SqlVersion.SQL_SERVER_2019, response.properties().version());
        Assertions.assertEquals(EditionType.EXPRESS, response.properties().edition());
        Assertions.assertEquals("vnhdldwmgxcxr", response.properties().containerResourceId());
        Assertions.assertEquals("rpkhjwn", response.properties().vCore());
        Assertions.assertEquals(ConnectionStatus.CONNECTED, response.properties().status());
        Assertions.assertEquals("sluicpdggkzz", response.properties().patchLevel());
        Assertions.assertEquals("mbmpaxmodfvuefy", response.properties().collation());
        Assertions.assertEquals("bpfvm", response.properties().currentVersion());
        Assertions.assertEquals("hrfou", response.properties().instanceName());
        Assertions.assertEquals("taakc", response.properties().tcpDynamicPorts());
        Assertions.assertEquals("iyzvqtmnub", response.properties().tcpStaticPorts());
        Assertions.assertEquals("kpzksmondjmq", response.properties().productId());
        Assertions.assertEquals(ArcSqlServerLicenseType.UNDEFINED, response.properties().licenseType());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-02-28T11:46:10Z"), response.properties().azureDefenderStatusLastUpdated());
        Assertions.assertEquals(DefenderStatus.PROTECTED, response.properties().azureDefenderStatus());
    }
}
