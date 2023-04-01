// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route_guide/v1/route_guide.proto

package io.grpc.route_guide.v1;

/**
 * Protobuf type {@code route_guide.v1.RecordRouteRequest}
 */
public final class RecordRouteRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:route_guide.v1.RecordRouteRequest)
    RecordRouteRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RecordRouteRequest.newBuilder() to construct.
  private RecordRouteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecordRouteRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RecordRouteRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.route_guide.v1.RouteGuideProto.internal_static_route_guide_v1_RecordRouteRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.route_guide.v1.RouteGuideProto.internal_static_route_guide_v1_RecordRouteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.route_guide.v1.RecordRouteRequest.class, io.grpc.route_guide.v1.RecordRouteRequest.Builder.class);
  }

  public static final int POINT_FIELD_NUMBER = 1;
  private io.grpc.route_guide.v1.Point point_;
  /**
   * <code>.route_guide.v1.Point point = 1 [json_name = "point"];</code>
   * @return Whether the point field is set.
   */
  @java.lang.Override
  public boolean hasPoint() {
    return point_ != null;
  }
  /**
   * <code>.route_guide.v1.Point point = 1 [json_name = "point"];</code>
   * @return The point.
   */
  @java.lang.Override
  public io.grpc.route_guide.v1.Point getPoint() {
    return point_ == null ? io.grpc.route_guide.v1.Point.getDefaultInstance() : point_;
  }
  /**
   * <code>.route_guide.v1.Point point = 1 [json_name = "point"];</code>
   */
  @java.lang.Override
  public io.grpc.route_guide.v1.PointOrBuilder getPointOrBuilder() {
    return point_ == null ? io.grpc.route_guide.v1.Point.getDefaultInstance() : point_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (point_ != null) {
      output.writeMessage(1, getPoint());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (point_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPoint());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.route_guide.v1.RecordRouteRequest)) {
      return super.equals(obj);
    }
    io.grpc.route_guide.v1.RecordRouteRequest other = (io.grpc.route_guide.v1.RecordRouteRequest) obj;

    if (hasPoint() != other.hasPoint()) return false;
    if (hasPoint()) {
      if (!getPoint()
          .equals(other.getPoint())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasPoint()) {
      hash = (37 * hash) + POINT_FIELD_NUMBER;
      hash = (53 * hash) + getPoint().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.route_guide.v1.RecordRouteRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.route_guide.v1.RecordRouteRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.route_guide.v1.RecordRouteRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.route_guide.v1.RecordRouteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.route_guide.v1.RecordRouteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.route_guide.v1.RecordRouteRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.route_guide.v1.RecordRouteRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.route_guide.v1.RecordRouteRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.route_guide.v1.RecordRouteRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.route_guide.v1.RecordRouteRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.route_guide.v1.RecordRouteRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.route_guide.v1.RecordRouteRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.route_guide.v1.RecordRouteRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code route_guide.v1.RecordRouteRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:route_guide.v1.RecordRouteRequest)
      io.grpc.route_guide.v1.RecordRouteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.route_guide.v1.RouteGuideProto.internal_static_route_guide_v1_RecordRouteRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.route_guide.v1.RouteGuideProto.internal_static_route_guide_v1_RecordRouteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.route_guide.v1.RecordRouteRequest.class, io.grpc.route_guide.v1.RecordRouteRequest.Builder.class);
    }

    // Construct using io.grpc.route_guide.v1.RecordRouteRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      point_ = null;
      if (pointBuilder_ != null) {
        pointBuilder_.dispose();
        pointBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.route_guide.v1.RouteGuideProto.internal_static_route_guide_v1_RecordRouteRequest_descriptor;
    }

    @java.lang.Override
    public io.grpc.route_guide.v1.RecordRouteRequest getDefaultInstanceForType() {
      return io.grpc.route_guide.v1.RecordRouteRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.route_guide.v1.RecordRouteRequest build() {
      io.grpc.route_guide.v1.RecordRouteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.route_guide.v1.RecordRouteRequest buildPartial() {
      io.grpc.route_guide.v1.RecordRouteRequest result = new io.grpc.route_guide.v1.RecordRouteRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.grpc.route_guide.v1.RecordRouteRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.point_ = pointBuilder_ == null
            ? point_
            : pointBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.route_guide.v1.RecordRouteRequest) {
        return mergeFrom((io.grpc.route_guide.v1.RecordRouteRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.route_guide.v1.RecordRouteRequest other) {
      if (other == io.grpc.route_guide.v1.RecordRouteRequest.getDefaultInstance()) return this;
      if (other.hasPoint()) {
        mergePoint(other.getPoint());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getPointFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private io.grpc.route_guide.v1.Point point_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.route_guide.v1.Point, io.grpc.route_guide.v1.Point.Builder, io.grpc.route_guide.v1.PointOrBuilder> pointBuilder_;
    /**
     * <code>.route_guide.v1.Point point = 1 [json_name = "point"];</code>
     * @return Whether the point field is set.
     */
    public boolean hasPoint() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.route_guide.v1.Point point = 1 [json_name = "point"];</code>
     * @return The point.
     */
    public io.grpc.route_guide.v1.Point getPoint() {
      if (pointBuilder_ == null) {
        return point_ == null ? io.grpc.route_guide.v1.Point.getDefaultInstance() : point_;
      } else {
        return pointBuilder_.getMessage();
      }
    }
    /**
     * <code>.route_guide.v1.Point point = 1 [json_name = "point"];</code>
     */
    public Builder setPoint(io.grpc.route_guide.v1.Point value) {
      if (pointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        point_ = value;
      } else {
        pointBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.route_guide.v1.Point point = 1 [json_name = "point"];</code>
     */
    public Builder setPoint(
        io.grpc.route_guide.v1.Point.Builder builderForValue) {
      if (pointBuilder_ == null) {
        point_ = builderForValue.build();
      } else {
        pointBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.route_guide.v1.Point point = 1 [json_name = "point"];</code>
     */
    public Builder mergePoint(io.grpc.route_guide.v1.Point value) {
      if (pointBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          point_ != null &&
          point_ != io.grpc.route_guide.v1.Point.getDefaultInstance()) {
          getPointBuilder().mergeFrom(value);
        } else {
          point_ = value;
        }
      } else {
        pointBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.route_guide.v1.Point point = 1 [json_name = "point"];</code>
     */
    public Builder clearPoint() {
      bitField0_ = (bitField0_ & ~0x00000001);
      point_ = null;
      if (pointBuilder_ != null) {
        pointBuilder_.dispose();
        pointBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.route_guide.v1.Point point = 1 [json_name = "point"];</code>
     */
    public io.grpc.route_guide.v1.Point.Builder getPointBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPointFieldBuilder().getBuilder();
    }
    /**
     * <code>.route_guide.v1.Point point = 1 [json_name = "point"];</code>
     */
    public io.grpc.route_guide.v1.PointOrBuilder getPointOrBuilder() {
      if (pointBuilder_ != null) {
        return pointBuilder_.getMessageOrBuilder();
      } else {
        return point_ == null ?
            io.grpc.route_guide.v1.Point.getDefaultInstance() : point_;
      }
    }
    /**
     * <code>.route_guide.v1.Point point = 1 [json_name = "point"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.route_guide.v1.Point, io.grpc.route_guide.v1.Point.Builder, io.grpc.route_guide.v1.PointOrBuilder> 
        getPointFieldBuilder() {
      if (pointBuilder_ == null) {
        pointBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grpc.route_guide.v1.Point, io.grpc.route_guide.v1.Point.Builder, io.grpc.route_guide.v1.PointOrBuilder>(
                getPoint(),
                getParentForChildren(),
                isClean());
        point_ = null;
      }
      return pointBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:route_guide.v1.RecordRouteRequest)
  }

  // @@protoc_insertion_point(class_scope:route_guide.v1.RecordRouteRequest)
  private static final io.grpc.route_guide.v1.RecordRouteRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.route_guide.v1.RecordRouteRequest();
  }

  public static io.grpc.route_guide.v1.RecordRouteRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecordRouteRequest>
      PARSER = new com.google.protobuf.AbstractParser<RecordRouteRequest>() {
    @java.lang.Override
    public RecordRouteRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<RecordRouteRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecordRouteRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.route_guide.v1.RecordRouteRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

