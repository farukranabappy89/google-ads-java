// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/errors/errors.proto

package com.google.ads.googleads.v0.errors;

public final class ErrorsProto {
  private ErrorsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_errors_GoogleAdsFailure_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_errors_GoogleAdsFailure_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_errors_GoogleAdsError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_errors_GoogleAdsError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_errors_ErrorCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_errors_ErrorCode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_errors_ErrorLocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_errors_ErrorLocation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_errors_ErrorLocation_FieldPathElement_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_errors_ErrorLocation_FieldPathElement_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_errors_ErrorDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_errors_ErrorDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_errors_PolicyViolationDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_errors_PolicyViolationDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_errors_PolicyFindingDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_errors_PolicyFindingDetails_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/ads/googleads/v0/errors/errors." +
      "proto\022\036google.ads.googleads.v0.errors\032+g" +
      "oogle/ads/googleads/v0/common/policy.pro" +
      "to\032*google/ads/googleads/v0/common/value" +
      ".proto\032Bgoogle/ads/googleads/v0/errors/a" +
      "ccount_budget_proposal_error.proto\0328goog" +
      "le/ads/googleads/v0/errors/ad_customizer" +
      "_error.proto\032-google/ads/googleads/v0/er" +
      "rors/ad_error.proto\0326google/ads/googlead" +
      "s/v0/errors/ad_group_ad_error.proto\032@goo" +
      "gle/ads/googleads/v0/errors/ad_group_bid" +
      "_modifier_error.proto\032=google/ads/google" +
      "ads/v0/errors/ad_group_criterion_error.p" +
      "roto\0323google/ads/googleads/v0/errors/ad_" +
      "group_error.proto\0325google/ads/googleads/" +
      "v0/errors/ad_sharing_error.proto\032.google" +
      "/ads/googleads/v0/errors/adx_error.proto" +
      "\0329google/ads/googleads/v0/errors/authent" +
      "ication_error.proto\0328google/ads/googlead" +
      "s/v0/errors/authorization_error.proto\0322g" +
      "oogle/ads/googleads/v0/errors/bidding_er" +
      "ror.proto\032;google/ads/googleads/v0/error" +
      "s/bidding_strategy_error.proto\0328google/a" +
      "ds/googleads/v0/errors/billing_setup_err" +
      "or.proto\032:google/ads/googleads/v0/errors" +
      "/campaign_budget_error.proto\032=google/ads" +
      "/googleads/v0/errors/campaign_criterion_" +
      "error.proto\0323google/ads/googleads/v0/err" +
      "ors/campaign_error.proto\0329google/ads/goo" +
      "gleads/v0/errors/campaign_group_error.pr" +
      "oto\032>google/ads/googleads/v0/errors/camp" +
      "aign_shared_set_error.proto\0328google/ads/" +
      "googleads/v0/errors/change_status_error." +
      "proto\032:google/ads/googleads/v0/errors/co" +
      "llection_size_error.proto\0322google/ads/go" +
      "ogleads/v0/errors/context_error.proto\032<g" +
      "oogle/ads/googleads/v0/errors/conversion" +
      "_action_error.proto\0324google/ads/googlead" +
      "s/v0/errors/criterion_error.proto\032?googl" +
      "e/ads/googleads/v0/errors/customer_clien" +
      "t_link_error.proto\0323google/ads/googleads" +
      "/v0/errors/customer_error.proto\032@google/" +
      "ads/googleads/v0/errors/customer_manager" +
      "_link_error.proto\0323google/ads/googleads/" +
      "v0/errors/database_error.proto\032/google/a" +
      "ds/googleads/v0/errors/date_error.proto\032" +
      "5google/ads/googleads/v0/errors/date_ran" +
      "ge_error.proto\0323google/ads/googleads/v0/" +
      "errors/distinct_error.proto\032/google/ads/" +
      "googleads/v0/errors/enum_error.proto\032Cgo" +
      "ogle/ads/googleads/v0/errors/feed_attrib" +
      "ute_reference_error.proto\0320google/ads/go" +
      "ogleads/v0/errors/field_error.proto\0325goo" +
      "gle/ads/googleads/v0/errors/field_mask_e" +
      "rror.proto\0323google/ads/googleads/v0/erro" +
      "rs/function_error.proto\032;google/ads/goog" +
      "leads/v0/errors/function_parsing_error.p" +
      "roto\032Igoogle/ads/googleads/v0/errors/geo" +
      "_target_constant_suggestion_error.proto\032" +
      "1google/ads/googleads/v0/errors/header_e" +
      "rror.proto\032-google/ads/googleads/v0/erro" +
      "rs/id_error.proto\0320google/ads/googleads/" +
      "v0/errors/image_error.proto\0323google/ads/" +
      "googleads/v0/errors/internal_error.proto" +
      "\0329google/ads/googleads/v0/errors/list_op" +
      "eration_error.proto\0327google/ads/googlead" +
      "s/v0/errors/media_bundle_error.proto\0325go" +
      "ogle/ads/googleads/v0/errors/media_file_" +
      "error.proto\0325google/ads/googleads/v0/err" +
      "ors/multiplier_error.proto\0321google/ads/g" +
      "oogleads/v0/errors/mutate_error.proto\032@g" +
      "oogle/ads/googleads/v0/errors/new_resour" +
      "ce_creation_error.proto\0324google/ads/goog" +
      "leads/v0/errors/not_empty_error.proto\032/g" +
      "oogle/ads/googleads/v0/errors/null_error" +
      ".proto\032Bgoogle/ads/googleads/v0/errors/o" +
      "peration_access_denied_error.proto\0323goog" +
      "le/ads/googleads/v0/errors/operator_erro" +
      "r.proto\0329google/ads/googleads/v0/errors/" +
      "policy_finding_error.proto\0320google/ads/g" +
      "oogleads/v0/errors/query_error.proto\0320go" +
      "ogle/ads/googleads/v0/errors/quota_error" +
      ".proto\0320google/ads/googleads/v0/errors/r" +
      "ange_error.proto\0329google/ads/googleads/v" +
      "0/errors/recommendation_error.proto\0326goo" +
      "gle/ads/googleads/v0/errors/region_code_" +
      "error.proto\0322google/ads/googleads/v0/err" +
      "ors/request_error.proto\032Agoogle/ads/goog" +
      "leads/v0/errors/resource_access_denied_e" +
      "rror.proto\032Hgoogle/ads/googleads/v0/erro" +
      "rs/resource_count_limit_exceeded_error.p" +
      "roto\0322google/ads/googleads/v0/errors/set" +
      "ting_error.proto\032;google/ads/googleads/v" +
      "0/errors/shared_criterion_error.proto\0325g" +
      "oogle/ads/googleads/v0/errors/shared_set" +
      "_error.proto\0328google/ads/googleads/v0/er" +
      "rors/string_format_error.proto\0328google/a" +
      "ds/googleads/v0/errors/string_length_err" +
      "or.proto\0324google/ads/googleads/v0/errors" +
      "/url_field_error.proto\032\036google/protobuf/" +
      "wrappers.proto\"R\n\020GoogleAdsFailure\022>\n\006er" +
      "rors\030\001 \003(\0132..google.ads.googleads.v0.err" +
      "ors.GoogleAdsError\"\230\002\n\016GoogleAdsError\022=\n" +
      "\nerror_code\030\001 \001(\0132).google.ads.googleads" +
      ".v0.errors.ErrorCode\022\017\n\007message\030\002 \001(\t\0226\n" +
      "\007trigger\030\003 \001(\0132%.google.ads.googleads.v0" +
      ".common.Value\022?\n\010location\030\004 \001(\0132-.google" +
      ".ads.googleads.v0.errors.ErrorLocation\022=" +
      "\n\007details\030\005 \001(\0132,.google.ads.googleads.v" +
      "0.errors.ErrorDetails\"\2365\n\tErrorCode\022V\n\rr" +
      "equest_error\030\001 \001(\0162=.google.ads.googlead" +
      "s.v0.errors.RequestErrorEnum.RequestErro" +
      "rH\000\022o\n\026bidding_strategy_error\030\002 \001(\0162M.go" +
      "ogle.ads.googleads.v0.errors.BiddingStra" +
      "tegyErrorEnum.BiddingStrategyErrorH\000\022Z\n\017" +
      "url_field_error\030\003 \001(\0162?.google.ads.googl" +
      "eads.v0.errors.UrlFieldErrorEnum.UrlFiel" +
      "dErrorH\000\022i\n\024list_operation_error\030\004 \001(\0162I" +
      ".google.ads.googleads.v0.errors.ListOper" +
      "ationErrorEnum.ListOperationErrorH\000\022P\n\013q" +
      "uery_error\030\005 \001(\01629.google.ads.googleads." +
      "v0.errors.QueryErrorEnum.QueryErrorH\000\022S\n" +
      "\014mutate_error\030\007 \001(\0162;.google.ads.googlea" +
      "ds.v0.errors.MutateErrorEnum.MutateError" +
      "H\000\022]\n\020field_mask_error\030\010 \001(\0162A.google.ad" +
      "s.googleads.v0.errors.FieldMaskErrorEnum" +
      ".FieldMaskErrorH\000\022h\n\023authorization_error" +
      "\030\t \001(\0162I.google.ads.googleads.v0.errors." +
      "AuthorizationErrorEnum.AuthorizationErro" +
      "rH\000\022Y\n\016internal_error\030\n \001(\0162?.google.ads" +
      ".googleads.v0.errors.InternalErrorEnum.I" +
      "nternalErrorH\000\022P\n\013quota_error\030\013 \001(\01629.go" +
      "ogle.ads.googleads.v0.errors.QuotaErrorE" +
      "num.QuotaErrorH\000\022G\n\010ad_error\030\014 \001(\01623.goo" +
      "gle.ads.googleads.v0.errors.AdErrorEnum." +
      "AdErrorH\000\022W\n\016ad_group_error\030\r \001(\0162=.goog" +
      "le.ads.googleads.v0.errors.AdGroupErrorE" +
      "num.AdGroupErrorH\000\022l\n\025campaign_budget_er" +
      "ror\030\016 \001(\0162K.google.ads.googleads.v0.erro" +
      "rs.CampaignBudgetErrorEnum.CampaignBudge" +
      "tErrorH\000\022Y\n\016campaign_error\030\017 \001(\0162?.googl" +
      "e.ads.googleads.v0.errors.CampaignErrorE" +
      "num.CampaignErrorH\000\022k\n\024authentication_er" +
      "ror\030\021 \001(\0162K.google.ads.googleads.v0.erro" +
      "rs.AuthenticationErrorEnum.Authenticatio" +
      "nErrorH\000\022s\n\030ad_group_criterion_error\030\022 \001" +
      "(\0162O.google.ads.googleads.v0.errors.AdGr" +
      "oupCriterionErrorEnum.AdGroupCriterionEr" +
      "rorH\000\022f\n\023ad_customizer_error\030\023 \001(\0162G.goo" +
      "gle.ads.googleads.v0.errors.AdCustomizer" +
      "ErrorEnum.AdCustomizerErrorH\000\022^\n\021ad_grou" +
      "p_ad_error\030\025 \001(\0162A.google.ads.googleads." +
      "v0.errors.AdGroupAdErrorEnum.AdGroupAdEr" +
      "rorH\000\022]\n\020ad_sharing_error\030\030 \001(\0162A.google" +
      ".ads.googleads.v0.errors.AdSharingErrorE" +
      "num.AdSharingErrorH\000\022J\n\tadx_error\030\031 \001(\0162" +
      "5.google.ads.googleads.v0.errors.AdxErro" +
      "rEnum.AdxErrorH\000\022V\n\rbidding_error\030\032 \001(\0162" +
      "=.google.ads.googleads.v0.errors.Bidding" +
      "ErrorEnum.BiddingErrorH\000\022u\n\030campaign_cri" +
      "terion_error\030\035 \001(\0162Q.google.ads.googlead" +
      "s.v0.errors.CampaignCriterionErrorEnum.C" +
      "ampaignCriterionErrorH\000\022l\n\025collection_si" +
      "ze_error\030\037 \001(\0162K.google.ads.googleads.v0" +
      ".errors.CollectionSizeErrorEnum.Collecti" +
      "onSizeErrorH\000\022\\\n\017criterion_error\030  \001(\0162A" +
      ".google.ads.googleads.v0.errors.Criterio" +
      "nErrorEnum.CriterionErrorH\000\022Y\n\016customer_" +
      "error\030Z \001(\0162?.google.ads.googleads.v0.er" +
      "rors.CustomerErrorEnum.CustomerErrorH\000\022M" +
      "\n\ndate_error\030! \001(\01627.google.ads.googlead" +
      "s.v0.errors.DateErrorEnum.DateErrorH\000\022]\n" +
      "\020date_range_error\030\" \001(\0162A.google.ads.goo" +
      "gleads.v0.errors.DateRangeErrorEnum.Date" +
      "RangeErrorH\000\022Y\n\016distinct_error\030# \001(\0162?.g" +
      "oogle.ads.googleads.v0.errors.DistinctEr" +
      "rorEnum.DistinctErrorH\000\022\205\001\n\036feed_attribu" +
      "te_reference_error\030$ \001(\0162[.google.ads.go" +
      "ogleads.v0.errors.FeedAttributeReference" +
      "ErrorEnum.FeedAttributeReferenceErrorH\000\022" +
      "Y\n\016function_error\030% \001(\0162?.google.ads.goo" +
      "gleads.v0.errors.FunctionErrorEnum.Funct" +
      "ionErrorH\000\022o\n\026function_parsing_error\030& \001" +
      "(\0162M.google.ads.googleads.v0.errors.Func" +
      "tionParsingErrorEnum.FunctionParsingErro" +
      "rH\000\022G\n\010id_error\030\' \001(\01623.google.ads.googl" +
      "eads.v0.errors.IdErrorEnum.IdErrorH\000\022P\n\013" +
      "image_error\030( \001(\01629.google.ads.googleads" +
      ".v0.errors.ImageErrorEnum.ImageErrorH\000\022c" +
      "\n\022media_bundle_error\030* \001(\0162E.google.ads." +
      "googleads.v0.errors.MediaBundleErrorEnum" +
      ".MediaBundleErrorH\000\022]\n\020media_file_error\030" +
      "V \001(\0162A.google.ads.googleads.v0.errors.M" +
      "ediaFileErrorEnum.MediaFileErrorH\000\022_\n\020mu" +
      "ltiplier_error\030, \001(\0162C.google.ads.google" +
      "ads.v0.errors.MultiplierErrorEnum.Multip" +
      "lierErrorH\000\022|\n\033new_resource_creation_err" +
      "or\030- \001(\0162U.google.ads.googleads.v0.error" +
      "s.NewResourceCreationErrorEnum.NewResour" +
      "ceCreationErrorH\000\022Z\n\017not_empty_error\030. \001" +
      "(\0162?.google.ads.googleads.v0.errors.NotE" +
      "mptyErrorEnum.NotEmptyErrorH\000\022M\n\nnull_er" +
      "ror\030/ \001(\01627.google.ads.googleads.v0.erro" +
      "rs.NullErrorEnum.NullErrorH\000\022Y\n\016operator" +
      "_error\0300 \001(\0162?.google.ads.googleads.v0.e" +
      "rrors.OperatorErrorEnum.OperatorErrorH\000\022" +
      "P\n\013range_error\0301 \001(\01629.google.ads.google" +
      "ads.v0.errors.RangeErrorEnum.RangeErrorH" +
      "\000\022k\n\024recommendation_error\030: \001(\0162K.google" +
      ".ads.googleads.v0.errors.RecommendationE" +
      "rrorEnum.RecommendationErrorH\000\022`\n\021region" +
      "_code_error\0303 \001(\0162C.google.ads.googleads" +
      ".v0.errors.RegionCodeErrorEnum.RegionCod" +
      "eErrorH\000\022V\n\rsetting_error\0304 \001(\0162=.google" +
      ".ads.googleads.v0.errors.SettingErrorEnu" +
      "m.SettingErrorH\000\022f\n\023string_format_error\030" +
      "5 \001(\0162G.google.ads.googleads.v0.errors.S" +
      "tringFormatErrorEnum.StringFormatErrorH\000" +
      "\022f\n\023string_length_error\0306 \001(\0162G.google.a" +
      "ds.googleads.v0.errors.StringLengthError" +
      "Enum.StringLengthErrorH\000\022\202\001\n\035operation_a" +
      "ccess_denied_error\0307 \001(\0162Y.google.ads.go" +
      "ogleads.v0.errors.OperationAccessDeniedE" +
      "rrorEnum.OperationAccessDeniedErrorH\000\022\177\n" +
      "\034resource_access_denied_error\0308 \001(\0162W.go" +
      "ogle.ads.googleads.v0.errors.ResourceAcc" +
      "essDeniedErrorEnum.ResourceAccessDeniedE" +
      "rrorH\000\022\222\001\n#resource_count_limit_exceeded" +
      "_error\0309 \001(\0162c.google.ads.googleads.v0.e" +
      "rrors.ResourceCountLimitExceededErrorEnu" +
      "m.ResourceCountLimitExceededErrorH\000\022z\n\033a" +
      "d_group_bid_modifier_error\030; \001(\0162S.googl" +
      "e.ads.googleads.v0.errors.AdGroupBidModi" +
      "fierErrorEnum.AdGroupBidModifierErrorH\000\022" +
      "V\n\rcontext_error\030< \001(\0162=.google.ads.goog" +
      "leads.v0.errors.ContextErrorEnum.Context" +
      "ErrorH\000\022P\n\013field_error\030= \001(\01629.google.ad" +
      "s.googleads.v0.errors.FieldErrorEnum.Fie" +
      "ldErrorH\000\022]\n\020shared_set_error\030> \001(\0162A.go" +
      "ogle.ads.googleads.v0.errors.SharedSetEr" +
      "rorEnum.SharedSetErrorH\000\022o\n\026shared_crite" +
      "rion_error\030? \001(\0162M.google.ads.googleads." +
      "v0.errors.SharedCriterionErrorEnum.Share" +
      "dCriterionErrorH\000\022v\n\031campaign_shared_set" +
      "_error\030@ \001(\0162Q.google.ads.googleads.v0.e" +
      "rrors.CampaignSharedSetErrorEnum.Campaig" +
      "nSharedSetErrorH\000\022r\n\027conversion_action_e" +
      "rror\030A \001(\0162O.google.ads.googleads.v0.err" +
      "ors.ConversionActionErrorEnum.Conversion" +
      "ActionErrorH\000\022S\n\014header_error\030B \001(\0162;.go" +
      "ogle.ads.googleads.v0.errors.HeaderError" +
      "Enum.HeaderErrorH\000\022Y\n\016database_error\030C \001" +
      "(\0162?.google.ads.googleads.v0.errors.Data" +
      "baseErrorEnum.DatabaseErrorH\000\022i\n\024policy_" +
      "finding_error\030D \001(\0162I.google.ads.googlea" +
      "ds.v0.errors.PolicyFindingErrorEnum.Poli" +
      "cyFindingErrorH\000\022i\n\024campaign_group_error" +
      "\030E \001(\0162I.google.ads.googleads.v0.errors." +
      "CampaignGroupErrorEnum.CampaignGroupErro" +
      "rH\000\022M\n\nenum_error\030F \001(\01627.google.ads.goo" +
      "gleads.v0.errors.EnumErrorEnum.EnumError" +
      "H\000\022\202\001\n\035account_budget_proposal_error\030M \001" +
      "(\0162Y.google.ads.googleads.v0.errors.Acco" +
      "untBudgetProposalErrorEnum.AccountBudget" +
      "ProposalErrorH\000\022f\n\023change_status_error\030O" +
      " \001(\0162G.google.ads.googleads.v0.errors.Ch" +
      "angeStatusErrorEnum.ChangeStatusErrorH\000\022" +
      "\225\001\n$geo_target_constant_suggestion_error" +
      "\030Q \001(\0162e.google.ads.googleads.v0.errors." +
      "GeoTargetConstantSuggestionErrorEnum.Geo" +
      "TargetConstantSuggestionErrorH\000\022f\n\023billi" +
      "ng_setup_error\030W \001(\0162G.google.ads.google" +
      "ads.v0.errors.BillingSetupErrorEnum.Bill" +
      "ingSetupErrorH\000\022y\n\032customer_client_link_" +
      "error\030X \001(\0162S.google.ads.googleads.v0.er" +
      "rors.CustomerClientLinkErrorEnum.Custome" +
      "rClientLinkErrorH\000\022|\n\033customer_manager_l" +
      "ink_error\030[ \001(\0162U.google.ads.googleads.v" +
      "0.errors.CustomerManagerLinkErrorEnum.Cu" +
      "stomerManagerLinkErrorH\000B\014\n\nerror_code\"\366" +
      "\001\n\rErrorLocation\0224\n\017operation_index\030\001 \001(" +
      "\0132\033.google.protobuf.Int64Value\022[\n\023field_" +
      "path_elements\030\002 \003(\0132>.google.ads.googlea" +
      "ds.v0.errors.ErrorLocation.FieldPathElem" +
      "ent\032R\n\020FieldPathElement\022\022\n\nfield_name\030\001 " +
      "\001(\t\022*\n\005index\030\002 \001(\0132\033.google.protobuf.Int" +
      "64Value\"\336\001\n\014ErrorDetails\022\036\n\026unpublished_" +
      "error_code\030\001 \001(\t\022X\n\030policy_violation_det" +
      "ails\030\002 \001(\01326.google.ads.googleads.v0.err" +
      "ors.PolicyViolationDetails\022T\n\026policy_fin" +
      "ding_details\030\003 \001(\01324.google.ads.googlead" +
      "s.v0.errors.PolicyFindingDetails\"\263\001\n\026Pol" +
      "icyViolationDetails\022#\n\033external_policy_d" +
      "escription\030\002 \001(\t\022?\n\003key\030\004 \001(\01322.google.a" +
      "ds.googleads.v0.common.PolicyViolationKe" +
      "y\022\034\n\024external_policy_name\030\005 \001(\t\022\025\n\ris_ex" +
      "emptible\030\006 \001(\010\"f\n\024PolicyFindingDetails\022N" +
      "\n\024policy_topic_entries\030\001 \003(\01320.google.ad" +
      "s.googleads.v0.common.PolicyTopicEntryB\301" +
      "\001\n\"com.google.ads.googleads.v0.errorsB\013E" +
      "rrorsProtoP\001ZDgoogle.golang.org/genproto" +
      "/googleapis/ads/googleads/v0/errors;erro" +
      "rs\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V0.Error" +
      "s\312\002\036Google\\Ads\\GoogleAds\\V0\\Errorsb\006prot" +
      "o3"
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
          com.google.ads.googleads.v0.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v0.common.ValueProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.AccountBudgetProposalErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.AdCustomizerErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.AdErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.AdGroupAdErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.AdGroupBidModifierErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.AdGroupCriterionErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.AdGroupErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.AdSharingErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.AdxErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.AuthenticationErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.AuthorizationErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.BiddingErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.BiddingStrategyErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.BillingSetupErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.CampaignBudgetErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.CampaignCriterionErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.CampaignErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.CampaignGroupErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.CampaignSharedSetErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.ChangeStatusErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.CollectionSizeErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.ContextErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.ConversionActionErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.CriterionErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.CustomerClientLinkErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.CustomerErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.CustomerManagerLinkErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.DatabaseErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.DateErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.DateRangeErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.DistinctErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.EnumErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.FeedAttributeReferenceErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.FieldErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.FieldMaskErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.FunctionErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.FunctionParsingErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.GeoTargetConstantSuggestionErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.HeaderErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.IdErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.ImageErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.InternalErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.ListOperationErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.MediaBundleErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.MediaFileErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.MultiplierErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.MutateErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.NewResourceCreationErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.NotEmptyErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.NullErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.OperationAccessDeniedErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.OperatorErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.PolicyFindingErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.QueryErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.QuotaErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.RangeErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.RecommendationErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.RegionCodeErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.RequestErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.ResourceAccessDeniedErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.ResourceCountLimitExceededErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.SettingErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.SharedCriterionErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.SharedSetErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.StringFormatErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.StringLengthErrorProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.UrlFieldErrorProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_errors_GoogleAdsFailure_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_errors_GoogleAdsFailure_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_errors_GoogleAdsFailure_descriptor,
        new java.lang.String[] { "Errors", });
    internal_static_google_ads_googleads_v0_errors_GoogleAdsError_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v0_errors_GoogleAdsError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_errors_GoogleAdsError_descriptor,
        new java.lang.String[] { "ErrorCode", "Message", "Trigger", "Location", "Details", });
    internal_static_google_ads_googleads_v0_errors_ErrorCode_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v0_errors_ErrorCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_errors_ErrorCode_descriptor,
        new java.lang.String[] { "RequestError", "BiddingStrategyError", "UrlFieldError", "ListOperationError", "QueryError", "MutateError", "FieldMaskError", "AuthorizationError", "InternalError", "QuotaError", "AdError", "AdGroupError", "CampaignBudgetError", "CampaignError", "AuthenticationError", "AdGroupCriterionError", "AdCustomizerError", "AdGroupAdError", "AdSharingError", "AdxError", "BiddingError", "CampaignCriterionError", "CollectionSizeError", "CriterionError", "CustomerError", "DateError", "DateRangeError", "DistinctError", "FeedAttributeReferenceError", "FunctionError", "FunctionParsingError", "IdError", "ImageError", "MediaBundleError", "MediaFileError", "MultiplierError", "NewResourceCreationError", "NotEmptyError", "NullError", "OperatorError", "RangeError", "RecommendationError", "RegionCodeError", "SettingError", "StringFormatError", "StringLengthError", "OperationAccessDeniedError", "ResourceAccessDeniedError", "ResourceCountLimitExceededError", "AdGroupBidModifierError", "ContextError", "FieldError", "SharedSetError", "SharedCriterionError", "CampaignSharedSetError", "ConversionActionError", "HeaderError", "DatabaseError", "PolicyFindingError", "CampaignGroupError", "EnumError", "AccountBudgetProposalError", "ChangeStatusError", "GeoTargetConstantSuggestionError", "BillingSetupError", "CustomerClientLinkError", "CustomerManagerLinkError", "ErrorCode", });
    internal_static_google_ads_googleads_v0_errors_ErrorLocation_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v0_errors_ErrorLocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_errors_ErrorLocation_descriptor,
        new java.lang.String[] { "OperationIndex", "FieldPathElements", });
    internal_static_google_ads_googleads_v0_errors_ErrorLocation_FieldPathElement_descriptor =
      internal_static_google_ads_googleads_v0_errors_ErrorLocation_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v0_errors_ErrorLocation_FieldPathElement_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_errors_ErrorLocation_FieldPathElement_descriptor,
        new java.lang.String[] { "FieldName", "Index", });
    internal_static_google_ads_googleads_v0_errors_ErrorDetails_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v0_errors_ErrorDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_errors_ErrorDetails_descriptor,
        new java.lang.String[] { "UnpublishedErrorCode", "PolicyViolationDetails", "PolicyFindingDetails", });
    internal_static_google_ads_googleads_v0_errors_PolicyViolationDetails_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v0_errors_PolicyViolationDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_errors_PolicyViolationDetails_descriptor,
        new java.lang.String[] { "ExternalPolicyDescription", "Key", "ExternalPolicyName", "IsExemptible", });
    internal_static_google_ads_googleads_v0_errors_PolicyFindingDetails_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v0_errors_PolicyFindingDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_errors_PolicyFindingDetails_descriptor,
        new java.lang.String[] { "PolicyTopicEntries", });
    com.google.ads.googleads.v0.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v0.common.ValueProto.getDescriptor();
    com.google.ads.googleads.v0.errors.AccountBudgetProposalErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.AdCustomizerErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.AdErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.AdGroupAdErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.AdGroupBidModifierErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.AdGroupCriterionErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.AdGroupErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.AdSharingErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.AdxErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.AuthenticationErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.AuthorizationErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.BiddingErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.BiddingStrategyErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.BillingSetupErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.CampaignBudgetErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.CampaignCriterionErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.CampaignErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.CampaignGroupErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.CampaignSharedSetErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.ChangeStatusErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.CollectionSizeErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.ContextErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.ConversionActionErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.CriterionErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.CustomerClientLinkErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.CustomerErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.CustomerManagerLinkErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.DatabaseErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.DateErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.DateRangeErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.DistinctErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.EnumErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.FeedAttributeReferenceErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.FieldErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.FieldMaskErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.FunctionErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.FunctionParsingErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.GeoTargetConstantSuggestionErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.HeaderErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.IdErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.ImageErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.InternalErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.ListOperationErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.MediaBundleErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.MediaFileErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.MultiplierErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.MutateErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.NewResourceCreationErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.NotEmptyErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.NullErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.OperationAccessDeniedErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.OperatorErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.PolicyFindingErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.QueryErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.QuotaErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.RangeErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.RecommendationErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.RegionCodeErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.RequestErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.ResourceAccessDeniedErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.ResourceCountLimitExceededErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.SettingErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.SharedCriterionErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.SharedSetErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.StringFormatErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.StringLengthErrorProto.getDescriptor();
    com.google.ads.googleads.v0.errors.UrlFieldErrorProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
