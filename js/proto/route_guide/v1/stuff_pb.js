// source: route_guide/v1/stuff.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

var jspb = require('google-protobuf');
var goog = jspb;
var global =
    (typeof globalThis !== 'undefined' && globalThis) ||
    (typeof window !== 'undefined' && window) ||
    (typeof global !== 'undefined' && global) ||
    (typeof self !== 'undefined' && self) ||
    (function () { return this; }).call(null) ||
    Function('return this')();

var route_guide_v1_route_guide_pb = require('../../route_guide/v1/route_guide_pb.js');
goog.object.extend(proto, route_guide_v1_route_guide_pb);
goog.exportSymbol('proto.route_guide.v1.RoutePointTest', null, global);
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.route_guide.v1.RoutePointTest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.route_guide.v1.RoutePointTest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.route_guide.v1.RoutePointTest.displayName = 'proto.route_guide.v1.RoutePointTest';
}



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.route_guide.v1.RoutePointTest.prototype.toObject = function(opt_includeInstance) {
  return proto.route_guide.v1.RoutePointTest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.route_guide.v1.RoutePointTest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.route_guide.v1.RoutePointTest.toObject = function(includeInstance, msg) {
  var f, obj = {
    point: (f = msg.getPoint()) && route_guide_v1_route_guide_pb.Point.toObject(includeInstance, f)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.route_guide.v1.RoutePointTest}
 */
proto.route_guide.v1.RoutePointTest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.route_guide.v1.RoutePointTest;
  return proto.route_guide.v1.RoutePointTest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.route_guide.v1.RoutePointTest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.route_guide.v1.RoutePointTest}
 */
proto.route_guide.v1.RoutePointTest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new route_guide_v1_route_guide_pb.Point;
      reader.readMessage(value,route_guide_v1_route_guide_pb.Point.deserializeBinaryFromReader);
      msg.setPoint(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.route_guide.v1.RoutePointTest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.route_guide.v1.RoutePointTest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.route_guide.v1.RoutePointTest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.route_guide.v1.RoutePointTest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPoint();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      route_guide_v1_route_guide_pb.Point.serializeBinaryToWriter
    );
  }
};


/**
 * optional Point point = 1;
 * @return {?proto.route_guide.v1.Point}
 */
proto.route_guide.v1.RoutePointTest.prototype.getPoint = function() {
  return /** @type{?proto.route_guide.v1.Point} */ (
    jspb.Message.getWrapperField(this, route_guide_v1_route_guide_pb.Point, 1));
};


/**
 * @param {?proto.route_guide.v1.Point|undefined} value
 * @return {!proto.route_guide.v1.RoutePointTest} returns this
*/
proto.route_guide.v1.RoutePointTest.prototype.setPoint = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.route_guide.v1.RoutePointTest} returns this
 */
proto.route_guide.v1.RoutePointTest.prototype.clearPoint = function() {
  return this.setPoint(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.route_guide.v1.RoutePointTest.prototype.hasPoint = function() {
  return jspb.Message.getField(this, 1) != null;
};


goog.object.extend(exports, proto.route_guide.v1);