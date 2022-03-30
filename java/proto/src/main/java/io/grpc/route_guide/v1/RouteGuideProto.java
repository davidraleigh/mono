// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/route_guide/v1/route_guide.proto

package io.grpc.route_guide.v1;

public final class RouteGuideProto {
  private RouteGuideProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_route_guide_v1_Point_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_route_guide_v1_Point_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_route_guide_v1_ListFeaturesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_route_guide_v1_ListFeaturesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_route_guide_v1_GetFeatureResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_route_guide_v1_GetFeatureResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_route_guide_v1_GetFeatureRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_route_guide_v1_GetFeatureRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_route_guide_v1_ListFeaturesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_route_guide_v1_ListFeaturesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_route_guide_v1_RecordRouteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_route_guide_v1_RecordRouteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_route_guide_v1_RouteChatRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_route_guide_v1_RouteChatRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_route_guide_v1_RouteChatResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_route_guide_v1_RouteChatResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_route_guide_v1_Feature_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_route_guide_v1_Feature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_route_guide_v1_FeatureDatabase_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_route_guide_v1_FeatureDatabase_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_route_guide_v1_RouteNote_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_route_guide_v1_RouteNote_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_route_guide_v1_RecordRouteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_route_guide_v1_RecordRouteResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&proto/route_guide/v1/route_guide.proto" +
      "\022\016route_guide.v1\"A\n\005Point\022\032\n\010latitude\030\001 " +
      "\001(\005R\010latitude\022\034\n\tlongitude\030\002 \001(\005R\tlongit" +
      "ude\"c\n\023ListFeaturesRequest\022%\n\002lo\030\001 \001(\0132\025" +
      ".route_guide.v1.PointR\002lo\022%\n\002hi\030\002 \001(\0132\025." +
      "route_guide.v1.PointR\002hi\"G\n\022GetFeatureRe" +
      "sponse\0221\n\007feature\030\001 \001(\0132\027.route_guide.v1" +
      ".FeatureR\007feature\"@\n\021GetFeatureRequest\022+" +
      "\n\005point\030\001 \001(\0132\025.route_guide.v1.PointR\005po" +
      "int\"I\n\024ListFeaturesResponse\0221\n\007feature\030\001" +
      " \001(\0132\027.route_guide.v1.FeatureR\007feature\"A" +
      "\n\022RecordRouteRequest\022+\n\005point\030\001 \001(\0132\025.ro" +
      "ute_guide.v1.PointR\005point\"L\n\020RouteChatRe" +
      "quest\0228\n\nroute_note\030\001 \001(\0132\031.route_guide." +
      "v1.RouteNoteR\trouteNote\"M\n\021RouteChatResp" +
      "onse\0228\n\nroute_note\030\001 \001(\0132\031.route_guide.v" +
      "1.RouteNoteR\trouteNote\"P\n\007Feature\022\022\n\004nam" +
      "e\030\001 \001(\tR\004name\0221\n\010location\030\002 \001(\0132\025.route_" +
      "guide.v1.PointR\010location\"D\n\017FeatureDatab" +
      "ase\0221\n\007feature\030\001 \003(\0132\027.route_guide.v1.Fe" +
      "atureR\007feature\"X\n\tRouteNote\0221\n\010location\030" +
      "\001 \001(\0132\025.route_guide.v1.PointR\010location\022\030" +
      "\n\007message\030\002 \001(\tR\007message\"\232\001\n\023RecordRoute" +
      "Response\022\037\n\013point_count\030\001 \001(\005R\npointCoun" +
      "t\022#\n\rfeature_count\030\002 \001(\005R\014featureCount\022\032" +
      "\n\010distance\030\003 \001(\005R\010distance\022!\n\014elapsed_ti" +
      "me\030\004 \001(\005R\013elapsedTime2\375\002\n\021RouteGuideServ" +
      "ice\022U\n\nGetFeature\022!.route_guide.v1.GetFe" +
      "atureRequest\032\".route_guide.v1.GetFeature" +
      "Response\"\000\022]\n\014ListFeatures\022#.route_guide" +
      ".v1.ListFeaturesRequest\032$.route_guide.v1" +
      ".ListFeaturesResponse\"\0000\001\022Z\n\013RecordRoute" +
      "\022\".route_guide.v1.RecordRouteRequest\032#.r" +
      "oute_guide.v1.RecordRouteResponse\"\000(\001\022V\n" +
      "\tRouteChat\022 .route_guide.v1.RouteChatReq" +
      "uest\032!.route_guide.v1.RouteChatResponse\"" +
      "\000(\0010\001B~\n\026io.grpc.route_guide.v1B\017RouteGu" +
      "ideProtoP\001Z2github.com/davidraleigh/mono" +
      "/golang/route_guide/v1\242\002\003RTG\252\002\026io.grpc.r" +
      "oute_guide.v1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_route_guide_v1_Point_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_route_guide_v1_Point_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_route_guide_v1_Point_descriptor,
        new java.lang.String[] { "Latitude", "Longitude", });
    internal_static_route_guide_v1_ListFeaturesRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_route_guide_v1_ListFeaturesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_route_guide_v1_ListFeaturesRequest_descriptor,
        new java.lang.String[] { "Lo", "Hi", });
    internal_static_route_guide_v1_GetFeatureResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_route_guide_v1_GetFeatureResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_route_guide_v1_GetFeatureResponse_descriptor,
        new java.lang.String[] { "Feature", });
    internal_static_route_guide_v1_GetFeatureRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_route_guide_v1_GetFeatureRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_route_guide_v1_GetFeatureRequest_descriptor,
        new java.lang.String[] { "Point", });
    internal_static_route_guide_v1_ListFeaturesResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_route_guide_v1_ListFeaturesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_route_guide_v1_ListFeaturesResponse_descriptor,
        new java.lang.String[] { "Feature", });
    internal_static_route_guide_v1_RecordRouteRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_route_guide_v1_RecordRouteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_route_guide_v1_RecordRouteRequest_descriptor,
        new java.lang.String[] { "Point", });
    internal_static_route_guide_v1_RouteChatRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_route_guide_v1_RouteChatRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_route_guide_v1_RouteChatRequest_descriptor,
        new java.lang.String[] { "RouteNote", });
    internal_static_route_guide_v1_RouteChatResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_route_guide_v1_RouteChatResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_route_guide_v1_RouteChatResponse_descriptor,
        new java.lang.String[] { "RouteNote", });
    internal_static_route_guide_v1_Feature_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_route_guide_v1_Feature_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_route_guide_v1_Feature_descriptor,
        new java.lang.String[] { "Name", "Location", });
    internal_static_route_guide_v1_FeatureDatabase_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_route_guide_v1_FeatureDatabase_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_route_guide_v1_FeatureDatabase_descriptor,
        new java.lang.String[] { "Feature", });
    internal_static_route_guide_v1_RouteNote_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_route_guide_v1_RouteNote_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_route_guide_v1_RouteNote_descriptor,
        new java.lang.String[] { "Location", "Message", });
    internal_static_route_guide_v1_RecordRouteResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_route_guide_v1_RecordRouteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_route_guide_v1_RecordRouteResponse_descriptor,
        new java.lang.String[] { "PointCount", "FeatureCount", "Distance", "ElapsedTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
