// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package network.minter.grpc;

public interface GenesisResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.GenesisResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string genesis_time = 1 [json_name = "genesisTime"];</code>
   * @return The genesisTime.
   */
  java.lang.String getGenesisTime();
  /**
   * <code>string genesis_time = 1 [json_name = "genesisTime"];</code>
   * @return The bytes for genesisTime.
   */
  com.google.protobuf.ByteString
      getGenesisTimeBytes();

  /**
   * <code>string chain_id = 2 [json_name = "chainId"];</code>
   * @return The chainId.
   */
  java.lang.String getChainId();
  /**
   * <code>string chain_id = 2 [json_name = "chainId"];</code>
   * @return The bytes for chainId.
   */
  com.google.protobuf.ByteString
      getChainIdBytes();

  /**
   * <code>uint64 initial_height = 6 [json_name = "initialHeight"];</code>
   * @return The initialHeight.
   */
  long getInitialHeight();

  /**
   * <code>.api_pb.GenesisResponse.ConsensusParams consensus_params = 3 [json_name = "consensusParams"];</code>
   * @return Whether the consensusParams field is set.
   */
  boolean hasConsensusParams();
  /**
   * <code>.api_pb.GenesisResponse.ConsensusParams consensus_params = 3 [json_name = "consensusParams"];</code>
   * @return The consensusParams.
   */
  network.minter.grpc.GenesisResponse.ConsensusParams getConsensusParams();
  /**
   * <code>.api_pb.GenesisResponse.ConsensusParams consensus_params = 3 [json_name = "consensusParams"];</code>
   */
  network.minter.grpc.GenesisResponse.ConsensusParamsOrBuilder getConsensusParamsOrBuilder();

  /**
   * <code>string app_hash = 4 [json_name = "appHash"];</code>
   * @return The appHash.
   */
  java.lang.String getAppHash();
  /**
   * <code>string app_hash = 4 [json_name = "appHash"];</code>
   * @return The bytes for appHash.
   */
  com.google.protobuf.ByteString
      getAppHashBytes();

  /**
   * <code>.api_pb.GenesisResponse.AppState app_state = 5 [json_name = "appState"];</code>
   * @return Whether the appState field is set.
   */
  boolean hasAppState();
  /**
   * <code>.api_pb.GenesisResponse.AppState app_state = 5 [json_name = "appState"];</code>
   * @return The appState.
   */
  network.minter.grpc.GenesisResponse.AppState getAppState();
  /**
   * <code>.api_pb.GenesisResponse.AppState app_state = 5 [json_name = "appState"];</code>
   */
  network.minter.grpc.GenesisResponse.AppStateOrBuilder getAppStateOrBuilder();
}
