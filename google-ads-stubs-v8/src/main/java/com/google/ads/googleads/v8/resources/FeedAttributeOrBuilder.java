// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/feed.proto

package com.google.ads.googleads.v8.resources;

public interface FeedAttributeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.resources.FeedAttribute)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the attribute.
   * </pre>
   *
   * <code>optional int64 id = 5;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * ID of the attribute.
   * </pre>
   *
   * <code>optional int64 id = 5;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * The name of the attribute. Required.
   * </pre>
   *
   * <code>optional string name = 6;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the attribute. Required.
   * </pre>
   *
   * <code>optional string name = 6;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the attribute. Required.
   * </pre>
   *
   * <code>optional string name = 6;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Data type for feed attribute. Required.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.FeedAttributeTypeEnum.FeedAttributeType type = 3;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Data type for feed attribute. Required.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.FeedAttributeTypeEnum.FeedAttributeType type = 3;</code>
   * @return The type.
   */
  com.google.ads.googleads.v8.enums.FeedAttributeTypeEnum.FeedAttributeType getType();

  /**
   * <pre>
   * Indicates that data corresponding to this attribute is part of a
   * FeedItem's unique key. It defaults to false if it is unspecified. Note
   * that a unique key is not required in a Feed's schema, in which case the
   * FeedItems must be referenced by their feed_item_id.
   * </pre>
   *
   * <code>optional bool is_part_of_key = 7;</code>
   * @return Whether the isPartOfKey field is set.
   */
  boolean hasIsPartOfKey();
  /**
   * <pre>
   * Indicates that data corresponding to this attribute is part of a
   * FeedItem's unique key. It defaults to false if it is unspecified. Note
   * that a unique key is not required in a Feed's schema, in which case the
   * FeedItems must be referenced by their feed_item_id.
   * </pre>
   *
   * <code>optional bool is_part_of_key = 7;</code>
   * @return The isPartOfKey.
   */
  boolean getIsPartOfKey();
}
