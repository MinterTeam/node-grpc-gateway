//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: data.proto

package network.minter.grpc;

@kotlin.jvm.JvmSynthetic
inline fun setCandidateOnData(block: network.minter.grpc.SetCandidateOnDataKt.Dsl.() -> Unit): network.minter.grpc.SetCandidateOnData =
  network.minter.grpc.SetCandidateOnDataKt.Dsl._create(network.minter.grpc.SetCandidateOnData.newBuilder()).apply { block() }._build()
object SetCandidateOnDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: network.minter.grpc.SetCandidateOnData.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: network.minter.grpc.SetCandidateOnData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): network.minter.grpc.SetCandidateOnData = _builder.build()

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
  }
}
@kotlin.jvm.JvmSynthetic
inline fun network.minter.grpc.SetCandidateOnData.copy(block: network.minter.grpc.SetCandidateOnDataKt.Dsl.() -> Unit): network.minter.grpc.SetCandidateOnData =
  network.minter.grpc.SetCandidateOnDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()
