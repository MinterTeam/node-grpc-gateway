// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package network.minter.grpc;

/**
 * Protobuf type {@code api_pb.EditCandidateCommission}
 */
public final class EditCandidateCommission extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.EditCandidateCommission)
    EditCandidateCommissionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EditCandidateCommission.newBuilder() to construct.
  private EditCandidateCommission(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EditCandidateCommission() {
    pubKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EditCandidateCommission();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EditCandidateCommission(
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

            pubKey_ = s;
            break;
          }
          case 16: {

            commission_ = input.readUInt64();
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
    return network.minter.grpc.Data.internal_static_api_pb_EditCandidateCommission_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return network.minter.grpc.Data.internal_static_api_pb_EditCandidateCommission_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            network.minter.grpc.EditCandidateCommission.class, network.minter.grpc.EditCandidateCommission.Builder.class);
  }

  public static final int PUB_KEY_FIELD_NUMBER = 1;
  private volatile java.lang.Object pubKey_;
  /**
   * <code>string pub_key = 1 [json_name = "pubKey"];</code>
   * @return The pubKey.
   */
  @java.lang.Override
  public java.lang.String getPubKey() {
    java.lang.Object ref = pubKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pubKey_ = s;
      return s;
    }
  }
  /**
   * <code>string pub_key = 1 [json_name = "pubKey"];</code>
   * @return The bytes for pubKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPubKeyBytes() {
    java.lang.Object ref = pubKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pubKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMMISSION_FIELD_NUMBER = 2;
  private long commission_;
  /**
   * <code>uint64 commission = 2 [json_name = "commission"];</code>
   * @return The commission.
   */
  @java.lang.Override
  public long getCommission() {
    return commission_;
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
    if (!getPubKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pubKey_);
    }
    if (commission_ != 0L) {
      output.writeUInt64(2, commission_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPubKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pubKey_);
    }
    if (commission_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, commission_);
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
    if (!(obj instanceof network.minter.grpc.EditCandidateCommission)) {
      return super.equals(obj);
    }
    network.minter.grpc.EditCandidateCommission other = (network.minter.grpc.EditCandidateCommission) obj;

    if (!getPubKey()
        .equals(other.getPubKey())) return false;
    if (getCommission()
        != other.getCommission()) return false;
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
    hash = (37 * hash) + PUB_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getPubKey().hashCode();
    hash = (37 * hash) + COMMISSION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCommission());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static network.minter.grpc.EditCandidateCommission parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.minter.grpc.EditCandidateCommission parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.minter.grpc.EditCandidateCommission parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.minter.grpc.EditCandidateCommission parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.minter.grpc.EditCandidateCommission parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.minter.grpc.EditCandidateCommission parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.minter.grpc.EditCandidateCommission parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.minter.grpc.EditCandidateCommission parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.minter.grpc.EditCandidateCommission parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static network.minter.grpc.EditCandidateCommission parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.minter.grpc.EditCandidateCommission parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.minter.grpc.EditCandidateCommission parseFrom(
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
  public static Builder newBuilder(network.minter.grpc.EditCandidateCommission prototype) {
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
   * Protobuf type {@code api_pb.EditCandidateCommission}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.EditCandidateCommission)
      network.minter.grpc.EditCandidateCommissionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return network.minter.grpc.Data.internal_static_api_pb_EditCandidateCommission_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return network.minter.grpc.Data.internal_static_api_pb_EditCandidateCommission_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              network.minter.grpc.EditCandidateCommission.class, network.minter.grpc.EditCandidateCommission.Builder.class);
    }

    // Construct using network.minter.grpc.EditCandidateCommission.newBuilder()
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
      pubKey_ = "";

      commission_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return network.minter.grpc.Data.internal_static_api_pb_EditCandidateCommission_descriptor;
    }

    @java.lang.Override
    public network.minter.grpc.EditCandidateCommission getDefaultInstanceForType() {
      return network.minter.grpc.EditCandidateCommission.getDefaultInstance();
    }

    @java.lang.Override
    public network.minter.grpc.EditCandidateCommission build() {
      network.minter.grpc.EditCandidateCommission result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public network.minter.grpc.EditCandidateCommission buildPartial() {
      network.minter.grpc.EditCandidateCommission result = new network.minter.grpc.EditCandidateCommission(this);
      result.pubKey_ = pubKey_;
      result.commission_ = commission_;
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
      if (other instanceof network.minter.grpc.EditCandidateCommission) {
        return mergeFrom((network.minter.grpc.EditCandidateCommission)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(network.minter.grpc.EditCandidateCommission other) {
      if (other == network.minter.grpc.EditCandidateCommission.getDefaultInstance()) return this;
      if (!other.getPubKey().isEmpty()) {
        pubKey_ = other.pubKey_;
        onChanged();
      }
      if (other.getCommission() != 0L) {
        setCommission(other.getCommission());
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
      network.minter.grpc.EditCandidateCommission parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (network.minter.grpc.EditCandidateCommission) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object pubKey_ = "";
    /**
     * <code>string pub_key = 1 [json_name = "pubKey"];</code>
     * @return The pubKey.
     */
    public java.lang.String getPubKey() {
      java.lang.Object ref = pubKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pubKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pub_key = 1 [json_name = "pubKey"];</code>
     * @return The bytes for pubKey.
     */
    public com.google.protobuf.ByteString
        getPubKeyBytes() {
      java.lang.Object ref = pubKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pubKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pub_key = 1 [json_name = "pubKey"];</code>
     * @param value The pubKey to set.
     * @return This builder for chaining.
     */
    public Builder setPubKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pubKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string pub_key = 1 [json_name = "pubKey"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPubKey() {
      
      pubKey_ = getDefaultInstance().getPubKey();
      onChanged();
      return this;
    }
    /**
     * <code>string pub_key = 1 [json_name = "pubKey"];</code>
     * @param value The bytes for pubKey to set.
     * @return This builder for chaining.
     */
    public Builder setPubKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pubKey_ = value;
      onChanged();
      return this;
    }

    private long commission_ ;
    /**
     * <code>uint64 commission = 2 [json_name = "commission"];</code>
     * @return The commission.
     */
    @java.lang.Override
    public long getCommission() {
      return commission_;
    }
    /**
     * <code>uint64 commission = 2 [json_name = "commission"];</code>
     * @param value The commission to set.
     * @return This builder for chaining.
     */
    public Builder setCommission(long value) {
      
      commission_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 commission = 2 [json_name = "commission"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCommission() {
      
      commission_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api_pb.EditCandidateCommission)
  }

  // @@protoc_insertion_point(class_scope:api_pb.EditCandidateCommission)
  private static final network.minter.grpc.EditCandidateCommission DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new network.minter.grpc.EditCandidateCommission();
  }

  public static network.minter.grpc.EditCandidateCommission getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EditCandidateCommission>
      PARSER = new com.google.protobuf.AbstractParser<EditCandidateCommission>() {
    @java.lang.Override
    public EditCandidateCommission parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EditCandidateCommission(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EditCandidateCommission> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EditCandidateCommission> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public network.minter.grpc.EditCandidateCommission getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

