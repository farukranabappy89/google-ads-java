// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/ad_group_criterion.proto

package com.google.ads.googleads.v0.resources;

public final class AdGroupCriterionProto {
  private AdGroupCriterionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_QualityInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_QualityInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_PositionEstimates_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_PositionEstimates_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v0/resources/ad_g" +
      "roup_criterion.proto\022!google.ads.googlea" +
      "ds.v0.resources\032-google/ads/googleads/v0" +
      "/common/criteria.proto\0325google/ads/googl" +
      "eads/v0/common/custom_parameter.proto\032=g" +
      "oogle/ads/googleads/v0/enums/ad_group_cr" +
      "iterion_status.proto\0322google/ads/googlea" +
      "ds/v0/enums/bidding_source.proto\0322google" +
      "/ads/googleads/v0/enums/criterion_type.p" +
      "roto\0328google/ads/googleads/v0/enums/qual" +
      "ity_score_bucket.proto\032\036google/protobuf/" +
      "wrappers.proto\"\243\027\n\020AdGroupCriterion\022\025\n\rr" +
      "esource_name\030\001 \001(\t\0221\n\014criterion_id\030\032 \001(\013" +
      "2\033.google.protobuf.Int64Value\022`\n\006status\030" +
      "\003 \001(\0162P.google.ads.googleads.v0.enums.Ad" +
      "GroupCriterionStatusEnum.AdGroupCriterio" +
      "nStatus\022U\n\014quality_info\030\004 \001(\0132?.google.a" +
      "ds.googleads.v0.resources.AdGroupCriteri" +
      "on.QualityInfo\022.\n\010ad_group\030\005 \001(\0132\034.googl" +
      "e.protobuf.StringValue\022L\n\004type\030\031 \001(\0162>.g" +
      "oogle.ads.googleads.v0.enums.CriterionTy" +
      "peEnum.CriterionType\022,\n\010negative\030\037 \001(\0132\032" +
      ".google.protobuf.BoolValue\0222\n\014bid_modifi" +
      "er\030, \001(\0132\034.google.protobuf.DoubleValue\0223" +
      "\n\016cpc_bid_micros\030\020 \001(\0132\033.google.protobuf" +
      ".Int64Value\0223\n\016cpm_bid_micros\030\021 \001(\0132\033.go" +
      "ogle.protobuf.Int64Value\0223\n\016cpv_bid_micr" +
      "os\030\030 \001(\0132\033.google.protobuf.Int64Value\022;\n" +
      "\026percent_cpc_bid_micros\030! \001(\0132\033.google.p" +
      "rotobuf.Int64Value\022=\n\030effective_cpc_bid_" +
      "micros\030\022 \001(\0132\033.google.protobuf.Int64Valu" +
      "e\022=\n\030effective_cpm_bid_micros\030\023 \001(\0132\033.go" +
      "ogle.protobuf.Int64Value\022=\n\030effective_cp" +
      "v_bid_micros\030\024 \001(\0132\033.google.protobuf.Int" +
      "64Value\022E\n effective_percent_cpc_bid_mic" +
      "ros\030\" \001(\0132\033.google.protobuf.Int64Value\022`" +
      "\n\030effective_cpc_bid_source\030\025 \001(\0162>.googl" +
      "e.ads.googleads.v0.enums.BiddingSourceEn" +
      "um.BiddingSource\022`\n\030effective_cpm_bid_so" +
      "urce\030\026 \001(\0162>.google.ads.googleads.v0.enu" +
      "ms.BiddingSourceEnum.BiddingSource\022`\n\030ef" +
      "fective_cpv_bid_source\030\027 \001(\0162>.google.ad" +
      "s.googleads.v0.enums.BiddingSourceEnum.B" +
      "iddingSource\022h\n effective_percent_cpc_bi" +
      "d_source\030# \001(\0162>.google.ads.googleads.v0" +
      ".enums.BiddingSourceEnum.BiddingSource\022a" +
      "\n\022position_estimates\030\n \001(\0132E.google.ads." +
      "googleads.v0.resources.AdGroupCriterion." +
      "PositionEstimates\0220\n\nfinal_urls\030\013 \003(\0132\034." +
      "google.protobuf.StringValue\022;\n\025tracking_" +
      "url_template\030\r \001(\0132\034.google.protobuf.Str" +
      "ingValue\022N\n\025url_custom_parameters\030\016 \003(\0132" +
      "/.google.ads.googleads.v0.common.CustomP" +
      "arameter\022>\n\007keyword\030\033 \001(\0132+.google.ads.g" +
      "oogleads.v0.common.KeywordInfoH\000\022B\n\tplac" +
      "ement\030\034 \001(\0132-.google.ads.googleads.v0.co" +
      "mmon.PlacementInfoH\000\022I\n\rlisting_group\030  " +
      "\001(\01320.google.ads.googleads.v0.common.Lis" +
      "tingGroupInfoH\000\022A\n\tage_range\030$ \001(\0132,.goo" +
      "gle.ads.googleads.v0.common.AgeRangeInfo" +
      "H\000\022<\n\006gender\030% \001(\0132*.google.ads.googlead" +
      "s.v0.common.GenderInfoH\000\022G\n\014income_range" +
      "\030& \001(\0132/.google.ads.googleads.v0.common." +
      "IncomeRangeInfoH\000\022M\n\017parental_status\030\' \001" +
      "(\01322.google.ads.googleads.v0.common.Pare" +
      "ntalStatusInfoH\000\022I\n\ryoutube_video\030( \001(\0132" +
      "0.google.ads.googleads.v0.common.YouTube" +
      "VideoInfoH\000\022M\n\017youtube_channel\030) \001(\01322.g" +
      "oogle.ads.googleads.v0.common.YouTubeCha" +
      "nnelInfoH\000\022:\n\005topic\030+ \001(\0132).google.ads.g" +
      "oogleads.v0.common.TopicInfoH\000\032\377\002\n\013Quali" +
      "tyInfo\0222\n\rquality_score\030\001 \001(\0132\033.google.p" +
      "rotobuf.Int32Value\022h\n\026creative_quality_s" +
      "core\030\002 \001(\0162H.google.ads.googleads.v0.enu" +
      "ms.QualityScoreBucketEnum.QualityScoreBu" +
      "cket\022j\n\030post_click_quality_score\030\003 \001(\0162H" +
      ".google.ads.googleads.v0.enums.QualitySc" +
      "oreBucketEnum.QualityScoreBucket\022f\n\024sear" +
      "ch_predicted_ctr\030\004 \001(\0162H.google.ads.goog" +
      "leads.v0.enums.QualityScoreBucketEnum.Qu" +
      "alityScoreBucket\032\314\001\n\021PositionEstimates\022:" +
      "\n\025first_page_cpc_micros\030\001 \001(\0132\033.google.p" +
      "rotobuf.Int64Value\022>\n\031first_position_cpc" +
      "_micros\030\002 \001(\0132\033.google.protobuf.Int64Val" +
      "ue\022;\n\026top_of_page_cpc_micros\030\003 \001(\0132\033.goo" +
      "gle.protobuf.Int64ValueB\013\n\tcriterionB\332\001\n" +
      "%com.google.ads.googleads.v0.resourcesB\025" +
      "AdGroupCriterionProtoP\001ZJgoogle.golang.o" +
      "rg/genproto/googleapis/ads/googleads/v0/" +
      "resources;resources\242\002\003GAA\252\002!Google.Ads.G" +
      "oogleAds.V0.Resources\312\002!Google\\Ads\\Googl" +
      "eAds\\V0\\Resourcesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v0.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v0.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.AdGroupCriterionStatusProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.BiddingSourceProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.CriterionTypeProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.QualityScoreBucketProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_descriptor,
        new java.lang.String[] { "ResourceName", "CriterionId", "Status", "QualityInfo", "AdGroup", "Type", "Negative", "BidModifier", "CpcBidMicros", "CpmBidMicros", "CpvBidMicros", "PercentCpcBidMicros", "EffectiveCpcBidMicros", "EffectiveCpmBidMicros", "EffectiveCpvBidMicros", "EffectivePercentCpcBidMicros", "EffectiveCpcBidSource", "EffectiveCpmBidSource", "EffectiveCpvBidSource", "EffectivePercentCpcBidSource", "PositionEstimates", "FinalUrls", "TrackingUrlTemplate", "UrlCustomParameters", "Keyword", "Placement", "ListingGroup", "AgeRange", "Gender", "IncomeRange", "ParentalStatus", "YoutubeVideo", "YoutubeChannel", "Topic", "Criterion", });
    internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_QualityInfo_descriptor =
      internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_QualityInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_QualityInfo_descriptor,
        new java.lang.String[] { "QualityScore", "CreativeQualityScore", "PostClickQualityScore", "SearchPredictedCtr", });
    internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_PositionEstimates_descriptor =
      internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_PositionEstimates_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_PositionEstimates_descriptor,
        new java.lang.String[] { "FirstPageCpcMicros", "FirstPositionCpcMicros", "TopOfPageCpcMicros", });
    com.google.ads.googleads.v0.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v0.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v0.enums.AdGroupCriterionStatusProto.getDescriptor();
    com.google.ads.googleads.v0.enums.BiddingSourceProto.getDescriptor();
    com.google.ads.googleads.v0.enums.CriterionTypeProto.getDescriptor();
    com.google.ads.googleads.v0.enums.QualityScoreBucketProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
