//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: data.proto

package network.minter.grpc;

@kotlin.jvm.JvmSynthetic
inline fun sellCoinData(block: network.minter.grpc.SellCoinDataKt.Dsl.() -> Unit): network.minter.grpc.SellCoinData =
  network.minter.grpc.SellCoinDataKt.Dsl._create(network.minter.grpc.SellCoinData.newBuilder()).apply { block() }._build()
object SellCoinDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: network.minter.grpc.SellCoinData.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: network.minter.grpc.SellCoinData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): network.minter.grpc.SellCoinData = _builder.build()

    /**
     * <code>.api_pb.Coin coin_to_sell = 1 [json_name = "coinToSell"];</code>
     */
    var coinToSell: network.minter.grpc.Coin
      @JvmName("getCoinToSell")
      get() = _builder.getCoinToSell()
      @JvmName("setCoinToSell")
      set(value) {
        _builder.setCoinToSell(value)
      }
    /**
     * <code>.api_pb.Coin coin_to_sell = 1 [json_name = "coinToSell"];</code>
     */
    fun clearCoinToSell() {
      _builder.clearCoinToSell()
    }
    /**
     * <code>.api_pb.Coin coin_to_sell = 1 [json_name = "coinToSell"];</code>
     * @return Whether the coinToSell field is set.
     */
    fun hasCoinToSell(): kotlin.Boolean {
      return _builder.hasCoinToSell()
    }

    /**
     * <code>string value_to_sell = 2 [json_name = "valueToSell"];</code>
     */
    var valueToSell: kotlin.String
      @JvmName("getValueToSell")
      get() = _builder.getValueToSell()
      @JvmName("setValueToSell")
      set(value) {
        _builder.setValueToSell(value)
      }
    /**
     * <code>string value_to_sell = 2 [json_name = "valueToSell"];</code>
     */
    fun clearValueToSell() {
      _builder.clearValueToSell()
    }

    /**
     * <code>.api_pb.Coin coin_to_buy = 3 [json_name = "coinToBuy"];</code>
     */
    var coinToBuy: network.minter.grpc.Coin
      @JvmName("getCoinToBuy")
      get() = _builder.getCoinToBuy()
      @JvmName("setCoinToBuy")
      set(value) {
        _builder.setCoinToBuy(value)
      }
    /**
     * <code>.api_pb.Coin coin_to_buy = 3 [json_name = "coinToBuy"];</code>
     */
    fun clearCoinToBuy() {
      _builder.clearCoinToBuy()
    }
    /**
     * <code>.api_pb.Coin coin_to_buy = 3 [json_name = "coinToBuy"];</code>
     * @return Whether the coinToBuy field is set.
     */
    fun hasCoinToBuy(): kotlin.Boolean {
      return _builder.hasCoinToBuy()
    }

    /**
     * <code>string minimum_value_to_buy = 4 [json_name = "minimumValueToBuy"];</code>
     */
    var minimumValueToBuy: kotlin.String
      @JvmName("getMinimumValueToBuy")
      get() = _builder.getMinimumValueToBuy()
      @JvmName("setMinimumValueToBuy")
      set(value) {
        _builder.setMinimumValueToBuy(value)
      }
    /**
     * <code>string minimum_value_to_buy = 4 [json_name = "minimumValueToBuy"];</code>
     */
    fun clearMinimumValueToBuy() {
      _builder.clearMinimumValueToBuy()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun network.minter.grpc.SellCoinData.copy(block: network.minter.grpc.SellCoinDataKt.Dsl.() -> Unit): network.minter.grpc.SellCoinData =
  network.minter.grpc.SellCoinDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()
