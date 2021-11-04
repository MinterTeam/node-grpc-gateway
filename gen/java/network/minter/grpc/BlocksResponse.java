// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package network.minter.grpc;

/**
 * Protobuf type {@code api_pb.BlocksResponse}
 */
public final class BlocksResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.BlocksResponse)
    BlocksResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BlocksResponse.newBuilder() to construct.
  private BlocksResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlocksResponse() {
    blocks_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BlocksResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BlocksResponse(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              blocks_ = new java.util.ArrayList<network.minter.grpc.BlockResponse>();
              mutable_bitField0_ |= 0x00000001;
            }
            blocks_.add(
                input.readMessage(network.minter.grpc.BlockResponse.parser(), extensionRegistry));
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
        blocks_ = java.util.Collections.unmodifiableList(blocks_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return network.minter.grpc.Resources.internal_static_api_pb_BlocksResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return network.minter.grpc.Resources.internal_static_api_pb_BlocksResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            network.minter.grpc.BlocksResponse.class, network.minter.grpc.BlocksResponse.Builder.class);
  }

  public static final int BLOCKS_FIELD_NUMBER = 1;
  private java.util.List<network.minter.grpc.BlockResponse> blocks_;
  /**
   * <code>repeated .api_pb.BlockResponse blocks = 1 [json_name = "blocks"];</code>
   */
  @java.lang.Override
  public java.util.List<network.minter.grpc.BlockResponse> getBlocksList() {
    return blocks_;
  }
  /**
   * <code>repeated .api_pb.BlockResponse blocks = 1 [json_name = "blocks"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends network.minter.grpc.BlockResponseOrBuilder> 
      getBlocksOrBuilderList() {
    return blocks_;
  }
  /**
   * <code>repeated .api_pb.BlockResponse blocks = 1 [json_name = "blocks"];</code>
   */
  @java.lang.Override
  public int getBlocksCount() {
    return blocks_.size();
  }
  /**
   * <code>repeated .api_pb.BlockResponse blocks = 1 [json_name = "blocks"];</code>
   */
  @java.lang.Override
  public network.minter.grpc.BlockResponse getBlocks(int index) {
    return blocks_.get(index);
  }
  /**
   * <code>repeated .api_pb.BlockResponse blocks = 1 [json_name = "blocks"];</code>
   */
  @java.lang.Override
  public network.minter.grpc.BlockResponseOrBuilder getBlocksOrBuilder(
      int index) {
    return blocks_.get(index);
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
    for (int i = 0; i < blocks_.size(); i++) {
      output.writeMessage(1, blocks_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < blocks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, blocks_.get(i));
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
    if (!(obj instanceof network.minter.grpc.BlocksResponse)) {
      return super.equals(obj);
    }
    network.minter.grpc.BlocksResponse other = (network.minter.grpc.BlocksResponse) obj;

    if (!getBlocksList()
        .equals(other.getBlocksList())) return false;
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
    if (getBlocksCount() > 0) {
      hash = (37 * hash) + BLOCKS_FIELD_NUMBER;
      hash = (53 * hash) + getBlocksList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static network.minter.grpc.BlocksResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.minter.grpc.BlocksResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.minter.grpc.BlocksResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.minter.grpc.BlocksResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.minter.grpc.BlocksResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.minter.grpc.BlocksResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.minter.grpc.BlocksResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.minter.grpc.BlocksResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.minter.grpc.BlocksResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static network.minter.grpc.BlocksResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.minter.grpc.BlocksResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.minter.grpc.BlocksResponse parseFrom(
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
  public static Builder newBuilder(network.minter.grpc.BlocksResponse prototype) {
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
   * Protobuf type {@code api_pb.BlocksResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.BlocksResponse)
      network.minter.grpc.BlocksResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return network.minter.grpc.Resources.internal_static_api_pb_BlocksResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return network.minter.grpc.Resources.internal_static_api_pb_BlocksResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              network.minter.grpc.BlocksResponse.class, network.minter.grpc.BlocksResponse.Builder.class);
    }

    // Construct using network.minter.grpc.BlocksResponse.newBuilder()
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
        getBlocksFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (blocksBuilder_ == null) {
        blocks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        blocksBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return network.minter.grpc.Resources.internal_static_api_pb_BlocksResponse_descriptor;
    }

    @java.lang.Override
    public network.minter.grpc.BlocksResponse getDefaultInstanceForType() {
      return network.minter.grpc.BlocksResponse.getDefaultInstance();
    }

    @java.lang.Override
    public network.minter.grpc.BlocksResponse build() {
      network.minter.grpc.BlocksResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public network.minter.grpc.BlocksResponse buildPartial() {
      network.minter.grpc.BlocksResponse result = new network.minter.grpc.BlocksResponse(this);
      int from_bitField0_ = bitField0_;
      if (blocksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          blocks_ = java.util.Collections.unmodifiableList(blocks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.blocks_ = blocks_;
      } else {
        result.blocks_ = blocksBuilder_.build();
      }
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
      if (other instanceof network.minter.grpc.BlocksResponse) {
        return mergeFrom((network.minter.grpc.BlocksResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(network.minter.grpc.BlocksResponse other) {
      if (other == network.minter.grpc.BlocksResponse.getDefaultInstance()) return this;
      if (blocksBuilder_ == null) {
        if (!other.blocks_.isEmpty()) {
          if (blocks_.isEmpty()) {
            blocks_ = other.blocks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBlocksIsMutable();
            blocks_.addAll(other.blocks_);
          }
          onChanged();
        }
      } else {
        if (!other.blocks_.isEmpty()) {
          if (blocksBuilder_.isEmpty()) {
            blocksBuilder_.dispose();
            blocksBuilder_ = null;
            blocks_ = other.blocks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            blocksBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBlocksFieldBuilder() : null;
          } else {
            blocksBuilder_.addAllMessages(other.blocks_);
          }
        }
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
      network.minter.grpc.BlocksResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (network.minter.grpc.BlocksResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<network.minter.grpc.BlockResponse> blocks_ =
      java.util.Collections.emptyList();
    private void ensureBlocksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        blocks_ = new java.util.ArrayList<network.minter.grpc.BlockResponse>(blocks_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        network.minter.grpc.BlockResponse, network.minter.grpc.BlockResponse.Builder, network.minter.grpc.BlockResponseOrBuilder> blocksBuilder_;

    /**
     * <code>repeated .api_pb.BlockResponse blocks = 1 [json_name = "blocks"];</code>
     */
    public java.util.List<network.minter.grpc.BlockResponse> getBlocksList() {
      if (blocksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(blocks_);
      } else {
        return blocksBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api_pb.BlockResponse blocks = 1 [json_name = "blocks"];</code>
     */
    public int getBlocksCount() {
      if (blocksBuilder_ == null) {
        return blocks_.size();
      } else {
        return blocksBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api_pb.BlockResponse blocks = 1 [json_name = "blocks"];</code>
     */
    public network.minter.grpc.BlockResponse getBlocks(int index) {
      if (blocksBuilder_ == null) {
        return blocks_.get(index);
      } else {
        return blocksBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api_pb.BlockResponse blocks = 1 [json_name = "blocks"];</code>
     */
    public Builder setBlocks(
        int index, network.minter.grpc.BlockResponse value) {
      if (blocksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBlocksIsMutable();
        blocks_.set(index, value);
        onChanged();
      } else {
        blocksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.BlockResponse blocks = 1 [json_name = "blocks"];</code>
     */
    public Builder setBlocks(
        int index, network.minter.grpc.BlockResponse.Builder builderForValue) {
      if (blocksBuilder_ == null) {
        ensureBlocksIsMutable();
        blocks_.set(index, builderForValue.build());
        onChanged();
      } else {
        blocksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.BlockResponse blocks = 1 [json_name = "blocks"];</code>
     */
    public Builder addBlocks(network.minter.grpc.BlockResponse value) {
      if (blocksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBlocksIsMutable();
        blocks_.add(value);
        onChanged();
      } else {
        blocksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.BlockResponse blocks = 1 [json_name = "blocks"];</code>
     */
    public Builder addBlocks(
        int index, network.minter.grpc.BlockResponse value) {
      if (blocksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBlocksIsMutable();
        blocks_.add(index, value);
        onChanged();
      } else {
        blocksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.BlockResponse blocks = 1 [json_name = "blocks"];</code>
     */
    public Builder addBlocks(
        network.minter.grpc.BlockResponse.Builder builderForValue) {
      if (blocksBuilder_ == null) {
        ensureBlocksIsMutable();
        blocks_.add(builderForValue.build());
        onChanged();
      } else {
        blocksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.BlockResponse blocks = 1 [json_name = "blocks"];</code>
     */
    public Builder addBlocks(
        int index, network.minter.grpc.BlockResponse.Builder builderForValue) {
      if (blocksBuilder_ == null) {
        ensureBlocksIsMutable();
        blocks_.add(index, builderForValue.build());
        onChanged();
      } else {
        blocksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.BlockResponse blocks = 1 [json_name = "blocks"];</code>
     */
    public Builder addAllBlocks(
        java.lang.Iterable<? extends network.minter.grpc.BlockResponse> values) {
      if (blocksBuilder_ == null) {
        ensureBlocksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, blocks_);
        onChanged();
      } else {
        blocksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.BlockResponse blocks = 1 [json_name = "blocks"];</code>
     */
    public Builder clearBlocks() {
      if (blocksBuilder_ == null) {
        blocks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        blocksBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.BlockResponse blocks = 1 [json_name = "blocks"];</code>
     */
    public Builder removeBlocks(int index) {
      if (blocksBuilder_ == null) {
        ensureBlocksIsMutable();
        blocks_.remove(index);
        onChanged();
      } else {
        blocksBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api_pb.BlockResponse blocks = 1 [json_name = "blocks"];</code>
     */
    public network.minter.grpc.BlockResponse.Builder getBlocksBuilder(
        int index) {
      return getBlocksFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api_pb.BlockResponse blocks = 1 [json_name = "blocks"];</code>
     */
    public network.minter.grpc.BlockResponseOrBuilder getBlocksOrBuilder(
        int index) {
      if (blocksBuilder_ == null) {
        return blocks_.get(index);  } else {
        return blocksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api_pb.BlockResponse blocks = 1 [json_name = "blocks"];</code>
     */
    public java.util.List<? extends network.minter.grpc.BlockResponseOrBuilder> 
         getBlocksOrBuilderList() {
      if (blocksBuilder_ != null) {
        return blocksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(blocks_);
      }
    }
    /**
     * <code>repeated .api_pb.BlockResponse blocks = 1 [json_name = "blocks"];</code>
     */
    public network.minter.grpc.BlockResponse.Builder addBlocksBuilder() {
      return getBlocksFieldBuilder().addBuilder(
          network.minter.grpc.BlockResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .api_pb.BlockResponse blocks = 1 [json_name = "blocks"];</code>
     */
    public network.minter.grpc.BlockResponse.Builder addBlocksBuilder(
        int index) {
      return getBlocksFieldBuilder().addBuilder(
          index, network.minter.grpc.BlockResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .api_pb.BlockResponse blocks = 1 [json_name = "blocks"];</code>
     */
    public java.util.List<network.minter.grpc.BlockResponse.Builder> 
         getBlocksBuilderList() {
      return getBlocksFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        network.minter.grpc.BlockResponse, network.minter.grpc.BlockResponse.Builder, network.minter.grpc.BlockResponseOrBuilder> 
        getBlocksFieldBuilder() {
      if (blocksBuilder_ == null) {
        blocksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            network.minter.grpc.BlockResponse, network.minter.grpc.BlockResponse.Builder, network.minter.grpc.BlockResponseOrBuilder>(
                blocks_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        blocks_ = null;
      }
      return blocksBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api_pb.BlocksResponse)
  }

  // @@protoc_insertion_point(class_scope:api_pb.BlocksResponse)
  private static final network.minter.grpc.BlocksResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new network.minter.grpc.BlocksResponse();
  }

  public static network.minter.grpc.BlocksResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlocksResponse>
      PARSER = new com.google.protobuf.AbstractParser<BlocksResponse>() {
    @java.lang.Override
    public BlocksResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BlocksResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BlocksResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlocksResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public network.minter.grpc.BlocksResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

