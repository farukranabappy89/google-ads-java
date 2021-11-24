// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/common/extensions.proto

package com.google.ads.googleads.v8.common;

public interface StructuredSnippetFeedItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.common.StructuredSnippetFeedItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The header of the snippet.
   * This string must not be empty.
   * </pre>
   *
   * <code>optional string header = 3;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <pre>
   * The header of the snippet.
   * This string must not be empty.
   * </pre>
   *
   * <code>optional string header = 3;</code>
   * @return The header.
   */
  java.lang.String getHeader();
  /**
   * <pre>
   * The header of the snippet.
   * This string must not be empty.
   * </pre>
   *
   * <code>optional string header = 3;</code>
   * @return The bytes for header.
   */
  com.google.protobuf.ByteString
      getHeaderBytes();

  /**
   * <pre>
   * The values in the snippet.
   * The maximum size of this collection is 10.
   * </pre>
   *
   * <code>repeated string values = 4;</code>
   * @return A list containing the values.
   */
  java.util.List<java.lang.String>
      getValuesList();
  /**
   * <pre>
   * The values in the snippet.
   * The maximum size of this collection is 10.
   * </pre>
   *
   * <code>repeated string values = 4;</code>
   * @return The count of values.
   */
  int getValuesCount();
  /**
   * <pre>
   * The values in the snippet.
   * The maximum size of this collection is 10.
   * </pre>
   *
   * <code>repeated string values = 4;</code>
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  java.lang.String getValues(int index);
  /**
   * <pre>
   * The values in the snippet.
   * The maximum size of this collection is 10.
   * </pre>
   *
   * <code>repeated string values = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the values at the given index.
   */
  com.google.protobuf.ByteString
      getValuesBytes(int index);
}
