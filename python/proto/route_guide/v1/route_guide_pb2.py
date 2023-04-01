# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: route_guide/v1/route_guide.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n route_guide/v1/route_guide.proto\x12\x0eroute_guide.v1\"A\n\x05Point\x12\x1a\n\x08latitude\x18\x01 \x01(\x05R\x08latitude\x12\x1c\n\tlongitude\x18\x02 \x01(\x05R\tlongitude\"c\n\x13ListFeaturesRequest\x12%\n\x02lo\x18\x01 \x01(\x0b\x32\x15.route_guide.v1.PointR\x02lo\x12%\n\x02hi\x18\x02 \x01(\x0b\x32\x15.route_guide.v1.PointR\x02hi\"G\n\x12GetFeatureResponse\x12\x31\n\x07\x66\x65\x61ture\x18\x01 \x01(\x0b\x32\x17.route_guide.v1.FeatureR\x07\x66\x65\x61ture\"@\n\x11GetFeatureRequest\x12+\n\x05point\x18\x01 \x01(\x0b\x32\x15.route_guide.v1.PointR\x05point\"I\n\x14ListFeaturesResponse\x12\x31\n\x07\x66\x65\x61ture\x18\x01 \x01(\x0b\x32\x17.route_guide.v1.FeatureR\x07\x66\x65\x61ture\"A\n\x12RecordRouteRequest\x12+\n\x05point\x18\x01 \x01(\x0b\x32\x15.route_guide.v1.PointR\x05point\"L\n\x10RouteChatRequest\x12\x38\n\nroute_note\x18\x01 \x01(\x0b\x32\x19.route_guide.v1.RouteNoteR\trouteNote\"M\n\x11RouteChatResponse\x12\x38\n\nroute_note\x18\x01 \x01(\x0b\x32\x19.route_guide.v1.RouteNoteR\trouteNote\"P\n\x07\x46\x65\x61ture\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12\x31\n\x08location\x18\x02 \x01(\x0b\x32\x15.route_guide.v1.PointR\x08location\"D\n\x0f\x46\x65\x61tureDatabase\x12\x31\n\x07\x66\x65\x61ture\x18\x01 \x03(\x0b\x32\x17.route_guide.v1.FeatureR\x07\x66\x65\x61ture\"X\n\tRouteNote\x12\x31\n\x08location\x18\x01 \x01(\x0b\x32\x15.route_guide.v1.PointR\x08location\x12\x18\n\x07message\x18\x02 \x01(\tR\x07message\"\x9a\x01\n\x13RecordRouteResponse\x12\x1f\n\x0bpoint_count\x18\x01 \x01(\x05R\npointCount\x12#\n\rfeature_count\x18\x02 \x01(\x05R\x0c\x66\x65\x61tureCount\x12\x1a\n\x08\x64istance\x18\x03 \x01(\x05R\x08\x64istance\x12!\n\x0c\x65lapsed_time\x18\x04 \x01(\x05R\x0b\x65lapsedTime2\xfd\x02\n\x11RouteGuideService\x12U\n\nGetFeature\x12!.route_guide.v1.GetFeatureRequest\x1a\".route_guide.v1.GetFeatureResponse\"\x00\x12]\n\x0cListFeatures\x12#.route_guide.v1.ListFeaturesRequest\x1a$.route_guide.v1.ListFeaturesResponse\"\x00\x30\x01\x12Z\n\x0bRecordRoute\x12\".route_guide.v1.RecordRouteRequest\x1a#.route_guide.v1.RecordRouteResponse\"\x00(\x01\x12V\n\tRouteChat\x12 .route_guide.v1.RouteChatRequest\x1a!.route_guide.v1.RouteChatResponse\"\x00(\x01\x30\x01\x42~\n\x16io.grpc.route_guide.v1B\x0fRouteGuideProtoP\x01Z2github.com/davidraleigh/mono/golang/route_guide/v1\xa2\x02\x03RTG\xaa\x02\x16io.grpc.route_guide.v1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'route_guide.v1.route_guide_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\026io.grpc.route_guide.v1B\017RouteGuideProtoP\001Z2github.com/davidraleigh/mono/golang/route_guide/v1\242\002\003RTG\252\002\026io.grpc.route_guide.v1'
  _globals['_POINT']._serialized_start=52
  _globals['_POINT']._serialized_end=117
  _globals['_LISTFEATURESREQUEST']._serialized_start=119
  _globals['_LISTFEATURESREQUEST']._serialized_end=218
  _globals['_GETFEATURERESPONSE']._serialized_start=220
  _globals['_GETFEATURERESPONSE']._serialized_end=291
  _globals['_GETFEATUREREQUEST']._serialized_start=293
  _globals['_GETFEATUREREQUEST']._serialized_end=357
  _globals['_LISTFEATURESRESPONSE']._serialized_start=359
  _globals['_LISTFEATURESRESPONSE']._serialized_end=432
  _globals['_RECORDROUTEREQUEST']._serialized_start=434
  _globals['_RECORDROUTEREQUEST']._serialized_end=499
  _globals['_ROUTECHATREQUEST']._serialized_start=501
  _globals['_ROUTECHATREQUEST']._serialized_end=577
  _globals['_ROUTECHATRESPONSE']._serialized_start=579
  _globals['_ROUTECHATRESPONSE']._serialized_end=656
  _globals['_FEATURE']._serialized_start=658
  _globals['_FEATURE']._serialized_end=738
  _globals['_FEATUREDATABASE']._serialized_start=740
  _globals['_FEATUREDATABASE']._serialized_end=808
  _globals['_ROUTENOTE']._serialized_start=810
  _globals['_ROUTENOTE']._serialized_end=898
  _globals['_RECORDROUTERESPONSE']._serialized_start=901
  _globals['_RECORDROUTERESPONSE']._serialized_end=1055
  _globals['_ROUTEGUIDESERVICE']._serialized_start=1058
  _globals['_ROUTEGUIDESERVICE']._serialized_end=1439
# @@protoc_insertion_point(module_scope)
