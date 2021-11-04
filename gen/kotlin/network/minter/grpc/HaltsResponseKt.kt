//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package network.minter.grpc;

@kotlin.jvm.JvmSynthetic
inline fun haltsResponse(block: network.minter.grpc.HaltsResponseKt.Dsl.() -> Unit): network.minter.grpc.HaltsResponse =
  network.minter.grpc.HaltsResponseKt.Dsl._create(network.minter.grpc.HaltsResponse.newBuilder()).apply { block() }._build()
object HaltsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: network.minter.grpc.HaltsResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: network.minter.grpc.HaltsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): network.minter.grpc.HaltsResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class PublicKeysProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated string public_keys = 1 [json_name = "publicKeys"];</code>
     * @return A list containing the publicKeys.
     */
    val publicKeys: com.google.protobuf.kotlin.DslList<kotlin.String, PublicKeysProxy>
      @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getPublicKeysList()
      )
    /**
     * <code>repeated string public_keys = 1 [json_name = "publicKeys"];</code>
     * @param value The publicKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addPublicKeys")
    fun com.google.protobuf.kotlin.DslList<kotlin.String, PublicKeysProxy>.add(value: kotlin.String) {
      _builder.addPublicKeys(value)
    }
    /**
     * <code>repeated string public_keys = 1 [json_name = "publicKeys"];</code>
     * @param value The publicKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignPublicKeys")
    operator fun com.google.protobuf.kotlin.DslList<kotlin.String, PublicKeysProxy>.plusAssign(value: kotlin.String) {
      _builder.addPublicKeys(value)
    }
    /**
     * <code>repeated string public_keys = 1 [json_name = "publicKeys"];</code>
     * @param values The publicKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllPublicKeys")
    fun com.google.protobuf.kotlin.DslList<kotlin.String, PublicKeysProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllPublicKeys(values)
    }
    /**
     * <code>repeated string public_keys = 1 [json_name = "publicKeys"];</code>
     * @param values The publicKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllPublicKeys")
    operator fun com.google.protobuf.kotlin.DslList<kotlin.String, PublicKeysProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllPublicKeys(values)
    }
    /**
     * <code>repeated string public_keys = 1 [json_name = "publicKeys"];</code>
     * @param index The index to set the value at.
     * @param value The publicKeys to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setPublicKeys")
    operator fun com.google.protobuf.kotlin.DslList<kotlin.String, PublicKeysProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setPublicKeys(index, value)
    }/**
     * <code>repeated string public_keys = 1 [json_name = "publicKeys"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearPublicKeys")
    fun com.google.protobuf.kotlin.DslList<kotlin.String, PublicKeysProxy>.clear() {
      _builder.clearPublicKeys()
    }}
}
@kotlin.jvm.JvmSynthetic
inline fun network.minter.grpc.HaltsResponse.copy(block: network.minter.grpc.HaltsResponseKt.Dsl.() -> Unit): network.minter.grpc.HaltsResponse =
  network.minter.grpc.HaltsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
