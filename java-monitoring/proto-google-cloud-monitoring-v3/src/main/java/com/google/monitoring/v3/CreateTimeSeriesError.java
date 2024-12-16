/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/metric_service.proto

// Protobuf Java Version: 3.25.5
package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * DEPRECATED. Used to hold per-time-series error status.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.CreateTimeSeriesError}
 */
public final class CreateTimeSeriesError extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.CreateTimeSeriesError)
    CreateTimeSeriesErrorOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateTimeSeriesError.newBuilder() to construct.
  private CreateTimeSeriesError(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateTimeSeriesError() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateTimeSeriesError();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.MetricServiceProto
        .internal_static_google_monitoring_v3_CreateTimeSeriesError_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.MetricServiceProto
        .internal_static_google_monitoring_v3_CreateTimeSeriesError_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.CreateTimeSeriesError.class,
            com.google.monitoring.v3.CreateTimeSeriesError.Builder.class);
  }

  private int bitField0_;
  public static final int TIME_SERIES_FIELD_NUMBER = 1;
  private com.google.monitoring.v3.TimeSeries timeSeries_;
  /**
   *
   *
   * <pre>
   * DEPRECATED. Time series ID that resulted in the `status` error.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeSeries time_series = 1 [deprecated = true];</code>
   *
   * @deprecated google.monitoring.v3.CreateTimeSeriesError.time_series is deprecated. See
   *     google/monitoring/v3/metric_service.proto;l=464
   * @return Whether the timeSeries field is set.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public boolean hasTimeSeries() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * DEPRECATED. Time series ID that resulted in the `status` error.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeSeries time_series = 1 [deprecated = true];</code>
   *
   * @deprecated google.monitoring.v3.CreateTimeSeriesError.time_series is deprecated. See
   *     google/monitoring/v3/metric_service.proto;l=464
   * @return The timeSeries.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public com.google.monitoring.v3.TimeSeries getTimeSeries() {
    return timeSeries_ == null
        ? com.google.monitoring.v3.TimeSeries.getDefaultInstance()
        : timeSeries_;
  }
  /**
   *
   *
   * <pre>
   * DEPRECATED. Time series ID that resulted in the `status` error.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeSeries time_series = 1 [deprecated = true];</code>
   */
  @java.lang.Override
  @java.lang.Deprecated
  public com.google.monitoring.v3.TimeSeriesOrBuilder getTimeSeriesOrBuilder() {
    return timeSeries_ == null
        ? com.google.monitoring.v3.TimeSeries.getDefaultInstance()
        : timeSeries_;
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private com.google.rpc.Status status_;
  /**
   *
   *
   * <pre>
   * DEPRECATED. The status of the requested write operation for `time_series`.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2 [deprecated = true];</code>
   *
   * @deprecated google.monitoring.v3.CreateTimeSeriesError.status is deprecated. See
   *     google/monitoring/v3/metric_service.proto;l=467
   * @return Whether the status field is set.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public boolean hasStatus() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * DEPRECATED. The status of the requested write operation for `time_series`.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2 [deprecated = true];</code>
   *
   * @deprecated google.monitoring.v3.CreateTimeSeriesError.status is deprecated. See
   *     google/monitoring/v3/metric_service.proto;l=467
   * @return The status.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public com.google.rpc.Status getStatus() {
    return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
  }
  /**
   *
   *
   * <pre>
   * DEPRECATED. The status of the requested write operation for `time_series`.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2 [deprecated = true];</code>
   */
  @java.lang.Override
  @java.lang.Deprecated
  public com.google.rpc.StatusOrBuilder getStatusOrBuilder() {
    return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getTimeSeries());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getStatus());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTimeSeries());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getStatus());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.monitoring.v3.CreateTimeSeriesError)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.CreateTimeSeriesError other =
        (com.google.monitoring.v3.CreateTimeSeriesError) obj;

    if (hasTimeSeries() != other.hasTimeSeries()) return false;
    if (hasTimeSeries()) {
      if (!getTimeSeries().equals(other.getTimeSeries())) return false;
    }
    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus().equals(other.getStatus())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTimeSeries()) {
      hash = (37 * hash) + TIME_SERIES_FIELD_NUMBER;
      hash = (53 * hash) + getTimeSeries().hashCode();
    }
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.monitoring.v3.CreateTimeSeriesError prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * DEPRECATED. Used to hold per-time-series error status.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.CreateTimeSeriesError}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.CreateTimeSeriesError)
      com.google.monitoring.v3.CreateTimeSeriesErrorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.MetricServiceProto
          .internal_static_google_monitoring_v3_CreateTimeSeriesError_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.MetricServiceProto
          .internal_static_google_monitoring_v3_CreateTimeSeriesError_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.CreateTimeSeriesError.class,
              com.google.monitoring.v3.CreateTimeSeriesError.Builder.class);
    }

    // Construct using com.google.monitoring.v3.CreateTimeSeriesError.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getTimeSeriesFieldBuilder();
        getStatusFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      timeSeries_ = null;
      if (timeSeriesBuilder_ != null) {
        timeSeriesBuilder_.dispose();
        timeSeriesBuilder_ = null;
      }
      status_ = null;
      if (statusBuilder_ != null) {
        statusBuilder_.dispose();
        statusBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.MetricServiceProto
          .internal_static_google_monitoring_v3_CreateTimeSeriesError_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateTimeSeriesError getDefaultInstanceForType() {
      return com.google.monitoring.v3.CreateTimeSeriesError.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateTimeSeriesError build() {
      com.google.monitoring.v3.CreateTimeSeriesError result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateTimeSeriesError buildPartial() {
      com.google.monitoring.v3.CreateTimeSeriesError result =
          new com.google.monitoring.v3.CreateTimeSeriesError(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.monitoring.v3.CreateTimeSeriesError result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.timeSeries_ = timeSeriesBuilder_ == null ? timeSeries_ : timeSeriesBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.status_ = statusBuilder_ == null ? status_ : statusBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.monitoring.v3.CreateTimeSeriesError) {
        return mergeFrom((com.google.monitoring.v3.CreateTimeSeriesError) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.CreateTimeSeriesError other) {
      if (other == com.google.monitoring.v3.CreateTimeSeriesError.getDefaultInstance()) return this;
      if (other.hasTimeSeries()) {
        mergeTimeSeries(other.getTimeSeries());
      }
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(getTimeSeriesFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getStatusFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.monitoring.v3.TimeSeries timeSeries_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.TimeSeries,
            com.google.monitoring.v3.TimeSeries.Builder,
            com.google.monitoring.v3.TimeSeriesOrBuilder>
        timeSeriesBuilder_;
    /**
     *
     *
     * <pre>
     * DEPRECATED. Time series ID that resulted in the `status` error.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeries time_series = 1 [deprecated = true];</code>
     *
     * @deprecated google.monitoring.v3.CreateTimeSeriesError.time_series is deprecated. See
     *     google/monitoring/v3/metric_service.proto;l=464
     * @return Whether the timeSeries field is set.
     */
    @java.lang.Deprecated
    public boolean hasTimeSeries() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. Time series ID that resulted in the `status` error.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeries time_series = 1 [deprecated = true];</code>
     *
     * @deprecated google.monitoring.v3.CreateTimeSeriesError.time_series is deprecated. See
     *     google/monitoring/v3/metric_service.proto;l=464
     * @return The timeSeries.
     */
    @java.lang.Deprecated
    public com.google.monitoring.v3.TimeSeries getTimeSeries() {
      if (timeSeriesBuilder_ == null) {
        return timeSeries_ == null
            ? com.google.monitoring.v3.TimeSeries.getDefaultInstance()
            : timeSeries_;
      } else {
        return timeSeriesBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. Time series ID that resulted in the `status` error.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeries time_series = 1 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    public Builder setTimeSeries(com.google.monitoring.v3.TimeSeries value) {
      if (timeSeriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timeSeries_ = value;
      } else {
        timeSeriesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. Time series ID that resulted in the `status` error.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeries time_series = 1 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    public Builder setTimeSeries(com.google.monitoring.v3.TimeSeries.Builder builderForValue) {
      if (timeSeriesBuilder_ == null) {
        timeSeries_ = builderForValue.build();
      } else {
        timeSeriesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. Time series ID that resulted in the `status` error.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeries time_series = 1 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    public Builder mergeTimeSeries(com.google.monitoring.v3.TimeSeries value) {
      if (timeSeriesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && timeSeries_ != null
            && timeSeries_ != com.google.monitoring.v3.TimeSeries.getDefaultInstance()) {
          getTimeSeriesBuilder().mergeFrom(value);
        } else {
          timeSeries_ = value;
        }
      } else {
        timeSeriesBuilder_.mergeFrom(value);
      }
      if (timeSeries_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. Time series ID that resulted in the `status` error.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeries time_series = 1 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    public Builder clearTimeSeries() {
      bitField0_ = (bitField0_ & ~0x00000001);
      timeSeries_ = null;
      if (timeSeriesBuilder_ != null) {
        timeSeriesBuilder_.dispose();
        timeSeriesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. Time series ID that resulted in the `status` error.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeries time_series = 1 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    public com.google.monitoring.v3.TimeSeries.Builder getTimeSeriesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTimeSeriesFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. Time series ID that resulted in the `status` error.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeries time_series = 1 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    public com.google.monitoring.v3.TimeSeriesOrBuilder getTimeSeriesOrBuilder() {
      if (timeSeriesBuilder_ != null) {
        return timeSeriesBuilder_.getMessageOrBuilder();
      } else {
        return timeSeries_ == null
            ? com.google.monitoring.v3.TimeSeries.getDefaultInstance()
            : timeSeries_;
      }
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. Time series ID that resulted in the `status` error.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeries time_series = 1 [deprecated = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.TimeSeries,
            com.google.monitoring.v3.TimeSeries.Builder,
            com.google.monitoring.v3.TimeSeriesOrBuilder>
        getTimeSeriesFieldBuilder() {
      if (timeSeriesBuilder_ == null) {
        timeSeriesBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.monitoring.v3.TimeSeries,
                com.google.monitoring.v3.TimeSeries.Builder,
                com.google.monitoring.v3.TimeSeriesOrBuilder>(
                getTimeSeries(), getParentForChildren(), isClean());
        timeSeries_ = null;
      }
      return timeSeriesBuilder_;
    }

    private com.google.rpc.Status status_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        statusBuilder_;
    /**
     *
     *
     * <pre>
     * DEPRECATED. The status of the requested write operation for `time_series`.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2 [deprecated = true];</code>
     *
     * @deprecated google.monitoring.v3.CreateTimeSeriesError.status is deprecated. See
     *     google/monitoring/v3/metric_service.proto;l=467
     * @return Whether the status field is set.
     */
    @java.lang.Deprecated
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. The status of the requested write operation for `time_series`.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2 [deprecated = true];</code>
     *
     * @deprecated google.monitoring.v3.CreateTimeSeriesError.status is deprecated. See
     *     google/monitoring/v3/metric_service.proto;l=467
     * @return The status.
     */
    @java.lang.Deprecated
    public com.google.rpc.Status getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. The status of the requested write operation for `time_series`.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    public Builder setStatus(com.google.rpc.Status value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
      } else {
        statusBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. The status of the requested write operation for `time_series`.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    public Builder setStatus(com.google.rpc.Status.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. The status of the requested write operation for `time_series`.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    public Builder mergeStatus(com.google.rpc.Status value) {
      if (statusBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && status_ != null
            && status_ != com.google.rpc.Status.getDefaultInstance()) {
          getStatusBuilder().mergeFrom(value);
        } else {
          status_ = value;
        }
      } else {
        statusBuilder_.mergeFrom(value);
      }
      if (status_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. The status of the requested write operation for `time_series`.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000002);
      status_ = null;
      if (statusBuilder_ != null) {
        statusBuilder_.dispose();
        statusBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. The status of the requested write operation for `time_series`.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    public com.google.rpc.Status.Builder getStatusBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. The status of the requested write operation for `time_series`.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    public com.google.rpc.StatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
      }
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. The status of the requested write operation for `time_series`.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2 [deprecated = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.rpc.Status,
                com.google.rpc.Status.Builder,
                com.google.rpc.StatusOrBuilder>(getStatus(), getParentForChildren(), isClean());
        status_ = null;
      }
      return statusBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.CreateTimeSeriesError)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.CreateTimeSeriesError)
  private static final com.google.monitoring.v3.CreateTimeSeriesError DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.CreateTimeSeriesError();
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateTimeSeriesError> PARSER =
      new com.google.protobuf.AbstractParser<CreateTimeSeriesError>() {
        @java.lang.Override
        public CreateTimeSeriesError parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<CreateTimeSeriesError> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTimeSeriesError> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.CreateTimeSeriesError getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
