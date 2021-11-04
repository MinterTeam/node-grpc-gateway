// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: events.proto

package network.minter.grpc;

/**
 * Protobuf type {@code api_pb.RewardEvent}
 */
public final class RewardEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.RewardEvent)
    RewardEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RewardEvent.newBuilder() to construct.
  private RewardEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RewardEvent() {
    role_ = 0;
    address_ = "";
    amount_ = "";
    validatorPubKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RewardEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RewardEvent(
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
          case 8: {
            int rawValue = input.readEnum();

            role_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            address_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            amount_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            validatorPubKey_ = s;
            break;
          }
          case 40: {

            coin_ = input.readUInt64();
            break;
          }
          case 48: {

            forCoin_ = input.readUInt64();
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
    return network.minter.grpc.Events.internal_static_api_pb_RewardEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return network.minter.grpc.Events.internal_static_api_pb_RewardEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            network.minter.grpc.RewardEvent.class, network.minter.grpc.RewardEvent.Builder.class);
  }

  /**
   * Protobuf enum {@code api_pb.RewardEvent.Role}
   */
  public enum Role
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Validator = 0;</code>
     */
    Validator(0),
    /**
     * <code>Delegator = 1;</code>
     */
    Delegator(1),
    /**
     * <code>DAO = 2;</code>
     */
    DAO(2),
    /**
     * <code>Developers = 3;</code>
     */
    Developers(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>Validator = 0;</code>
     */
    public static final int Validator_VALUE = 0;
    /**
     * <code>Delegator = 1;</code>
     */
    public static final int Delegator_VALUE = 1;
    /**
     * <code>DAO = 2;</code>
     */
    public static final int DAO_VALUE = 2;
    /**
     * <code>Developers = 3;</code>
     */
    public static final int Developers_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Role valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Role forNumber(int value) {
      switch (value) {
        case 0: return Validator;
        case 1: return Delegator;
        case 2: return DAO;
        case 3: return Developers;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Role>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Role> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Role>() {
            public Role findValueByNumber(int number) {
              return Role.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return network.minter.grpc.RewardEvent.getDescriptor().getEnumTypes().get(0);
    }

    private static final Role[] VALUES = values();

    public static Role valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Role(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:api_pb.RewardEvent.Role)
  }

  public static final int ROLE_FIELD_NUMBER = 1;
  private int role_;
  /**
   * <code>.api_pb.RewardEvent.Role role = 1 [json_name = "role"];</code>
   * @return The enum numeric value on the wire for role.
   */
  @java.lang.Override public int getRoleValue() {
    return role_;
  }
  /**
   * <code>.api_pb.RewardEvent.Role role = 1 [json_name = "role"];</code>
   * @return The role.
   */
  @java.lang.Override public network.minter.grpc.RewardEvent.Role getRole() {
    @SuppressWarnings("deprecation")
    network.minter.grpc.RewardEvent.Role result = network.minter.grpc.RewardEvent.Role.valueOf(role_);
    return result == null ? network.minter.grpc.RewardEvent.Role.UNRECOGNIZED : result;
  }

  public static final int ADDRESS_FIELD_NUMBER = 2;
  private volatile java.lang.Object address_;
  /**
   * <code>string address = 2 [json_name = "address"];</code>
   * @return The address.
   */
  @java.lang.Override
  public java.lang.String getAddress() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      address_ = s;
      return s;
    }
  }
  /**
   * <code>string address = 2 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAddressBytes() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      address_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMOUNT_FIELD_NUMBER = 3;
  private volatile java.lang.Object amount_;
  /**
   * <code>string amount = 3 [json_name = "amount"];</code>
   * @return The amount.
   */
  @java.lang.Override
  public java.lang.String getAmount() {
    java.lang.Object ref = amount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      amount_ = s;
      return s;
    }
  }
  /**
   * <code>string amount = 3 [json_name = "amount"];</code>
   * @return The bytes for amount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAmountBytes() {
    java.lang.Object ref = amount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      amount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COIN_FIELD_NUMBER = 5;
  private long coin_;
  /**
   * <code>uint64 coin = 5 [json_name = "coin"];</code>
   * @return The coin.
   */
  @java.lang.Override
  public long getCoin() {
    return coin_;
  }

  public static final int VALIDATOR_PUB_KEY_FIELD_NUMBER = 4;
  private volatile java.lang.Object validatorPubKey_;
  /**
   * <code>string validator_pub_key = 4 [json_name = "validatorPubKey"];</code>
   * @return The validatorPubKey.
   */
  @java.lang.Override
  public java.lang.String getValidatorPubKey() {
    java.lang.Object ref = validatorPubKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      validatorPubKey_ = s;
      return s;
    }
  }
  /**
   * <code>string validator_pub_key = 4 [json_name = "validatorPubKey"];</code>
   * @return The bytes for validatorPubKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValidatorPubKeyBytes() {
    java.lang.Object ref = validatorPubKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      validatorPubKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FOR_COIN_FIELD_NUMBER = 6;
  private long forCoin_;
  /**
   * <pre>
   * coin for which the delegator received the reward
   * </pre>
   *
   * <code>uint64 for_coin = 6 [json_name = "forCoin"];</code>
   * @return The forCoin.
   */
  @java.lang.Override
  public long getForCoin() {
    return forCoin_;
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
    if (role_ != network.minter.grpc.RewardEvent.Role.Validator.getNumber()) {
      output.writeEnum(1, role_);
    }
    if (!getAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, address_);
    }
    if (!getAmountBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, amount_);
    }
    if (!getValidatorPubKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, validatorPubKey_);
    }
    if (coin_ != 0L) {
      output.writeUInt64(5, coin_);
    }
    if (forCoin_ != 0L) {
      output.writeUInt64(6, forCoin_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (role_ != network.minter.grpc.RewardEvent.Role.Validator.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, role_);
    }
    if (!getAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, address_);
    }
    if (!getAmountBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, amount_);
    }
    if (!getValidatorPubKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, validatorPubKey_);
    }
    if (coin_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, coin_);
    }
    if (forCoin_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(6, forCoin_);
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
    if (!(obj instanceof network.minter.grpc.RewardEvent)) {
      return super.equals(obj);
    }
    network.minter.grpc.RewardEvent other = (network.minter.grpc.RewardEvent) obj;

    if (role_ != other.role_) return false;
    if (!getAddress()
        .equals(other.getAddress())) return false;
    if (!getAmount()
        .equals(other.getAmount())) return false;
    if (getCoin()
        != other.getCoin()) return false;
    if (!getValidatorPubKey()
        .equals(other.getValidatorPubKey())) return false;
    if (getForCoin()
        != other.getForCoin()) return false;
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
    hash = (37 * hash) + ROLE_FIELD_NUMBER;
    hash = (53 * hash) + role_;
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount().hashCode();
    hash = (37 * hash) + COIN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCoin());
    hash = (37 * hash) + VALIDATOR_PUB_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getValidatorPubKey().hashCode();
    hash = (37 * hash) + FOR_COIN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getForCoin());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static network.minter.grpc.RewardEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.minter.grpc.RewardEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.minter.grpc.RewardEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.minter.grpc.RewardEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.minter.grpc.RewardEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.minter.grpc.RewardEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.minter.grpc.RewardEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.minter.grpc.RewardEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.minter.grpc.RewardEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static network.minter.grpc.RewardEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.minter.grpc.RewardEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.minter.grpc.RewardEvent parseFrom(
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
  public static Builder newBuilder(network.minter.grpc.RewardEvent prototype) {
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
   * Protobuf type {@code api_pb.RewardEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.RewardEvent)
      network.minter.grpc.RewardEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return network.minter.grpc.Events.internal_static_api_pb_RewardEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return network.minter.grpc.Events.internal_static_api_pb_RewardEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              network.minter.grpc.RewardEvent.class, network.minter.grpc.RewardEvent.Builder.class);
    }

    // Construct using network.minter.grpc.RewardEvent.newBuilder()
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
      role_ = 0;

      address_ = "";

      amount_ = "";

      coin_ = 0L;

      validatorPubKey_ = "";

      forCoin_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return network.minter.grpc.Events.internal_static_api_pb_RewardEvent_descriptor;
    }

    @java.lang.Override
    public network.minter.grpc.RewardEvent getDefaultInstanceForType() {
      return network.minter.grpc.RewardEvent.getDefaultInstance();
    }

    @java.lang.Override
    public network.minter.grpc.RewardEvent build() {
      network.minter.grpc.RewardEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public network.minter.grpc.RewardEvent buildPartial() {
      network.minter.grpc.RewardEvent result = new network.minter.grpc.RewardEvent(this);
      result.role_ = role_;
      result.address_ = address_;
      result.amount_ = amount_;
      result.coin_ = coin_;
      result.validatorPubKey_ = validatorPubKey_;
      result.forCoin_ = forCoin_;
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
      if (other instanceof network.minter.grpc.RewardEvent) {
        return mergeFrom((network.minter.grpc.RewardEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(network.minter.grpc.RewardEvent other) {
      if (other == network.minter.grpc.RewardEvent.getDefaultInstance()) return this;
      if (other.role_ != 0) {
        setRoleValue(other.getRoleValue());
      }
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        onChanged();
      }
      if (!other.getAmount().isEmpty()) {
        amount_ = other.amount_;
        onChanged();
      }
      if (other.getCoin() != 0L) {
        setCoin(other.getCoin());
      }
      if (!other.getValidatorPubKey().isEmpty()) {
        validatorPubKey_ = other.validatorPubKey_;
        onChanged();
      }
      if (other.getForCoin() != 0L) {
        setForCoin(other.getForCoin());
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
      network.minter.grpc.RewardEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (network.minter.grpc.RewardEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int role_ = 0;
    /**
     * <code>.api_pb.RewardEvent.Role role = 1 [json_name = "role"];</code>
     * @return The enum numeric value on the wire for role.
     */
    @java.lang.Override public int getRoleValue() {
      return role_;
    }
    /**
     * <code>.api_pb.RewardEvent.Role role = 1 [json_name = "role"];</code>
     * @param value The enum numeric value on the wire for role to set.
     * @return This builder for chaining.
     */
    public Builder setRoleValue(int value) {
      
      role_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.api_pb.RewardEvent.Role role = 1 [json_name = "role"];</code>
     * @return The role.
     */
    @java.lang.Override
    public network.minter.grpc.RewardEvent.Role getRole() {
      @SuppressWarnings("deprecation")
      network.minter.grpc.RewardEvent.Role result = network.minter.grpc.RewardEvent.Role.valueOf(role_);
      return result == null ? network.minter.grpc.RewardEvent.Role.UNRECOGNIZED : result;
    }
    /**
     * <code>.api_pb.RewardEvent.Role role = 1 [json_name = "role"];</code>
     * @param value The role to set.
     * @return This builder for chaining.
     */
    public Builder setRole(network.minter.grpc.RewardEvent.Role value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      role_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api_pb.RewardEvent.Role role = 1 [json_name = "role"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRole() {
      
      role_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object address_ = "";
    /**
     * <code>string address = 2 [json_name = "address"];</code>
     * @return The address.
     */
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string address = 2 [json_name = "address"];</code>
     * @return The bytes for address.
     */
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string address = 2 [json_name = "address"];</code>
     * @param value The address to set.
     * @return This builder for chaining.
     */
    public Builder setAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      address_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string address = 2 [json_name = "address"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      
      address_ = getDefaultInstance().getAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string address = 2 [json_name = "address"];</code>
     * @param value The bytes for address to set.
     * @return This builder for chaining.
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      address_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object amount_ = "";
    /**
     * <code>string amount = 3 [json_name = "amount"];</code>
     * @return The amount.
     */
    public java.lang.String getAmount() {
      java.lang.Object ref = amount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        amount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string amount = 3 [json_name = "amount"];</code>
     * @return The bytes for amount.
     */
    public com.google.protobuf.ByteString
        getAmountBytes() {
      java.lang.Object ref = amount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        amount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string amount = 3 [json_name = "amount"];</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string amount = 3 [json_name = "amount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      
      amount_ = getDefaultInstance().getAmount();
      onChanged();
      return this;
    }
    /**
     * <code>string amount = 3 [json_name = "amount"];</code>
     * @param value The bytes for amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      amount_ = value;
      onChanged();
      return this;
    }

    private long coin_ ;
    /**
     * <code>uint64 coin = 5 [json_name = "coin"];</code>
     * @return The coin.
     */
    @java.lang.Override
    public long getCoin() {
      return coin_;
    }
    /**
     * <code>uint64 coin = 5 [json_name = "coin"];</code>
     * @param value The coin to set.
     * @return This builder for chaining.
     */
    public Builder setCoin(long value) {
      
      coin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 coin = 5 [json_name = "coin"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCoin() {
      
      coin_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object validatorPubKey_ = "";
    /**
     * <code>string validator_pub_key = 4 [json_name = "validatorPubKey"];</code>
     * @return The validatorPubKey.
     */
    public java.lang.String getValidatorPubKey() {
      java.lang.Object ref = validatorPubKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        validatorPubKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string validator_pub_key = 4 [json_name = "validatorPubKey"];</code>
     * @return The bytes for validatorPubKey.
     */
    public com.google.protobuf.ByteString
        getValidatorPubKeyBytes() {
      java.lang.Object ref = validatorPubKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        validatorPubKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string validator_pub_key = 4 [json_name = "validatorPubKey"];</code>
     * @param value The validatorPubKey to set.
     * @return This builder for chaining.
     */
    public Builder setValidatorPubKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      validatorPubKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string validator_pub_key = 4 [json_name = "validatorPubKey"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValidatorPubKey() {
      
      validatorPubKey_ = getDefaultInstance().getValidatorPubKey();
      onChanged();
      return this;
    }
    /**
     * <code>string validator_pub_key = 4 [json_name = "validatorPubKey"];</code>
     * @param value The bytes for validatorPubKey to set.
     * @return This builder for chaining.
     */
    public Builder setValidatorPubKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      validatorPubKey_ = value;
      onChanged();
      return this;
    }

    private long forCoin_ ;
    /**
     * <pre>
     * coin for which the delegator received the reward
     * </pre>
     *
     * <code>uint64 for_coin = 6 [json_name = "forCoin"];</code>
     * @return The forCoin.
     */
    @java.lang.Override
    public long getForCoin() {
      return forCoin_;
    }
    /**
     * <pre>
     * coin for which the delegator received the reward
     * </pre>
     *
     * <code>uint64 for_coin = 6 [json_name = "forCoin"];</code>
     * @param value The forCoin to set.
     * @return This builder for chaining.
     */
    public Builder setForCoin(long value) {
      
      forCoin_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * coin for which the delegator received the reward
     * </pre>
     *
     * <code>uint64 for_coin = 6 [json_name = "forCoin"];</code>
     * @return This builder for chaining.
     */
    public Builder clearForCoin() {
      
      forCoin_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api_pb.RewardEvent)
  }

  // @@protoc_insertion_point(class_scope:api_pb.RewardEvent)
  private static final network.minter.grpc.RewardEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new network.minter.grpc.RewardEvent();
  }

  public static network.minter.grpc.RewardEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RewardEvent>
      PARSER = new com.google.protobuf.AbstractParser<RewardEvent>() {
    @java.lang.Override
    public RewardEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RewardEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RewardEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RewardEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public network.minter.grpc.RewardEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

