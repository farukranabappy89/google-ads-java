// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/common/ad_type_infos.proto

package com.google.ads.googleads.v8.common;

/**
 * <pre>
 * Data for display call to action. The call to action is a piece of the ad
 * that prompts the user to do something. Like clicking a link or making a phone
 * call.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v8.common.DisplayCallToAction}
 */
public final class DisplayCallToAction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v8.common.DisplayCallToAction)
    DisplayCallToActionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DisplayCallToAction.newBuilder() to construct.
  private DisplayCallToAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DisplayCallToAction() {
    text_ = "";
    textColor_ = "";
    urlCollectionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DisplayCallToAction();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DisplayCallToAction(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            text_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000002;
            textColor_ = s;
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000004;
            urlCollectionId_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v8.common.AdTypeInfosProto.internal_static_google_ads_googleads_v8_common_DisplayCallToAction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v8.common.AdTypeInfosProto.internal_static_google_ads_googleads_v8_common_DisplayCallToAction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v8.common.DisplayCallToAction.class, com.google.ads.googleads.v8.common.DisplayCallToAction.Builder.class);
  }

  private int bitField0_;
  public static final int TEXT_FIELD_NUMBER = 5;
  private volatile java.lang.Object text_;
  /**
   * <pre>
   * Text for the display-call-to-action.
   * </pre>
   *
   * <code>optional string text = 5;</code>
   * @return Whether the text field is set.
   */
  @java.lang.Override
  public boolean hasText() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Text for the display-call-to-action.
   * </pre>
   *
   * <code>optional string text = 5;</code>
   * @return The text.
   */
  @java.lang.Override
  public java.lang.String getText() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      text_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Text for the display-call-to-action.
   * </pre>
   *
   * <code>optional string text = 5;</code>
   * @return The bytes for text.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTextBytes() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      text_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEXT_COLOR_FIELD_NUMBER = 6;
  private volatile java.lang.Object textColor_;
  /**
   * <pre>
   * Text color for the display-call-to-action in hexadecimal, e.g. #ffffff for
   * white.
   * </pre>
   *
   * <code>optional string text_color = 6;</code>
   * @return Whether the textColor field is set.
   */
  @java.lang.Override
  public boolean hasTextColor() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Text color for the display-call-to-action in hexadecimal, e.g. #ffffff for
   * white.
   * </pre>
   *
   * <code>optional string text_color = 6;</code>
   * @return The textColor.
   */
  @java.lang.Override
  public java.lang.String getTextColor() {
    java.lang.Object ref = textColor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      textColor_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Text color for the display-call-to-action in hexadecimal, e.g. #ffffff for
   * white.
   * </pre>
   *
   * <code>optional string text_color = 6;</code>
   * @return The bytes for textColor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTextColorBytes() {
    java.lang.Object ref = textColor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      textColor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URL_COLLECTION_ID_FIELD_NUMBER = 7;
  private volatile java.lang.Object urlCollectionId_;
  /**
   * <pre>
   * Identifies the URL collection in the `ad.url_collections` field. If not
   * set, the URL defaults to `final_url`.
   * </pre>
   *
   * <code>optional string url_collection_id = 7;</code>
   * @return Whether the urlCollectionId field is set.
   */
  @java.lang.Override
  public boolean hasUrlCollectionId() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Identifies the URL collection in the `ad.url_collections` field. If not
   * set, the URL defaults to `final_url`.
   * </pre>
   *
   * <code>optional string url_collection_id = 7;</code>
   * @return The urlCollectionId.
   */
  @java.lang.Override
  public java.lang.String getUrlCollectionId() {
    java.lang.Object ref = urlCollectionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      urlCollectionId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Identifies the URL collection in the `ad.url_collections` field. If not
   * set, the URL defaults to `final_url`.
   * </pre>
   *
   * <code>optional string url_collection_id = 7;</code>
   * @return The bytes for urlCollectionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlCollectionIdBytes() {
    java.lang.Object ref = urlCollectionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      urlCollectionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, text_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, textColor_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, urlCollectionId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, text_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, textColor_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, urlCollectionId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v8.common.DisplayCallToAction)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v8.common.DisplayCallToAction other = (com.google.ads.googleads.v8.common.DisplayCallToAction) obj;

    if (hasText() != other.hasText()) return false;
    if (hasText()) {
      if (!getText()
          .equals(other.getText())) return false;
    }
    if (hasTextColor() != other.hasTextColor()) return false;
    if (hasTextColor()) {
      if (!getTextColor()
          .equals(other.getTextColor())) return false;
    }
    if (hasUrlCollectionId() != other.hasUrlCollectionId()) return false;
    if (hasUrlCollectionId()) {
      if (!getUrlCollectionId()
          .equals(other.getUrlCollectionId())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasText()) {
      hash = (37 * hash) + TEXT_FIELD_NUMBER;
      hash = (53 * hash) + getText().hashCode();
    }
    if (hasTextColor()) {
      hash = (37 * hash) + TEXT_COLOR_FIELD_NUMBER;
      hash = (53 * hash) + getTextColor().hashCode();
    }
    if (hasUrlCollectionId()) {
      hash = (37 * hash) + URL_COLLECTION_ID_FIELD_NUMBER;
      hash = (53 * hash) + getUrlCollectionId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v8.common.DisplayCallToAction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.common.DisplayCallToAction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.DisplayCallToAction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.common.DisplayCallToAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.DisplayCallToAction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.common.DisplayCallToAction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.DisplayCallToAction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.common.DisplayCallToAction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.DisplayCallToAction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.common.DisplayCallToAction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.common.DisplayCallToAction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.common.DisplayCallToAction parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v8.common.DisplayCallToAction prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Data for display call to action. The call to action is a piece of the ad
   * that prompts the user to do something. Like clicking a link or making a phone
   * call.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v8.common.DisplayCallToAction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v8.common.DisplayCallToAction)
      com.google.ads.googleads.v8.common.DisplayCallToActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v8.common.AdTypeInfosProto.internal_static_google_ads_googleads_v8_common_DisplayCallToAction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v8.common.AdTypeInfosProto.internal_static_google_ads_googleads_v8_common_DisplayCallToAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v8.common.DisplayCallToAction.class, com.google.ads.googleads.v8.common.DisplayCallToAction.Builder.class);
    }

    // Construct using com.google.ads.googleads.v8.common.DisplayCallToAction.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      text_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      textColor_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      urlCollectionId_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v8.common.AdTypeInfosProto.internal_static_google_ads_googleads_v8_common_DisplayCallToAction_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.common.DisplayCallToAction getDefaultInstanceForType() {
      return com.google.ads.googleads.v8.common.DisplayCallToAction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.common.DisplayCallToAction build() {
      com.google.ads.googleads.v8.common.DisplayCallToAction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.common.DisplayCallToAction buildPartial() {
      com.google.ads.googleads.v8.common.DisplayCallToAction result = new com.google.ads.googleads.v8.common.DisplayCallToAction(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.text_ = text_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.textColor_ = textColor_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.urlCollectionId_ = urlCollectionId_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v8.common.DisplayCallToAction) {
        return mergeFrom((com.google.ads.googleads.v8.common.DisplayCallToAction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v8.common.DisplayCallToAction other) {
      if (other == com.google.ads.googleads.v8.common.DisplayCallToAction.getDefaultInstance()) return this;
      if (other.hasText()) {
        bitField0_ |= 0x00000001;
        text_ = other.text_;
        onChanged();
      }
      if (other.hasTextColor()) {
        bitField0_ |= 0x00000002;
        textColor_ = other.textColor_;
        onChanged();
      }
      if (other.hasUrlCollectionId()) {
        bitField0_ |= 0x00000004;
        urlCollectionId_ = other.urlCollectionId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v8.common.DisplayCallToAction parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v8.common.DisplayCallToAction) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object text_ = "";
    /**
     * <pre>
     * Text for the display-call-to-action.
     * </pre>
     *
     * <code>optional string text = 5;</code>
     * @return Whether the text field is set.
     */
    public boolean hasText() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Text for the display-call-to-action.
     * </pre>
     *
     * <code>optional string text = 5;</code>
     * @return The text.
     */
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        text_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Text for the display-call-to-action.
     * </pre>
     *
     * <code>optional string text = 5;</code>
     * @return The bytes for text.
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Text for the display-call-to-action.
     * </pre>
     *
     * <code>optional string text = 5;</code>
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      text_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Text for the display-call-to-action.
     * </pre>
     *
     * <code>optional string text = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearText() {
      bitField0_ = (bitField0_ & ~0x00000001);
      text_ = getDefaultInstance().getText();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Text for the display-call-to-action.
     * </pre>
     *
     * <code>optional string text = 5;</code>
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      text_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object textColor_ = "";
    /**
     * <pre>
     * Text color for the display-call-to-action in hexadecimal, e.g. #ffffff for
     * white.
     * </pre>
     *
     * <code>optional string text_color = 6;</code>
     * @return Whether the textColor field is set.
     */
    public boolean hasTextColor() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Text color for the display-call-to-action in hexadecimal, e.g. #ffffff for
     * white.
     * </pre>
     *
     * <code>optional string text_color = 6;</code>
     * @return The textColor.
     */
    public java.lang.String getTextColor() {
      java.lang.Object ref = textColor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        textColor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Text color for the display-call-to-action in hexadecimal, e.g. #ffffff for
     * white.
     * </pre>
     *
     * <code>optional string text_color = 6;</code>
     * @return The bytes for textColor.
     */
    public com.google.protobuf.ByteString
        getTextColorBytes() {
      java.lang.Object ref = textColor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        textColor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Text color for the display-call-to-action in hexadecimal, e.g. #ffffff for
     * white.
     * </pre>
     *
     * <code>optional string text_color = 6;</code>
     * @param value The textColor to set.
     * @return This builder for chaining.
     */
    public Builder setTextColor(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      textColor_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Text color for the display-call-to-action in hexadecimal, e.g. #ffffff for
     * white.
     * </pre>
     *
     * <code>optional string text_color = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearTextColor() {
      bitField0_ = (bitField0_ & ~0x00000002);
      textColor_ = getDefaultInstance().getTextColor();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Text color for the display-call-to-action in hexadecimal, e.g. #ffffff for
     * white.
     * </pre>
     *
     * <code>optional string text_color = 6;</code>
     * @param value The bytes for textColor to set.
     * @return This builder for chaining.
     */
    public Builder setTextColorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      textColor_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object urlCollectionId_ = "";
    /**
     * <pre>
     * Identifies the URL collection in the `ad.url_collections` field. If not
     * set, the URL defaults to `final_url`.
     * </pre>
     *
     * <code>optional string url_collection_id = 7;</code>
     * @return Whether the urlCollectionId field is set.
     */
    public boolean hasUrlCollectionId() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Identifies the URL collection in the `ad.url_collections` field. If not
     * set, the URL defaults to `final_url`.
     * </pre>
     *
     * <code>optional string url_collection_id = 7;</code>
     * @return The urlCollectionId.
     */
    public java.lang.String getUrlCollectionId() {
      java.lang.Object ref = urlCollectionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        urlCollectionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Identifies the URL collection in the `ad.url_collections` field. If not
     * set, the URL defaults to `final_url`.
     * </pre>
     *
     * <code>optional string url_collection_id = 7;</code>
     * @return The bytes for urlCollectionId.
     */
    public com.google.protobuf.ByteString
        getUrlCollectionIdBytes() {
      java.lang.Object ref = urlCollectionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        urlCollectionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Identifies the URL collection in the `ad.url_collections` field. If not
     * set, the URL defaults to `final_url`.
     * </pre>
     *
     * <code>optional string url_collection_id = 7;</code>
     * @param value The urlCollectionId to set.
     * @return This builder for chaining.
     */
    public Builder setUrlCollectionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      urlCollectionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Identifies the URL collection in the `ad.url_collections` field. If not
     * set, the URL defaults to `final_url`.
     * </pre>
     *
     * <code>optional string url_collection_id = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrlCollectionId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      urlCollectionId_ = getDefaultInstance().getUrlCollectionId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Identifies the URL collection in the `ad.url_collections` field. If not
     * set, the URL defaults to `final_url`.
     * </pre>
     *
     * <code>optional string url_collection_id = 7;</code>
     * @param value The bytes for urlCollectionId to set.
     * @return This builder for chaining.
     */
    public Builder setUrlCollectionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000004;
      urlCollectionId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v8.common.DisplayCallToAction)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v8.common.DisplayCallToAction)
  private static final com.google.ads.googleads.v8.common.DisplayCallToAction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v8.common.DisplayCallToAction();
  }

  public static com.google.ads.googleads.v8.common.DisplayCallToAction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DisplayCallToAction>
      PARSER = new com.google.protobuf.AbstractParser<DisplayCallToAction>() {
    @java.lang.Override
    public DisplayCallToAction parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DisplayCallToAction(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DisplayCallToAction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DisplayCallToAction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v8.common.DisplayCallToAction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

