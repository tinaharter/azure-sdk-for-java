// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer.administration;

import com.azure.ai.formrecognizer.DocumentAnalysisClient;
import com.azure.ai.formrecognizer.DocumentAnalysisServiceVersion;
import com.azure.ai.formrecognizer.administration.models.BuildModelOptions;
import com.azure.ai.formrecognizer.administration.models.ComposeModelOptions;
import com.azure.ai.formrecognizer.administration.models.CopyAuthorization;
import com.azure.ai.formrecognizer.administration.models.DocumentModelBuildMode;
import com.azure.ai.formrecognizer.administration.models.DocumentModelDetails;
import com.azure.ai.formrecognizer.administration.models.DocumentModelSummary;
import com.azure.ai.formrecognizer.administration.models.ResourceDetails;
import com.azure.ai.formrecognizer.models.AnalyzeResult;
import com.azure.ai.formrecognizer.models.DocumentOperationResult;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.models.ResponseError;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import io.netty.handler.codec.http.HttpResponseStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static com.azure.ai.formrecognizer.TestUtils.DISPLAY_NAME_WITH_ARGUMENTS;
import static com.azure.ai.formrecognizer.TestUtils.NON_EXIST_MODEL_ID;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DocumentModelAdminClientTest extends DocumentModelAdministrationClientTestBase {
    private DocumentModelAdministrationClient client;

    private DocumentModelAdministrationClient getDocumentModelAdministrationClient(HttpClient httpClient,
                                                                                   DocumentAnalysisServiceVersion serviceVersion) {
        return getDocumentModelAdminClientBuilder(httpClient, serviceVersion, true).buildClient();
    }

    /**
     * Verifies the form recognizer client is valid.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void getDocumentAnalysisClientAndValidate(HttpClient httpClient,
                                                     DocumentAnalysisServiceVersion serviceVersion) {
        DocumentAnalysisClient documentAnalysisClient = getDocumentModelAdministrationClient(httpClient, serviceVersion)
            .getDocumentAnalysisClient();
        blankPdfDataRunner((data, dataLength) -> {
            SyncPoller<DocumentOperationResult, AnalyzeResult> syncPoller =
                documentAnalysisClient.beginAnalyzeDocument("prebuilt-layout", BinaryData.fromStream(data), dataLength)
                    .setPollInterval(durationTestMode);
            syncPoller.waitForCompletion();
            assertNotNull(syncPoller.getFinalResult());
        });
    }

    /**
     * Verifies that an exception is thrown for null model ID parameter.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void getModelNullModelID(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdministrationClient(httpClient, serviceVersion);
        assertThrows(IllegalArgumentException.class, () -> client.getModel(null));
    }

    /**
     * Verifies that an exception is thrown for invalid model ID.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void getModelNonExistingModelID(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdministrationClient(httpClient, serviceVersion);
        HttpResponseException exception = assertThrows(HttpResponseException.class, () ->
            client.getModel(NON_EXIST_MODEL_ID));
        final ResponseError responseError = (ResponseError) exception.getValue();
        assertEquals("NotFound", responseError.getCode());
    }

    /**
     * Verifies custom model info returned with response for a valid model ID.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void getModelWithResponse(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdministrationClient(httpClient, serviceVersion);
        buildModelRunner((trainingDataSasUrl) -> {
            DocumentModelDetails documentModelDetails =
                client.beginBuildModel(trainingDataSasUrl, DocumentModelBuildMode.TEMPLATE)
                    .setPollInterval(durationTestMode).getFinalResult();
            Response<DocumentModelDetails> documentModelResponse =
                client.getModelWithResponse(documentModelDetails.getModelId(),
                    Context.NONE);
            client.deleteModel(documentModelDetails.getModelId());

            assertEquals(documentModelResponse.getStatusCode(), HttpResponseStatus.OK.code());
            validateDocumentModelData(documentModelResponse.getValue());
        });
    }

    /**
     * Verifies account properties returned for a subscription account.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void validGetResourceDetails(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdministrationClient(httpClient, serviceVersion);
        validateResourceInfo(client.getResourceDetails());
    }

    /**
     * Verifies account properties returned with a Http Response for a subscription account.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void validGetResourceDetailsWithResponse(HttpClient httpClient,
                                                 DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdministrationClient(httpClient, serviceVersion);
        Response<ResourceDetails> resourceDetailsResponse = client.getResourceDetailsWithResponse(Context.NONE);
        assertEquals(resourceDetailsResponse.getStatusCode(), HttpResponseStatus.OK.code());
        validateResourceInfo(resourceDetailsResponse.getValue());
    }

    /**
     * Verifies that an exception is thrown for invalid status model ID.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void deleteModelNonExistingModelID(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdministrationClient(httpClient, serviceVersion);
        HttpResponseException exception = assertThrows(HttpResponseException.class, () ->
            client.deleteModel(NON_EXIST_MODEL_ID));
        final ResponseError responseError = (ResponseError) exception.getValue();
        assertEquals("NotFound", responseError.getCode());
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void deleteModelValidModelIDWithResponse(HttpClient httpClient,
                                                    DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdministrationClient(httpClient, serviceVersion);
        buildModelRunner((trainingDataSasUrl) -> {
            SyncPoller<DocumentOperationResult, DocumentModelDetails> syncPoller =
                client.beginBuildModel(trainingDataSasUrl, DocumentModelBuildMode.TEMPLATE)
                    .setPollInterval(durationTestMode);
            syncPoller.waitForCompletion();
            DocumentModelDetails createdModel = syncPoller.getFinalResult();

            final Response<Void> deleteModelWithResponse
                = client.deleteModelWithResponse(createdModel.getModelId(), Context.NONE);

            assertEquals(deleteModelWithResponse.getStatusCode(), HttpResponseStatus.NO_CONTENT.code());
            final HttpResponseException exception = assertThrows(HttpResponseException.class, () ->
                client.getModelWithResponse(createdModel.getModelId(), Context.NONE));
            final ResponseError responseError = (ResponseError) exception.getValue();
            assertEquals("NotFound", responseError.getCode());
        });
    }

    /**
     * Test for listing all models information.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void listModels(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdministrationClient(httpClient, serviceVersion);
        int pageCount = 0;
        for (PagedResponse<DocumentModelSummary> documentModelSummaryPagedResponse : client.listModels().iterableByPage()) {
            List<DocumentModelSummary> modelInfoList = documentModelSummaryPagedResponse.getValue();
            modelInfoList.forEach(documentModelSummary -> {
                assertNotNull(documentModelSummary.getModelId());
                assertNotNull(documentModelSummary.getCreatedOn());
            });
            pageCount++;
            if (pageCount > 4) {
                // Stop after 4 pages since there can be large number of models.
                break;
            }
        }
    }

    /**
     * Test for listing all models information with {@link Context}.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void listModelsWithContext(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdministrationClient(httpClient, serviceVersion);
        int pageCount = 0;
        for (PagedResponse<DocumentModelSummary> documentModelSummaryPagedResponse
            : client.listModels(Context.NONE).iterableByPage()) {
            List<DocumentModelSummary> modelInfoList = documentModelSummaryPagedResponse.getValue();
            modelInfoList.forEach(documentModelSummary -> {
                assertNotNull(documentModelSummary.getModelId());
                assertNotNull(documentModelSummary.getCreatedOn());
            });
            pageCount++;
            if (pageCount > 4) {
                // Stop after 4 pages since there can be large number of models.
                break;
            }
        }
    }

    /**
     * Verifies that an exception is thrown for null source url input.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void beginBuildModelNullInput(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdministrationClient(httpClient, serviceVersion);
        Exception exception = assertThrows(NullPointerException.class, () ->
            client.beginBuildModel(null, DocumentModelBuildMode.TEMPLATE));
        assertEquals("'blobContainerUrl' cannot be null.", exception.getMessage());
    }

    /**
     * Verifies the result of the copy operation for valid parameters.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void beginCopy(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdministrationClient(httpClient, serviceVersion);
        buildModelRunner((trainingFilesUrl) -> {
            SyncPoller<DocumentOperationResult, DocumentModelDetails> syncPoller =
                client.beginBuildModel(trainingFilesUrl, DocumentModelBuildMode.TEMPLATE)
                    .setPollInterval(durationTestMode);
            syncPoller.waitForCompletion();
            DocumentModelDetails actualModel = syncPoller.getFinalResult();

            CopyAuthorization target =
                client.getCopyAuthorization();
            SyncPoller<DocumentOperationResult, DocumentModelDetails>
                copyPoller = client.beginCopyModelTo(actualModel.getModelId(), target)
                .setPollInterval(durationTestMode);
            DocumentModelDetails copiedModel = copyPoller.getFinalResult();

            Assertions.assertEquals(target.getTargetModelId(), copiedModel.getModelId());
            client.deleteModel(actualModel.getModelId());
            client.deleteModel(copiedModel.getModelId());
        });
    }

    /**
     * Verifies the result of the copy authorization for valid parameters.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void copyAuthorization(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdministrationClient(httpClient, serviceVersion);
        validateCopyAuthorizationResult(client.getCopyAuthorization());
    }

    /**
     * Verifies the result of the training operation for a valid labeled model ID and JPG training set Url.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void beginBuildModelWithJPGTrainingSet(HttpClient httpClient,
                                                  DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdministrationClient(httpClient, serviceVersion);
        buildModelRunner((trainingFilesUrl) -> {
            SyncPoller<DocumentOperationResult, DocumentModelDetails> buildModelPoller =
                client.beginBuildModel(trainingFilesUrl, DocumentModelBuildMode.TEMPLATE)
                    .setPollInterval(durationTestMode);
            buildModelPoller.waitForCompletion();

            validateDocumentModelData(buildModelPoller.getFinalResult());
        });
    }

    /**
     * Verifies the result of the training operation for a valid labeled model ID and multi-page PDF training set Url.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void beginBuildModelWithMultiPagePDFTrainingSet(HttpClient httpClient,
                                                           DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdministrationClient(httpClient, serviceVersion);
        multipageTrainingRunner(trainingFilesUrl -> {
            SyncPoller<DocumentOperationResult, DocumentModelDetails> buildModelPoller =
                client.beginBuildModel(trainingFilesUrl, DocumentModelBuildMode.TEMPLATE)
                    .setPollInterval(durationTestMode);
            buildModelPoller.waitForCompletion();

            validateDocumentModelData(buildModelPoller.getFinalResult());
        });
    }

    /**
     * Verifies the result of the training operation for a valid unlabeled model ID and include subfolder training set
     * Url with existing prefix name.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void beginBuildModelFailsWithInvalidPrefix(HttpClient httpClient,
                                                      DocumentAnalysisServiceVersion serviceVersion) {

        client = getDocumentModelAdministrationClient(httpClient, serviceVersion);
        buildModelRunner((trainingFilesUrl) -> {
            HttpResponseException exception = assertThrows(HttpResponseException.class, () ->
                client.beginBuildModel(trainingFilesUrl,
                        DocumentModelBuildMode.TEMPLATE,
                        "invalidPrefix",
                        null,
                        Context.NONE)
                    .setPollInterval(durationTestMode));

            final ResponseError responseError  = (ResponseError) exception.getValue();
            assertEquals("InvalidRequest", responseError.getCode());
        });
    }

    /**
     * Verifies the result of the training operation for a valid unlabeled model ID and include subfolder training set
     * Url with non-existing prefix name.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void beginBuildModelIncludeSubfolderWithNonExistPrefixName(HttpClient httpClient,
                                                                      DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdministrationClient(httpClient, serviceVersion);
        multipageTrainingRunner(trainingFilesUrl -> {
            HttpResponseException exception = assertThrows(HttpResponseException.class, () ->
                client.beginBuildModel(trainingFilesUrl, DocumentModelBuildMode.TEMPLATE, "subfolders", null, Context.NONE)
                    .setPollInterval(durationTestMode));

            final ResponseError responseError = (ResponseError) exception.getValue();
            assertEquals("InvalidRequest", responseError.getCode());
        });
    }

    /**
     * Verifies the result of the create composed model for valid parameters.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void beginCreateComposedModel(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion) {
        client = getDocumentModelAdministrationClient(httpClient, serviceVersion);
        buildModelRunner((trainingFilesUrl) -> {
            SyncPoller<DocumentOperationResult, DocumentModelDetails> syncPoller1 =
                client.beginBuildModel(trainingFilesUrl, DocumentModelBuildMode.TEMPLATE, null,
                        new BuildModelOptions().setModelId("sync_component_model_1" + UUID.randomUUID()), Context.NONE)
                    .setPollInterval(durationTestMode);
            syncPoller1.waitForCompletion();
            DocumentModelDetails createdModel1 = syncPoller1.getFinalResult();

            SyncPoller<DocumentOperationResult, DocumentModelDetails> syncPoller2 =
                client.beginBuildModel(trainingFilesUrl, DocumentModelBuildMode.TEMPLATE, null,
                        new BuildModelOptions().setModelId("sync_component_model_2" + UUID.randomUUID()), Context.NONE)
                    .setPollInterval(durationTestMode);
            syncPoller2.waitForCompletion();
            DocumentModelDetails createdModel2 = syncPoller2.getFinalResult();

            final List<String> modelIDList = Arrays.asList(createdModel1.getModelId(), createdModel2.getModelId());

            DocumentModelDetails composedModel =
                client.beginComposeModel(modelIDList,
                        new ComposeModelOptions().setModelId("sync_java_composed_model" + UUID.randomUUID())
                            .setDescription("test desc"),
                        Context.NONE)
                    .setPollInterval(durationTestMode)
                    .getFinalResult();

            assertNotNull(composedModel.getModelId());
            assertEquals("test desc", composedModel.getDescription());
            assertEquals(2, composedModel.getDocumentTypes().size());
            composedModel.getDocumentTypes().forEach((key, documentTypeDetails) -> {
                if (key.contains("sync_component_model_1") || key.contains("sync_component_model_2")) {
                    assert true;
                } else {
                    assert false;
                }
            });
            validateDocumentModelData(composedModel);

            client.deleteModel(createdModel1.getModelId());
            client.deleteModel(createdModel2.getModelId());
            client.deleteModel(composedModel.getModelId());
        });
    }
}