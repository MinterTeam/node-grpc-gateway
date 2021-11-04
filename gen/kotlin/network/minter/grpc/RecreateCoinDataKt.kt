//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: data.proto

package network.minter.grpc;

@kotlin.jvm.JvmSynthetic
inline fun recreateCoinData(block: network.minter.grpc.RecreateCoinDataKt.Dsl.() -> Unit): network.minter.grpc.RecreateCoinData =
  network.minter.grpc.RecreateCoinDataKt.Dsl._create(network.minter.grpc.RecreateCoinData.newBuilder()).apply { block() }._build()
object RecreateCoinDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: network.minter.grpc.RecreateCoinData.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: network.minter.grpc.RecreateCoinData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): network.minter.grpc.RecreateCoinData = _builder.build()

    /**
     * <code>string name = 1 [json_name = "name"];</code>
     */
    var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     */
    fun clearName() {
      _builder.clearName()
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

    /**
     * <code>string initial_amount = 3 [json_name = "initialAmount"];</code>
     */
    var initialAmount: kotlin.String
      @JvmName("getInitialAmount")
      get() = _builder.getInitialAmount()
      @JvmName("setInitialAmount")
      set(value) {
        _builder.setInitialAmount(value)
      }
    /**
     * <code>string initial_amount = 3 [json_name = "initialAmount"];</code>
     */
    fun clearInitialAmount() {
      _builder.clearInitialAmount()
    }

    /**
     * <code>string initial_reserve = 4 [json_name = "initialReserve"];</code>
     */
    var initialReserve: kotlin.String
      @JvmName("getInitialReserve")
      get() = _builder.getInitialReserve()
      @JvmName("setInitialReserve")
      set(value) {
        _builder.setInitialReserve(value)
      }
    /**
     * <code>string initial_reserve = 4 [json_name = "initialReserve"];</code>
     */
    fun clearInitialReserve() {
      _builder.clearInitialReserve()
    }

    /**
     * <code>uint64 constant_reserve_ratio = 5 [json_name = "constantReserveRatio"];</code>
     */
    var constantReserveRatio: kotlin.Long
      @JvmName("getConstantReserveRatio")
      get() = _builder.getConstantReserveRatio()
      @JvmName("setConstantReserveRatio")
      set(value) {
        _builder.setConstantReserveRatio(value)
      }
    /**
     * <code>uint64 constant_reserve_ratio = 5 [json_name = "constantReserveRatio"];</code>
     */
    fun clearConstantReserveRatio() {
      _builder.clearConstantReserveRatio()
    }

    /**
     * <code>string max_supply = 6 [json_name = "maxSupply"];</code>
     */
    var maxSupply: kotlin.String
      @JvmName("getMaxSupply")
      get() = _builder.getMaxSupply()
      @JvmName("setMaxSupply")
      set(value) {
        _builder.setMaxSupply(value)
      }
    /**
     * <code>string max_supply = 6 [json_name = "maxSupply"];</code>
     */
    fun clearMaxSupply() {
      _builder.clearMaxSupply()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun network.minter.grpc.RecreateCoinData.copy(block: network.minter.grpc.RecreateCoinDataKt.Dsl.() -> Unit): network.minter.grpc.RecreateCoinData =
  network.minter.grpc.RecreateCoinDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()
