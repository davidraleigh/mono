// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/route_guide/v1/route_guide.proto

package io.grpc.route_guide.v1;

public interface ListFeaturesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:route_guide.v1.ListFeaturesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.route_guide.v1.Feature feature = 1 [json_name = "feature"];</code>
   * @return Whether the feature field is set.
   */
  boolean hasFeature();
  /**
   * <code>.route_guide.v1.Feature feature = 1 [json_name = "feature"];</code>
   * @return The feature.
   */
  io.grpc.route_guide.v1.Feature getFeature();
  /**
   * <code>.route_guide.v1.Feature feature = 1 [json_name = "feature"];</code>
   */
  io.grpc.route_guide.v1.FeatureOrBuilder getFeatureOrBuilder();
}
