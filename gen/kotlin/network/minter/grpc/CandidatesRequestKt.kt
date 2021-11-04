//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package network.minter.grpc;

@kotlin.jvm.JvmSynthetic
inline fun candidatesRequest(block: network.minter.grpc.CandidatesRequestKt.Dsl.() -> Unit): network.minter.grpc.CandidatesRequest =
  network.minter.grpc.CandidatesRequestKt.Dsl._create(network.minter.grpc.CandidatesRequest.newBuilder()).apply { block() }._build()
object CandidatesRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: network.minter.grpc.CandidatesRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: network.minter.grpc.CandidatesRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): network.minter.grpc.CandidatesRequest = _builder.build()

    /**
     * <pre>
     * Blockchain state height for the current request. Optional, the last default state of the node is used
     * </pre>
     *
     * <code>uint64 height = 1 [json_name = "height", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    var height: kotlin.Long
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <pre>
     * Blockchain state height for the current request. Optional, the last default state of the node is used
     * </pre>
     *
     * <code>uint64 height = 1 [json_name = "height", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    fun clearHeight() {
      _builder.clearHeight()
    }

    /**
     * <pre>
     * Calculate field values used_slots, uniq_users, min_stake
     * </pre>
     *
     * <code>bool include_stakes = 2 [json_name = "includeStakes", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    var includeStakes: kotlin.Boolean
      @JvmName("getIncludeStakes")
      get() = _builder.getIncludeStakes()
      @JvmName("setIncludeStakes")
      set(value) {
        _builder.setIncludeStakes(value)
      }
    /**
     * <pre>
     * Calculate field values used_slots, uniq_users, min_stake
     * </pre>
     *
     * <code>bool include_stakes = 2 [json_name = "includeStakes", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    fun clearIncludeStakes() {
      _builder.clearIncludeStakes()
    }

    /**
     * <pre>
     * Do not display the list of stakes, the include_stakes flag is also required to display. Note: used_slots, uniq_users, min_stake will still be filled if include_stakes flag is used
     * </pre>
     *
     * <code>bool not_show_stakes = 4 [json_name = "notShowStakes", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    var notShowStakes: kotlin.Boolean
      @JvmName("getNotShowStakes")
      get() = _builder.getNotShowStakes()
      @JvmName("setNotShowStakes")
      set(value) {
        _builder.setNotShowStakes(value)
      }
    /**
     * <pre>
     * Do not display the list of stakes, the include_stakes flag is also required to display. Note: used_slots, uniq_users, min_stake will still be filled if include_stakes flag is used
     * </pre>
     *
     * <code>bool not_show_stakes = 4 [json_name = "notShowStakes", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    fun clearNotShowStakes() {
      _builder.clearNotShowStakes()
    }

    /**
     * <code>.api_pb.CandidatesRequest.CandidateStatus status = 3 [json_name = "status"];</code>
     */
    var status: network.minter.grpc.CandidatesRequest.CandidateStatus
      @JvmName("getStatus")
      get() = _builder.getStatus()
      @JvmName("setStatus")
      set(value) {
        _builder.setStatus(value)
      }
    /**
     * <code>.api_pb.CandidatesRequest.CandidateStatus status = 3 [json_name = "status"];</code>
     */
    fun clearStatus() {
      _builder.clearStatus()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun network.minter.grpc.CandidatesRequest.copy(block: network.minter.grpc.CandidatesRequestKt.Dsl.() -> Unit): network.minter.grpc.CandidatesRequest =
  network.minter.grpc.CandidatesRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
