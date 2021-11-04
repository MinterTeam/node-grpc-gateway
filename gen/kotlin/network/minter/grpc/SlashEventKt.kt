//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: events.proto

package network.minter.grpc;

@kotlin.jvm.JvmSynthetic
inline fun slashEvent(block: network.minter.grpc.SlashEventKt.Dsl.() -> Unit): network.minter.grpc.SlashEvent =
  network.minter.grpc.SlashEventKt.Dsl._create(network.minter.grpc.SlashEvent.newBuilder()).apply { block() }._build()
object SlashEventKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: network.minter.grpc.SlashEvent.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: network.minter.grpc.SlashEvent.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): network.minter.grpc.SlashEvent = _builder.build()

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
     * <code>string amount = 2 [json_name = "amount"];</code>
     */
    var amount: kotlin.String
      @JvmName("getAmount")
      get() = _builder.getAmount()
      @JvmName("setAmount")
      set(value) {
        _builder.setAmount(value)
      }
    /**
     * <code>string amount = 2 [json_name = "amount"];</code>
     */
    fun clearAmount() {
      _builder.clearAmount()
    }

    /**
     * <code>uint64 coin = 3 [json_name = "coin"];</code>
     */
    var coin: kotlin.Long
      @JvmName("getCoin")
      get() = _builder.getCoin()
      @JvmName("setCoin")
      set(value) {
        _builder.setCoin(value)
      }
    /**
     * <code>uint64 coin = 3 [json_name = "coin"];</code>
     */
    fun clearCoin() {
      _builder.clearCoin()
    }

    /**
     * <code>string validator_pub_key = 4 [json_name = "validatorPubKey"];</code>
     */
    var validatorPubKey: kotlin.String
      @JvmName("getValidatorPubKey")
      get() = _builder.getValidatorPubKey()
      @JvmName("setValidatorPubKey")
      set(value) {
        _builder.setValidatorPubKey(value)
      }
    /**
     * <code>string validator_pub_key = 4 [json_name = "validatorPubKey"];</code>
     */
    fun clearValidatorPubKey() {
      _builder.clearValidatorPubKey()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun network.minter.grpc.SlashEvent.copy(block: network.minter.grpc.SlashEventKt.Dsl.() -> Unit): network.minter.grpc.SlashEvent =
  network.minter.grpc.SlashEventKt.Dsl._create(this.toBuilder()).apply { block() }._build()
