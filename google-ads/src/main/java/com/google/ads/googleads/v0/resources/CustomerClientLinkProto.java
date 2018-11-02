// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/customer_client_link.proto

package com.google.ads.googleads.v0.resources;

public final class CustomerClientLinkProto {
  private CustomerClientLinkProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_CustomerClientLink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_CustomerClientLink_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v0/resources/cust" +
      "omer_client_link.proto\022!google.ads.googl" +
      "eads.v0.resources\0327google/ads/googleads/" +
      "v0/enums/manager_link_status.proto\032\036goog" +
      "le/protobuf/wrappers.proto\"\234\002\n\022CustomerC" +
      "lientLink\022\025\n\rresource_name\030\001 \001(\t\0225\n\017clie" +
      "nt_customer\030\003 \001(\0132\034.google.protobuf.Stri" +
      "ngValue\0224\n\017manager_link_id\030\004 \001(\0132\033.googl" +
      "e.protobuf.Int64Value\022V\n\006status\030\005 \001(\0162F." +
      "google.ads.googleads.v0.enums.ManagerLin" +
      "kStatusEnum.ManagerLinkStatus\022*\n\006hidden\030" +
      "\006 \001(\0132\032.google.protobuf.BoolValueB\334\001\n%co" +
      "m.google.ads.googleads.v0.resourcesB\027Cus" +
      "tomerClientLinkProtoP\001ZJgoogle.golang.or" +
      "g/genproto/googleapis/ads/googleads/v0/r" +
      "esources;resources\242\002\003GAA\252\002!Google.Ads.Go" +
      "ogleAds.V0.Resources\312\002!Google\\Ads\\Google" +
      "Ads\\V0\\Resourcesb\006proto3"
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
          com.google.ads.googleads.v0.enums.ManagerLinkStatusProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_resources_CustomerClientLink_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_CustomerClientLink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_CustomerClientLink_descriptor,
        new java.lang.String[] { "ResourceName", "ClientCustomer", "ManagerLinkId", "Status", "Hidden", });
    com.google.ads.googleads.v0.enums.ManagerLinkStatusProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
