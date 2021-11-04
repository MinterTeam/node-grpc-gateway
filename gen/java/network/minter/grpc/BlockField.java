// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package network.minter.grpc;

/**
 * Protobuf enum {@code api_pb.BlockField}
 */
public enum BlockField
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>transactions = 0;</code>
   */
  transactions(0),
  /**
   * <code>missed = 1;</code>
   */
  missed(1),
  /**
   * <code>block_reward = 2;</code>
   */
  block_reward(2),
  /**
   * <code>size = 3;</code>
   */
  size(3),
  /**
   * <code>proposer = 4;</code>
   */
  proposer(4),
  /**
   * <code>validators = 5;</code>
   */
  validators(5),
  /**
   * <code>evidence = 6;</code>
   */
  evidence(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>transactions = 0;</code>
   */
  public static final int transactions_VALUE = 0;
  /**
   * <code>missed = 1;</code>
   */
  public static final int missed_VALUE = 1;
  /**
   * <code>block_reward = 2;</code>
   */
  public static final int block_reward_VALUE = 2;
  /**
   * <code>size = 3;</code>
   */
  public static final int size_VALUE = 3;
  /**
   * <code>proposer = 4;</code>
   */
  public static final int proposer_VALUE = 4;
  /**
   * <code>validators = 5;</code>
   */
  public static final int validators_VALUE = 5;
  /**
   * <code>evidence = 6;</code>
   */
  public static final int evidence_VALUE = 6;


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
  public static BlockField valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BlockField forNumber(int value) {
    switch (value) {
      case 0: return transactions;
      case 1: return missed;
      case 2: return block_reward;
      case 3: return size;
      case 4: return proposer;
      case 5: return validators;
      case 6: return evidence;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BlockField>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BlockField> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BlockField>() {
          public BlockField findValueByNumber(int number) {
            return BlockField.forNumber(number);
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
    return network.minter.grpc.Resources.getDescriptor().getEnumTypes().get(0);
  }

  private static final BlockField[] VALUES = values();

  public static BlockField valueOf(
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

  private BlockField(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api_pb.BlockField)
}

