// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/campaign_experiment_service.proto

package com.google.ads.googleads.v7.services;

/**
 * <pre>
 * Message used as metadata returned in Long Running Operations for
 * CreateCampaignExperimentRequest
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v7.services.CreateCampaignExperimentMetadata}
 */
public final class CreateCampaignExperimentMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v7.services.CreateCampaignExperimentMetadata)
    CreateCampaignExperimentMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateCampaignExperimentMetadata.newBuilder() to construct.
  private CreateCampaignExperimentMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateCampaignExperimentMetadata() {
    campaignExperiment_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateCampaignExperimentMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateCampaignExperimentMetadata(
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

            campaignExperiment_ = s;
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
    return com.google.ads.googleads.v7.services.CampaignExperimentServiceProto.internal_static_google_ads_googleads_v7_services_CreateCampaignExperimentMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v7.services.CampaignExperimentServiceProto.internal_static_google_ads_googleads_v7_services_CreateCampaignExperimentMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata.class, com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata.Builder.class);
  }

  public static final int CAMPAIGN_EXPERIMENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object campaignExperiment_;
  /**
   * <pre>
   * Resource name of campaign experiment created.
   * </pre>
   *
   * <code>string campaign_experiment = 1;</code>
   * @return The campaignExperiment.
   */
  @java.lang.Override
  public java.lang.String getCampaignExperiment() {
    java.lang.Object ref = campaignExperiment_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      campaignExperiment_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Resource name of campaign experiment created.
   * </pre>
   *
   * <code>string campaign_experiment = 1;</code>
   * @return The bytes for campaignExperiment.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCampaignExperimentBytes() {
    java.lang.Object ref = campaignExperiment_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      campaignExperiment_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(campaignExperiment_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, campaignExperiment_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(campaignExperiment_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, campaignExperiment_);
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
    if (!(obj instanceof com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata other = (com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata) obj;

    if (!getCampaignExperiment()
        .equals(other.getCampaignExperiment())) return false;
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
    hash = (37 * hash) + CAMPAIGN_EXPERIMENT_FIELD_NUMBER;
    hash = (53 * hash) + getCampaignExperiment().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata prototype) {
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
   * Message used as metadata returned in Long Running Operations for
   * CreateCampaignExperimentRequest
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v7.services.CreateCampaignExperimentMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v7.services.CreateCampaignExperimentMetadata)
      com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v7.services.CampaignExperimentServiceProto.internal_static_google_ads_googleads_v7_services_CreateCampaignExperimentMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v7.services.CampaignExperimentServiceProto.internal_static_google_ads_googleads_v7_services_CreateCampaignExperimentMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata.class, com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata.Builder.class);
    }

    // Construct using com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata.newBuilder()
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
      campaignExperiment_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v7.services.CampaignExperimentServiceProto.internal_static_google_ads_googleads_v7_services_CreateCampaignExperimentMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata getDefaultInstanceForType() {
      return com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata build() {
      com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata buildPartial() {
      com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata result = new com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata(this);
      result.campaignExperiment_ = campaignExperiment_;
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
      if (other instanceof com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata) {
        return mergeFrom((com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata other) {
      if (other == com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata.getDefaultInstance()) return this;
      if (!other.getCampaignExperiment().isEmpty()) {
        campaignExperiment_ = other.campaignExperiment_;
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
      com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object campaignExperiment_ = "";
    /**
     * <pre>
     * Resource name of campaign experiment created.
     * </pre>
     *
     * <code>string campaign_experiment = 1;</code>
     * @return The campaignExperiment.
     */
    public java.lang.String getCampaignExperiment() {
      java.lang.Object ref = campaignExperiment_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        campaignExperiment_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Resource name of campaign experiment created.
     * </pre>
     *
     * <code>string campaign_experiment = 1;</code>
     * @return The bytes for campaignExperiment.
     */
    public com.google.protobuf.ByteString
        getCampaignExperimentBytes() {
      java.lang.Object ref = campaignExperiment_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        campaignExperiment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Resource name of campaign experiment created.
     * </pre>
     *
     * <code>string campaign_experiment = 1;</code>
     * @param value The campaignExperiment to set.
     * @return This builder for chaining.
     */
    public Builder setCampaignExperiment(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      campaignExperiment_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name of campaign experiment created.
     * </pre>
     *
     * <code>string campaign_experiment = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCampaignExperiment() {
      
      campaignExperiment_ = getDefaultInstance().getCampaignExperiment();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name of campaign experiment created.
     * </pre>
     *
     * <code>string campaign_experiment = 1;</code>
     * @param value The bytes for campaignExperiment to set.
     * @return This builder for chaining.
     */
    public Builder setCampaignExperimentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      campaignExperiment_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v7.services.CreateCampaignExperimentMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.CreateCampaignExperimentMetadata)
  private static final com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata();
  }

  public static com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCampaignExperimentMetadata>
      PARSER = new com.google.protobuf.AbstractParser<CreateCampaignExperimentMetadata>() {
    @java.lang.Override
    public CreateCampaignExperimentMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateCampaignExperimentMetadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateCampaignExperimentMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCampaignExperimentMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v7.services.CreateCampaignExperimentMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

