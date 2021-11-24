// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/keyword_plan_idea_service.proto

package com.google.ads.googleads.v7.services;

/**
 * <pre>
 * Keyword And Url Seed
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v7.services.KeywordAndUrlSeed}
 */
public final class KeywordAndUrlSeed extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v7.services.KeywordAndUrlSeed)
    KeywordAndUrlSeedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordAndUrlSeed.newBuilder() to construct.
  private KeywordAndUrlSeed(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordAndUrlSeed() {
    url_ = "";
    keywords_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeywordAndUrlSeed();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KeywordAndUrlSeed(
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
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            url_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              keywords_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            keywords_.add(s);
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        keywords_ = keywords_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v7.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v7_services_KeywordAndUrlSeed_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v7.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v7_services_KeywordAndUrlSeed_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v7.services.KeywordAndUrlSeed.class, com.google.ads.googleads.v7.services.KeywordAndUrlSeed.Builder.class);
  }

  private int bitField0_;
  public static final int URL_FIELD_NUMBER = 3;
  private volatile java.lang.Object url_;
  /**
   * <pre>
   * The URL to crawl in order to generate keyword ideas.
   * </pre>
   *
   * <code>optional string url = 3;</code>
   * @return Whether the url field is set.
   */
  @java.lang.Override
  public boolean hasUrl() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The URL to crawl in order to generate keyword ideas.
   * </pre>
   *
   * <code>optional string url = 3;</code>
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The URL to crawl in order to generate keyword ideas.
   * </pre>
   *
   * <code>optional string url = 3;</code>
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEYWORDS_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList keywords_;
  /**
   * <pre>
   * Requires at least one keyword.
   * </pre>
   *
   * <code>repeated string keywords = 4;</code>
   * @return A list containing the keywords.
   */
  public com.google.protobuf.ProtocolStringList
      getKeywordsList() {
    return keywords_;
  }
  /**
   * <pre>
   * Requires at least one keyword.
   * </pre>
   *
   * <code>repeated string keywords = 4;</code>
   * @return The count of keywords.
   */
  public int getKeywordsCount() {
    return keywords_.size();
  }
  /**
   * <pre>
   * Requires at least one keyword.
   * </pre>
   *
   * <code>repeated string keywords = 4;</code>
   * @param index The index of the element to return.
   * @return The keywords at the given index.
   */
  public java.lang.String getKeywords(int index) {
    return keywords_.get(index);
  }
  /**
   * <pre>
   * Requires at least one keyword.
   * </pre>
   *
   * <code>repeated string keywords = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the keywords at the given index.
   */
  public com.google.protobuf.ByteString
      getKeywordsBytes(int index) {
    return keywords_.getByteString(index);
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, url_);
    }
    for (int i = 0; i < keywords_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, keywords_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, url_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < keywords_.size(); i++) {
        dataSize += computeStringSizeNoTag(keywords_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getKeywordsList().size();
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
    if (!(obj instanceof com.google.ads.googleads.v7.services.KeywordAndUrlSeed)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v7.services.KeywordAndUrlSeed other = (com.google.ads.googleads.v7.services.KeywordAndUrlSeed) obj;

    if (hasUrl() != other.hasUrl()) return false;
    if (hasUrl()) {
      if (!getUrl()
          .equals(other.getUrl())) return false;
    }
    if (!getKeywordsList()
        .equals(other.getKeywordsList())) return false;
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
    if (hasUrl()) {
      hash = (37 * hash) + URL_FIELD_NUMBER;
      hash = (53 * hash) + getUrl().hashCode();
    }
    if (getKeywordsCount() > 0) {
      hash = (37 * hash) + KEYWORDS_FIELD_NUMBER;
      hash = (53 * hash) + getKeywordsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v7.services.KeywordAndUrlSeed parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.KeywordAndUrlSeed parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.KeywordAndUrlSeed parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.KeywordAndUrlSeed parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.KeywordAndUrlSeed parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.KeywordAndUrlSeed parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.KeywordAndUrlSeed parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.KeywordAndUrlSeed parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.KeywordAndUrlSeed parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.KeywordAndUrlSeed parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.KeywordAndUrlSeed parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.KeywordAndUrlSeed parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v7.services.KeywordAndUrlSeed prototype) {
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
   * Keyword And Url Seed
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v7.services.KeywordAndUrlSeed}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v7.services.KeywordAndUrlSeed)
      com.google.ads.googleads.v7.services.KeywordAndUrlSeedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v7.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v7_services_KeywordAndUrlSeed_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v7.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v7_services_KeywordAndUrlSeed_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v7.services.KeywordAndUrlSeed.class, com.google.ads.googleads.v7.services.KeywordAndUrlSeed.Builder.class);
    }

    // Construct using com.google.ads.googleads.v7.services.KeywordAndUrlSeed.newBuilder()
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
      url_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      keywords_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v7.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v7_services_KeywordAndUrlSeed_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.KeywordAndUrlSeed getDefaultInstanceForType() {
      return com.google.ads.googleads.v7.services.KeywordAndUrlSeed.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.KeywordAndUrlSeed build() {
      com.google.ads.googleads.v7.services.KeywordAndUrlSeed result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.KeywordAndUrlSeed buildPartial() {
      com.google.ads.googleads.v7.services.KeywordAndUrlSeed result = new com.google.ads.googleads.v7.services.KeywordAndUrlSeed(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.url_ = url_;
      if (((bitField0_ & 0x00000002) != 0)) {
        keywords_ = keywords_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.keywords_ = keywords_;
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
      if (other instanceof com.google.ads.googleads.v7.services.KeywordAndUrlSeed) {
        return mergeFrom((com.google.ads.googleads.v7.services.KeywordAndUrlSeed)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v7.services.KeywordAndUrlSeed other) {
      if (other == com.google.ads.googleads.v7.services.KeywordAndUrlSeed.getDefaultInstance()) return this;
      if (other.hasUrl()) {
        bitField0_ |= 0x00000001;
        url_ = other.url_;
        onChanged();
      }
      if (!other.keywords_.isEmpty()) {
        if (keywords_.isEmpty()) {
          keywords_ = other.keywords_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureKeywordsIsMutable();
          keywords_.addAll(other.keywords_);
        }
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
      com.google.ads.googleads.v7.services.KeywordAndUrlSeed parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v7.services.KeywordAndUrlSeed) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object url_ = "";
    /**
     * <pre>
     * The URL to crawl in order to generate keyword ideas.
     * </pre>
     *
     * <code>optional string url = 3;</code>
     * @return Whether the url field is set.
     */
    public boolean hasUrl() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The URL to crawl in order to generate keyword ideas.
     * </pre>
     *
     * <code>optional string url = 3;</code>
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The URL to crawl in order to generate keyword ideas.
     * </pre>
     *
     * <code>optional string url = 3;</code>
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The URL to crawl in order to generate keyword ideas.
     * </pre>
     *
     * <code>optional string url = 3;</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      url_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URL to crawl in order to generate keyword ideas.
     * </pre>
     *
     * <code>optional string url = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      bitField0_ = (bitField0_ & ~0x00000001);
      url_ = getDefaultInstance().getUrl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URL to crawl in order to generate keyword ideas.
     * </pre>
     *
     * <code>optional string url = 3;</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      url_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList keywords_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureKeywordsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        keywords_ = new com.google.protobuf.LazyStringArrayList(keywords_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated string keywords = 4;</code>
     * @return A list containing the keywords.
     */
    public com.google.protobuf.ProtocolStringList
        getKeywordsList() {
      return keywords_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated string keywords = 4;</code>
     * @return The count of keywords.
     */
    public int getKeywordsCount() {
      return keywords_.size();
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated string keywords = 4;</code>
     * @param index The index of the element to return.
     * @return The keywords at the given index.
     */
    public java.lang.String getKeywords(int index) {
      return keywords_.get(index);
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated string keywords = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the keywords at the given index.
     */
    public com.google.protobuf.ByteString
        getKeywordsBytes(int index) {
      return keywords_.getByteString(index);
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated string keywords = 4;</code>
     * @param index The index to set the value at.
     * @param value The keywords to set.
     * @return This builder for chaining.
     */
    public Builder setKeywords(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureKeywordsIsMutable();
      keywords_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated string keywords = 4;</code>
     * @param value The keywords to add.
     * @return This builder for chaining.
     */
    public Builder addKeywords(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureKeywordsIsMutable();
      keywords_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated string keywords = 4;</code>
     * @param values The keywords to add.
     * @return This builder for chaining.
     */
    public Builder addAllKeywords(
        java.lang.Iterable<java.lang.String> values) {
      ensureKeywordsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, keywords_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated string keywords = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearKeywords() {
      keywords_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Requires at least one keyword.
     * </pre>
     *
     * <code>repeated string keywords = 4;</code>
     * @param value The bytes of the keywords to add.
     * @return This builder for chaining.
     */
    public Builder addKeywordsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureKeywordsIsMutable();
      keywords_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v7.services.KeywordAndUrlSeed)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.KeywordAndUrlSeed)
  private static final com.google.ads.googleads.v7.services.KeywordAndUrlSeed DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v7.services.KeywordAndUrlSeed();
  }

  public static com.google.ads.googleads.v7.services.KeywordAndUrlSeed getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordAndUrlSeed>
      PARSER = new com.google.protobuf.AbstractParser<KeywordAndUrlSeed>() {
    @java.lang.Override
    public KeywordAndUrlSeed parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KeywordAndUrlSeed(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KeywordAndUrlSeed> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordAndUrlSeed> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v7.services.KeywordAndUrlSeed getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

