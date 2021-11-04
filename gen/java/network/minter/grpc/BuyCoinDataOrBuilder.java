// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package network.minter.grpc;

public interface BuyCoinDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.BuyCoinData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api_pb.Coin coin_to_buy = 1 [json_name = "coinToBuy"];</code>
   * @return Whether the coinToBuy field is set.
   */
  boolean hasCoinToBuy();
  /**
   * <code>.api_pb.Coin coin_to_buy = 1 [json_name = "coinToBuy"];</code>
   * @return The coinToBuy.
   */
  network.minter.grpc.Coin getCoinToBuy();
  /**
   * <code>.api_pb.Coin coin_to_buy = 1 [json_name = "coinToBuy"];</code>
   */
  network.minter.grpc.CoinOrBuilder getCoinToBuyOrBuilder();

  /**
   * <code>string value_to_buy = 2 [json_name = "valueToBuy"];</code>
   * @return The valueToBuy.
   */
  java.lang.String getValueToBuy();
  /**
   * <code>string value_to_buy = 2 [json_name = "valueToBuy"];</code>
   * @return The bytes for valueToBuy.
   */
  com.google.protobuf.ByteString
      getValueToBuyBytes();

  /**
   * <code>.api_pb.Coin coin_to_sell = 3 [json_name = "coinToSell"];</code>
   * @return Whether the coinToSell field is set.
   */
  boolean hasCoinToSell();
  /**
   * <code>.api_pb.Coin coin_to_sell = 3 [json_name = "coinToSell"];</code>
   * @return The coinToSell.
   */
  network.minter.grpc.Coin getCoinToSell();
  /**
   * <code>.api_pb.Coin coin_to_sell = 3 [json_name = "coinToSell"];</code>
   */
  network.minter.grpc.CoinOrBuilder getCoinToSellOrBuilder();

  /**
   * <code>string maximum_value_to_sell = 4 [json_name = "maximumValueToSell"];</code>
   * @return The maximumValueToSell.
   */
  java.lang.String getMaximumValueToSell();
  /**
   * <code>string maximum_value_to_sell = 4 [json_name = "maximumValueToSell"];</code>
   * @return The bytes for maximumValueToSell.
   */
  com.google.protobuf.ByteString
      getMaximumValueToSellBytes();
}
