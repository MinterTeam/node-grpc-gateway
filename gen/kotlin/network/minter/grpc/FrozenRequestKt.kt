//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package network.minter.grpc;

@kotlin.jvm.JvmSynthetic
inline fun frozenRequest(block: network.minter.grpc.FrozenRequestKt.Dsl.() -> Unit): network.minter.grpc.FrozenRequest =
  network.minter.grpc.FrozenRequestKt.Dsl._create(network.minter.grpc.FrozenRequest.newBuilder()).apply { block() }._build()
object FrozenRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: network.minter.grpc.FrozenRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: network.minter.grpc.FrozenRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): network.minter.grpc.FrozenRequest = _builder.build()

    /**
     * <code>string address = 1 [json_name = "address"];</code>
     */
    var address: kotlin.String
      @JvmName("getAddress")
      get() = _builder.getAddress()
      @JvmName("setAddress")
      set(value) {
        _builder.setAddress(value)
      }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     */
    fun clearAddress() {
      _builder.clearAddress()
    }

    /**
     * <code>.google.protobuf.UInt64Value coin_id = 2 [json_name = "coinId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    var coinId: com.google.protobuf.UInt64Value
      @JvmName("getCoinId")
      get() = _builder.getCoinId()
      @JvmName("setCoinId")
      set(value) {
        _builder.setCoinId(value)
      }
    /**
     * <code>.google.protobuf.UInt64Value coin_id = 2 [json_name = "coinId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    fun clearCoinId() {
      _builder.clearCoinId()
    }
    /**
     * <code>.google.protobuf.UInt64Value coin_id = 2 [json_name = "coinId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the coinId field is set.
     */
    fun hasCoinId(): kotlin.Boolean {
      return _builder.hasCoinId()
    }

    /**
     * <code>uint64 height = 3 [json_name = "height", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    var height: kotlin.Long
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <code>uint64 height = 3 [json_name = "height", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    fun clearHeight() {
      _builder.clearHeight()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun network.minter.grpc.FrozenRequest.copy(block: network.minter.grpc.FrozenRequestKt.Dsl.() -> Unit): network.minter.grpc.FrozenRequest =
  network.minter.grpc.FrozenRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
