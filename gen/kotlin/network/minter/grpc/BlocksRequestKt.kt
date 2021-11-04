//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package network.minter.grpc;

@kotlin.jvm.JvmSynthetic
inline fun blocksRequest(block: network.minter.grpc.BlocksRequestKt.Dsl.() -> Unit): network.minter.grpc.BlocksRequest =
  network.minter.grpc.BlocksRequestKt.Dsl._create(network.minter.grpc.BlocksRequest.newBuilder()).apply { block() }._build()
object BlocksRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: network.minter.grpc.BlocksRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: network.minter.grpc.BlocksRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): network.minter.grpc.BlocksRequest = _builder.build()

    /**
     * <code>uint64 from_height = 1 [json_name = "fromHeight", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    var fromHeight: kotlin.Long
      @JvmName("getFromHeight")
      get() = _builder.getFromHeight()
      @JvmName("setFromHeight")
      set(value) {
        _builder.setFromHeight(value)
      }
    /**
     * <code>uint64 from_height = 1 [json_name = "fromHeight", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    fun clearFromHeight() {
      _builder.clearFromHeight()
    }

    /**
     * <code>uint64 to_height = 2 [json_name = "toHeight", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    var toHeight: kotlin.Long
      @JvmName("getToHeight")
      get() = _builder.getToHeight()
      @JvmName("setToHeight")
      set(value) {
        _builder.setToHeight(value)
      }
    /**
     * <code>uint64 to_height = 2 [json_name = "toHeight", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    fun clearToHeight() {
      _builder.clearToHeight()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class FieldsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .api_pb.BlockField fields = 3 [json_name = "fields"];</code>
     */
     val fields: com.google.protobuf.kotlin.DslList<network.minter.grpc.BlockField, FieldsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getFieldsList()
      )
    /**
     * <code>repeated .api_pb.BlockField fields = 3 [json_name = "fields"];</code>
     * @param value The fields to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addFields")
    fun com.google.protobuf.kotlin.DslList<network.minter.grpc.BlockField, FieldsProxy>.add(value: network.minter.grpc.BlockField) {
      _builder.addFields(value)
    }/**
     * <code>repeated .api_pb.BlockField fields = 3 [json_name = "fields"];</code>
     * @param value The fields to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignFields")
    inline operator fun com.google.protobuf.kotlin.DslList<network.minter.grpc.BlockField, FieldsProxy>.plusAssign(value: network.minter.grpc.BlockField) {
      add(value)
    }/**
     * <code>repeated .api_pb.BlockField fields = 3 [json_name = "fields"];</code>
     * @param values The fields to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllFields")
    fun com.google.protobuf.kotlin.DslList<network.minter.grpc.BlockField, FieldsProxy>.addAll(values: kotlin.collections.Iterable<network.minter.grpc.BlockField>) {
      _builder.addAllFields(values)
    }/**
     * <code>repeated .api_pb.BlockField fields = 3 [json_name = "fields"];</code>
     * @param values The fields to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllFields")
    inline operator fun com.google.protobuf.kotlin.DslList<network.minter.grpc.BlockField, FieldsProxy>.plusAssign(values: kotlin.collections.Iterable<network.minter.grpc.BlockField>) {
      addAll(values)
    }/**
     * <code>repeated .api_pb.BlockField fields = 3 [json_name = "fields"];</code>
     * @param index The index to set the value at.
     * @param value The fields to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setFields")
    operator fun com.google.protobuf.kotlin.DslList<network.minter.grpc.BlockField, FieldsProxy>.set(index: kotlin.Int, value: network.minter.grpc.BlockField) {
      _builder.setFields(index, value)
    }/**
     * <code>repeated .api_pb.BlockField fields = 3 [json_name = "fields"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearFields")
    fun com.google.protobuf.kotlin.DslList<network.minter.grpc.BlockField, FieldsProxy>.clear() {
      _builder.clearFields()
    }
    /**
     * <code>bool failed_txs = 4 [json_name = "failedTxs", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    var failedTxs: kotlin.Boolean
      @JvmName("getFailedTxs")
      get() = _builder.getFailedTxs()
      @JvmName("setFailedTxs")
      set(value) {
        _builder.setFailedTxs(value)
      }
    /**
     * <code>bool failed_txs = 4 [json_name = "failedTxs", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    fun clearFailedTxs() {
      _builder.clearFailedTxs()
    }

    /**
     * <code>bool events = 5 [json_name = "events", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    var events: kotlin.Boolean
      @JvmName("getEvents")
      get() = _builder.getEvents()
      @JvmName("setEvents")
      set(value) {
        _builder.setEvents(value)
      }
    /**
     * <code>bool events = 5 [json_name = "events", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    fun clearEvents() {
      _builder.clearEvents()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun network.minter.grpc.BlocksRequest.copy(block: network.minter.grpc.BlocksRequestKt.Dsl.() -> Unit): network.minter.grpc.BlocksRequest =
  network.minter.grpc.BlocksRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
