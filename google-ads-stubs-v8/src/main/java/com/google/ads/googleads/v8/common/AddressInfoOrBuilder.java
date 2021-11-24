// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/common/criteria.proto

package com.google.ads.googleads.v8.common;

public interface AddressInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.common.AddressInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Postal code.
   * </pre>
   *
   * <code>optional string postal_code = 8;</code>
   * @return Whether the postalCode field is set.
   */
  boolean hasPostalCode();
  /**
   * <pre>
   * Postal code.
   * </pre>
   *
   * <code>optional string postal_code = 8;</code>
   * @return The postalCode.
   */
  java.lang.String getPostalCode();
  /**
   * <pre>
   * Postal code.
   * </pre>
   *
   * <code>optional string postal_code = 8;</code>
   * @return The bytes for postalCode.
   */
  com.google.protobuf.ByteString
      getPostalCodeBytes();

  /**
   * <pre>
   * Province or state code.
   * </pre>
   *
   * <code>optional string province_code = 9;</code>
   * @return Whether the provinceCode field is set.
   */
  boolean hasProvinceCode();
  /**
   * <pre>
   * Province or state code.
   * </pre>
   *
   * <code>optional string province_code = 9;</code>
   * @return The provinceCode.
   */
  java.lang.String getProvinceCode();
  /**
   * <pre>
   * Province or state code.
   * </pre>
   *
   * <code>optional string province_code = 9;</code>
   * @return The bytes for provinceCode.
   */
  com.google.protobuf.ByteString
      getProvinceCodeBytes();

  /**
   * <pre>
   * Country code.
   * </pre>
   *
   * <code>optional string country_code = 10;</code>
   * @return Whether the countryCode field is set.
   */
  boolean hasCountryCode();
  /**
   * <pre>
   * Country code.
   * </pre>
   *
   * <code>optional string country_code = 10;</code>
   * @return The countryCode.
   */
  java.lang.String getCountryCode();
  /**
   * <pre>
   * Country code.
   * </pre>
   *
   * <code>optional string country_code = 10;</code>
   * @return The bytes for countryCode.
   */
  com.google.protobuf.ByteString
      getCountryCodeBytes();

  /**
   * <pre>
   * Province or state name.
   * </pre>
   *
   * <code>optional string province_name = 11;</code>
   * @return Whether the provinceName field is set.
   */
  boolean hasProvinceName();
  /**
   * <pre>
   * Province or state name.
   * </pre>
   *
   * <code>optional string province_name = 11;</code>
   * @return The provinceName.
   */
  java.lang.String getProvinceName();
  /**
   * <pre>
   * Province or state name.
   * </pre>
   *
   * <code>optional string province_name = 11;</code>
   * @return The bytes for provinceName.
   */
  com.google.protobuf.ByteString
      getProvinceNameBytes();

  /**
   * <pre>
   * Street address line 1.
   * </pre>
   *
   * <code>optional string street_address = 12;</code>
   * @return Whether the streetAddress field is set.
   */
  boolean hasStreetAddress();
  /**
   * <pre>
   * Street address line 1.
   * </pre>
   *
   * <code>optional string street_address = 12;</code>
   * @return The streetAddress.
   */
  java.lang.String getStreetAddress();
  /**
   * <pre>
   * Street address line 1.
   * </pre>
   *
   * <code>optional string street_address = 12;</code>
   * @return The bytes for streetAddress.
   */
  com.google.protobuf.ByteString
      getStreetAddressBytes();

  /**
   * <pre>
   * Street address line 2. This field is write-only. It is only used for
   * calculating the longitude and latitude of an address when geo_point is
   * empty.
   * </pre>
   *
   * <code>optional string street_address2 = 13;</code>
   * @return Whether the streetAddress2 field is set.
   */
  boolean hasStreetAddress2();
  /**
   * <pre>
   * Street address line 2. This field is write-only. It is only used for
   * calculating the longitude and latitude of an address when geo_point is
   * empty.
   * </pre>
   *
   * <code>optional string street_address2 = 13;</code>
   * @return The streetAddress2.
   */
  java.lang.String getStreetAddress2();
  /**
   * <pre>
   * Street address line 2. This field is write-only. It is only used for
   * calculating the longitude and latitude of an address when geo_point is
   * empty.
   * </pre>
   *
   * <code>optional string street_address2 = 13;</code>
   * @return The bytes for streetAddress2.
   */
  com.google.protobuf.ByteString
      getStreetAddress2Bytes();

  /**
   * <pre>
   * Name of the city.
   * </pre>
   *
   * <code>optional string city_name = 14;</code>
   * @return Whether the cityName field is set.
   */
  boolean hasCityName();
  /**
   * <pre>
   * Name of the city.
   * </pre>
   *
   * <code>optional string city_name = 14;</code>
   * @return The cityName.
   */
  java.lang.String getCityName();
  /**
   * <pre>
   * Name of the city.
   * </pre>
   *
   * <code>optional string city_name = 14;</code>
   * @return The bytes for cityName.
   */
  com.google.protobuf.ByteString
      getCityNameBytes();
}
