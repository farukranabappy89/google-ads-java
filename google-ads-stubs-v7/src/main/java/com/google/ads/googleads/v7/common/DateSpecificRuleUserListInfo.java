// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/common/user_lists.proto

package com.google.ads.googleads.v7.common;

/**
 * <pre>
 * Visitors of a page during specific dates.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v7.common.DateSpecificRuleUserListInfo}
 */
public final class DateSpecificRuleUserListInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v7.common.DateSpecificRuleUserListInfo)
    DateSpecificRuleUserListInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DateSpecificRuleUserListInfo.newBuilder() to construct.
  private DateSpecificRuleUserListInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DateSpecificRuleUserListInfo() {
    startDate_ = "";
    endDate_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DateSpecificRuleUserListInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DateSpecificRuleUserListInfo(
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
          case 10: {
            com.google.ads.googleads.v7.common.UserListRuleInfo.Builder subBuilder = null;
            if (rule_ != null) {
              subBuilder = rule_.toBuilder();
            }
            rule_ = input.readMessage(com.google.ads.googleads.v7.common.UserListRuleInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(rule_);
              rule_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            startDate_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000002;
            endDate_ = s;
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
    return com.google.ads.googleads.v7.common.UserListsProto.internal_static_google_ads_googleads_v7_common_DateSpecificRuleUserListInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v7.common.UserListsProto.internal_static_google_ads_googleads_v7_common_DateSpecificRuleUserListInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo.class, com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo.Builder.class);
  }

  private int bitField0_;
  public static final int RULE_FIELD_NUMBER = 1;
  private com.google.ads.googleads.v7.common.UserListRuleInfo rule_;
  /**
   * <pre>
   * Boolean rule that defines visitor of a page.
   * Required for creating a date specific rule user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.UserListRuleInfo rule = 1;</code>
   * @return Whether the rule field is set.
   */
  @java.lang.Override
  public boolean hasRule() {
    return rule_ != null;
  }
  /**
   * <pre>
   * Boolean rule that defines visitor of a page.
   * Required for creating a date specific rule user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.UserListRuleInfo rule = 1;</code>
   * @return The rule.
   */
  @java.lang.Override
  public com.google.ads.googleads.v7.common.UserListRuleInfo getRule() {
    return rule_ == null ? com.google.ads.googleads.v7.common.UserListRuleInfo.getDefaultInstance() : rule_;
  }
  /**
   * <pre>
   * Boolean rule that defines visitor of a page.
   * Required for creating a date specific rule user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.UserListRuleInfo rule = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v7.common.UserListRuleInfoOrBuilder getRuleOrBuilder() {
    return getRule();
  }

  public static final int START_DATE_FIELD_NUMBER = 4;
  private volatile java.lang.Object startDate_;
  /**
   * <pre>
   * Start date of users visit. If set to 2000-01-01, then the list includes all
   * users before end_date. The date's format should be YYYY-MM-DD.
   * Required for creating a data specific rule user list.
   * </pre>
   *
   * <code>optional string start_date = 4;</code>
   * @return Whether the startDate field is set.
   */
  @java.lang.Override
  public boolean hasStartDate() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Start date of users visit. If set to 2000-01-01, then the list includes all
   * users before end_date. The date's format should be YYYY-MM-DD.
   * Required for creating a data specific rule user list.
   * </pre>
   *
   * <code>optional string start_date = 4;</code>
   * @return The startDate.
   */
  @java.lang.Override
  public java.lang.String getStartDate() {
    java.lang.Object ref = startDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      startDate_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Start date of users visit. If set to 2000-01-01, then the list includes all
   * users before end_date. The date's format should be YYYY-MM-DD.
   * Required for creating a data specific rule user list.
   * </pre>
   *
   * <code>optional string start_date = 4;</code>
   * @return The bytes for startDate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStartDateBytes() {
    java.lang.Object ref = startDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      startDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int END_DATE_FIELD_NUMBER = 5;
  private volatile java.lang.Object endDate_;
  /**
   * <pre>
   * Last date of users visit. If set to 2037-12-30, then the list includes all
   * users after start_date. The date's format should be YYYY-MM-DD.
   * Required for creating a data specific rule user list.
   * </pre>
   *
   * <code>optional string end_date = 5;</code>
   * @return Whether the endDate field is set.
   */
  @java.lang.Override
  public boolean hasEndDate() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Last date of users visit. If set to 2037-12-30, then the list includes all
   * users after start_date. The date's format should be YYYY-MM-DD.
   * Required for creating a data specific rule user list.
   * </pre>
   *
   * <code>optional string end_date = 5;</code>
   * @return The endDate.
   */
  @java.lang.Override
  public java.lang.String getEndDate() {
    java.lang.Object ref = endDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      endDate_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Last date of users visit. If set to 2037-12-30, then the list includes all
   * users after start_date. The date's format should be YYYY-MM-DD.
   * Required for creating a data specific rule user list.
   * </pre>
   *
   * <code>optional string end_date = 5;</code>
   * @return The bytes for endDate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEndDateBytes() {
    java.lang.Object ref = endDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      endDate_ = b;
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
    if (rule_ != null) {
      output.writeMessage(1, getRule());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, startDate_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, endDate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rule_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRule());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, startDate_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, endDate_);
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
    if (!(obj instanceof com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo other = (com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo) obj;

    if (hasRule() != other.hasRule()) return false;
    if (hasRule()) {
      if (!getRule()
          .equals(other.getRule())) return false;
    }
    if (hasStartDate() != other.hasStartDate()) return false;
    if (hasStartDate()) {
      if (!getStartDate()
          .equals(other.getStartDate())) return false;
    }
    if (hasEndDate() != other.hasEndDate()) return false;
    if (hasEndDate()) {
      if (!getEndDate()
          .equals(other.getEndDate())) return false;
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
    if (hasRule()) {
      hash = (37 * hash) + RULE_FIELD_NUMBER;
      hash = (53 * hash) + getRule().hashCode();
    }
    if (hasStartDate()) {
      hash = (37 * hash) + START_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getStartDate().hashCode();
    }
    if (hasEndDate()) {
      hash = (37 * hash) + END_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getEndDate().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo prototype) {
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
   * Visitors of a page during specific dates.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v7.common.DateSpecificRuleUserListInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v7.common.DateSpecificRuleUserListInfo)
      com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v7.common.UserListsProto.internal_static_google_ads_googleads_v7_common_DateSpecificRuleUserListInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v7.common.UserListsProto.internal_static_google_ads_googleads_v7_common_DateSpecificRuleUserListInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo.class, com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo.newBuilder()
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
      if (ruleBuilder_ == null) {
        rule_ = null;
      } else {
        rule_ = null;
        ruleBuilder_ = null;
      }
      startDate_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      endDate_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v7.common.UserListsProto.internal_static_google_ads_googleads_v7_common_DateSpecificRuleUserListInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo build() {
      com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo buildPartial() {
      com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo result = new com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (ruleBuilder_ == null) {
        result.rule_ = rule_;
      } else {
        result.rule_ = ruleBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.startDate_ = startDate_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.endDate_ = endDate_;
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
      if (other instanceof com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo) {
        return mergeFrom((com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo other) {
      if (other == com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo.getDefaultInstance()) return this;
      if (other.hasRule()) {
        mergeRule(other.getRule());
      }
      if (other.hasStartDate()) {
        bitField0_ |= 0x00000001;
        startDate_ = other.startDate_;
        onChanged();
      }
      if (other.hasEndDate()) {
        bitField0_ |= 0x00000002;
        endDate_ = other.endDate_;
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
      com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.ads.googleads.v7.common.UserListRuleInfo rule_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v7.common.UserListRuleInfo, com.google.ads.googleads.v7.common.UserListRuleInfo.Builder, com.google.ads.googleads.v7.common.UserListRuleInfoOrBuilder> ruleBuilder_;
    /**
     * <pre>
     * Boolean rule that defines visitor of a page.
     * Required for creating a date specific rule user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.common.UserListRuleInfo rule = 1;</code>
     * @return Whether the rule field is set.
     */
    public boolean hasRule() {
      return ruleBuilder_ != null || rule_ != null;
    }
    /**
     * <pre>
     * Boolean rule that defines visitor of a page.
     * Required for creating a date specific rule user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.common.UserListRuleInfo rule = 1;</code>
     * @return The rule.
     */
    public com.google.ads.googleads.v7.common.UserListRuleInfo getRule() {
      if (ruleBuilder_ == null) {
        return rule_ == null ? com.google.ads.googleads.v7.common.UserListRuleInfo.getDefaultInstance() : rule_;
      } else {
        return ruleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Boolean rule that defines visitor of a page.
     * Required for creating a date specific rule user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.common.UserListRuleInfo rule = 1;</code>
     */
    public Builder setRule(com.google.ads.googleads.v7.common.UserListRuleInfo value) {
      if (ruleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rule_ = value;
        onChanged();
      } else {
        ruleBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Boolean rule that defines visitor of a page.
     * Required for creating a date specific rule user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.common.UserListRuleInfo rule = 1;</code>
     */
    public Builder setRule(
        com.google.ads.googleads.v7.common.UserListRuleInfo.Builder builderForValue) {
      if (ruleBuilder_ == null) {
        rule_ = builderForValue.build();
        onChanged();
      } else {
        ruleBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Boolean rule that defines visitor of a page.
     * Required for creating a date specific rule user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.common.UserListRuleInfo rule = 1;</code>
     */
    public Builder mergeRule(com.google.ads.googleads.v7.common.UserListRuleInfo value) {
      if (ruleBuilder_ == null) {
        if (rule_ != null) {
          rule_ =
            com.google.ads.googleads.v7.common.UserListRuleInfo.newBuilder(rule_).mergeFrom(value).buildPartial();
        } else {
          rule_ = value;
        }
        onChanged();
      } else {
        ruleBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Boolean rule that defines visitor of a page.
     * Required for creating a date specific rule user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.common.UserListRuleInfo rule = 1;</code>
     */
    public Builder clearRule() {
      if (ruleBuilder_ == null) {
        rule_ = null;
        onChanged();
      } else {
        rule_ = null;
        ruleBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Boolean rule that defines visitor of a page.
     * Required for creating a date specific rule user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.common.UserListRuleInfo rule = 1;</code>
     */
    public com.google.ads.googleads.v7.common.UserListRuleInfo.Builder getRuleBuilder() {
      
      onChanged();
      return getRuleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Boolean rule that defines visitor of a page.
     * Required for creating a date specific rule user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.common.UserListRuleInfo rule = 1;</code>
     */
    public com.google.ads.googleads.v7.common.UserListRuleInfoOrBuilder getRuleOrBuilder() {
      if (ruleBuilder_ != null) {
        return ruleBuilder_.getMessageOrBuilder();
      } else {
        return rule_ == null ?
            com.google.ads.googleads.v7.common.UserListRuleInfo.getDefaultInstance() : rule_;
      }
    }
    /**
     * <pre>
     * Boolean rule that defines visitor of a page.
     * Required for creating a date specific rule user list.
     * </pre>
     *
     * <code>.google.ads.googleads.v7.common.UserListRuleInfo rule = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v7.common.UserListRuleInfo, com.google.ads.googleads.v7.common.UserListRuleInfo.Builder, com.google.ads.googleads.v7.common.UserListRuleInfoOrBuilder> 
        getRuleFieldBuilder() {
      if (ruleBuilder_ == null) {
        ruleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v7.common.UserListRuleInfo, com.google.ads.googleads.v7.common.UserListRuleInfo.Builder, com.google.ads.googleads.v7.common.UserListRuleInfoOrBuilder>(
                getRule(),
                getParentForChildren(),
                isClean());
        rule_ = null;
      }
      return ruleBuilder_;
    }

    private java.lang.Object startDate_ = "";
    /**
     * <pre>
     * Start date of users visit. If set to 2000-01-01, then the list includes all
     * users before end_date. The date's format should be YYYY-MM-DD.
     * Required for creating a data specific rule user list.
     * </pre>
     *
     * <code>optional string start_date = 4;</code>
     * @return Whether the startDate field is set.
     */
    public boolean hasStartDate() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Start date of users visit. If set to 2000-01-01, then the list includes all
     * users before end_date. The date's format should be YYYY-MM-DD.
     * Required for creating a data specific rule user list.
     * </pre>
     *
     * <code>optional string start_date = 4;</code>
     * @return The startDate.
     */
    public java.lang.String getStartDate() {
      java.lang.Object ref = startDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        startDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Start date of users visit. If set to 2000-01-01, then the list includes all
     * users before end_date. The date's format should be YYYY-MM-DD.
     * Required for creating a data specific rule user list.
     * </pre>
     *
     * <code>optional string start_date = 4;</code>
     * @return The bytes for startDate.
     */
    public com.google.protobuf.ByteString
        getStartDateBytes() {
      java.lang.Object ref = startDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        startDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Start date of users visit. If set to 2000-01-01, then the list includes all
     * users before end_date. The date's format should be YYYY-MM-DD.
     * Required for creating a data specific rule user list.
     * </pre>
     *
     * <code>optional string start_date = 4;</code>
     * @param value The startDate to set.
     * @return This builder for chaining.
     */
    public Builder setStartDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      startDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Start date of users visit. If set to 2000-01-01, then the list includes all
     * users before end_date. The date's format should be YYYY-MM-DD.
     * Required for creating a data specific rule user list.
     * </pre>
     *
     * <code>optional string start_date = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartDate() {
      bitField0_ = (bitField0_ & ~0x00000001);
      startDate_ = getDefaultInstance().getStartDate();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Start date of users visit. If set to 2000-01-01, then the list includes all
     * users before end_date. The date's format should be YYYY-MM-DD.
     * Required for creating a data specific rule user list.
     * </pre>
     *
     * <code>optional string start_date = 4;</code>
     * @param value The bytes for startDate to set.
     * @return This builder for chaining.
     */
    public Builder setStartDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      startDate_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object endDate_ = "";
    /**
     * <pre>
     * Last date of users visit. If set to 2037-12-30, then the list includes all
     * users after start_date. The date's format should be YYYY-MM-DD.
     * Required for creating a data specific rule user list.
     * </pre>
     *
     * <code>optional string end_date = 5;</code>
     * @return Whether the endDate field is set.
     */
    public boolean hasEndDate() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Last date of users visit. If set to 2037-12-30, then the list includes all
     * users after start_date. The date's format should be YYYY-MM-DD.
     * Required for creating a data specific rule user list.
     * </pre>
     *
     * <code>optional string end_date = 5;</code>
     * @return The endDate.
     */
    public java.lang.String getEndDate() {
      java.lang.Object ref = endDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        endDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Last date of users visit. If set to 2037-12-30, then the list includes all
     * users after start_date. The date's format should be YYYY-MM-DD.
     * Required for creating a data specific rule user list.
     * </pre>
     *
     * <code>optional string end_date = 5;</code>
     * @return The bytes for endDate.
     */
    public com.google.protobuf.ByteString
        getEndDateBytes() {
      java.lang.Object ref = endDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        endDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Last date of users visit. If set to 2037-12-30, then the list includes all
     * users after start_date. The date's format should be YYYY-MM-DD.
     * Required for creating a data specific rule user list.
     * </pre>
     *
     * <code>optional string end_date = 5;</code>
     * @param value The endDate to set.
     * @return This builder for chaining.
     */
    public Builder setEndDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      endDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Last date of users visit. If set to 2037-12-30, then the list includes all
     * users after start_date. The date's format should be YYYY-MM-DD.
     * Required for creating a data specific rule user list.
     * </pre>
     *
     * <code>optional string end_date = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndDate() {
      bitField0_ = (bitField0_ & ~0x00000002);
      endDate_ = getDefaultInstance().getEndDate();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Last date of users visit. If set to 2037-12-30, then the list includes all
     * users after start_date. The date's format should be YYYY-MM-DD.
     * Required for creating a data specific rule user list.
     * </pre>
     *
     * <code>optional string end_date = 5;</code>
     * @param value The bytes for endDate to set.
     * @return This builder for chaining.
     */
    public Builder setEndDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      endDate_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v7.common.DateSpecificRuleUserListInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v7.common.DateSpecificRuleUserListInfo)
  private static final com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo();
  }

  public static com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DateSpecificRuleUserListInfo>
      PARSER = new com.google.protobuf.AbstractParser<DateSpecificRuleUserListInfo>() {
    @java.lang.Override
    public DateSpecificRuleUserListInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DateSpecificRuleUserListInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DateSpecificRuleUserListInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DateSpecificRuleUserListInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v7.common.DateSpecificRuleUserListInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

