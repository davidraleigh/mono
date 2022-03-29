# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/route_guide/v1/route_guide.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/route_guide/v1/route_guide.proto',
  package='route_guide.v1',
  syntax='proto3',
  serialized_options=b'\n\026io.grpc.route_guide.v1B\017RouteGuideProtoP\001Z2github.com/davidraleigh/mono/golang/route_guide/v1\242\002\003RTG\252\002\026io.grpc.route_guide.v1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n&proto/route_guide/v1/route_guide.proto\x12\x0eroute_guide.v1\"A\n\x05Point\x12\x1a\n\x08latitude\x18\x01 \x01(\x05R\x08latitude\x12\x1c\n\tlongitude\x18\x02 \x01(\x05R\tlongitude\"c\n\x13ListFeaturesRequest\x12%\n\x02lo\x18\x01 \x01(\x0b\x32\x15.route_guide.v1.PointR\x02lo\x12%\n\x02hi\x18\x02 \x01(\x0b\x32\x15.route_guide.v1.PointR\x02hi\"G\n\x12GetFeatureResponse\x12\x31\n\x07\x66\x65\x61ture\x18\x01 \x01(\x0b\x32\x17.route_guide.v1.FeatureR\x07\x66\x65\x61ture\"@\n\x11GetFeatureRequest\x12+\n\x05point\x18\x01 \x01(\x0b\x32\x15.route_guide.v1.PointR\x05point\"I\n\x14ListFeaturesResponse\x12\x31\n\x07\x66\x65\x61ture\x18\x01 \x01(\x0b\x32\x17.route_guide.v1.FeatureR\x07\x66\x65\x61ture\"A\n\x12RecordRouteRequest\x12+\n\x05point\x18\x01 \x01(\x0b\x32\x15.route_guide.v1.PointR\x05point\"L\n\x10RouteChatRequest\x12\x38\n\nroute_note\x18\x01 \x01(\x0b\x32\x19.route_guide.v1.RouteNoteR\trouteNote\"M\n\x11RouteChatResponse\x12\x38\n\nroute_note\x18\x01 \x01(\x0b\x32\x19.route_guide.v1.RouteNoteR\trouteNote\"P\n\x07\x46\x65\x61ture\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12\x31\n\x08location\x18\x02 \x01(\x0b\x32\x15.route_guide.v1.PointR\x08location\"D\n\x0f\x46\x65\x61tureDatabase\x12\x31\n\x07\x66\x65\x61ture\x18\x01 \x03(\x0b\x32\x17.route_guide.v1.FeatureR\x07\x66\x65\x61ture\"X\n\tRouteNote\x12\x31\n\x08location\x18\x01 \x01(\x0b\x32\x15.route_guide.v1.PointR\x08location\x12\x18\n\x07message\x18\x02 \x01(\tR\x07message\"\x9a\x01\n\x13RecordRouteResponse\x12\x1f\n\x0bpoint_count\x18\x01 \x01(\x05R\npointCount\x12#\n\rfeature_count\x18\x02 \x01(\x05R\x0c\x66\x65\x61tureCount\x12\x1a\n\x08\x64istance\x18\x03 \x01(\x05R\x08\x64istance\x12!\n\x0c\x65lapsed_time\x18\x04 \x01(\x05R\x0b\x65lapsedTime2\xfd\x02\n\x11RouteGuideService\x12U\n\nGetFeature\x12!.route_guide.v1.GetFeatureRequest\x1a\".route_guide.v1.GetFeatureResponse\"\x00\x12]\n\x0cListFeatures\x12#.route_guide.v1.ListFeaturesRequest\x1a$.route_guide.v1.ListFeaturesResponse\"\x00\x30\x01\x12Z\n\x0bRecordRoute\x12\".route_guide.v1.RecordRouteRequest\x1a#.route_guide.v1.RecordRouteResponse\"\x00(\x01\x12V\n\tRouteChat\x12 .route_guide.v1.RouteChatRequest\x1a!.route_guide.v1.RouteChatResponse\"\x00(\x01\x30\x01\x42~\n\x16io.grpc.route_guide.v1B\x0fRouteGuideProtoP\x01Z2github.com/davidraleigh/mono/golang/route_guide/v1\xa2\x02\x03RTG\xaa\x02\x16io.grpc.route_guide.v1b\x06proto3'
)




