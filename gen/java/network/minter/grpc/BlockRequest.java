// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package network.minter.grpc;

/**
 * Protobuf type {@code api_pb.BlockRequest}
 */
public final class BlockRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.BlockRequest)
    BlockRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BlockRequest.newBuilder() to construct.
  private BlockRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlockRequest() {
    fields_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BlockRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BlockRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            height_ = input.readUInt64();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              fields_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            fields_.add(rawValue);
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                fields_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              fields_.add(rawValue);
            }
            input.popLimit(oldLimit);
            break;
          }
          case 24: {

            failedTxs_ = input.readBool();
            break;
          }
          case 32: {

            events_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        fields_ = java.util.Collections.unmodifiableList(fields_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return network.minter.grpc.Resources.internal_static_api_pb_BlockRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return network.minter.grpc.Resources.internal_static_api_pb_BlockRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            network.minter.grpc.BlockRequest.class, network.minter.grpc.BlockRequest.Builder.class);
  }

  public static final int HEIGHT_FIELD_NUMBER = 1;
  private long height_;
  /**
   * <code>uint64 height = 1 [json_name = "height", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The height.
   */
  @java.lang.Override
  public long getHeight() {
    return height_;
  }

  public static final int FIELDS_FIELD_NUMBER = 2;
  private java.util.List<java.lang.Integer> fields_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, network.minter.grpc.BlockField> fields_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, network.minter.grpc.BlockField>() {
            public network.minter.grpc.BlockField convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              network.minter.grpc.BlockField result = network.minter.grpc.BlockField.valueOf(from);
              return result == null ? network.minter.grpc.BlockField.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .api_pb.BlockField fields = 2 [json_name = "fields"];</code>
   * @return A list containing the fields.
   */
  @java.lang.Override
  public java.util.List<network.minter.grpc.BlockField> getFieldsList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, network.minter.grpc.BlockField>(fields_, fields_converter_);
  }
  /**
   * <code>repeated .api_pb.BlockField fields = 2 [json_name = "fields"];</code>
   * @return The count of fields.
   */
  @java.lang.Override
  public int getFieldsCount() {
    return fields_.size();
  }
  /**
   * <code>repeated .api_pb.BlockField fields = 2 [json_name = "fields"];</code>
   * @param index The index of the element to return.
   * @return The fields at the given index.
   */
  @java.lang.Override
  public network.minter.grpc.BlockField getFields(int index) {
    return fields_converter_.convert(fields_.get(index));
  }
  /**
   * <code>repeated .api_pb.BlockField fields = 2 [json_name = "fields"];</code>
   * @return A list containing the enum numeric values on the wire for fields.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getFieldsValueList() {
    return fields_;
  }
  /**
   * <code>repeated .api_pb.BlockField fields = 2 [json_name = "fields"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of fields at the given index.
   */
  @java.lang.Override
  public int getFieldsValue(int index) {
    return fields_.get(index);
  }
  private int fieldsMemoizedSerializedSize;

  public static final int FAILED_TXS_FIELD_NUMBER = 3;
  private boolean failedTxs_;
  /**
   * <code>bool failed_txs = 3 [json_name = "failedTxs", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The failedTxs.
   */
  @java.lang.Override
  public boolean getFailedTxs() {
    return failedTxs_;
  }

  public static final int EVENTS_FIELD_NUMBER = 4;
  private boolean events_;
  /**
   * <code>bool events = 4 [json_name = "events", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The events.
   */
  @java.lang.Override
  public boolean getEvents() {
    return events_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (height_ != 0L) {
      output.writeUInt64(1, height_);
    }
    if (getFieldsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(fieldsMemoizedSerializedSize);
    }
    for (int i = 0; i < fields_.size(); i++) {
      output.writeEnumNoTag(fields_.get(i));
    }
    if (failedTxs_ != false) {
      output.writeBool(3, failedTxs_);
    }
    if (events_ != false) {
      output.writeBool(4, events_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (height_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, height_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < fields_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(fields_.get(i));
      }
      size += dataSize;
      if (!getFieldsList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }fieldsMemoizedSerializedSize = dataSize;
    }
    if (failedTxs_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, failedTxs_);
    }
    if (events_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, events_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof network.minter.grpc.BlockRequest)) {
      return super.equals(obj);
    }
    network.minter.grpc.BlockRequest other = (network.minter.grpc.BlockRequest) obj;

    if (getHeight()
        != other.getHeight()) return false;
    if (!fields_.equals(other.fields_)) return false;
    if (getFailedTxs()
        != other.getFailedTxs()) return false;
    if (getEvents()
        != other.getEvents()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHeight());
    if (getFieldsCount() > 0) {
      hash = (37 * hash) + FIELDS_FIELD_NUMBER;
      hash = (53 * hash) + fields_.hashCode();
    }
    hash = (37 * hash) + FAILED_TXS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFailedTxs());
    hash = (37 * hash) + EVENTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEvents());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static network.minter.grpc.BlockRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.minter.grpc.BlockRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.minter.grpc.BlockRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.minter.grpc.BlockRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.minter.grpc.BlockRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.minter.grpc.BlockRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.minter.grpc.BlockRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.minter.grpc.BlockRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.minter.grpc.BlockRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static network.minter.grpc.BlockRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.minter.grpc.BlockRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.minter.grpc.BlockRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(network.minter.grpc.BlockRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code api_pb.BlockRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.BlockRequest)
      network.minter.grpc.BlockRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return network.minter.grpc.Resources.internal_static_api_pb_BlockRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return network.minter.grpc.Resources.internal_static_api_pb_BlockRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              network.minter.grpc.BlockRequest.class, network.minter.grpc.BlockRequest.Builder.class);
    }

    // Construct using network.minter.grpc.BlockRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      height_ = 0L;

      fields_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      failedTxs_ = false;

      events_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return network.minter.grpc.Resources.internal_static_api_pb_BlockRequest_descriptor;
    }

    @java.lang.Override
    public network.minter.grpc.BlockRequest getDefaultInstanceForType() {
      return network.minter.grpc.BlockRequest.getDefaultInstance();
    }

    @java.lang.Override
    public network.minter.grpc.BlockRequest build() {
      network.minter.grpc.BlockRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public network.minter.grpc.BlockRequest buildPartial() {
      network.minter.grpc.BlockRequest result = new network.minter.grpc.BlockRequest(this);
      int from_bitField0_ = bitField0_;
      result.height_ = height_;
      if (((bitField0_ & 0x00000001) != 0)) {
        fields_ = java.util.Collections.unmodifiableList(fields_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.fields_ = fields_;
      result.failedTxs_ = failedTxs_;
      result.events_ = events_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof network.minter.grpc.BlockRequest) {
        return mergeFrom((network.minter.grpc.BlockRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(network.minter.grpc.BlockRequest other) {
      if (other == network.minter.grpc.BlockRequest.getDefaultInstance()) return this;
      if (other.getHeight() != 0L) {
        setHeight(other.getHeight());
      }
      if (!other.fields_.isEmpty()) {
        if (fields_.isEmpty()) {
          fields_ = other.fields_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureFieldsIsMutable();
          fields_.addAll(other.fields_);
        }
        onChanged();
      }
      if (other.getFailedTxs() != false) {
        setFailedTxs(other.getFailedTxs());
      }
      if (other.getEvents() != false) {
        setEvents(other.getEvents());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      network.minter.grpc.BlockRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (network.minter.grpc.BlockRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long height_ ;
    /**
     * <code>uint64 height = 1 [json_name = "height", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The height.
     */
    @java.lang.Override
    public long getHeight() {
      return height_;
    }
    /**
     * <code>uint64 height = 1 [json_name = "height", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(long value) {
      
      height_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 height = 1 [json_name = "height", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      
      height_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> fields_ =
      java.util.Collections.emptyList();
    private void ensureFieldsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fields_ = new java.util.ArrayList<java.lang.Integer>(fields_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .api_pb.BlockField fields = 2 [json_name = "fields"];</code>
     * @return A list containing the fields.
     */
    public java.util.List<network.minter.grpc.BlockField> getFieldsList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, network.minter.grpc.BlockField>(fields_, fields_converter_);
    }
    /**
     * <code>repeated .api_pb.BlockField fields = 2 [json_name = "fields"];</code>
     * @return The count of fields.
     */
    public int getFieldsCount() {
      return fields_.size();
    }
    /**
     * <code>repeated .api_pb.BlockField fields = 2 [json_name = "fields"];</code>
     * @param index The index of the element to return.
     * @return The fields at the given index.
     */
    public network.minter.grpc.BlockField getFields(int index) {
      return fields_converter_.convert(fields_.get(index));
    }
    /**
     * <code>repeated .api_pb.BlockField fields = 2 [json_name = "fields"];</code>
     * @param index The index to set the value at.
     * @param value The fields to set.
     * @return This builder for chaining.
     */
    public Builder setFields(
        int index, network.minter.grpc.BlockField value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureFieldsIsMutable();
      fields_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .api_pb.BlockField fields = 2 [json_name = "fields"];</code>
     * @param value The fields to add.
     * @return This builder for chaining.
     */
    public Builder addFields(network.minter.grpc.BlockField value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureFieldsIsMutable();
      fields_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .api_pb.BlockField fields = 2 [json_name = "fields"];</code>
     * @param values The fields to add.
     * @return This builder for chaining.
     */
    public Builder addAllFields(
        java.lang.Iterable<? extends network.minter.grpc.BlockField> values) {
      ensureFieldsIsMutable();
      for (network.minter.grpc.BlockField value : values) {
        fields_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .api_pb.BlockField fields = 2 [json_name = "fields"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFields() {
      fields_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .api_pb.BlockField fields = 2 [json_name = "fields"];</code>
     * @return A list containing the enum numeric values on the wire for fields.
     */
    public java.util.List<java.lang.Integer>
    getFieldsValueList() {
      return java.util.Collections.unmodifiableList(fields_);
    }
    /**
     * <code>repeated .api_pb.BlockField fields = 2 [json_name = "fields"];</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of fields at the given index.
     */
    public int getFieldsValue(int index) {
      return fields_.get(index);
    }
    /**
     * <code>repeated .api_pb.BlockField fields = 2 [json_name = "fields"];</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of fields at the given index.
     * @return This builder for chaining.
     */
    public Builder setFieldsValue(
        int index, int value) {
      ensureFieldsIsMutable();
      fields_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .api_pb.BlockField fields = 2 [json_name = "fields"];</code>
     * @param value The enum numeric value on the wire for fields to add.
     * @return This builder for chaining.
     */
    public Builder addFieldsValue(int value) {
      ensureFieldsIsMutable();
      fields_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .api_pb.BlockField fields = 2 [json_name = "fields"];</code>
     * @param values The enum numeric values on the wire for fields to add.
     * @return This builder for chaining.
     */
    public Builder addAllFieldsValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureFieldsIsMutable();
      for (int value : values) {
        fields_.add(value);
      }
      onChanged();
      return this;
    }

    private boolean failedTxs_ ;
    /**
     * <code>bool failed_txs = 3 [json_name = "failedTxs", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The failedTxs.
     */
    @java.lang.Override
    public boolean getFailedTxs() {
      return failedTxs_;
    }
    /**
     * <code>bool failed_txs = 3 [json_name = "failedTxs", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The failedTxs to set.
     * @return This builder for chaining.
     */
    public Builder setFailedTxs(boolean value) {
      
      failedTxs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool failed_txs = 3 [json_name = "failedTxs", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearFailedTxs() {
      
      failedTxs_ = false;
      onChanged();
      return this;
    }

    private boolean events_ ;
    /**
     * <code>bool events = 4 [json_name = "events", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The events.
     */
    @java.lang.Override
    public boolean getEvents() {
      return events_;
    }
    /**
     * <code>bool events = 4 [json_name = "events", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The events to set.
     * @return This builder for chaining.
     */
    public Builder setEvents(boolean value) {
      
      events_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool events = 4 [json_name = "events", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearEvents() {
      
      events_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:api_pb.BlockRequest)
  }

  // @@protoc_insertion_point(class_scope:api_pb.BlockRequest)
  private static final network.minter.grpc.BlockRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new network.minter.grpc.BlockRequest();
  }

  public static network.minter.grpc.BlockRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlockRequest>
      PARSER = new com.google.protobuf.AbstractParser<BlockRequest>() {
    @java.lang.Override
    public BlockRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BlockRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BlockRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlockRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public network.minter.grpc.BlockRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

