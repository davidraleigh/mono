from route_guide.v1 import route_guide_pb2 as _route_guide_pb2
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class RoutePointTest(_message.Message):
    __slots__ = ["point"]
    POINT_FIELD_NUMBER: _ClassVar[int]
    point: _route_guide_pb2.Point
    def __init__(self, point: _Optional[_Union[_route_guide_pb2.Point, _Mapping]] = ...) -> None: ...
