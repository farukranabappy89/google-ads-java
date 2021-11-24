// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/campaign_extension_setting_service.proto

package com.google.ads.googleads.v7.services;

/**
 * <pre>
 * The result for the campaign extension setting mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult}
 */
public final class MutateCampaignExtensionSettingResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult)
    MutateCampaignExtensionSettingResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateCampaignExtensionSettingResult.newBuilder() to construct.
  private MutateCampaignExtensionSettingResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateCampaignExtensionSettingResult() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateCampaignExtensionSettingResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutateCampaignExtensionSettingResult(
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

            resourceName_ = s;
            break;
          }
          case 18: {
            com.google.ads.googleads.v7.resources.CampaignExtensionSetting.Builder subBuilder = null;
            if (campaignExtensionSetting_ != null) {
              subBuilder = campaignExtensionSetting_.toBuilder();
            }
            campaignExtensionSetting_ = input.readMessage(com.google.ads.googleads.v7.resources.CampaignExtensionSetting.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(campaignExtensionSetting_);
              campaignExtensionSetting_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v7.services.CampaignExtensionSettingServiceProto.internal_static_google_ads_googleads_v7_services_MutateCampaignExtensionSettingResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v7.services.CampaignExtensionSettingServiceProto.internal_static_google_ads_googleads_v7_services_MutateCampaignExtensionSettingResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult.class, com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CAMPAIGN_EXTENSION_SETTING_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v7.resources.CampaignExtensionSetting campaignExtensionSetting_;
  /**
   * <pre>
   * The mutated campaign extension setting with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.CampaignExtensionSetting campaign_extension_setting = 2;</code>
   * @return Whether the campaignExtensionSetting field is set.
   */
  @java.lang.Override
  public boolean hasCampaignExtensionSetting() {
    return campaignExtensionSetting_ != null;
  }
  /**
   * <pre>
   * The mutated campaign extension setting with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.CampaignExtensionSetting campaign_extension_setting = 2;</code>
   * @return The campaignExtensionSetting.
   */
  @java.lang.Override
  public com.google.ads.googleads.v7.resources.CampaignExtensionSetting getCampaignExtensionSetting() {
    return campaignExtensionSetting_ == null ? com.google.ads.googleads.v7.resources.CampaignExtensionSetting.getDefaultInstance() : campaignExtensionSetting_;
  }
  /**
   * <pre>
   * The mutated campaign extension setting with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.CampaignExtensionSetting campaign_extension_setting = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v7.resources.CampaignExtensionSettingOrBuilder getCampaignExtensionSettingOrBuilder() {
    return getCampaignExtensionSetting();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (campaignExtensionSetting_ != null) {
      output.writeMessage(2, getCampaignExtensionSetting());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (campaignExtensionSetting_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCampaignExtensionSetting());
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
    if (!(obj instanceof com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult other = (com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasCampaignExtensionSetting() != other.hasCampaignExtensionSetting()) return false;
    if (hasCampaignExtensionSetting()) {
      if (!getCampaignExtensionSetting()
          .equals(other.getCampaignExtensionSetting())) return false;
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    if (hasCampaignExtensionSetting()) {
      hash = (37 * hash) + CAMPAIGN_EXTENSION_SETTING_FIELD_NUMBER;
      hash = (53 * hash) + getCampaignExtensionSetting().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult prototype) {
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
   * The result for the campaign extension setting mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult)
      com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v7.services.CampaignExtensionSettingServiceProto.internal_static_google_ads_googleads_v7_services_MutateCampaignExtensionSettingResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v7.services.CampaignExtensionSettingServiceProto.internal_static_google_ads_googleads_v7_services_MutateCampaignExtensionSettingResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult.class, com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult.newBuilder()
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
      resourceName_ = "";

      if (campaignExtensionSettingBuilder_ == null) {
        campaignExtensionSetting_ = null;
      } else {
        campaignExtensionSetting_ = null;
        campaignExtensionSettingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v7.services.CampaignExtensionSettingServiceProto.internal_static_google_ads_googleads_v7_services_MutateCampaignExtensionSettingResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult build() {
      com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult buildPartial() {
      com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult result = new com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult(this);
      result.resourceName_ = resourceName_;
      if (campaignExtensionSettingBuilder_ == null) {
        result.campaignExtensionSetting_ = campaignExtensionSetting_;
      } else {
        result.campaignExtensionSetting_ = campaignExtensionSettingBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult) {
        return mergeFrom((com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult other) {
      if (other == com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasCampaignExtensionSetting()) {
        mergeCampaignExtensionSetting(other.getCampaignExtensionSetting());
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
      com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1;</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceName_ = value;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v7.resources.CampaignExtensionSetting campaignExtensionSetting_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v7.resources.CampaignExtensionSetting, com.google.ads.googleads.v7.resources.CampaignExtensionSetting.Builder, com.google.ads.googleads.v7.resources.CampaignExtensionSettingOrBuilder> campaignExtensionSettingBuilder_;
    /**
     * <pre>
     * The mutated campaign extension setting with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignExtensionSetting campaign_extension_setting = 2;</code>
     * @return Whether the campaignExtensionSetting field is set.
     */
    public boolean hasCampaignExtensionSetting() {
      return campaignExtensionSettingBuilder_ != null || campaignExtensionSetting_ != null;
    }
    /**
     * <pre>
     * The mutated campaign extension setting with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignExtensionSetting campaign_extension_setting = 2;</code>
     * @return The campaignExtensionSetting.
     */
    public com.google.ads.googleads.v7.resources.CampaignExtensionSetting getCampaignExtensionSetting() {
      if (campaignExtensionSettingBuilder_ == null) {
        return campaignExtensionSetting_ == null ? com.google.ads.googleads.v7.resources.CampaignExtensionSetting.getDefaultInstance() : campaignExtensionSetting_;
      } else {
        return campaignExtensionSettingBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mutated campaign extension setting with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignExtensionSetting campaign_extension_setting = 2;</code>
     */
    public Builder setCampaignExtensionSetting(com.google.ads.googleads.v7.resources.CampaignExtensionSetting value) {
      if (campaignExtensionSettingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        campaignExtensionSetting_ = value;
        onChanged();
      } else {
        campaignExtensionSettingBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated campaign extension setting with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignExtensionSetting campaign_extension_setting = 2;</code>
     */
    public Builder setCampaignExtensionSetting(
        com.google.ads.googleads.v7.resources.CampaignExtensionSetting.Builder builderForValue) {
      if (campaignExtensionSettingBuilder_ == null) {
        campaignExtensionSetting_ = builderForValue.build();
        onChanged();
      } else {
        campaignExtensionSettingBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The mutated campaign extension setting with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignExtensionSetting campaign_extension_setting = 2;</code>
     */
    public Builder mergeCampaignExtensionSetting(com.google.ads.googleads.v7.resources.CampaignExtensionSetting value) {
      if (campaignExtensionSettingBuilder_ == null) {
        if (campaignExtensionSetting_ != null) {
          campaignExtensionSetting_ =
            com.google.ads.googleads.v7.resources.CampaignExtensionSetting.newBuilder(campaignExtensionSetting_).mergeFrom(value).buildPartial();
        } else {
          campaignExtensionSetting_ = value;
        }
        onChanged();
      } else {
        campaignExtensionSettingBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated campaign extension setting with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignExtensionSetting campaign_extension_setting = 2;</code>
     */
    public Builder clearCampaignExtensionSetting() {
      if (campaignExtensionSettingBuilder_ == null) {
        campaignExtensionSetting_ = null;
        onChanged();
      } else {
        campaignExtensionSetting_ = null;
        campaignExtensionSettingBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The mutated campaign extension setting with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignExtensionSetting campaign_extension_setting = 2;</code>
     */
    public com.google.ads.googleads.v7.resources.CampaignExtensionSetting.Builder getCampaignExtensionSettingBuilder() {
      
      onChanged();
      return getCampaignExtensionSettingFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mutated campaign extension setting with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignExtensionSetting campaign_extension_setting = 2;</code>
     */
    public com.google.ads.googleads.v7.resources.CampaignExtensionSettingOrBuilder getCampaignExtensionSettingOrBuilder() {
      if (campaignExtensionSettingBuilder_ != null) {
        return campaignExtensionSettingBuilder_.getMessageOrBuilder();
      } else {
        return campaignExtensionSetting_ == null ?
            com.google.ads.googleads.v7.resources.CampaignExtensionSetting.getDefaultInstance() : campaignExtensionSetting_;
      }
    }
    /**
     * <pre>
     * The mutated campaign extension setting with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignExtensionSetting campaign_extension_setting = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v7.resources.CampaignExtensionSetting, com.google.ads.googleads.v7.resources.CampaignExtensionSetting.Builder, com.google.ads.googleads.v7.resources.CampaignExtensionSettingOrBuilder> 
        getCampaignExtensionSettingFieldBuilder() {
      if (campaignExtensionSettingBuilder_ == null) {
        campaignExtensionSettingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v7.resources.CampaignExtensionSetting, com.google.ads.googleads.v7.resources.CampaignExtensionSetting.Builder, com.google.ads.googleads.v7.resources.CampaignExtensionSettingOrBuilder>(
                getCampaignExtensionSetting(),
                getParentForChildren(),
                isClean());
        campaignExtensionSetting_ = null;
      }
      return campaignExtensionSettingBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult)
  private static final com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult();
  }

  public static com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateCampaignExtensionSettingResult>
      PARSER = new com.google.protobuf.AbstractParser<MutateCampaignExtensionSettingResult>() {
    @java.lang.Override
    public MutateCampaignExtensionSettingResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutateCampaignExtensionSettingResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutateCampaignExtensionSettingResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateCampaignExtensionSettingResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v7.services.MutateCampaignExtensionSettingResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

