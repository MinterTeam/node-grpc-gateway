//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package network.minter.grpc;

@kotlin.jvm.JvmSynthetic
inline fun coinInfoRequest(block: network.minter.grpc.CoinInfoRequestKt.Dsl.() -> Unit): network.minter.grpc.CoinInfoRequest =
  network.minter.grpc.CoinInfoRequestKt.Dsl._create(network.minter.grpc.CoinInfoRequest.newBuilder()).apply { block() }._build()
object CoinInfoRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: network.minter.grpc.CoinInfoRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: network.minter.grpc.CoinInfoRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): network.minter.grpc.CoinInfoRequest = _builder.build()

    /**
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
     * <code>uint64 height = 1 [json_name = "height", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    fun clearHeight() {
      _builder.clearHeight()
    }

    /**
     * <code>string symbol = 2 [json_name = "symbol"];</code>
     */
    var symbol: kotlin.String
      @JvmName("getSymbol")
      get() = _builder.getSymbol()
      @JvmName("setSymbol")
      set(value) {
        _builder.setSymbol(value)
      }
    /**
     * <code>string symbol = 2 [json_name = "symbol"];</code>
     */
    fun clearSymbol() {
      _builder.clearSymbol()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun network.minter.grpc.CoinInfoRequest.copy(block: network.minter.grpc.CoinInfoRequestKt.Dsl.() -> Unit): network.minter.grpc.CoinInfoRequest =
  network.minter.grpc.CoinInfoRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
