// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/services/conversion_upload_service.proto

package com.google.ads.googleads.v8.services;

public interface ClickConversionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.services.ClickConversion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Google click ID (gclid) associated with this conversion.
   * </pre>
   *
   * <code>optional string gclid = 9;</code>
   * @return Whether the gclid field is set.
   */
  boolean hasGclid();
  /**
   * <pre>
   * The Google click ID (gclid) associated with this conversion.
   * </pre>
   *
   * <code>optional string gclid = 9;</code>
   * @return The gclid.
   */
  java.lang.String getGclid();
  /**
   * <pre>
   * The Google click ID (gclid) associated with this conversion.
   * </pre>
   *
   * <code>optional string gclid = 9;</code>
   * @return The bytes for gclid.
   */
  com.google.protobuf.ByteString
      getGclidBytes();

  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion.
   * Note: Although this resource name consists of a customer id and a
   * conversion action id, validation will ignore the customer id and use the
   * conversion action id as the sole identifier of the conversion action.
   * </pre>
   *
   * <code>optional string conversion_action = 10;</code>
   * @return Whether the conversionAction field is set.
   */
  boolean hasConversionAction();
  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion.
   * Note: Although this resource name consists of a customer id and a
   * conversion action id, validation will ignore the customer id and use the
   * conversion action id as the sole identifier of the conversion action.
   * </pre>
   *
   * <code>optional string conversion_action = 10;</code>
   * @return The conversionAction.
   */
  java.lang.String getConversionAction();
  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion.
   * Note: Although this resource name consists of a customer id and a
   * conversion action id, validation will ignore the customer id and use the
   * conversion action id as the sole identifier of the conversion action.
   * </pre>
   *
   * <code>optional string conversion_action = 10;</code>
   * @return The bytes for conversionAction.
   */
  com.google.protobuf.ByteString
      getConversionActionBytes();

  /**
   * <pre>
   * The date time at which the conversion occurred. Must be after
   * the click time. The timezone must be specified. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. “2019-01-01 12:32:45-08:00”.
   * </pre>
   *
   * <code>optional string conversion_date_time = 11;</code>
   * @return Whether the conversionDateTime field is set.
   */
  boolean hasConversionDateTime();
  /**
   * <pre>
   * The date time at which the conversion occurred. Must be after
   * the click time. The timezone must be specified. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. “2019-01-01 12:32:45-08:00”.
   * </pre>
   *
   * <code>optional string conversion_date_time = 11;</code>
   * @return The conversionDateTime.
   */
  java.lang.String getConversionDateTime();
  /**
   * <pre>
   * The date time at which the conversion occurred. Must be after
   * the click time. The timezone must be specified. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. “2019-01-01 12:32:45-08:00”.
   * </pre>
   *
   * <code>optional string conversion_date_time = 11;</code>
   * @return The bytes for conversionDateTime.
   */
  com.google.protobuf.ByteString
      getConversionDateTimeBytes();

  /**
   * <pre>
   * The value of the conversion for the advertiser.
   * </pre>
   *
   * <code>optional double conversion_value = 12;</code>
   * @return Whether the conversionValue field is set.
   */
  boolean hasConversionValue();
  /**
   * <pre>
   * The value of the conversion for the advertiser.
   * </pre>
   *
   * <code>optional double conversion_value = 12;</code>
   * @return The conversionValue.
   */
  double getConversionValue();

  /**
   * <pre>
   * Currency associated with the conversion value. This is the ISO 4217
   * 3-character currency code. For example: USD, EUR.
   * </pre>
   *
   * <code>optional string currency_code = 13;</code>
   * @return Whether the currencyCode field is set.
   */
  boolean hasCurrencyCode();
  /**
   * <pre>
   * Currency associated with the conversion value. This is the ISO 4217
   * 3-character currency code. For example: USD, EUR.
   * </pre>
   *
   * <code>optional string currency_code = 13;</code>
   * @return The currencyCode.
   */
  java.lang.String getCurrencyCode();
  /**
   * <pre>
   * Currency associated with the conversion value. This is the ISO 4217
   * 3-character currency code. For example: USD, EUR.
   * </pre>
   *
   * <code>optional string currency_code = 13;</code>
   * @return The bytes for currencyCode.
   */
  com.google.protobuf.ByteString
      getCurrencyCodeBytes();

  /**
   * <pre>
   * The order ID associated with the conversion. An order id can only be used
   * for one conversion per conversion action.
   * </pre>
   *
   * <code>optional string order_id = 14;</code>
   * @return Whether the orderId field is set.
   */
  boolean hasOrderId();
  /**
   * <pre>
   * The order ID associated with the conversion. An order id can only be used
   * for one conversion per conversion action.
   * </pre>
   *
   * <code>optional string order_id = 14;</code>
   * @return The orderId.
   */
  java.lang.String getOrderId();
  /**
   * <pre>
   * The order ID associated with the conversion. An order id can only be used
   * for one conversion per conversion action.
   * </pre>
   *
   * <code>optional string order_id = 14;</code>
   * @return The bytes for orderId.
   */
  com.google.protobuf.ByteString
      getOrderIdBytes();

  /**
   * <pre>
   * Additional data about externally attributed conversions. This field
   * is required for conversions with an externally attributed conversion
   * action, but should not be set otherwise.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.ExternalAttributionData external_attribution_data = 7;</code>
   * @return Whether the externalAttributionData field is set.
   */
  boolean hasExternalAttributionData();
  /**
   * <pre>
   * Additional data about externally attributed conversions. This field
   * is required for conversions with an externally attributed conversion
   * action, but should not be set otherwise.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.ExternalAttributionData external_attribution_data = 7;</code>
   * @return The externalAttributionData.
   */
  com.google.ads.googleads.v8.services.ExternalAttributionData getExternalAttributionData();
  /**
   * <pre>
   * Additional data about externally attributed conversions. This field
   * is required for conversions with an externally attributed conversion
   * action, but should not be set otherwise.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.ExternalAttributionData external_attribution_data = 7;</code>
   */
  com.google.ads.googleads.v8.services.ExternalAttributionDataOrBuilder getExternalAttributionDataOrBuilder();

  /**
   * <pre>
   * The custom variables associated with this conversion.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.services.CustomVariable custom_variables = 15;</code>
   */
  java.util.List<com.google.ads.googleads.v8.services.CustomVariable> 
      getCustomVariablesList();
  /**
   * <pre>
   * The custom variables associated with this conversion.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.services.CustomVariable custom_variables = 15;</code>
   */
  com.google.ads.googleads.v8.services.CustomVariable getCustomVariables(int index);
  /**
   * <pre>
   * The custom variables associated with this conversion.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.services.CustomVariable custom_variables = 15;</code>
   */
  int getCustomVariablesCount();
  /**
   * <pre>
   * The custom variables associated with this conversion.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.services.CustomVariable custom_variables = 15;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v8.services.CustomVariableOrBuilder> 
      getCustomVariablesOrBuilderList();
  /**
   * <pre>
   * The custom variables associated with this conversion.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.services.CustomVariable custom_variables = 15;</code>
   */
  com.google.ads.googleads.v8.services.CustomVariableOrBuilder getCustomVariablesOrBuilder(
      int index);

  /**
   * <pre>
   * The cart data associated with this conversion.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.CartData cart_data = 16;</code>
   * @return Whether the cartData field is set.
   */
  boolean hasCartData();
  /**
   * <pre>
   * The cart data associated with this conversion.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.CartData cart_data = 16;</code>
   * @return The cartData.
   */
  com.google.ads.googleads.v8.services.CartData getCartData();
  /**
   * <pre>
   * The cart data associated with this conversion.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.CartData cart_data = 16;</code>
   */
  com.google.ads.googleads.v8.services.CartDataOrBuilder getCartDataOrBuilder();

  /**
   * <pre>
   * The user identifiers associated with this conversion. Only hashed_email and
   * hashed_phone_number are supported for conversion uploads. The maximum
   * number of user identifiers for each conversion is 5.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.UserIdentifier user_identifiers = 17;</code>
   */
  java.util.List<com.google.ads.googleads.v8.common.UserIdentifier> 
      getUserIdentifiersList();
  /**
   * <pre>
   * The user identifiers associated with this conversion. Only hashed_email and
   * hashed_phone_number are supported for conversion uploads. The maximum
   * number of user identifiers for each conversion is 5.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.UserIdentifier user_identifiers = 17;</code>
   */
  com.google.ads.googleads.v8.common.UserIdentifier getUserIdentifiers(int index);
  /**
   * <pre>
   * The user identifiers associated with this conversion. Only hashed_email and
   * hashed_phone_number are supported for conversion uploads. The maximum
   * number of user identifiers for each conversion is 5.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.UserIdentifier user_identifiers = 17;</code>
   */
  int getUserIdentifiersCount();
  /**
   * <pre>
   * The user identifiers associated with this conversion. Only hashed_email and
   * hashed_phone_number are supported for conversion uploads. The maximum
   * number of user identifiers for each conversion is 5.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.UserIdentifier user_identifiers = 17;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v8.common.UserIdentifierOrBuilder> 
      getUserIdentifiersOrBuilderList();
  /**
   * <pre>
   * The user identifiers associated with this conversion. Only hashed_email and
   * hashed_phone_number are supported for conversion uploads. The maximum
   * number of user identifiers for each conversion is 5.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.UserIdentifier user_identifiers = 17;</code>
   */
  com.google.ads.googleads.v8.common.UserIdentifierOrBuilder getUserIdentifiersOrBuilder(
      int index);
}
