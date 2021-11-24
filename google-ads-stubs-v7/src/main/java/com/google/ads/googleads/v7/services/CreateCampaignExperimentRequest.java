// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/campaign_experiment_service.proto

package com.google.ads.googleads.v7.services;

/**
 * <pre>
 * Request message for [CampaignExperimentService.CreateCampaignExperiment][google.ads.googleads.v7.services.CampaignExperimentService.CreateCampaignExperiment].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v7.services.CreateCampaignExperimentRequest}
 */
public final class CreateCampaignExperimentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v7.services.CreateCampaignExperimentRequest)
    CreateCampaignExperimentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateCampaignExperimentRequest.newBuilder() to construct.
  private CreateCampaignExperimentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateCampaignExperimentRequest() {
    customerId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateCampaignExperimentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateCampaignExperimentRequest(
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
            com.google.ads.googleads.v7.resources.CampaignExperiment.Builder subBuilder = null;
            if (campaignExperiment_ != null) {
              subBuilder = campaignExperiment_.toBuilder();
            }
            campaignExperiment_ = input.readMessage(com.google.ads.googleads.v7.resources.CampaignExperiment.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(campaignExperiment_);
              campaignExperiment_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            validateOnly_ = input.readBool();
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
    return com.google.ads.googleads.v7.services.CampaignExperimentServiceProto.internal_static_google_ads_googleads_v7_services_CreateCampaignExperimentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v7.services.CampaignExperimentServiceProto.internal_static_google_ads_googleads_v7_services_CreateCampaignExperimentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest.class, com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest.Builder.class);
  }

  public static final int CUSTOMER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object customerId_;
  /**
   * <pre>
   * Required. The ID of the customer whose campaign experiment is being created.
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
   * Required. The ID of the customer whose campaign experiment is being created.
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

  public static final int CAMPAIGN_EXPERIMENT_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v7.resources.CampaignExperiment campaignExperiment_;
  /**
   * <pre>
   * Required. The campaign experiment to be created.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.CampaignExperiment campaign_experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the campaignExperiment field is set.
   */
  @java.lang.Override
  public boolean hasCampaignExperiment() {
    return campaignExperiment_ != null;
  }
  /**
   * <pre>
   * Required. The campaign experiment to be created.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.CampaignExperiment campaign_experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The campaignExperiment.
   */
  @java.lang.Override
  public com.google.ads.googleads.v7.resources.CampaignExperiment getCampaignExperiment() {
    return campaignExperiment_ == null ? com.google.ads.googleads.v7.resources.CampaignExperiment.getDefaultInstance() : campaignExperiment_;
  }
  /**
   * <pre>
   * Required. The campaign experiment to be created.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.resources.CampaignExperiment campaign_experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v7.resources.CampaignExperimentOrBuilder getCampaignExperimentOrBuilder() {
    return getCampaignExperiment();
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 3;
  private boolean validateOnly_;
  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
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
    if (campaignExperiment_ != null) {
      output.writeMessage(2, getCampaignExperiment());
    }
    if (validateOnly_ != false) {
      output.writeBool(3, validateOnly_);
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
    if (campaignExperiment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCampaignExperiment());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, validateOnly_);
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
    if (!(obj instanceof com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest other = (com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest) obj;

    if (!getCustomerId()
        .equals(other.getCustomerId())) return false;
    if (hasCampaignExperiment() != other.hasCampaignExperiment()) return false;
    if (hasCampaignExperiment()) {
      if (!getCampaignExperiment()
          .equals(other.getCampaignExperiment())) return false;
    }
    if (getValidateOnly()
        != other.getValidateOnly()) return false;
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
    if (hasCampaignExperiment()) {
      hash = (37 * hash) + CAMPAIGN_EXPERIMENT_FIELD_NUMBER;
      hash = (53 * hash) + getCampaignExperiment().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getValidateOnly());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest prototype) {
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
   * Request message for [CampaignExperimentService.CreateCampaignExperiment][google.ads.googleads.v7.services.CampaignExperimentService.CreateCampaignExperiment].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v7.services.CreateCampaignExperimentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v7.services.CreateCampaignExperimentRequest)
      com.google.ads.googleads.v7.services.CreateCampaignExperimentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v7.services.CampaignExperimentServiceProto.internal_static_google_ads_googleads_v7_services_CreateCampaignExperimentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v7.services.CampaignExperimentServiceProto.internal_static_google_ads_googleads_v7_services_CreateCampaignExperimentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest.class, com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest.Builder.class);
    }

    // Construct using com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest.newBuilder()
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

      if (campaignExperimentBuilder_ == null) {
        campaignExperiment_ = null;
      } else {
        campaignExperiment_ = null;
        campaignExperimentBuilder_ = null;
      }
      validateOnly_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v7.services.CampaignExperimentServiceProto.internal_static_google_ads_googleads_v7_services_CreateCampaignExperimentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest getDefaultInstanceForType() {
      return com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest build() {
      com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest buildPartial() {
      com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest result = new com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest(this);
      result.customerId_ = customerId_;
      if (campaignExperimentBuilder_ == null) {
        result.campaignExperiment_ = campaignExperiment_;
      } else {
        result.campaignExperiment_ = campaignExperimentBuilder_.build();
      }
      result.validateOnly_ = validateOnly_;
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
      if (other instanceof com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest) {
        return mergeFrom((com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest other) {
      if (other == com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest.getDefaultInstance()) return this;
      if (!other.getCustomerId().isEmpty()) {
        customerId_ = other.customerId_;
        onChanged();
      }
      if (other.hasCampaignExperiment()) {
        mergeCampaignExperiment(other.getCampaignExperiment());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
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
      com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest) e.getUnfinishedMessage();
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
     * Required. The ID of the customer whose campaign experiment is being created.
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
     * Required. The ID of the customer whose campaign experiment is being created.
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
     * Required. The ID of the customer whose campaign experiment is being created.
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
     * Required. The ID of the customer whose campaign experiment is being created.
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
     * Required. The ID of the customer whose campaign experiment is being created.
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

    private com.google.ads.googleads.v7.resources.CampaignExperiment campaignExperiment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v7.resources.CampaignExperiment, com.google.ads.googleads.v7.resources.CampaignExperiment.Builder, com.google.ads.googleads.v7.resources.CampaignExperimentOrBuilder> campaignExperimentBuilder_;
    /**
     * <pre>
     * Required. The campaign experiment to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignExperiment campaign_experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the campaignExperiment field is set.
     */
    public boolean hasCampaignExperiment() {
      return campaignExperimentBuilder_ != null || campaignExperiment_ != null;
    }
    /**
     * <pre>
     * Required. The campaign experiment to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignExperiment campaign_experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The campaignExperiment.
     */
    public com.google.ads.googleads.v7.resources.CampaignExperiment getCampaignExperiment() {
      if (campaignExperimentBuilder_ == null) {
        return campaignExperiment_ == null ? com.google.ads.googleads.v7.resources.CampaignExperiment.getDefaultInstance() : campaignExperiment_;
      } else {
        return campaignExperimentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The campaign experiment to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignExperiment campaign_experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setCampaignExperiment(com.google.ads.googleads.v7.resources.CampaignExperiment value) {
      if (campaignExperimentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        campaignExperiment_ = value;
        onChanged();
      } else {
        campaignExperimentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The campaign experiment to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignExperiment campaign_experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setCampaignExperiment(
        com.google.ads.googleads.v7.resources.CampaignExperiment.Builder builderForValue) {
      if (campaignExperimentBuilder_ == null) {
        campaignExperiment_ = builderForValue.build();
        onChanged();
      } else {
        campaignExperimentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The campaign experiment to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignExperiment campaign_experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeCampaignExperiment(com.google.ads.googleads.v7.resources.CampaignExperiment value) {
      if (campaignExperimentBuilder_ == null) {
        if (campaignExperiment_ != null) {
          campaignExperiment_ =
            com.google.ads.googleads.v7.resources.CampaignExperiment.newBuilder(campaignExperiment_).mergeFrom(value).buildPartial();
        } else {
          campaignExperiment_ = value;
        }
        onChanged();
      } else {
        campaignExperimentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The campaign experiment to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignExperiment campaign_experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearCampaignExperiment() {
      if (campaignExperimentBuilder_ == null) {
        campaignExperiment_ = null;
        onChanged();
      } else {
        campaignExperiment_ = null;
        campaignExperimentBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The campaign experiment to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignExperiment campaign_experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v7.resources.CampaignExperiment.Builder getCampaignExperimentBuilder() {
      
      onChanged();
      return getCampaignExperimentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The campaign experiment to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignExperiment campaign_experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v7.resources.CampaignExperimentOrBuilder getCampaignExperimentOrBuilder() {
      if (campaignExperimentBuilder_ != null) {
        return campaignExperimentBuilder_.getMessageOrBuilder();
      } else {
        return campaignExperiment_ == null ?
            com.google.ads.googleads.v7.resources.CampaignExperiment.getDefaultInstance() : campaignExperiment_;
      }
    }
    /**
     * <pre>
     * Required. The campaign experiment to be created.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.resources.CampaignExperiment campaign_experiment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v7.resources.CampaignExperiment, com.google.ads.googleads.v7.resources.CampaignExperiment.Builder, com.google.ads.googleads.v7.resources.CampaignExperimentOrBuilder> 
        getCampaignExperimentFieldBuilder() {
      if (campaignExperimentBuilder_ == null) {
        campaignExperimentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v7.resources.CampaignExperiment, com.google.ads.googleads.v7.resources.CampaignExperiment.Builder, com.google.ads.googleads.v7.resources.CampaignExperimentOrBuilder>(
                getCampaignExperiment(),
                getParentForChildren(),
                isClean());
        campaignExperiment_ = null;
      }
      return campaignExperimentBuilder_;
    }

    private boolean validateOnly_ ;
    /**
     * <pre>
     * If true, the request is validated but not executed. Only errors are
     * returned, not results.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     * <pre>
     * If true, the request is validated but not executed. Only errors are
     * returned, not results.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {
      
      validateOnly_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, the request is validated but not executed. Only errors are
     * returned, not results.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      
      validateOnly_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v7.services.CreateCampaignExperimentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.CreateCampaignExperimentRequest)
  private static final com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest();
  }

  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCampaignExperimentRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateCampaignExperimentRequest>() {
    @java.lang.Override
    public CreateCampaignExperimentRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateCampaignExperimentRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateCampaignExperimentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCampaignExperimentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v7.services.CreateCampaignExperimentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