_POINT = _descriptor.Descriptor(
  name='Point',
  full_name='route_guide.v1.Point',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='latitude', full_name='route_guide.v1.Point.latitude', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='latitude', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='longitude', full_name='route_guide.v1.Point.longitude', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='longitude', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=58,
  serialized_end=123,
)


_LISTFEATURESREQUEST = _descriptor.Descriptor(
  name='ListFeaturesRequest',
  full_name='route_guide.v1.ListFeaturesRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='lo', full_name='route_guide.v1.ListFeaturesRequest.lo', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='lo', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='hi', full_name='route_guide.v1.ListFeaturesRequest.hi', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='hi', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=125,
  serialized_end=224,
)


_GETFEATURERESPONSE = _descriptor.Descriptor(
  name='GetFeatureResponse',
  full_name='route_guide.v1.GetFeatureResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='feature', full_name='route_guide.v1.GetFeatureResponse.feature', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='feature', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=226,
  serialized_end=297,
)


_GETFEATUREREQUEST = _descriptor.Descriptor(
  name='GetFeatureRequest',
  full_name='route_guide.v1.GetFeatureRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='point', full_name='route_guide.v1.GetFeatureRequest.point', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='point', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=299,
  serialized_end=363,
)


_LISTFEATURESRESPONSE = _descriptor.Descriptor(
  name='ListFeaturesResponse',
  full_name='route_guide.v1.ListFeaturesResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='feature', full_name='route_guide.v1.ListFeaturesResponse.feature', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='feature', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=365,
  serialized_end=438,
)


_RECORDROUTEREQUEST = _descriptor.Descriptor(
  name='RecordRouteRequest',
  full_name='route_guide.v1.RecordRouteRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='point', full_name='route_guide.v1.RecordRouteRequest.point', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='point', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=440,
  serialized_end=505,
)


_ROUTECHATREQUEST = _descriptor.Descriptor(
  name='RouteChatRequest',
  full_name='route_guide.v1.RouteChatRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='route_note', full_name='route_guide.v1.RouteChatRequest.route_note', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='routeNote', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=507,
  serialized_end=583,
)


_ROUTECHATRESPONSE = _descriptor.Descriptor(
  name='RouteChatResponse',
  full_name='route_guide.v1.RouteChatResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='route_note', full_name='route_guide.v1.RouteChatResponse.route_note', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='routeNote', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=585,
  serialized_end=662,
)


_FEATURE = _descriptor.Descriptor(
  name='Feature',
  full_name='route_guide.v1.Feature',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='route_guide.v1.Feature.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='name', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='location', full_name='route_guide.v1.Feature.location', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='location', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=664,
  serialized_end=744,
)


_FEATUREDATABASE = _descriptor.Descriptor(
  name='FeatureDatabase',
  full_name='route_guide.v1.FeatureDatabase',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='feature', full_name='route_guide.v1.FeatureDatabase.feature', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='feature', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=746,
  serialized_end=814,
)


_ROUTENOTE = _descriptor.Descriptor(
  name='RouteNote',
  full_name='route_guide.v1.RouteNote',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='location', full_name='route_guide.v1.RouteNote.location', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='location', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='message', full_name='route_guide.v1.RouteNote.message', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='message', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=816,
  serialized_end=904,
)


_RECORDROUTERESPONSE = _descriptor.Descriptor(
  name='RecordRouteResponse',
  full_name='route_guide.v1.RecordRouteResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='point_count', full_name='route_guide.v1.RecordRouteResponse.point_count', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='pointCount', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='feature_count', full_name='route_guide.v1.RecordRouteResponse.feature_count', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='featureCount', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='distance', full_name='route_guide.v1.RecordRouteResponse.distance', index=2,
      number=3, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='distance', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='elapsed_time', full_name='route_guide.v1.RecordRouteResponse.elapsed_time', index=3,
      number=4, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='elapsedTime', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=907,
  serialized_end=1061,
)

