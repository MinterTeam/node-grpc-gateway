//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package network.minter.grpc;

@kotlin.jvm.JvmSynthetic
inline fun coinIdRequest(block: network.minter.grpc.CoinIdRequestKt.Dsl.() -> Unit): network.minter.grpc.CoinIdRequest =
  network.minter.grpc.CoinIdRequestKt.Dsl._create(network.minter.grpc.CoinIdRequest.newBuilder()).apply { block() }._build()
object CoinIdRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: network.minter.grpc.CoinIdRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: network.minter.grpc.CoinIdRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): network.minter.grpc.CoinIdRequest = _builder.build()

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
     * <code>uint64 id = 2 [json_name = "id"];</code>
     */
    var id: kotlin.Long
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <code>uint64 id = 2 [json_name = "id"];</code>
     */
    fun clearId() {
      _builder.clearId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun network.minter.grpc.CoinIdRequest.copy(block: network.minter.grpc.CoinIdRequestKt.Dsl.() -> Unit): network.minter.grpc.CoinIdRequest =
  network.minter.grpc.CoinIdRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
