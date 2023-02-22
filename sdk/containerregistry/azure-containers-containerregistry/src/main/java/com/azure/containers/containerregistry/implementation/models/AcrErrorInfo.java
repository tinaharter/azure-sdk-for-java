// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/** Error information. */
@Fluent
public final class AcrErrorInfo implements JsonSerializable<AcrErrorInfo> {
    /*
     * Error code
     */
    private String code;

    /*
     * Error message
     */
    private String message;

    /*
     * Error details
     */
    private Object detail;

    /** Creates an instance of AcrErrorInfo class. */
    public AcrErrorInfo() {}

    /**
     * Get the code property: Error code.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code property: Error code.
     *
     * @param code the code value to set.
     * @return the AcrErrorInfo object itself.
     */
    public AcrErrorInfo setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: Error message.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: Error message.
     *
     * @param message the message value to set.
     * @return the AcrErrorInfo object itself.
     */
    public AcrErrorInfo setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the detail property: Error details.
     *
     * @return the detail value.
     */
    public Object getDetail() {
        return this.detail;
    }

    /**
     * Set the detail property: Error details.
     *
     * @param detail the detail value to set.
     * @return the AcrErrorInfo object itself.
     */
    public AcrErrorInfo setDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("code", this.code);
        jsonWriter.writeStringField("message", this.message);
        jsonWriter.writeUntyped(this.detail);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AcrErrorInfo from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AcrErrorInfo if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IOException If an error occurs while reading the AcrErrorInfo.
     */
    public static AcrErrorInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    String code = null;
                    String message = null;
                    Object detail = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("code".equals(fieldName)) {
                            code = reader.getString();
                        } else if ("message".equals(fieldName)) {
                            message = reader.getString();
                        } else if ("detail".equals(fieldName)) {
                            detail = reader.readUntyped();
                        } else {
                            reader.skipChildren();
                        }
                    }
                    AcrErrorInfo deserializedValue = new AcrErrorInfo();
                    deserializedValue.code = code;
                    deserializedValue.message = message;
                    deserializedValue.detail = detail;

                    return deserializedValue;
                });
    }
}