_LISTFEATURESREQUEST.fields_by_name['lo'].message_type = _POINT
_LISTFEATURESREQUEST.fields_by_name['hi'].message_type = _POINT
_GETFEATURERESPONSE.fields_by_name['feature'].message_type = _FEATURE
_GETFEATUREREQUEST.fields_by_name['point'].message_type = _POINT
_LISTFEATURESRESPONSE.fields_by_name['feature'].message_type = _FEATURE
_RECORDROUTEREQUEST.fields_by_name['point'].message_type = _POINT
_ROUTECHATREQUEST.fields_by_name['route_note'].message_type = _ROUTENOTE
_ROUTECHATRESPONSE.fields_by_name['route_note'].message_type = _ROUTENOTE
_FEATURE.fields_by_name['location'].message_type = _POINT
_FEATUREDATABASE.fields_by_name['feature'].message_type = _FEATURE
_ROUTENOTE.fields_by_name['location'].message_type = _POINT
DESCRIPTOR.message_types_by_name['Point'] = _POINT
DESCRIPTOR.message_types_by_name['ListFeaturesRequest'] = _LISTFEATURESREQUEST
DESCRIPTOR.message_types_by_name['GetFeatureResponse'] = _GETFEATURERESPONSE
DESCRIPTOR.message_types_by_name['GetFeatureRequest'] = _GETFEATUREREQUEST
DESCRIPTOR.message_types_by_name['ListFeaturesResponse'] = _LISTFEATURESRESPONSE
DESCRIPTOR.message_types_by_name['RecordRouteRequest'] = _RECORDROUTEREQUEST
DESCRIPTOR.message_types_by_name['RouteChatRequest'] = _ROUTECHATREQUEST
DESCRIPTOR.message_types_by_name['RouteChatResponse'] = _ROUTECHATRESPONSE
DESCRIPTOR.message_types_by_name['Feature'] = _FEATURE
DESCRIPTOR.message_types_by_name['FeatureDatabase'] = _FEATUREDATABASE
DESCRIPTOR.message_types_by_name['RouteNote'] = _ROUTENOTE
DESCRIPTOR.message_types_by_name['RecordRouteResponse'] = _RECORDROUTERESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Point = _reflection.GeneratedProtocolMessageType('Point', (_message.Message,), {
  'DESCRIPTOR' : _POINT,
  '__module__' : 'proto.route_guide.v1.route_guide_pb2'
  # @@protoc_insertion_point(class_scope:route_guide.v1.Point)
  })
_sym_db.RegisterMessage(Point)

ListFeaturesRequest = _reflection.GeneratedProtocolMessageType('ListFeaturesRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTFEATURESREQUEST,
  '__module__' : 'proto.route_guide.v1.route_guide_pb2'
  # @@protoc_insertion_point(class_scope:route_guide.v1.ListFeaturesRequest)
  })
_sym_db.RegisterMessage(ListFeaturesRequest)

GetFeatureResponse = _reflection.GeneratedProtocolMessageType('GetFeatureResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETFEATURERESPONSE,
  '__module__' : 'proto.route_guide.v1.route_guide_pb2'
  # @@protoc_insertion_point(class_scope:route_guide.v1.GetFeatureResponse)
  })
_sym_db.RegisterMessage(GetFeatureResponse)

GetFeatureRequest = _reflection.GeneratedProtocolMessageType('GetFeatureRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETFEATUREREQUEST,
  '__module__' : 'proto.route_guide.v1.route_guide_pb2'
  # @@protoc_insertion_point(class_scope:route_guide.v1.GetFeatureRequest)
  })
_sym_db.RegisterMessage(GetFeatureRequest)

ListFeaturesResponse = _reflection.GeneratedProtocolMessageType('ListFeaturesResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTFEATURESRESPONSE,
  '__module__' : 'proto.route_guide.v1.route_guide_pb2'
  # @@protoc_insertion_point(class_scope:route_guide.v1.ListFeaturesResponse)
  })
_sym_db.RegisterMessage(ListFeaturesResponse)

