// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package network.minter.grpc;

/**
 * Protobuf type {@code api_pb.AddLiquidityData}
 */
public final class AddLiquidityData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.AddLiquidityData)
    AddLiquidityDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddLiquidityData.newBuilder() to construct.
  private AddLiquidityData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddLiquidityData() {
    volume0_ = "";
    maximumVolume1_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddLiquidityData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddLiquidityData(
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
            network.minter.grpc.Coin.Builder subBuilder = null;
            if (coin0_ != null) {
              subBuilder = coin0_.toBuilder();
            }
            coin0_ = input.readMessage(network.minter.grpc.Coin.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(coin0_);
              coin0_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            network.minter.grpc.Coin.Builder subBuilder = null;
            if (coin1_ != null) {
              subBuilder = coin1_.toBuilder();
            }
            coin1_ = input.readMessage(network.minter.grpc.Coin.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(coin1_);
              coin1_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            volume0_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            maximumVolume1_ = s;
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
    return network.minter.grpc.Data.internal_static_api_pb_AddLiquidityData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return network.minter.grpc.Data.internal_static_api_pb_AddLiquidityData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            network.minter.grpc.AddLiquidityData.class, network.minter.grpc.AddLiquidityData.Builder.class);
  }

  public static final int COIN0_FIELD_NUMBER = 1;
  private network.minter.grpc.Coin coin0_;
  /**
   * <code>.api_pb.Coin coin0 = 1 [json_name = "coin0"];</code>
   * @return Whether the coin0 field is set.
   */
  @java.lang.Override
  public boolean hasCoin0() {
    return coin0_ != null;
  }
  /**
   * <code>.api_pb.Coin coin0 = 1 [json_name = "coin0"];</code>
   * @return The coin0.
   */
  @java.lang.Override
  public network.minter.grpc.Coin getCoin0() {
    return coin0_ == null ? network.minter.grpc.Coin.getDefaultInstance() : coin0_;
  }
  /**
   * <code>.api_pb.Coin coin0 = 1 [json_name = "coin0"];</code>
   */
  @java.lang.Override
  public network.minter.grpc.CoinOrBuilder getCoin0OrBuilder() {
    return getCoin0();
  }

  public static final int COIN1_FIELD_NUMBER = 2;
  private network.minter.grpc.Coin coin1_;
  /**
   * <code>.api_pb.Coin coin1 = 2 [json_name = "coin1"];</code>
   * @return Whether the coin1 field is set.
   */
  @java.lang.Override
  public boolean hasCoin1() {
    return coin1_ != null;
  }
  /**
   * <code>.api_pb.Coin coin1 = 2 [json_name = "coin1"];</code>
   * @return The coin1.
   */
  @java.lang.Override
  public network.minter.grpc.Coin getCoin1() {
    return coin1_ == null ? network.minter.grpc.Coin.getDefaultInstance() : coin1_;
  }
  /**
   * <code>.api_pb.Coin coin1 = 2 [json_name = "coin1"];</code>
   */
  @java.lang.Override
  public network.minter.grpc.CoinOrBuilder getCoin1OrBuilder() {
    return getCoin1();
  }

  public static final int VOLUME0_FIELD_NUMBER = 3;
  private volatile java.lang.Object volume0_;
  /**
   * <code>string volume0 = 3 [json_name = "volume0"];</code>
   * @return The volume0.
   */
  @java.lang.Override
  public java.lang.String getVolume0() {
    java.lang.Object ref = volume0_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      volume0_ = s;
      return s;
    }
  }
  /**
   * <code>string volume0 = 3 [json_name = "volume0"];</code>
   * @return The bytes for volume0.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVolume0Bytes() {
    java.lang.Object ref = volume0_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      volume0_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAXIMUM_VOLUME1_FIELD_NUMBER = 4;
  private volatile java.lang.Object maximumVolume1_;
  /**
   * <code>string maximum_volume1 = 4 [json_name = "maximumVolume1"];</code>
   * @return The maximumVolume1.
   */
  @java.lang.Override
  public java.lang.String getMaximumVolume1() {
    java.lang.Object ref = maximumVolume1_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      maximumVolume1_ = s;
      return s;
    }
  }
  /**
   * <code>string maximum_volume1 = 4 [json_name = "maximumVolume1"];</code>
   * @return The bytes for maximumVolume1.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMaximumVolume1Bytes() {
    java.lang.Object ref = maximumVolume1_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      maximumVolume1_ = b;
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
    if (coin0_ != null) {
      output.writeMessage(1, getCoin0());
    }
    if (coin1_ != null) {
      output.writeMessage(2, getCoin1());
    }
    if (!getVolume0Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, volume0_);
    }
    if (!getMaximumVolume1Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, maximumVolume1_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (coin0_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCoin0());
    }
    if (coin1_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCoin1());
    }
    if (!getVolume0Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, volume0_);
    }
    if (!getMaximumVolume1Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, maximumVolume1_);
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
    if (!(obj instanceof network.minter.grpc.AddLiquidityData)) {
      return super.equals(obj);
    }
    network.minter.grpc.AddLiquidityData other = (network.minter.grpc.AddLiquidityData) obj;

    if (hasCoin0() != other.hasCoin0()) return false;
    if (hasCoin0()) {
      if (!getCoin0()
          .equals(other.getCoin0())) return false;
    }
    if (hasCoin1() != other.hasCoin1()) return false;
    if (hasCoin1()) {
      if (!getCoin1()
          .equals(other.getCoin1())) return false;
    }
    if (!getVolume0()
        .equals(other.getVolume0())) return false;
    if (!getMaximumVolume1()
        .equals(other.getMaximumVolume1())) return false;
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
    if (hasCoin0()) {
      hash = (37 * hash) + COIN0_FIELD_NUMBER;
      hash = (53 * hash) + getCoin0().hashCode();
    }
    if (hasCoin1()) {
      hash = (37 * hash) + COIN1_FIELD_NUMBER;
      hash = (53 * hash) + getCoin1().hashCode();
    }
    hash = (37 * hash) + VOLUME0_FIELD_NUMBER;
    hash = (53 * hash) + getVolume0().hashCode();
    hash = (37 * hash) + MAXIMUM_VOLUME1_FIELD_NUMBER;
    hash = (53 * hash) + getMaximumVolume1().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static network.minter.grpc.AddLiquidityData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.minter.grpc.AddLiquidityData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.minter.grpc.AddLiquidityData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.minter.grpc.AddLiquidityData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.minter.grpc.AddLiquidityData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.minter.grpc.AddLiquidityData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.minter.grpc.AddLiquidityData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.minter.grpc.AddLiquidityData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.minter.grpc.AddLiquidityData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static network.minter.grpc.AddLiquidityData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.minter.grpc.AddLiquidityData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.minter.grpc.AddLiquidityData parseFrom(
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
  public static Builder newBuilder(network.minter.grpc.AddLiquidityData prototype) {
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
   * Protobuf type {@code api_pb.AddLiquidityData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.AddLiquidityData)
      network.minter.grpc.AddLiquidityDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return network.minter.grpc.Data.internal_static_api_pb_AddLiquidityData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return network.minter.grpc.Data.internal_static_api_pb_AddLiquidityData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              network.minter.grpc.AddLiquidityData.class, network.minter.grpc.AddLiquidityData.Builder.class);
    }

    // Construct using network.minter.grpc.AddLiquidityData.newBuilder()
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
      if (coin0Builder_ == null) {
        coin0_ = null;
      } else {
        coin0_ = null;
        coin0Builder_ = null;
      }
      if (coin1Builder_ == null) {
        coin1_ = null;
      } else {
        coin1_ = null;
        coin1Builder_ = null;
      }
      volume0_ = "";

      maximumVolume1_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return network.minter.grpc.Data.internal_static_api_pb_AddLiquidityData_descriptor;
    }

    @java.lang.Override
    public network.minter.grpc.AddLiquidityData getDefaultInstanceForType() {
      return network.minter.grpc.AddLiquidityData.getDefaultInstance();
    }

    @java.lang.Override
    public network.minter.grpc.AddLiquidityData build() {
      network.minter.grpc.AddLiquidityData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public network.minter.grpc.AddLiquidityData buildPartial() {
      network.minter.grpc.AddLiquidityData result = new network.minter.grpc.AddLiquidityData(this);
      if (coin0Builder_ == null) {
        result.coin0_ = coin0_;
      } else {
        result.coin0_ = coin0Builder_.build();
      }
      if (coin1Builder_ == null) {
        result.coin1_ = coin1_;
      } else {
        result.coin1_ = coin1Builder_.build();
      }
      result.volume0_ = volume0_;
      result.maximumVolume1_ = maximumVolume1_;
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
      if (other instanceof network.minter.grpc.AddLiquidityData) {
        return mergeFrom((network.minter.grpc.AddLiquidityData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(network.minter.grpc.AddLiquidityData other) {
      if (other == network.minter.grpc.AddLiquidityData.getDefaultInstance()) return this;
      if (other.hasCoin0()) {
        mergeCoin0(other.getCoin0());
      }
      if (other.hasCoin1()) {
        mergeCoin1(other.getCoin1());
      }
      if (!other.getVolume0().isEmpty()) {
        volume0_ = other.volume0_;
        onChanged();
      }
      if (!other.getMaximumVolume1().isEmpty()) {
        maximumVolume1_ = other.maximumVolume1_;
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
      network.minter.grpc.AddLiquidityData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (network.minter.grpc.AddLiquidityData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private network.minter.grpc.Coin coin0_;
    private com.google.protobuf.SingleFieldBuilderV3<
        network.minter.grpc.Coin, network.minter.grpc.Coin.Builder, network.minter.grpc.CoinOrBuilder> coin0Builder_;
    /**
     * <code>.api_pb.Coin coin0 = 1 [json_name = "coin0"];</code>
     * @return Whether the coin0 field is set.
     */
    public boolean hasCoin0() {
      return coin0Builder_ != null || coin0_ != null;
    }
    /**
     * <code>.api_pb.Coin coin0 = 1 [json_name = "coin0"];</code>
     * @return The coin0.
     */
    public network.minter.grpc.Coin getCoin0() {
      if (coin0Builder_ == null) {
        return coin0_ == null ? network.minter.grpc.Coin.getDefaultInstance() : coin0_;
      } else {
        return coin0Builder_.getMessage();
      }
    }
    /**
     * <code>.api_pb.Coin coin0 = 1 [json_name = "coin0"];</code>
     */
    public Builder setCoin0(network.minter.grpc.Coin value) {
      if (coin0Builder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        coin0_ = value;
        onChanged();
      } else {
        coin0Builder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin0 = 1 [json_name = "coin0"];</code>
     */
    public Builder setCoin0(
        network.minter.grpc.Coin.Builder builderForValue) {
      if (coin0Builder_ == null) {
        coin0_ = builderForValue.build();
        onChanged();
      } else {
        coin0Builder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin0 = 1 [json_name = "coin0"];</code>
     */
    public Builder mergeCoin0(network.minter.grpc.Coin value) {
      if (coin0Builder_ == null) {
        if (coin0_ != null) {
          coin0_ =
            network.minter.grpc.Coin.newBuilder(coin0_).mergeFrom(value).buildPartial();
        } else {
          coin0_ = value;
        }
        onChanged();
      } else {
        coin0Builder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin0 = 1 [json_name = "coin0"];</code>
     */
    public Builder clearCoin0() {
      if (coin0Builder_ == null) {
        coin0_ = null;
        onChanged();
      } else {
        coin0_ = null;
        coin0Builder_ = null;
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin0 = 1 [json_name = "coin0"];</code>
     */
    public network.minter.grpc.Coin.Builder getCoin0Builder() {
      
      onChanged();
      return getCoin0FieldBuilder().getBuilder();
    }
    /**
     * <code>.api_pb.Coin coin0 = 1 [json_name = "coin0"];</code>
     */
    public network.minter.grpc.CoinOrBuilder getCoin0OrBuilder() {
      if (coin0Builder_ != null) {
        return coin0Builder_.getMessageOrBuilder();
      } else {
        return coin0_ == null ?
            network.minter.grpc.Coin.getDefaultInstance() : coin0_;
      }
    }
    /**
     * <code>.api_pb.Coin coin0 = 1 [json_name = "coin0"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        network.minter.grpc.Coin, network.minter.grpc.Coin.Builder, network.minter.grpc.CoinOrBuilder> 
        getCoin0FieldBuilder() {
      if (coin0Builder_ == null) {
        coin0Builder_ = new com.google.protobuf.SingleFieldBuilderV3<
            network.minter.grpc.Coin, network.minter.grpc.Coin.Builder, network.minter.grpc.CoinOrBuilder>(
                getCoin0(),
                getParentForChildren(),
                isClean());
        coin0_ = null;
      }
      return coin0Builder_;
    }

    private network.minter.grpc.Coin coin1_;
    private com.google.protobuf.SingleFieldBuilderV3<
        network.minter.grpc.Coin, network.minter.grpc.Coin.Builder, network.minter.grpc.CoinOrBuilder> coin1Builder_;
    /**
     * <code>.api_pb.Coin coin1 = 2 [json_name = "coin1"];</code>
     * @return Whether the coin1 field is set.
     */
    public boolean hasCoin1() {
      return coin1Builder_ != null || coin1_ != null;
    }
    /**
     * <code>.api_pb.Coin coin1 = 2 [json_name = "coin1"];</code>
     * @return The coin1.
     */
    public network.minter.grpc.Coin getCoin1() {
      if (coin1Builder_ == null) {
        return coin1_ == null ? network.minter.grpc.Coin.getDefaultInstance() : coin1_;
      } else {
        return coin1Builder_.getMessage();
      }
    }
    /**
     * <code>.api_pb.Coin coin1 = 2 [json_name = "coin1"];</code>
     */
    public Builder setCoin1(network.minter.grpc.Coin value) {
      if (coin1Builder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        coin1_ = value;
        onChanged();
      } else {
        coin1Builder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin1 = 2 [json_name = "coin1"];</code>
     */
    public Builder setCoin1(
        network.minter.grpc.Coin.Builder builderForValue) {
      if (coin1Builder_ == null) {
        coin1_ = builderForValue.build();
        onChanged();
      } else {
        coin1Builder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin1 = 2 [json_name = "coin1"];</code>
     */
    public Builder mergeCoin1(network.minter.grpc.Coin value) {
      if (coin1Builder_ == null) {
        if (coin1_ != null) {
          coin1_ =
            network.minter.grpc.Coin.newBuilder(coin1_).mergeFrom(value).buildPartial();
        } else {
          coin1_ = value;
        }
        onChanged();
      } else {
        coin1Builder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin1 = 2 [json_name = "coin1"];</code>
     */
    public Builder clearCoin1() {
      if (coin1Builder_ == null) {
        coin1_ = null;
        onChanged();
      } else {
        coin1_ = null;
        coin1Builder_ = null;
      }

      return this;
    }
    /**
     * <code>.api_pb.Coin coin1 = 2 [json_name = "coin1"];</code>
     */
    public network.minter.grpc.Coin.Builder getCoin1Builder() {
      
      onChanged();
      return getCoin1FieldBuilder().getBuilder();
    }
    /**
     * <code>.api_pb.Coin coin1 = 2 [json_name = "coin1"];</code>
     */
    public network.minter.grpc.CoinOrBuilder getCoin1OrBuilder() {
      if (coin1Builder_ != null) {
        return coin1Builder_.getMessageOrBuilder();
      } else {
        return coin1_ == null ?
            network.minter.grpc.Coin.getDefaultInstance() : coin1_;
      }
    }
    /**
     * <code>.api_pb.Coin coin1 = 2 [json_name = "coin1"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        network.minter.grpc.Coin, network.minter.grpc.Coin.Builder, network.minter.grpc.CoinOrBuilder> 
        getCoin1FieldBuilder() {
      if (coin1Builder_ == null) {
        coin1Builder_ = new com.google.protobuf.SingleFieldBuilderV3<
            network.minter.grpc.Coin, network.minter.grpc.Coin.Builder, network.minter.grpc.CoinOrBuilder>(
                getCoin1(),
                getParentForChildren(),
                isClean());
        coin1_ = null;
      }
      return coin1Builder_;
    }

    private java.lang.Object volume0_ = "";
    /**
     * <code>string volume0 = 3 [json_name = "volume0"];</code>
     * @return The volume0.
     */
    public java.lang.String getVolume0() {
      java.lang.Object ref = volume0_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        volume0_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string volume0 = 3 [json_name = "volume0"];</code>
     * @return The bytes for volume0.
     */
    public com.google.protobuf.ByteString
        getVolume0Bytes() {
      java.lang.Object ref = volume0_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        volume0_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string volume0 = 3 [json_name = "volume0"];</code>
     * @param value The volume0 to set.
     * @return This builder for chaining.
     */
    public Builder setVolume0(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      volume0_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string volume0 = 3 [json_name = "volume0"];</code>
     * @return This builder for chaining.
     */
    public Builder clearVolume0() {
      
      volume0_ = getDefaultInstance().getVolume0();
      onChanged();
      return this;
    }
    /**
     * <code>string volume0 = 3 [json_name = "volume0"];</code>
     * @param value The bytes for volume0 to set.
     * @return This builder for chaining.
     */
    public Builder setVolume0Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      volume0_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object maximumVolume1_ = "";
    /**
     * <code>string maximum_volume1 = 4 [json_name = "maximumVolume1"];</code>
     * @return The maximumVolume1.
     */
    public java.lang.String getMaximumVolume1() {
      java.lang.Object ref = maximumVolume1_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        maximumVolume1_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string maximum_volume1 = 4 [json_name = "maximumVolume1"];</code>
     * @return The bytes for maximumVolume1.
     */
    public com.google.protobuf.ByteString
        getMaximumVolume1Bytes() {
      java.lang.Object ref = maximumVolume1_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        maximumVolume1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string maximum_volume1 = 4 [json_name = "maximumVolume1"];</code>
     * @param value The maximumVolume1 to set.
     * @return This builder for chaining.
     */
    public Builder setMaximumVolume1(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      maximumVolume1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string maximum_volume1 = 4 [json_name = "maximumVolume1"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMaximumVolume1() {
      
      maximumVolume1_ = getDefaultInstance().getMaximumVolume1();
      onChanged();
      return this;
    }
    /**
     * <code>string maximum_volume1 = 4 [json_name = "maximumVolume1"];</code>
     * @param value The bytes for maximumVolume1 to set.
     * @return This builder for chaining.
     */
    public Builder setMaximumVolume1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      maximumVolume1_ = value;
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


    // @@protoc_insertion_point(builder_scope:api_pb.AddLiquidityData)
  }

  // @@protoc_insertion_point(class_scope:api_pb.AddLiquidityData)
  private static final network.minter.grpc.AddLiquidityData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new network.minter.grpc.AddLiquidityData();
  }

  public static network.minter.grpc.AddLiquidityData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddLiquidityData>
      PARSER = new com.google.protobuf.AbstractParser<AddLiquidityData>() {
    @java.lang.Override
    public AddLiquidityData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddLiquidityData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddLiquidityData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddLiquidityData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public network.minter.grpc.AddLiquidityData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

