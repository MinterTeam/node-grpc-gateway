// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package network.minter.grpc;

/**
 * Protobuf type {@code api_pb.EditCoinOwnerData}
 */
public final class EditCoinOwnerData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.EditCoinOwnerData)
    EditCoinOwnerDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EditCoinOwnerData.newBuilder() to construct.
  private EditCoinOwnerData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EditCoinOwnerData() {
    symbol_ = "";
    newOwner_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EditCoinOwnerData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EditCoinOwnerData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            java.lang.String s = input.readStringRequireUtf8();

            symbol_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            newOwner_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return network.minter.grpc.Data.internal_static_api_pb_EditCoinOwnerData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return network.minter.grpc.Data.internal_static_api_pb_EditCoinOwnerData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            network.minter.grpc.EditCoinOwnerData.class, network.minter.grpc.EditCoinOwnerData.Builder.class);
  }

  public static final int SYMBOL_FIELD_NUMBER = 1;
  private volatile java.lang.Object symbol_;
  /**
   * <code>string symbol = 1 [json_name = "symbol"];</code>
   * @return The symbol.
   */
  @java.lang.Override
  public java.lang.String getSymbol() {
    java.lang.Object ref = symbol_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      symbol_ = s;
      return s;
    }
  }
  /**
   * <code>string symbol = 1 [json_name = "symbol"];</code>
   * @return The bytes for symbol.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSymbolBytes() {
    java.lang.Object ref = symbol_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      symbol_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEW_OWNER_FIELD_NUMBER = 2;
  private volatile java.lang.Object newOwner_;
  /**
   * <code>string new_owner = 2 [json_name = "newOwner"];</code>
   * @return The newOwner.
   */
  @java.lang.Override
  public java.lang.String getNewOwner() {
    java.lang.Object ref = newOwner_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newOwner_ = s;
      return s;
    }
  }
  /**
   * <code>string new_owner = 2 [json_name = "newOwner"];</code>
   * @return The bytes for newOwner.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNewOwnerBytes() {
    java.lang.Object ref = newOwner_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      newOwner_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getSymbolBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, symbol_);
    }
    if (!getNewOwnerBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, newOwner_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSymbolBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, symbol_);
    }
    if (!getNewOwnerBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, newOwner_);
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
    if (!(obj instanceof network.minter.grpc.EditCoinOwnerData)) {
      return super.equals(obj);
    }
    network.minter.grpc.EditCoinOwnerData other = (network.minter.grpc.EditCoinOwnerData) obj;

    if (!getSymbol()
        .equals(other.getSymbol())) return false;
    if (!getNewOwner()
        .equals(other.getNewOwner())) return false;
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
    hash = (37 * hash) + SYMBOL_FIELD_NUMBER;
    hash = (53 * hash) + getSymbol().hashCode();
    hash = (37 * hash) + NEW_OWNER_FIELD_NUMBER;
    hash = (53 * hash) + getNewOwner().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static network.minter.grpc.EditCoinOwnerData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.minter.grpc.EditCoinOwnerData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.minter.grpc.EditCoinOwnerData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.minter.grpc.EditCoinOwnerData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.minter.grpc.EditCoinOwnerData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.minter.grpc.EditCoinOwnerData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.minter.grpc.EditCoinOwnerData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.minter.grpc.EditCoinOwnerData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.minter.grpc.EditCoinOwnerData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static network.minter.grpc.EditCoinOwnerData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.minter.grpc.EditCoinOwnerData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.minter.grpc.EditCoinOwnerData parseFrom(
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
  public static Builder newBuilder(network.minter.grpc.EditCoinOwnerData prototype) {
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
   * Protobuf type {@code api_pb.EditCoinOwnerData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.EditCoinOwnerData)
      network.minter.grpc.EditCoinOwnerDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return network.minter.grpc.Data.internal_static_api_pb_EditCoinOwnerData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return network.minter.grpc.Data.internal_static_api_pb_EditCoinOwnerData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              network.minter.grpc.EditCoinOwnerData.class, network.minter.grpc.EditCoinOwnerData.Builder.class);
    }

    // Construct using network.minter.grpc.EditCoinOwnerData.newBuilder()
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
      symbol_ = "";

      newOwner_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return network.minter.grpc.Data.internal_static_api_pb_EditCoinOwnerData_descriptor;
    }

    @java.lang.Override
    public network.minter.grpc.EditCoinOwnerData getDefaultInstanceForType() {
      return network.minter.grpc.EditCoinOwnerData.getDefaultInstance();
    }

    @java.lang.Override
    public network.minter.grpc.EditCoinOwnerData build() {
      network.minter.grpc.EditCoinOwnerData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public network.minter.grpc.EditCoinOwnerData buildPartial() {
      network.minter.grpc.EditCoinOwnerData result = new network.minter.grpc.EditCoinOwnerData(this);
      result.symbol_ = symbol_;
      result.newOwner_ = newOwner_;
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
      if (other instanceof network.minter.grpc.EditCoinOwnerData) {
        return mergeFrom((network.minter.grpc.EditCoinOwnerData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(network.minter.grpc.EditCoinOwnerData other) {
      if (other == network.minter.grpc.EditCoinOwnerData.getDefaultInstance()) return this;
      if (!other.getSymbol().isEmpty()) {
        symbol_ = other.symbol_;
        onChanged();
      }
      if (!other.getNewOwner().isEmpty()) {
        newOwner_ = other.newOwner_;
        onChanged();
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
      network.minter.grpc.EditCoinOwnerData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (network.minter.grpc.EditCoinOwnerData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object symbol_ = "";
    /**
     * <code>string symbol = 1 [json_name = "symbol"];</code>
     * @return The symbol.
     */
    public java.lang.String getSymbol() {
      java.lang.Object ref = symbol_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        symbol_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string symbol = 1 [json_name = "symbol"];</code>
     * @return The bytes for symbol.
     */
    public com.google.protobuf.ByteString
        getSymbolBytes() {
      java.lang.Object ref = symbol_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        symbol_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string symbol = 1 [json_name = "symbol"];</code>
     * @param value The symbol to set.
     * @return This builder for chaining.
     */
    public Builder setSymbol(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      symbol_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string symbol = 1 [json_name = "symbol"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSymbol() {
      
      symbol_ = getDefaultInstance().getSymbol();
      onChanged();
      return this;
    }
    /**
     * <code>string symbol = 1 [json_name = "symbol"];</code>
     * @param value The bytes for symbol to set.
     * @return This builder for chaining.
     */
    public Builder setSymbolBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      symbol_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object newOwner_ = "";
    /**
     * <code>string new_owner = 2 [json_name = "newOwner"];</code>
     * @return The newOwner.
     */
    public java.lang.String getNewOwner() {
      java.lang.Object ref = newOwner_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newOwner_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string new_owner = 2 [json_name = "newOwner"];</code>
     * @return The bytes for newOwner.
     */
    public com.google.protobuf.ByteString
        getNewOwnerBytes() {
      java.lang.Object ref = newOwner_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newOwner_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string new_owner = 2 [json_name = "newOwner"];</code>
     * @param value The newOwner to set.
     * @return This builder for chaining.
     */
    public Builder setNewOwner(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      newOwner_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string new_owner = 2 [json_name = "newOwner"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNewOwner() {
      
      newOwner_ = getDefaultInstance().getNewOwner();
      onChanged();
      return this;
    }
    /**
     * <code>string new_owner = 2 [json_name = "newOwner"];</code>
     * @param value The bytes for newOwner to set.
     * @return This builder for chaining.
     */
    public Builder setNewOwnerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      newOwner_ = value;
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


    // @@protoc_insertion_point(builder_scope:api_pb.EditCoinOwnerData)
  }

  // @@protoc_insertion_point(class_scope:api_pb.EditCoinOwnerData)
  private static final network.minter.grpc.EditCoinOwnerData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new network.minter.grpc.EditCoinOwnerData();
  }

  public static network.minter.grpc.EditCoinOwnerData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EditCoinOwnerData>
      PARSER = new com.google.protobuf.AbstractParser<EditCoinOwnerData>() {
    @java.lang.Override
    public EditCoinOwnerData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EditCoinOwnerData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EditCoinOwnerData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EditCoinOwnerData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public network.minter.grpc.EditCoinOwnerData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

