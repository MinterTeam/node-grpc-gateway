// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package network.minter.grpc;

public interface TransactionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.TransactionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string hash = 1 [json_name = "hash"];</code>
   * @return The hash.
   */
  java.lang.String getHash();
  /**
   * <code>string hash = 1 [json_name = "hash"];</code>
   * @return The bytes for hash.
   */
  com.google.protobuf.ByteString
      getHashBytes();

  /**
   * <code>string raw_tx = 2 [json_name = "rawTx"];</code>
   * @return The rawTx.
   */
  java.lang.String getRawTx();
  /**
   * <code>string raw_tx = 2 [json_name = "rawTx"];</code>
   * @return The bytes for rawTx.
   */
  com.google.protobuf.ByteString
      getRawTxBytes();

  /**
   * <code>uint64 height = 3 [json_name = "height"];</code>
   * @return The height.
   */
  long getHeight();

  /**
   * <code>uint64 index = 4 [json_name = "index"];</code>
   * @return The index.
   */
  long getIndex();

  /**
   * <code>string from = 5 [json_name = "from"];</code>
   * @return The from.
   */
  java.lang.String getFrom();
  /**
   * <code>string from = 5 [json_name = "from"];</code>
   * @return The bytes for from.
   */
  com.google.protobuf.ByteString
      getFromBytes();

  /**
   * <code>uint64 nonce = 6 [json_name = "nonce"];</code>
   * @return The nonce.
   */
  long getNonce();

  /**
   * <code>uint64 gas = 7 [json_name = "gas"];</code>
   * @return The gas.
   */
  long getGas();

  /**
   * <code>uint64 gas_price = 8 [json_name = "gasPrice"];</code>
   * @return The gasPrice.
   */
  long getGasPrice();

  /**
   * <code>.api_pb.Coin gas_coin = 9 [json_name = "gasCoin"];</code>
   * @return Whether the gasCoin field is set.
   */
  boolean hasGasCoin();
  /**
   * <code>.api_pb.Coin gas_coin = 9 [json_name = "gasCoin"];</code>
   * @return The gasCoin.
   */
  network.minter.grpc.Coin getGasCoin();
  /**
   * <code>.api_pb.Coin gas_coin = 9 [json_name = "gasCoin"];</code>
   */
  network.minter.grpc.CoinOrBuilder getGasCoinOrBuilder();

  /**
   * <code>string type_hex = 17 [json_name = "typeHex"];</code>
   * @return The typeHex.
   */
  java.lang.String getTypeHex();
  /**
   * <code>string type_hex = 17 [json_name = "typeHex"];</code>
   * @return The bytes for typeHex.
   */
  com.google.protobuf.ByteString
      getTypeHexBytes();

  /**
   * <pre>
   *    string type_name = 18;
   * </pre>
   *
   * <code>uint64 type = 10 [json_name = "type"];</code>
   * @return The type.
   */
  long getType();

  /**
   * <code>.google.protobuf.Any data = 11 [json_name = "data"];</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <code>.google.protobuf.Any data = 11 [json_name = "data"];</code>
   * @return The data.
   */
  com.google.protobuf.Any getData();
  /**
   * <code>.google.protobuf.Any data = 11 [json_name = "data"];</code>
   */
  com.google.protobuf.AnyOrBuilder getDataOrBuilder();

  /**
   * <code>bytes payload = 12 [json_name = "payload"];</code>
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();

  /**
   * <code>bytes service_data = 16 [json_name = "serviceData"];</code>
   * @return The serviceData.
   */
  com.google.protobuf.ByteString getServiceData();

  /**
   * <code>map&lt;string, string&gt; tags = 13 [json_name = "tags"];</code>
   */
  int getTagsCount();
  /**
   * <code>map&lt;string, string&gt; tags = 13 [json_name = "tags"];</code>
   */
  boolean containsTags(
      java.lang.String key);
  /**
   * Use {@link #getTagsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getTags();
  /**
   * <code>map&lt;string, string&gt; tags = 13 [json_name = "tags"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getTagsMap();
  /**
   * <code>map&lt;string, string&gt; tags = 13 [json_name = "tags"];</code>
   */

  java.lang.String getTagsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; tags = 13 [json_name = "tags"];</code>
   */

  java.lang.String getTagsOrThrow(
      java.lang.String key);

  /**
   * <code>uint64 code = 14 [json_name = "code"];</code>
   * @return The code.
   */
  long getCode();

  /**
   * <code>string log = 15 [json_name = "log"];</code>
   * @return The log.
   */
  java.lang.String getLog();
  /**
   * <code>string log = 15 [json_name = "log"];</code>
   * @return The bytes for log.
   */
  com.google.protobuf.ByteString
      getLogBytes();
}
