/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.storage;

import com.microsoft.azure.storage.blob.models.AppendBlobsAppendBlockResponse;
import com.microsoft.azure.storage.blob.models.AppendBlobsCreateResponse;
import com.microsoft.rest.v2.DateTimeRfc1123;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.Validator;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.HostParam;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.QueryParam;
import com.microsoft.rest.v2.util.Base64Util;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;
import java.nio.ByteBuffer;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * An instance of this class provides access to all the operations defined in
 * GeneratedAppendBlobs.
 */
public final class GeneratedAppendBlobs {
    /**
     * The proxy service used to perform REST calls.
     */
    private AppendBlobsService service;

    /**
     * The service client containing this operation class.
     */
    private GeneratedStorageClient client;

    /**
     * Initializes an instance of GeneratedAppendBlobs.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public GeneratedAppendBlobs(GeneratedStorageClient client) {
        this.service = RestProxy.create(AppendBlobsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedAppendBlobs to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{url}")
    private interface AppendBlobsService {
        @PUT("{containerName}/{blob}")
        @ExpectedResponses({201})
        Single<AppendBlobsCreateResponse> create(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("Content-Length") long contentLength, @HeaderParam("x-ms-blob-content-type") String blobContentType, @HeaderParam("x-ms-blob-content-encoding") String blobContentEncoding, @HeaderParam("x-ms-blob-content-language") String blobContentLanguage, @HeaderParam("x-ms-blob-content-md5") String blobContentMD5, @HeaderParam("x-ms-blob-cache-control") String blobCacheControl, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-blob-content-disposition") String blobContentDisposition, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatches, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @HeaderParam("x-ms-blob-type") String blobType);

        @PUT("{containerName}/{blob}")
        @ExpectedResponses({201})
        Single<AppendBlobsAppendBlockResponse> appendBlock(@HostParam("url") String url, @BodyParam("application/xml; charset=utf-8") Flowable<ByteBuffer> body, @QueryParam("timeout") Integer timeout, @HeaderParam("Content-Length") long contentLength, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-blob-condition-maxsize") Long maxSize, @HeaderParam("x-ms-blob-condition-appendpos") Long appendPosition, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatches, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp);
    }

    /**
     * The Create Append Blob operation creates a new append blob.
     *
     * @param contentLength The length of the request.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param blobContentType Optional. Sets the blob's content type. If specified, this property is stored with the blob and returned with a read request.
     * @param blobContentEncoding Optional. Sets the blob's content encoding. If specified, this property is stored with the blob and returned with a read request.
     * @param blobContentLanguage Optional. Set the blob's content language. If specified, this property is stored with the blob and returned with a read request.
     * @param blobContentMD5 Optional. An MD5 hash of the blob content. Note that this hash is not validated, as the hashes for the individual blocks were validated when each was uploaded.
     * @param blobCacheControl Optional. Sets the blob's cache control. If specified, this property is stored with the blob and returned with a read request.
     * @param metadata Optional. Specifies a user-defined name-value pair associated with the blob. If no name-value pairs are specified, the operation will copy the metadata from the source blob or file to the destination blob. If one or more name-value pairs are specified, the destination blob is created with the specified metadata, and metadata is not copied from the source blob or file. Note that beginning with version 2009-09-19, metadata names must adhere to the naming rules for C# identifiers. See Naming and Referencing Containers, Blobs, and Metadata for more information.
     * @param leaseId If specified, the operation only succeeds if the container's lease is active and matches this ID.
     * @param blobContentDisposition Optional. Sets the blob's Content-Disposition header.
     * @param ifModifiedSince Specify this header value to operate only on a blob if it has been modified since the specified date/time.
     * @param ifUnmodifiedSince Specify this header value to operate only on a blob if it has not been modified since the specified date/time.
     * @param ifMatches Specify an ETag value to operate only on blobs with a matching value.
     * @param ifNoneMatch Specify an ETag value to operate only on blobs without a matching value.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void create(@NonNull long contentLength, Integer timeout, String blobContentType, String blobContentEncoding, String blobContentLanguage, byte[] blobContentMD5, String blobCacheControl, Map<String, String> metadata, String leaseId, String blobContentDisposition, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatches, String ifNoneMatch, String requestId) {
        createAsync(contentLength, timeout, blobContentType, blobContentEncoding, blobContentLanguage, blobContentMD5, blobCacheControl, metadata, leaseId, blobContentDisposition, ifModifiedSince, ifUnmodifiedSince, ifMatches, ifNoneMatch, requestId).blockingAwait();
    }

    /**
     * The Create Append Blob operation creates a new append blob.
     *
     * @param contentLength The length of the request.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param blobContentType Optional. Sets the blob's content type. If specified, this property is stored with the blob and returned with a read request.
     * @param blobContentEncoding Optional. Sets the blob's content encoding. If specified, this property is stored with the blob and returned with a read request.
     * @param blobContentLanguage Optional. Set the blob's content language. If specified, this property is stored with the blob and returned with a read request.
     * @param blobContentMD5 Optional. An MD5 hash of the blob content. Note that this hash is not validated, as the hashes for the individual blocks were validated when each was uploaded.
     * @param blobCacheControl Optional. Sets the blob's cache control. If specified, this property is stored with the blob and returned with a read request.
     * @param metadata Optional. Specifies a user-defined name-value pair associated with the blob. If no name-value pairs are specified, the operation will copy the metadata from the source blob or file to the destination blob. If one or more name-value pairs are specified, the destination blob is created with the specified metadata, and metadata is not copied from the source blob or file. Note that beginning with version 2009-09-19, metadata names must adhere to the naming rules for C# identifiers. See Naming and Referencing Containers, Blobs, and Metadata for more information.
     * @param leaseId If specified, the operation only succeeds if the container's lease is active and matches this ID.
     * @param blobContentDisposition Optional. Sets the blob's Content-Disposition header.
     * @param ifModifiedSince Specify this header value to operate only on a blob if it has been modified since the specified date/time.
     * @param ifUnmodifiedSince Specify this header value to operate only on a blob if it has not been modified since the specified date/time.
     * @param ifMatches Specify an ETag value to operate only on blobs with a matching value.
     * @param ifNoneMatch Specify an ETag value to operate only on blobs without a matching value.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> createAsync(@NonNull long contentLength, Integer timeout, String blobContentType, String blobContentEncoding, String blobContentLanguage, byte[] blobContentMD5, String blobCacheControl, Map<String, String> metadata, String leaseId, String blobContentDisposition, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatches, String ifNoneMatch, String requestId, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(createAsync(contentLength, timeout, blobContentType, blobContentEncoding, blobContentLanguage, blobContentMD5, blobCacheControl, metadata, leaseId, blobContentDisposition, ifModifiedSince, ifUnmodifiedSince, ifMatches, ifNoneMatch, requestId), serviceCallback);
    }

    /**
     * The Create Append Blob operation creates a new append blob.
     *
     * @param contentLength The length of the request.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param blobContentType Optional. Sets the blob's content type. If specified, this property is stored with the blob and returned with a read request.
     * @param blobContentEncoding Optional. Sets the blob's content encoding. If specified, this property is stored with the blob and returned with a read request.
     * @param blobContentLanguage Optional. Set the blob's content language. If specified, this property is stored with the blob and returned with a read request.
     * @param blobContentMD5 Optional. An MD5 hash of the blob content. Note that this hash is not validated, as the hashes for the individual blocks were validated when each was uploaded.
     * @param blobCacheControl Optional. Sets the blob's cache control. If specified, this property is stored with the blob and returned with a read request.
     * @param metadata Optional. Specifies a user-defined name-value pair associated with the blob. If no name-value pairs are specified, the operation will copy the metadata from the source blob or file to the destination blob. If one or more name-value pairs are specified, the destination blob is created with the specified metadata, and metadata is not copied from the source blob or file. Note that beginning with version 2009-09-19, metadata names must adhere to the naming rules for C# identifiers. See Naming and Referencing Containers, Blobs, and Metadata for more information.
     * @param leaseId If specified, the operation only succeeds if the container's lease is active and matches this ID.
     * @param blobContentDisposition Optional. Sets the blob's Content-Disposition header.
     * @param ifModifiedSince Specify this header value to operate only on a blob if it has been modified since the specified date/time.
     * @param ifUnmodifiedSince Specify this header value to operate only on a blob if it has not been modified since the specified date/time.
     * @param ifMatches Specify an ETag value to operate only on blobs with a matching value.
     * @param ifNoneMatch Specify an ETag value to operate only on blobs without a matching value.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<AppendBlobsCreateResponse> createWithRestResponseAsync(@NonNull long contentLength, Integer timeout, String blobContentType, String blobContentEncoding, String blobContentLanguage, byte[] blobContentMD5, String blobCacheControl, Map<String, String> metadata, String leaseId, String blobContentDisposition, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatches, String ifNoneMatch, String requestId) {
        if (this.client.url() == null) {
            throw new IllegalArgumentException("Parameter this.client.url() is required and cannot be null.");
        }
        if (this.client.version() == null) {
            throw new IllegalArgumentException("Parameter this.client.version() is required and cannot be null.");
        }
        Validator.validate(metadata);
        final String blobType = "AppendBlob";
        String blobContentMD5Converted = Base64Util.encodeToString(blobContentMD5);
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        if (ifModifiedSince != null) {
            ifModifiedSinceConverted = new DateTimeRfc1123(ifModifiedSince);
        }
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        if (ifUnmodifiedSince != null) {
            ifUnmodifiedSinceConverted = new DateTimeRfc1123(ifUnmodifiedSince);
        }
        return service.create(this.client.url(), timeout, contentLength, blobContentType, blobContentEncoding, blobContentLanguage, blobContentMD5Converted, blobCacheControl, metadata, leaseId, blobContentDisposition, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatches, ifNoneMatch, this.client.version(), requestId, blobType);
    }

    /**
     * The Create Append Blob operation creates a new append blob.
     *
     * @param contentLength The length of the request.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param blobContentType Optional. Sets the blob's content type. If specified, this property is stored with the blob and returned with a read request.
     * @param blobContentEncoding Optional. Sets the blob's content encoding. If specified, this property is stored with the blob and returned with a read request.
     * @param blobContentLanguage Optional. Set the blob's content language. If specified, this property is stored with the blob and returned with a read request.
     * @param blobContentMD5 Optional. An MD5 hash of the blob content. Note that this hash is not validated, as the hashes for the individual blocks were validated when each was uploaded.
     * @param blobCacheControl Optional. Sets the blob's cache control. If specified, this property is stored with the blob and returned with a read request.
     * @param metadata Optional. Specifies a user-defined name-value pair associated with the blob. If no name-value pairs are specified, the operation will copy the metadata from the source blob or file to the destination blob. If one or more name-value pairs are specified, the destination blob is created with the specified metadata, and metadata is not copied from the source blob or file. Note that beginning with version 2009-09-19, metadata names must adhere to the naming rules for C# identifiers. See Naming and Referencing Containers, Blobs, and Metadata for more information.
     * @param leaseId If specified, the operation only succeeds if the container's lease is active and matches this ID.
     * @param blobContentDisposition Optional. Sets the blob's Content-Disposition header.
     * @param ifModifiedSince Specify this header value to operate only on a blob if it has been modified since the specified date/time.
     * @param ifUnmodifiedSince Specify this header value to operate only on a blob if it has not been modified since the specified date/time.
     * @param ifMatches Specify an ETag value to operate only on blobs with a matching value.
     * @param ifNoneMatch Specify an ETag value to operate only on blobs without a matching value.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable createAsync(@NonNull long contentLength, Integer timeout, String blobContentType, String blobContentEncoding, String blobContentLanguage, byte[] blobContentMD5, String blobCacheControl, Map<String, String> metadata, String leaseId, String blobContentDisposition, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatches, String ifNoneMatch, String requestId) {
        return createWithRestResponseAsync(contentLength, timeout, blobContentType, blobContentEncoding, blobContentLanguage, blobContentMD5, blobCacheControl, metadata, leaseId, blobContentDisposition, ifModifiedSince, ifUnmodifiedSince, ifMatches, ifNoneMatch, requestId)
            .toCompletable();
    }

    /**
     * The Append Block operation commits a new block of data to the end of an existing append blob. The Append Block operation is permitted only if the blob was created with x-ms-blob-type set to AppendBlob. Append Block is supported only on version 2015-02-21 version or later.
     *
     * @param body Initial data.
     * @param contentLength The length of the request.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param leaseId If specified, the operation only succeeds if the container's lease is active and matches this ID.
     * @param maxSize Optional conditional header. The max length in bytes permitted for the append blob. If the Append Block operation would cause the blob to exceed that limit or if the blob size is already greater than the value specified in this header, the request will fail with MaxBlobSizeConditionNotMet error (HTTP status code 412 - Precondition Failed).
     * @param appendPosition Optional conditional header, used only for the Append Block operation. A number indicating the byte offset to compare. Append Block will succeed only if the append position is equal to this number. If it is not, the request will fail with the AppendPositionConditionNotMet error (HTTP status code 412 - Precondition Failed).
     * @param ifModifiedSince Specify this header value to operate only on a blob if it has been modified since the specified date/time.
     * @param ifUnmodifiedSince Specify this header value to operate only on a blob if it has not been modified since the specified date/time.
     * @param ifMatches Specify an ETag value to operate only on blobs with a matching value.
     * @param ifNoneMatch Specify an ETag value to operate only on blobs without a matching value.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void appendBlock(@NonNull Flowable<ByteBuffer> body, @NonNull long contentLength, Integer timeout, String leaseId, Long maxSize, Long appendPosition, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatches, String ifNoneMatch, String requestId) {
        appendBlockAsync(body, contentLength, timeout, leaseId, maxSize, appendPosition, ifModifiedSince, ifUnmodifiedSince, ifMatches, ifNoneMatch, requestId).blockingAwait();
    }

    /**
     * The Append Block operation commits a new block of data to the end of an existing append blob. The Append Block operation is permitted only if the blob was created with x-ms-blob-type set to AppendBlob. Append Block is supported only on version 2015-02-21 version or later.
     *
     * @param body Initial data.
     * @param contentLength The length of the request.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param leaseId If specified, the operation only succeeds if the container's lease is active and matches this ID.
     * @param maxSize Optional conditional header. The max length in bytes permitted for the append blob. If the Append Block operation would cause the blob to exceed that limit or if the blob size is already greater than the value specified in this header, the request will fail with MaxBlobSizeConditionNotMet error (HTTP status code 412 - Precondition Failed).
     * @param appendPosition Optional conditional header, used only for the Append Block operation. A number indicating the byte offset to compare. Append Block will succeed only if the append position is equal to this number. If it is not, the request will fail with the AppendPositionConditionNotMet error (HTTP status code 412 - Precondition Failed).
     * @param ifModifiedSince Specify this header value to operate only on a blob if it has been modified since the specified date/time.
     * @param ifUnmodifiedSince Specify this header value to operate only on a blob if it has not been modified since the specified date/time.
     * @param ifMatches Specify an ETag value to operate only on blobs with a matching value.
     * @param ifNoneMatch Specify an ETag value to operate only on blobs without a matching value.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> appendBlockAsync(@NonNull Flowable<ByteBuffer> body, @NonNull long contentLength, Integer timeout, String leaseId, Long maxSize, Long appendPosition, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatches, String ifNoneMatch, String requestId, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(appendBlockAsync(body, contentLength, timeout, leaseId, maxSize, appendPosition, ifModifiedSince, ifUnmodifiedSince, ifMatches, ifNoneMatch, requestId), serviceCallback);
    }

    /**
     * The Append Block operation commits a new block of data to the end of an existing append blob. The Append Block operation is permitted only if the blob was created with x-ms-blob-type set to AppendBlob. Append Block is supported only on version 2015-02-21 version or later.
     *
     * @param body Initial data.
     * @param contentLength The length of the request.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param leaseId If specified, the operation only succeeds if the container's lease is active and matches this ID.
     * @param maxSize Optional conditional header. The max length in bytes permitted for the append blob. If the Append Block operation would cause the blob to exceed that limit or if the blob size is already greater than the value specified in this header, the request will fail with MaxBlobSizeConditionNotMet error (HTTP status code 412 - Precondition Failed).
     * @param appendPosition Optional conditional header, used only for the Append Block operation. A number indicating the byte offset to compare. Append Block will succeed only if the append position is equal to this number. If it is not, the request will fail with the AppendPositionConditionNotMet error (HTTP status code 412 - Precondition Failed).
     * @param ifModifiedSince Specify this header value to operate only on a blob if it has been modified since the specified date/time.
     * @param ifUnmodifiedSince Specify this header value to operate only on a blob if it has not been modified since the specified date/time.
     * @param ifMatches Specify an ETag value to operate only on blobs with a matching value.
     * @param ifNoneMatch Specify an ETag value to operate only on blobs without a matching value.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<AppendBlobsAppendBlockResponse> appendBlockWithRestResponseAsync(@NonNull Flowable<ByteBuffer> body, @NonNull long contentLength, Integer timeout, String leaseId, Long maxSize, Long appendPosition, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatches, String ifNoneMatch, String requestId) {
        if (this.client.url() == null) {
            throw new IllegalArgumentException("Parameter this.client.url() is required and cannot be null.");
        }
        if (body == null) {
            throw new IllegalArgumentException("Parameter body is required and cannot be null.");
        }
        if (this.client.version() == null) {
            throw new IllegalArgumentException("Parameter this.client.version() is required and cannot be null.");
        }
        final String comp = "appendblock";
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        if (ifModifiedSince != null) {
            ifModifiedSinceConverted = new DateTimeRfc1123(ifModifiedSince);
        }
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        if (ifUnmodifiedSince != null) {
            ifUnmodifiedSinceConverted = new DateTimeRfc1123(ifUnmodifiedSince);
        }
        return service.appendBlock(this.client.url(), body, timeout, contentLength, leaseId, maxSize, appendPosition, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatches, ifNoneMatch, this.client.version(), requestId, comp);
    }

    /**
     * The Append Block operation commits a new block of data to the end of an existing append blob. The Append Block operation is permitted only if the blob was created with x-ms-blob-type set to AppendBlob. Append Block is supported only on version 2015-02-21 version or later.
     *
     * @param body Initial data.
     * @param contentLength The length of the request.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param leaseId If specified, the operation only succeeds if the container's lease is active and matches this ID.
     * @param maxSize Optional conditional header. The max length in bytes permitted for the append blob. If the Append Block operation would cause the blob to exceed that limit or if the blob size is already greater than the value specified in this header, the request will fail with MaxBlobSizeConditionNotMet error (HTTP status code 412 - Precondition Failed).
     * @param appendPosition Optional conditional header, used only for the Append Block operation. A number indicating the byte offset to compare. Append Block will succeed only if the append position is equal to this number. If it is not, the request will fail with the AppendPositionConditionNotMet error (HTTP status code 412 - Precondition Failed).
     * @param ifModifiedSince Specify this header value to operate only on a blob if it has been modified since the specified date/time.
     * @param ifUnmodifiedSince Specify this header value to operate only on a blob if it has not been modified since the specified date/time.
     * @param ifMatches Specify an ETag value to operate only on blobs with a matching value.
     * @param ifNoneMatch Specify an ETag value to operate only on blobs without a matching value.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable appendBlockAsync(@NonNull Flowable<ByteBuffer> body, @NonNull long contentLength, Integer timeout, String leaseId, Long maxSize, Long appendPosition, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatches, String ifNoneMatch, String requestId) {
        return appendBlockWithRestResponseAsync(body, contentLength, timeout, leaseId, maxSize, appendPosition, ifModifiedSince, ifUnmodifiedSince, ifMatches, ifNoneMatch, requestId)
            .toCompletable();
    }
}
