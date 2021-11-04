//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package network.minter.grpc;

@kotlin.jvm.JvmSynthetic
inline fun eventsRequest(block: network.minter.grpc.EventsRequestKt.Dsl.() -> Unit): network.minter.grpc.EventsRequest =
  network.minter.grpc.EventsRequestKt.Dsl._create(network.minter.grpc.EventsRequest.newBuilder()).apply { block() }._build()
object EventsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: network.minter.grpc.EventsRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: network.minter.grpc.EventsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): network.minter.grpc.EventsRequest = _builder.build()

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
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class SearchProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * Array of public keys of validators and wallet addresses of delegators for filtering
     * </pre>
     *
     * <code>repeated string search = 2 [json_name = "search"];</code>
     * @return A list containing the search.
     */
    val search: com.google.protobuf.kotlin.DslList<kotlin.String, SearchProxy>
      @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getSearchList()
      )
    /**
     * <pre>
     * Array of public keys of validators and wallet addresses of delegators for filtering
     * </pre>
     *
     * <code>repeated string search = 2 [json_name = "search"];</code>
     * @param value The search to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addSearch")
    fun com.google.protobuf.kotlin.DslList<kotlin.String, SearchProxy>.add(value: kotlin.String) {
      _builder.addSearch(value)
    }
    /**
     * <pre>
     * Array of public keys of validators and wallet addresses of delegators for filtering
     * </pre>
     *
     * <code>repeated string search = 2 [json_name = "search"];</code>
     * @param value The search to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignSearch")
    operator fun com.google.protobuf.kotlin.DslList<kotlin.String, SearchProxy>.plusAssign(value: kotlin.String) {
      _builder.addSearch(value)
    }
    /**
     * <pre>
     * Array of public keys of validators and wallet addresses of delegators for filtering
     * </pre>
     *
     * <code>repeated string search = 2 [json_name = "search"];</code>
     * @param values The search to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllSearch")
    fun com.google.protobuf.kotlin.DslList<kotlin.String, SearchProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllSearch(values)
    }
    /**
     * <pre>
     * Array of public keys of validators and wallet addresses of delegators for filtering
     * </pre>
     *
     * <code>repeated string search = 2 [json_name = "search"];</code>
     * @param values The search to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllSearch")
    operator fun com.google.protobuf.kotlin.DslList<kotlin.String, SearchProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllSearch(values)
    }
    /**
     * <pre>
     * Array of public keys of validators and wallet addresses of delegators for filtering
     * </pre>
     *
     * <code>repeated string search = 2 [json_name = "search"];</code>
     * @param index The index to set the value at.
     * @param value The search to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setSearch")
    operator fun com.google.protobuf.kotlin.DslList<kotlin.String, SearchProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setSearch(index, value)
    }/**
     * <pre>
     * Array of public keys of validators and wallet addresses of delegators for filtering
     * </pre>
     *
     * <code>repeated string search = 2 [json_name = "search"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearSearch")
    fun com.google.protobuf.kotlin.DslList<kotlin.String, SearchProxy>.clear() {
      _builder.clearSearch()
    }}
}
@kotlin.jvm.JvmSynthetic
inline fun network.minter.grpc.EventsRequest.copy(block: network.minter.grpc.EventsRequestKt.Dsl.() -> Unit): network.minter.grpc.EventsRequest =
  network.minter.grpc.EventsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
