// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package network.minter.grpc;

public interface EditCandidateDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.EditCandidateData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string pub_key = 1 [json_name = "pubKey"];</code>
   * @return The pubKey.
   */
  java.lang.String getPubKey();
  /**
   * <code>string pub_key = 1 [json_name = "pubKey"];</code>
   * @return The bytes for pubKey.
   */
  com.google.protobuf.ByteString
      getPubKeyBytes();

  /**
   * <code>string reward_address = 3 [json_name = "rewardAddress"];</code>
   * @return The rewardAddress.
   */
  java.lang.String getRewardAddress();
  /**
   * <code>string reward_address = 3 [json_name = "rewardAddress"];</code>
   * @return The bytes for rewardAddress.
   */
  com.google.protobuf.ByteString
      getRewardAddressBytes();

  /**
   * <code>string owner_address = 4 [json_name = "ownerAddress"];</code>
   * @return The ownerAddress.
   */
  java.lang.String getOwnerAddress();
  /**
   * <code>string owner_address = 4 [json_name = "ownerAddress"];</code>
   * @return The bytes for ownerAddress.
   */
  com.google.protobuf.ByteString
      getOwnerAddressBytes();

  /**
   * <code>string control_address = 5 [json_name = "controlAddress"];</code>
   * @return The controlAddress.
   */
  java.lang.String getControlAddress();
  /**
   * <code>string control_address = 5 [json_name = "controlAddress"];</code>
   * @return The bytes for controlAddress.
   */
  com.google.protobuf.ByteString
      getControlAddressBytes();
}
