// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/enums/account_budget_proposal_type.proto

package com.google.ads.googleads.v0.enums;

/**
 * <pre>
 * Message describing AccountBudgetProposal types.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum}
 */
public  final class AccountBudgetProposalTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum)
    AccountBudgetProposalTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AccountBudgetProposalTypeEnum.newBuilder() to construct.
  private AccountBudgetProposalTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AccountBudgetProposalTypeEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AccountBudgetProposalTypeEnum(
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
          default: {
            if (!parseUnknownFieldProto3(
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
    return com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeProto.internal_static_google_ads_googleads_v0_enums_AccountBudgetProposalTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeProto.internal_static_google_ads_googleads_v0_enums_AccountBudgetProposalTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum.class, com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * The possible types of an AccountBudgetProposal.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum.AccountBudgetProposalType}
   */
  public enum AccountBudgetProposalType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Identifies a request to create a new budget.
     * </pre>
     *
     * <code>CREATE = 2;</code>
     */
    CREATE(2),
    /**
     * <pre>
     * Identifies a request to edit an existing budget.
     * </pre>
     *
     * <code>UPDATE = 3;</code>
     */
    UPDATE(3),
    /**
     * <pre>
     * Identifies a request to end a budget that has already started.
     * </pre>
     *
     * <code>END = 4;</code>
     */
    END(4),
    /**
     * <pre>
     * Identifies a request to remove a budget that hasn't started yet.
     * </pre>
     *
     * <code>REMOVE = 5;</code>
     */
    REMOVE(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Identifies a request to create a new budget.
     * </pre>
     *
     * <code>CREATE = 2;</code>
     */
    public static final int CREATE_VALUE = 2;
    /**
     * <pre>
     * Identifies a request to edit an existing budget.
     * </pre>
     *
     * <code>UPDATE = 3;</code>
     */
    public static final int UPDATE_VALUE = 3;
    /**
     * <pre>
     * Identifies a request to end a budget that has already started.
     * </pre>
     *
     * <code>END = 4;</code>
     */
    public static final int END_VALUE = 4;
    /**
     * <pre>
     * Identifies a request to remove a budget that hasn't started yet.
     * </pre>
     *
     * <code>REMOVE = 5;</code>
     */
    public static final int REMOVE_VALUE = 5;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AccountBudgetProposalType valueOf(int value) {
      return forNumber(value);
    }

    public static AccountBudgetProposalType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return CREATE;
        case 3: return UPDATE;
        case 4: return END;
        case 5: return REMOVE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AccountBudgetProposalType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AccountBudgetProposalType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AccountBudgetProposalType>() {
            public AccountBudgetProposalType findValueByNumber(int number) {
              return AccountBudgetProposalType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AccountBudgetProposalType[] VALUES = values();

    public static AccountBudgetProposalType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AccountBudgetProposalType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum.AccountBudgetProposalType)
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum other = (com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum) obj;

    boolean result = true;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum prototype) {
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
   * Message describing AccountBudgetProposal types.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum)
      com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeProto.internal_static_google_ads_googleads_v0_enums_AccountBudgetProposalTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeProto.internal_static_google_ads_googleads_v0_enums_AccountBudgetProposalTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum.class, com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeProto.internal_static_google_ads_googleads_v0_enums_AccountBudgetProposalTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum build() {
      com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum buildPartial() {
      com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum result = new com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum other) {
      if (other == com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum)
  private static final com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum();
  }

  public static com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccountBudgetProposalTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<AccountBudgetProposalTypeEnum>() {
    @java.lang.Override
    public AccountBudgetProposalTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AccountBudgetProposalTypeEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AccountBudgetProposalTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccountBudgetProposalTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v0.enums.AccountBudgetProposalTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

