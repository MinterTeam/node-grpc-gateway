// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package network.minter.grpc;

public interface LimitOrdersOfPoolResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.LimitOrdersOfPoolResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string pool_price = 2 [json_name = "poolPrice"];</code>
   * @return The poolPrice.
   */
  java.lang.String getPoolPrice();
  /**
   * <code>string pool_price = 2 [json_name = "poolPrice"];</code>
   * @return The bytes for poolPrice.
   */
  com.google.protobuf.ByteString
      getPoolPriceBytes();

  /**
   * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
   */
  java.util.List<network.minter.grpc.LimitOrderResponse> 
      getOrdersList();
  /**
   * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
   */
  network.minter.grpc.LimitOrderResponse getOrders(int index);
  /**
   * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
   */
  int getOrdersCount();
  /**
   * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
   */
  java.util.List<? extends network.minter.grpc.LimitOrderResponseOrBuilder> 
      getOrdersOrBuilderList();
  /**
   * <code>repeated .api_pb.LimitOrderResponse orders = 1 [json_name = "orders"];</code>
   */
  network.minter.grpc.LimitOrderResponseOrBuilder getOrdersOrBuilder(
      int index);
}
