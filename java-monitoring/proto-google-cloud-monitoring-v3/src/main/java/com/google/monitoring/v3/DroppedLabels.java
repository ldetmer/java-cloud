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
// source: google/monitoring/v3/dropped_labels.proto

// Protobuf Java Version: 3.25.5
package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * A set of (label, value) pairs that were removed from a Distribution
 * time series during aggregation and then added as an attachment to a
 * Distribution.Exemplar.
 *
 * The full label set for the exemplars is constructed by using the dropped
 * pairs in combination with the label values that remain on the aggregated
 * Distribution time series. The constructed full label set can be used to
 * identify the specific entity, such as the instance or job, which might be
 * contributing to a long-tail. However, with dropped labels, the storage
 * requirements are reduced because only the aggregated distribution values for
 * a large group of time series are stored.
 *
 * Note that there are no guarantees on ordering of the labels from
 * exemplar-to-exemplar and from distribution-to-distribution in the same
 * stream, and there may be duplicates.  It is up to clients to resolve any
 * ambiguities.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.DroppedLabels}
 */
public final class DroppedLabels extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.DroppedLabels)
    DroppedLabelsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DroppedLabels.newBuilder() to construct.
  private DroppedLabels(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DroppedLabels() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DroppedLabels();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.DroppedLabelsProto
        .internal_static_google_monitoring_v3_DroppedLabels_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 1:
        return internalGetLabel();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.DroppedLabelsProto
        .internal_static_google_monitoring_v3_DroppedLabels_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.DroppedLabels.class,
            com.google.monitoring.v3.DroppedLabels.Builder.class);
  }

  public static final int LABEL_FIELD_NUMBER = 1;

  private static final class LabelDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.monitoring.v3.DroppedLabelsProto
                .internal_static_google_monitoring_v3_DroppedLabels_LabelEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, java.lang.String> label_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetLabel() {
    if (label_ == null) {
      return com.google.protobuf.MapField.emptyMapField(LabelDefaultEntryHolder.defaultEntry);
    }
    return label_;
  }

  public int getLabelCount() {
    return internalGetLabel().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Map from label to its value, for all labels dropped in any aggregation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; label = 1;</code>
   */
  @java.lang.Override
  public boolean containsLabel(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetLabel().getMap().containsKey(key);
  }
  /** Use {@link #getLabelMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getLabel() {
    return getLabelMap();
  }
  /**
   *
   *
   * <pre>
   * Map from label to its value, for all labels dropped in any aggregation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; label = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getLabelMap() {
    return internalGetLabel().getMap();
  }
  /**
   *
   *
   * <pre>
   * Map from label to its value, for all labels dropped in any aggregation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; label = 1;</code>
   */
  @java.lang.Override
  public /* nullable */ java.lang.String getLabelOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetLabel().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Map from label to its value, for all labels dropped in any aggregation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; label = 1;</code>
   */
  @java.lang.Override
  public java.lang.String getLabelOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetLabel().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetLabel(), LabelDefaultEntryHolder.defaultEntry, 1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetLabel().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> label__ =
          LabelDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, label__);
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
    if (!(obj instanceof com.google.monitoring.v3.DroppedLabels)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.DroppedLabels other = (com.google.monitoring.v3.DroppedLabels) obj;

    if (!internalGetLabel().equals(other.internalGetLabel())) return false;
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
    if (!internalGetLabel().getMap().isEmpty()) {
      hash = (37 * hash) + LABEL_FIELD_NUMBER;
      hash = (53 * hash) + internalGetLabel().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.DroppedLabels parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.DroppedLabels parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.DroppedLabels parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.DroppedLabels parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.DroppedLabels parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.DroppedLabels parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.DroppedLabels parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.DroppedLabels parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.DroppedLabels parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.DroppedLabels parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.DroppedLabels parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.DroppedLabels parseFrom(
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

  public static Builder newBuilder(com.google.monitoring.v3.DroppedLabels prototype) {
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
   * A set of (label, value) pairs that were removed from a Distribution
   * time series during aggregation and then added as an attachment to a
   * Distribution.Exemplar.
   *
   * The full label set for the exemplars is constructed by using the dropped
   * pairs in combination with the label values that remain on the aggregated
   * Distribution time series. The constructed full label set can be used to
   * identify the specific entity, such as the instance or job, which might be
   * contributing to a long-tail. However, with dropped labels, the storage
   * requirements are reduced because only the aggregated distribution values for
   * a large group of time series are stored.
   *
   * Note that there are no guarantees on ordering of the labels from
   * exemplar-to-exemplar and from distribution-to-distribution in the same
   * stream, and there may be duplicates.  It is up to clients to resolve any
   * ambiguities.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.DroppedLabels}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.DroppedLabels)
      com.google.monitoring.v3.DroppedLabelsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.DroppedLabelsProto
          .internal_static_google_monitoring_v3_DroppedLabels_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetLabel();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableLabel();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.DroppedLabelsProto
          .internal_static_google_monitoring_v3_DroppedLabels_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.DroppedLabels.class,
              com.google.monitoring.v3.DroppedLabels.Builder.class);
    }

    // Construct using com.google.monitoring.v3.DroppedLabels.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableLabel().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.DroppedLabelsProto
          .internal_static_google_monitoring_v3_DroppedLabels_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.DroppedLabels getDefaultInstanceForType() {
      return com.google.monitoring.v3.DroppedLabels.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.DroppedLabels build() {
      com.google.monitoring.v3.DroppedLabels result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.DroppedLabels buildPartial() {
      com.google.monitoring.v3.DroppedLabels result =
          new com.google.monitoring.v3.DroppedLabels(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.monitoring.v3.DroppedLabels result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.label_ = internalGetLabel();
        result.label_.makeImmutable();
      }
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
      if (other instanceof com.google.monitoring.v3.DroppedLabels) {
        return mergeFrom((com.google.monitoring.v3.DroppedLabels) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.DroppedLabels other) {
      if (other == com.google.monitoring.v3.DroppedLabels.getDefaultInstance()) return this;
      internalGetMutableLabel().mergeFrom(other.internalGetLabel());
      bitField0_ |= 0x00000001;
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
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> label__ =
                    input.readMessage(
                        LabelDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableLabel().getMutableMap().put(label__.getKey(), label__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> label_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetLabel() {
      if (label_ == null) {
        return com.google.protobuf.MapField.emptyMapField(LabelDefaultEntryHolder.defaultEntry);
      }
      return label_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableLabel() {
      if (label_ == null) {
        label_ = com.google.protobuf.MapField.newMapField(LabelDefaultEntryHolder.defaultEntry);
      }
      if (!label_.isMutable()) {
        label_ = label_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return label_;
    }

    public int getLabelCount() {
      return internalGetLabel().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Map from label to its value, for all labels dropped in any aggregation.
     * </pre>
     *
     * <code>map&lt;string, string&gt; label = 1;</code>
     */
    @java.lang.Override
    public boolean containsLabel(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetLabel().getMap().containsKey(key);
    }
    /** Use {@link #getLabelMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getLabel() {
      return getLabelMap();
    }
    /**
     *
     *
     * <pre>
     * Map from label to its value, for all labels dropped in any aggregation.
     * </pre>
     *
     * <code>map&lt;string, string&gt; label = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getLabelMap() {
      return internalGetLabel().getMap();
    }
    /**
     *
     *
     * <pre>
     * Map from label to its value, for all labels dropped in any aggregation.
     * </pre>
     *
     * <code>map&lt;string, string&gt; label = 1;</code>
     */
    @java.lang.Override
    public /* nullable */ java.lang.String getLabelOrDefault(
        java.lang.String key,
        /* nullable */
        java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetLabel().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Map from label to its value, for all labels dropped in any aggregation.
     * </pre>
     *
     * <code>map&lt;string, string&gt; label = 1;</code>
     */
    @java.lang.Override
    public java.lang.String getLabelOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetLabel().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearLabel() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableLabel().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Map from label to its value, for all labels dropped in any aggregation.
     * </pre>
     *
     * <code>map&lt;string, string&gt; label = 1;</code>
     */
    public Builder removeLabel(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableLabel().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableLabel() {
      bitField0_ |= 0x00000001;
      return internalGetMutableLabel().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Map from label to its value, for all labels dropped in any aggregation.
     * </pre>
     *
     * <code>map&lt;string, string&gt; label = 1;</code>
     */
    public Builder putLabel(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableLabel().getMutableMap().put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Map from label to its value, for all labels dropped in any aggregation.
     * </pre>
     *
     * <code>map&lt;string, string&gt; label = 1;</code>
     */
    public Builder putAllLabel(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableLabel().getMutableMap().putAll(values);
      bitField0_ |= 0x00000001;
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.DroppedLabels)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.DroppedLabels)
  private static final com.google.monitoring.v3.DroppedLabels DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.DroppedLabels();
  }

  public static com.google.monitoring.v3.DroppedLabels getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DroppedLabels> PARSER =
      new com.google.protobuf.AbstractParser<DroppedLabels>() {
        @java.lang.Override
        public DroppedLabels parsePartialFrom(
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

  public static com.google.protobuf.Parser<DroppedLabels> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DroppedLabels> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.DroppedLabels getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
