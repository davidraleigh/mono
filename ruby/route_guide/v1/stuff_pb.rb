# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: route_guide/v1/stuff.proto

require 'google/protobuf'

require 'route_guide/v1/route_guide_pb'

Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("route_guide/v1/stuff.proto", :syntax => :proto3) do
    add_message "route_guide.v1.RoutePointTest" do
      optional :point, :message, 1, "route_guide.v1.Point", json_name: "point"
    end
  end
end

module RouteGuide
  module V1
    RoutePointTest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("route_guide.v1.RoutePointTest").msgclass
  end
end
