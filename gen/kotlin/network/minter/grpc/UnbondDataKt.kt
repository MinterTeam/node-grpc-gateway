//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: data.proto

package network.minter.grpc;

@kotlin.jvm.JvmSynthetic
inline fun unbondData(block: network.minter.grpc.UnbondDataKt.Dsl.() -> Unit): network.minter.grpc.UnbondData =
  network.minter.grpc.UnbondDataKt.Dsl._create(network.minter.grpc.UnbondData.newBuilder()).apply { block() }._build()
object UnbondDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: network.minter.grpc.UnbondData.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: network.minter.grpc.UnbondData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): network.minter.grpc.UnbondData = _builder.build()

    /**
     * <code>string pub_key = 1 [json_name = "pubKey"];</code>
     */
    var pubKey: kotlin.String
      @JvmName("getPubKey")
      get() = _builder.getPubKey()
      @JvmName("setPubKey")
      set(value) {
        _builder.setPubKey(value)
      }
    /**
     * <code>string pub_key = 1 [json_name = "pubKey"];</code>
     */
    fun clearPubKey() {
      _builder.clearPubKey()
    }

    /**
     * <code>.api_pb.Coin coin = 2 [json_name = "coin"];</code>
     */
    var coin: network.minter.grpc.Coin
      @JvmName("getCoin")
      get() = _builder.getCoin()
      @JvmName("setCoin")
      set(value) {
        _builder.setCoin(value)
      }
    /**
     * <code>.api_pb.Coin coin = 2 [json_name = "coin"];</code>
     */
    fun clearCoin() {
      _builder.clearCoin()
    }
    /**
     * <code>.api_pb.Coin coin = 2 [json_name = "coin"];</code>
     * @return Whether the coin field is set.
     */
    fun hasCoin(): kotlin.Boolean {
      return _builder.hasCoin()
    }

    /**
     * <code>string value = 3 [json_name = "value"];</code>
     */
    var value: kotlin.String
      @JvmName("getValue")
      get() = _builder.getValue()
      @JvmName("setValue")
      set(value) {
        _builder.setValue(value)
      }
    /**
     * <code>string value = 3 [json_name = "value"];</code>
     */
    fun clearValue() {
      _builder.clearValue()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun network.minter.grpc.UnbondData.copy(block: network.minter.grpc.UnbondDataKt.Dsl.() -> Unit): network.minter.grpc.UnbondData =
  network.minter.grpc.UnbondDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()
