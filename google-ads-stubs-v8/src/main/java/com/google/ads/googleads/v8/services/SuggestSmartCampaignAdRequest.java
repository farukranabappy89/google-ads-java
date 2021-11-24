// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/services/smart_campaign_suggest_service.proto

package com.google.ads.googleads.v8.services;

/**
 * <pre>
 * Request message for
 * [SmartCampaignSuggestService.SuggestSmartCampaignAd][google.ads.googleads.v8.services.SmartCampaignSuggestService.SuggestSmartCampaignAd].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest}
 */
public final class SuggestSmartCampaignAdRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest)
    SuggestSmartCampaignAdRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SuggestSmartCampaignAdRequest.newBuilder() to construct.
  private SuggestSmartCampaignAdRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SuggestSmartCampaignAdRequest() {
    customerId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SuggestSmartCampaignAdRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SuggestSmartCampaignAdRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            customerId_ = s;
            break;
          }
          case 18: {
            com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo.Builder subBuilder = null;
            if (suggestionInfo_ != null) {
              subBuilder = suggestionInfo_.toBuilder();
            }
            suggestionInfo_ = input.readMessage(com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(suggestionInfo_);
              suggestionInfo_ = subBuilder.buildPartial();
            }

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
    return com.google.ads.googleads.v8.services.SmartCampaignSuggestServiceProto.internal_static_google_ads_googleads_v8_services_SuggestSmartCampaignAdRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v8.services.SmartCampaignSuggestServiceProto.internal_static_google_ads_googleads_v8_services_SuggestSmartCampaignAdRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest.class, com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest.Builder.class);
  }

  public static final int CUSTOMER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object customerId_;
  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  @java.lang.Override
  public java.lang.String getCustomerId() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomerIdBytes() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUGGESTION_INFO_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo suggestionInfo_;
  /**
   * <pre>
   * Required. Inputs used to suggest a Smart campaign ad.
   * Required fields: final_url, language_code, keyword_themes.
   * Optional but recommended fields to improve the quality of the suggestion:
   * business_setting and geo_target.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo suggestion_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the suggestionInfo field is set.
   */
  @java.lang.Override
  public boolean hasSuggestionInfo() {
    return suggestionInfo_ != null;
  }
  /**
   * <pre>
   * Required. Inputs used to suggest a Smart campaign ad.
   * Required fields: final_url, language_code, keyword_themes.
   * Optional but recommended fields to improve the quality of the suggestion:
   * business_setting and geo_target.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo suggestion_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The suggestionInfo.
   */
  @java.lang.Override
  public com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo getSuggestionInfo() {
    return suggestionInfo_ == null ? com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo.getDefaultInstance() : suggestionInfo_;
  }
  /**
   * <pre>
   * Required. Inputs used to suggest a Smart campaign ad.
   * Required fields: final_url, language_code, keyword_themes.
   * Optional but recommended fields to improve the quality of the suggestion:
   * business_setting and geo_target.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo suggestion_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfoOrBuilder getSuggestionInfoOrBuilder() {
    return getSuggestionInfo();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, customerId_);
    }
    if (suggestionInfo_ != null) {
      output.writeMessage(2, getSuggestionInfo());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, customerId_);
    }
    if (suggestionInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSuggestionInfo());
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
    if (!(obj instanceof com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest other = (com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest) obj;

    if (!getCustomerId()
        .equals(other.getCustomerId())) return false;
    if (hasSuggestionInfo() != other.hasSuggestionInfo()) return false;
    if (hasSuggestionInfo()) {
      if (!getSuggestionInfo()
          .equals(other.getSuggestionInfo())) return false;
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
    hash = (37 * hash) + CUSTOMER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerId().hashCode();
    if (hasSuggestionInfo()) {
      hash = (37 * hash) + SUGGESTION_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getSuggestionInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest prototype) {
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
   * Request message for
   * [SmartCampaignSuggestService.SuggestSmartCampaignAd][google.ads.googleads.v8.services.SmartCampaignSuggestService.SuggestSmartCampaignAd].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest)
      com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v8.services.SmartCampaignSuggestServiceProto.internal_static_google_ads_googleads_v8_services_SuggestSmartCampaignAdRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v8.services.SmartCampaignSuggestServiceProto.internal_static_google_ads_googleads_v8_services_SuggestSmartCampaignAdRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest.class, com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest.Builder.class);
    }

    // Construct using com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest.newBuilder()
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
      customerId_ = "";

      if (suggestionInfoBuilder_ == null) {
        suggestionInfo_ = null;
      } else {
        suggestionInfo_ = null;
        suggestionInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v8.services.SmartCampaignSuggestServiceProto.internal_static_google_ads_googleads_v8_services_SuggestSmartCampaignAdRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest getDefaultInstanceForType() {
      return com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest build() {
      com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest buildPartial() {
      com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest result = new com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest(this);
      result.customerId_ = customerId_;
      if (suggestionInfoBuilder_ == null) {
        result.suggestionInfo_ = suggestionInfo_;
      } else {
        result.suggestionInfo_ = suggestionInfoBuilder_.build();
      }
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
      if (other instanceof com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest) {
        return mergeFrom((com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest other) {
      if (other == com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest.getDefaultInstance()) return this;
      if (!other.getCustomerId().isEmpty()) {
        customerId_ = other.customerId_;
        onChanged();
      }
      if (other.hasSuggestionInfo()) {
        mergeSuggestionInfo(other.getSuggestionInfo());
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
      com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object customerId_ = "";
    /**
     * <pre>
     * Required. The ID of the customer.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The customerId.
     */
    public java.lang.String getCustomerId() {
      java.lang.Object ref = customerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the customer.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for customerId.
     */
    public com.google.protobuf.ByteString
        getCustomerIdBytes() {
      java.lang.Object ref = customerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the customer.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      customerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the customer.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomerId() {
      
      customerId_ = getDefaultInstance().getCustomerId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the customer.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      customerId_ = value;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo suggestionInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo, com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo.Builder, com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfoOrBuilder> suggestionInfoBuilder_;
    /**
     * <pre>
     * Required. Inputs used to suggest a Smart campaign ad.
     * Required fields: final_url, language_code, keyword_themes.
     * Optional but recommended fields to improve the quality of the suggestion:
     * business_setting and geo_target.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo suggestion_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the suggestionInfo field is set.
     */
    public boolean hasSuggestionInfo() {
      return suggestionInfoBuilder_ != null || suggestionInfo_ != null;
    }
    /**
     * <pre>
     * Required. Inputs used to suggest a Smart campaign ad.
     * Required fields: final_url, language_code, keyword_themes.
     * Optional but recommended fields to improve the quality of the suggestion:
     * business_setting and geo_target.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo suggestion_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The suggestionInfo.
     */
    public com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo getSuggestionInfo() {
      if (suggestionInfoBuilder_ == null) {
        return suggestionInfo_ == null ? com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo.getDefaultInstance() : suggestionInfo_;
      } else {
        return suggestionInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Inputs used to suggest a Smart campaign ad.
     * Required fields: final_url, language_code, keyword_themes.
     * Optional but recommended fields to improve the quality of the suggestion:
     * business_setting and geo_target.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo suggestion_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSuggestionInfo(com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo value) {
      if (suggestionInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        suggestionInfo_ = value;
        onChanged();
      } else {
        suggestionInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Inputs used to suggest a Smart campaign ad.
     * Required fields: final_url, language_code, keyword_themes.
     * Optional but recommended fields to improve the quality of the suggestion:
     * business_setting and geo_target.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo suggestion_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSuggestionInfo(
        com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo.Builder builderForValue) {
      if (suggestionInfoBuilder_ == null) {
        suggestionInfo_ = builderForValue.build();
        onChanged();
      } else {
        suggestionInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. Inputs used to suggest a Smart campaign ad.
     * Required fields: final_url, language_code, keyword_themes.
     * Optional but recommended fields to improve the quality of the suggestion:
     * business_setting and geo_target.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo suggestion_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeSuggestionInfo(com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo value) {
      if (suggestionInfoBuilder_ == null) {
        if (suggestionInfo_ != null) {
          suggestionInfo_ =
            com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo.newBuilder(suggestionInfo_).mergeFrom(value).buildPartial();
        } else {
          suggestionInfo_ = value;
        }
        onChanged();
      } else {
        suggestionInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Inputs used to suggest a Smart campaign ad.
     * Required fields: final_url, language_code, keyword_themes.
     * Optional but recommended fields to improve the quality of the suggestion:
     * business_setting and geo_target.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo suggestion_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearSuggestionInfo() {
      if (suggestionInfoBuilder_ == null) {
        suggestionInfo_ = null;
        onChanged();
      } else {
        suggestionInfo_ = null;
        suggestionInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. Inputs used to suggest a Smart campaign ad.
     * Required fields: final_url, language_code, keyword_themes.
     * Optional but recommended fields to improve the quality of the suggestion:
     * business_setting and geo_target.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo suggestion_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo.Builder getSuggestionInfoBuilder() {
      
      onChanged();
      return getSuggestionInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Inputs used to suggest a Smart campaign ad.
     * Required fields: final_url, language_code, keyword_themes.
     * Optional but recommended fields to improve the quality of the suggestion:
     * business_setting and geo_target.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo suggestion_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfoOrBuilder getSuggestionInfoOrBuilder() {
      if (suggestionInfoBuilder_ != null) {
        return suggestionInfoBuilder_.getMessageOrBuilder();
      } else {
        return suggestionInfo_ == null ?
            com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo.getDefaultInstance() : suggestionInfo_;
      }
    }
    /**
     * <pre>
     * Required. Inputs used to suggest a Smart campaign ad.
     * Required fields: final_url, language_code, keyword_themes.
     * Optional but recommended fields to improve the quality of the suggestion:
     * business_setting and geo_target.
     * </pre>
     *
     * <code>.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo suggestion_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo, com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo.Builder, com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfoOrBuilder> 
        getSuggestionInfoFieldBuilder() {
      if (suggestionInfoBuilder_ == null) {
        suggestionInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo, com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo.Builder, com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfoOrBuilder>(
                getSuggestionInfo(),
                getParentForChildren(),
                isClean());
        suggestionInfo_ = null;
      }
      return suggestionInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest)
  private static final com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest();
  }

  public static com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SuggestSmartCampaignAdRequest>
      PARSER = new com.google.protobuf.AbstractParser<SuggestSmartCampaignAdRequest>() {
    @java.lang.Override
    public SuggestSmartCampaignAdRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SuggestSmartCampaignAdRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SuggestSmartCampaignAdRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SuggestSmartCampaignAdRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v8.services.SuggestSmartCampaignAdRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

