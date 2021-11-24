// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/services/smart_campaign_suggest_service.proto

package com.google.ads.googleads.v8.services;

public interface SmartCampaignSuggestionInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.services.SmartCampaignSuggestionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Landing page URL of the campaign.
   * </pre>
   *
   * <code>string final_url = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The finalUrl.
   */
  java.lang.String getFinalUrl();
  /**
   * <pre>
   * Optional. Landing page URL of the campaign.
   * </pre>
   *
   * <code>string final_url = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for finalUrl.
   */
  com.google.protobuf.ByteString
      getFinalUrlBytes();

  /**
   * <pre>
   * Optional. The two letter advertising language for the Smart campaign to be
   * constructed, default to 'en' if not set.
   * </pre>
   *
   * <code>string language_code = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * Optional. The two letter advertising language for the Smart campaign to be
   * constructed, default to 'en' if not set.
   * </pre>
   *
   * <code>string language_code = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();

  /**
   * <pre>
   * Optional. The business ad schedule.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdScheduleInfo ad_schedules = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<com.google.ads.googleads.v8.common.AdScheduleInfo> 
      getAdSchedulesList();
  /**
   * <pre>
   * Optional. The business ad schedule.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdScheduleInfo ad_schedules = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.ads.googleads.v8.common.AdScheduleInfo getAdSchedules(int index);
  /**
   * <pre>
   * Optional. The business ad schedule.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdScheduleInfo ad_schedules = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getAdSchedulesCount();
  /**
   * <pre>
   * Optional. The business ad schedule.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdScheduleInfo ad_schedules = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v8.common.AdScheduleInfoOrBuilder> 
      getAdSchedulesOrBuilderList();
  /**
   * <pre>
   * Optional. The business ad schedule.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.AdScheduleInfo ad_schedules = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.ads.googleads.v8.common.AdScheduleInfoOrBuilder getAdSchedulesOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. Smart campaign keyword themes. This field may greatly improve suggestion
   * accuracy and we recommend always setting it if possible.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.KeywordThemeInfo keyword_themes = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<com.google.ads.googleads.v8.common.KeywordThemeInfo> 
      getKeywordThemesList();
  /**
   * <pre>
   * Optional. Smart campaign keyword themes. This field may greatly improve suggestion
   * accuracy and we recommend always setting it if possible.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.KeywordThemeInfo keyword_themes = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.ads.googleads.v8.common.KeywordThemeInfo getKeywordThemes(int index);
  /**
   * <pre>
   * Optional. Smart campaign keyword themes. This field may greatly improve suggestion
   * accuracy and we recommend always setting it if possible.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.KeywordThemeInfo keyword_themes = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getKeywordThemesCount();
  /**
   * <pre>
   * Optional. Smart campaign keyword themes. This field may greatly improve suggestion
   * accuracy and we recommend always setting it if possible.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.KeywordThemeInfo keyword_themes = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v8.common.KeywordThemeInfoOrBuilder> 
      getKeywordThemesOrBuilderList();
  /**
   * <pre>
   * Optional. Smart campaign keyword themes. This field may greatly improve suggestion
   * accuracy and we recommend always setting it if possible.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v8.common.KeywordThemeInfo keyword_themes = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.ads.googleads.v8.common.KeywordThemeInfoOrBuilder getKeywordThemesOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. Context describing the business to advertise.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo.BusinessContext business_context = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the businessContext field is set.
   */
  boolean hasBusinessContext();
  /**
   * <pre>
   * Optional. Context describing the business to advertise.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo.BusinessContext business_context = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The businessContext.
   */
  com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo.BusinessContext getBusinessContext();
  /**
   * <pre>
   * Optional. Context describing the business to advertise.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo.BusinessContext business_context = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo.BusinessContextOrBuilder getBusinessContextOrBuilder();

  /**
   * <pre>
   * Optional. The ID of the Business Profile location.
   * The location ID can be fetched by Business Profile API with its form:
   * accounts/{accountId}/locations/{locationId}. The last {locationId}
   * component from the Business Profile API represents the
   * business_location_id. See the [Business Profile API]
   * (https://developers.google.com/my-business/reference/rest/v4/accounts.locations)
   * </pre>
   *
   * <code>int64 business_location_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the businessLocationId field is set.
   */
  boolean hasBusinessLocationId();
  /**
   * <pre>
   * Optional. The ID of the Business Profile location.
   * The location ID can be fetched by Business Profile API with its form:
   * accounts/{accountId}/locations/{locationId}. The last {locationId}
   * component from the Business Profile API represents the
   * business_location_id. See the [Business Profile API]
   * (https://developers.google.com/my-business/reference/rest/v4/accounts.locations)
   * </pre>
   *
   * <code>int64 business_location_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The businessLocationId.
   */
  long getBusinessLocationId();

  /**
   * <pre>
   * Optional. The targeting geo location by locations.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo.LocationList location_list = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the locationList field is set.
   */
  boolean hasLocationList();
  /**
   * <pre>
   * Optional. The targeting geo location by locations.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo.LocationList location_list = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The locationList.
   */
  com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo.LocationList getLocationList();
  /**
   * <pre>
   * Optional. The targeting geo location by locations.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo.LocationList location_list = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo.LocationListOrBuilder getLocationListOrBuilder();

  /**
   * <pre>
   * Optional. The targeting geo location by proximity.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.ProximityInfo proximity = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the proximity field is set.
   */
  boolean hasProximity();
  /**
   * <pre>
   * Optional. The targeting geo location by proximity.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.ProximityInfo proximity = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The proximity.
   */
  com.google.ads.googleads.v8.common.ProximityInfo getProximity();
  /**
   * <pre>
   * Optional. The targeting geo location by proximity.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.common.ProximityInfo proximity = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.ads.googleads.v8.common.ProximityInfoOrBuilder getProximityOrBuilder();

  public com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo.BusinessSettingCase getBusinessSettingCase();

  public com.google.ads.googleads.v8.services.SmartCampaignSuggestionInfo.GeoTargetCase getGeoTargetCase();
}
