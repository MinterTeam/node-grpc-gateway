// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package network.minter.grpc;

public interface EditCoinOwnerDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.EditCoinOwnerData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string symbol = 1 [json_name = "symbol"];</code>
   * @return The symbol.
   */
  java.lang.String getSymbol();
  /**
   * <code>string symbol = 1 [json_name = "symbol"];</code>
   * @return The bytes for symbol.
   */
  com.google.protobuf.ByteString
      getSymbolBytes();

  /**
   * <code>string new_owner = 2 [json_name = "newOwner"];</code>
   * @return The newOwner.
   */
  java.lang.String getNewOwner();
  /**
   * <code>string new_owner = 2 [json_name = "newOwner"];</code>
   * @return The bytes for newOwner.
   */
  com.google.protobuf.ByteString
      getNewOwnerBytes();
}