RecordRouteRequest = _reflection.GeneratedProtocolMessageType('RecordRouteRequest', (_message.Message,), {
  'DESCRIPTOR' : _RECORDROUTEREQUEST,
  '__module__' : 'proto.route_guide.v1.route_guide_pb2'
  # @@protoc_insertion_point(class_scope:route_guide.v1.RecordRouteRequest)
  })
_sym_db.RegisterMessage(RecordRouteRequest)

RouteChatRequest = _reflection.GeneratedProtocolMessageType('RouteChatRequest', (_message.Message,), {
  'DESCRIPTOR' : _ROUTECHATREQUEST,
  '__module__' : 'proto.route_guide.v1.route_guide_pb2'
  # @@protoc_insertion_point(class_scope:route_guide.v1.RouteChatRequest)
  })
_sym_db.RegisterMessage(RouteChatRequest)

RouteChatResponse = _reflection.GeneratedProtocolMessageType('RouteChatResponse', (_message.Message,), {
  'DESCRIPTOR' : _ROUTECHATRESPONSE,
  '__module__' : 'proto.route_guide.v1.route_guide_pb2'
  # @@protoc_insertion_point(class_scope:route_guide.v1.RouteChatResponse)
  })
_sym_db.RegisterMessage(RouteChatResponse)

Feature = _reflection.GeneratedProtocolMessageType('Feature', (_message.Message,), {
  'DESCRIPTOR' : _FEATURE,
  '__module__' : 'proto.route_guide.v1.route_guide_pb2'
  # @@protoc_insertion_point(class_scope:route_guide.v1.Feature)
  })
_sym_db.RegisterMessage(Feature)

FeatureDatabase = _reflection.GeneratedProtocolMessageType('FeatureDatabase', (_message.Message,), {
  'DESCRIPTOR' : _FEATUREDATABASE,
  '__module__' : 'proto.route_guide.v1.route_guide_pb2'
  # @@protoc_insertion_point(class_scope:route_guide.v1.FeatureDatabase)
  })
_sym_db.RegisterMessage(FeatureDatabase)

RouteNote = _reflection.GeneratedProtocolMessageType('RouteNote', (_message.Message,), {
  'DESCRIPTOR' : _ROUTENOTE,
  '__module__' : 'proto.route_guide.v1.route_guide_pb2'
  # @@protoc_insertion_point(class_scope:route_guide.v1.RouteNote)
  })
_sym_db.RegisterMessage(RouteNote)

RecordRouteResponse = _reflection.GeneratedProtocolMessageType('RecordRouteResponse', (_message.Message,), {
  'DESCRIPTOR' : _RECORDROUTERESPONSE,
  '__module__' : 'proto.route_guide.v1.route_guide_pb2'
  # @@protoc_insertion_point(class_scope:route_guide.v1.RecordRouteResponse)
  })
_sym_db.RegisterMessage(RecordRouteResponse)


DESCRIPTOR._options = None

_ROUTEGUIDESERVICE = _descriptor.ServiceDescriptor(
  name='RouteGuideService',
  full_name='route_guide.v1.RouteGuideService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=1064,
  serialized_end=1445,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetFeature',
    full_name='route_guide.v1.RouteGuideService.GetFeature',
    index=0,
    containing_service=None,
    input_type=_GETFEATUREREQUEST,
    output_type=_GETFEATURERESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='ListFeatures',
    full_name='route_guide.v1.RouteGuideService.ListFeatures',
    index=1,
    containing_service=None,
    input_type=_LISTFEATURESREQUEST,
    output_type=_LISTFEATURESRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='RecordRoute',
    full_name='route_guide.v1.RouteGuideService.RecordRoute',
    index=2,
    containing_service=None,
    input_type=_RECORDROUTEREQUEST,
    output_type=_RECORDROUTERESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='RouteChat',
    full_name='route_guide.v1.RouteGuideService.RouteChat',
    index=3,
    containing_service=None,
    input_type=_ROUTECHATREQUEST,
    output_type=_ROUTECHATRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_ROUTEGUIDESERVICE)

DESCRIPTOR.services_by_name['RouteGuideService'] = _ROUTEGUIDESERVICE

# @@protoc_insertion_point(module_scope)