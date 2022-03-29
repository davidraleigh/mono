# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/route_guide/v1/route_guide.proto

require 'google/protobuf'

Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("proto/route_guide/v1/route_guide.proto", :syntax => :proto3) do
    add_message "route_guide.v1.Point" do
      optional :latitude, :int32, 1, json_name: "latitude"
      optional :longitude, :int32, 2, json_name: "longitude"
    end
    add_message "route_guide.v1.ListFeaturesRequest" do
      optional :lo, :message, 1, "route_guide.v1.Point", json_name: "lo"
      optional :hi, :message, 2, "route_guide.v1.Point", json_name: "hi"
    end
    add_message "route_guide.v1.GetFeatureResponse" do
      optional :feature, :message, 1, "route_guide.v1.Feature", json_name: "feature"
    end
    add_message "route_guide.v1.GetFeatureRequest" do
      optional :point, :message, 1, "route_guide.v1.Point", json_name: "point"
    end
    add_message "route_guide.v1.ListFeaturesResponse" do
      optional :feature, :message, 1, "route_guide.v1.Feature", json_name: "feature"
    end
    add_message "route_guide.v1.RecordRouteRequest" do
      optional :point, :message, 1, "route_guide.v1.Point", json_name: "point"
    end
    add_message "route_guide.v1.RouteChatRequest" do
      optional :route_note, :message, 1, "route_guide.v1.RouteNote", json_name: "routeNote"
    end
    add_message "route_guide.v1.RouteChatResponse" do
      optional :route_note, :message, 1, "route_guide.v1.RouteNote", json_name: "routeNote"
    end
    add_message "route_guide.v1.Feature" do
      optional :name, :string, 1, json_name: "name"
      optional :location, :message, 2, "route_guide.v1.Point", json_name: "location"
    end
    add_message "route_guide.v1.FeatureDatabase" do
      repeated :feature, :message, 1, "route_guide.v1.Feature", json_name: "feature"
    end
    add_message "route_guide.v1.RouteNote" do
      optional :location, :message, 1, "route_guide.v1.Point", json_name: "location"
      optional :message, :string, 2, json_name: "message"
    end
    add_message "route_guide.v1.RecordRouteResponse" do
      optional :point_count, :int32, 1, json_name: "pointCount"
      optional :feature_count, :int32, 2, json_name: "featureCount"
      optional :distance, :int32, 3, json_name: "distance"
      optional :elapsed_time, :int32, 4, json_name: "elapsedTime"
    end
  end
end

module RouteGuide
  module V1
    Point = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("route_guide.v1.Point").msgclass
    ListFeaturesRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("route_guide.v1.ListFeaturesRequest").msgclass
    GetFeatureResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("route_guide.v1.GetFeatureResponse").msgclass
    GetFeatureRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("route_guide.v1.GetFeatureRequest").msgclass
    ListFeaturesResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("route_guide.v1.ListFeaturesResponse").msgclass
    RecordRouteRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("route_guide.v1.RecordRouteRequest").msgclass
    RouteChatRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("route_guide.v1.RouteChatRequest").msgclass
    RouteChatResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("route_guide.v1.RouteChatResponse").msgclass
    Feature = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("route_guide.v1.Feature").msgclass
    FeatureDatabase = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("route_guide.v1.FeatureDatabase").msgclass
    RouteNote = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("route_guide.v1.RouteNote").msgclass
    RecordRouteResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("route_guide.v1.RecordRouteResponse").msgclass
  end
end