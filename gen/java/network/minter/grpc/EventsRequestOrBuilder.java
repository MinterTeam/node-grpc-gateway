// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package network.minter.grpc;

public interface EventsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.EventsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 height = 1 [json_name = "height", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The height.
   */
  long getHeight();

  /**
   * <pre>
   * Array of public keys of validators and wallet addresses of delegators for filtering
   * </pre>
   *
   * <code>repeated string search = 2 [json_name = "search"];</code>
   * @return A list containing the search.
   */
  java.util.List<java.lang.String>
      getSearchList();
  /**
   * <pre>
   * Array of public keys of validators and wallet addresses of delegators for filtering
   * </pre>
   *
   * <code>repeated string search = 2 [json_name = "search"];</code>
   * @return The count of search.
   */
  int getSearchCount();
  /**
   * <pre>
   * Array of public keys of validators and wallet addresses of delegators for filtering
   * </pre>
   *
   * <code>repeated string search = 2 [json_name = "search"];</code>
   * @param index The index of the element to return.
   * @return The search at the given index.
   */
  java.lang.String getSearch(int index);
  /**
   * <pre>
   * Array of public keys of validators and wallet addresses of delegators for filtering
   * </pre>
   *
   * <code>repeated string search = 2 [json_name = "search"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the search at the given index.
   */
  com.google.protobuf.ByteString
      getSearchBytes(int index);
}
