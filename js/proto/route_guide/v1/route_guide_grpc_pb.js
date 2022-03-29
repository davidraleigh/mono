// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Copyright 2015 gRPC authors.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
'use strict';
var grpc = require('grpc');
var proto_route_guide_v1_route_guide_pb = require('../../../proto/route_guide/v1/route_guide_pb.js');

function serialize_route_guide_v1_GetFeatureRequest(arg) {
  if (!(arg instanceof proto_route_guide_v1_route_guide_pb.GetFeatureRequest)) {
    throw new Error('Expected argument of type route_guide.v1.GetFeatureRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_route_guide_v1_GetFeatureRequest(buffer_arg) {
  return proto_route_guide_v1_route_guide_pb.GetFeatureRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_route_guide_v1_GetFeatureResponse(arg) {
  if (!(arg instanceof proto_route_guide_v1_route_guide_pb.GetFeatureResponse)) {
    throw new Error('Expected argument of type route_guide.v1.GetFeatureResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_route_guide_v1_GetFeatureResponse(buffer_arg) {
  return proto_route_guide_v1_route_guide_pb.GetFeatureResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_route_guide_v1_ListFeaturesRequest(arg) {
  if (!(arg instanceof proto_route_guide_v1_route_guide_pb.ListFeaturesRequest)) {
    throw new Error('Expected argument of type route_guide.v1.ListFeaturesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_route_guide_v1_ListFeaturesRequest(buffer_arg) {
  return proto_route_guide_v1_route_guide_pb.ListFeaturesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_route_guide_v1_ListFeaturesResponse(arg) {
  if (!(arg instanceof proto_route_guide_v1_route_guide_pb.ListFeaturesResponse)) {
    throw new Error('Expected argument of type route_guide.v1.ListFeaturesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_route_guide_v1_ListFeaturesResponse(buffer_arg) {
  return proto_route_guide_v1_route_guide_pb.ListFeaturesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_route_guide_v1_RecordRouteRequest(arg) {
  if (!(arg instanceof proto_route_guide_v1_route_guide_pb.RecordRouteRequest)) {
    throw new Error('Expected argument of type route_guide.v1.RecordRouteRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_route_guide_v1_RecordRouteRequest(buffer_arg) {
  return proto_route_guide_v1_route_guide_pb.RecordRouteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_route_guide_v1_RecordRouteResponse(arg) {
  if (!(arg instanceof proto_route_guide_v1_route_guide_pb.RecordRouteResponse)) {
    throw new Error('Expected argument of type route_guide.v1.RecordRouteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_route_guide_v1_RecordRouteResponse(buffer_arg) {
  return proto_route_guide_v1_route_guide_pb.RecordRouteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_route_guide_v1_RouteChatRequest(arg) {
  if (!(arg instanceof proto_route_guide_v1_route_guide_pb.RouteChatRequest)) {
    throw new Error('Expected argument of type route_guide.v1.RouteChatRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_route_guide_v1_RouteChatRequest(buffer_arg) {
  return proto_route_guide_v1_route_guide_pb.RouteChatRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_route_guide_v1_RouteChatResponse(arg) {
  if (!(arg instanceof proto_route_guide_v1_route_guide_pb.RouteChatResponse)) {
    throw new Error('Expected argument of type route_guide.v1.RouteChatResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_route_guide_v1_RouteChatResponse(buffer_arg) {
  return proto_route_guide_v1_route_guide_pb.RouteChatResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Interface exported by the server.
var RouteGuideServiceService = exports.RouteGuideServiceService = {
  // A simple RPC.
//
// Obtains the feature at a given position.
//
// A feature with an empty name is returned if there's no feature at the given
// position.
getFeature: {
    path: '/route_guide.v1.RouteGuideService/GetFeature',
    requestStream: false,
    responseStream: false,
    requestType: proto_route_guide_v1_route_guide_pb.GetFeatureRequest,
    responseType: proto_route_guide_v1_route_guide_pb.GetFeatureResponse,
    requestSerialize: serialize_route_guide_v1_GetFeatureRequest,
    requestDeserialize: deserialize_route_guide_v1_GetFeatureRequest,
    responseSerialize: serialize_route_guide_v1_GetFeatureResponse,
    responseDeserialize: deserialize_route_guide_v1_GetFeatureResponse,
  },
  // A server-to-client streaming RPC.
//
// Obtains the Features available within the given Rectangle.  Results are
// streamed rather than returned at once (e.g. in a response message with a
// repeated field), as the rectangle may cover a large area and contain a
// huge number of features.
listFeatures: {
    path: '/route_guide.v1.RouteGuideService/ListFeatures',
    requestStream: false,
    responseStream: true,
    requestType: proto_route_guide_v1_route_guide_pb.ListFeaturesRequest,
    responseType: proto_route_guide_v1_route_guide_pb.ListFeaturesResponse,
    requestSerialize: serialize_route_guide_v1_ListFeaturesRequest,
    requestDeserialize: deserialize_route_guide_v1_ListFeaturesRequest,
    responseSerialize: serialize_route_guide_v1_ListFeaturesResponse,
    responseDeserialize: deserialize_route_guide_v1_ListFeaturesResponse,
  },
  // A client-to-server streaming RPC.
//
// Accepts a stream of Points on a route being traversed, returning a
// RouteSummary when traversal is completed.
recordRoute: {
    path: '/route_guide.v1.RouteGuideService/RecordRoute',
    requestStream: true,
    responseStream: false,
    requestType: proto_route_guide_v1_route_guide_pb.RecordRouteRequest,
    responseType: proto_route_guide_v1_route_guide_pb.RecordRouteResponse,
    requestSerialize: serialize_route_guide_v1_RecordRouteRequest,
    requestDeserialize: deserialize_route_guide_v1_RecordRouteRequest,
    responseSerialize: serialize_route_guide_v1_RecordRouteResponse,
    responseDeserialize: deserialize_route_guide_v1_RecordRouteResponse,
  },
  // A Bidirectional streaming RPC.
//
// Accepts a stream of RouteNotes sent while a route is being traversed,
// while receiving other RouteNotes (e.g. from other users).
routeChat: {
    path: '/route_guide.v1.RouteGuideService/RouteChat',
    requestStream: true,
    responseStream: true,
    requestType: proto_route_guide_v1_route_guide_pb.RouteChatRequest,
    responseType: proto_route_guide_v1_route_guide_pb.RouteChatResponse,
    requestSerialize: serialize_route_guide_v1_RouteChatRequest,
    requestDeserialize: deserialize_route_guide_v1_RouteChatRequest,
    responseSerialize: serialize_route_guide_v1_RouteChatResponse,
    responseDeserialize: deserialize_route_guide_v1_RouteChatResponse,
  },
};

exports.RouteGuideServiceClient = grpc.makeGenericClientConstructor(RouteGuideServiceService);
