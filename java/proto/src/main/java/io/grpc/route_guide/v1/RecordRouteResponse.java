// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route_guide/v1/route_guide.proto

package io.grpc.route_guide.v1;

/**
 * <pre>
 * A RouteSummary is received in response to a RecordRoute rpc.
 * It contains the number of individual points received, the number of
 * detected features, and the total distance covered as the cumulative sum of
 * the distance between each point.
 * </pre>
 *
 * Protobuf type {@code route_guide.v1.RecordRouteResponse}
 */
public final class RecordRouteResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:route_guide.v1.RecordRouteResponse)
    RecordRouteResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RecordRouteResponse.newBuilder() to construct.
  private RecordRouteResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecordRouteResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RecordRouteResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.route_guide.v1.RouteGuideProto.internal_static_route_guide_v1_RecordRouteResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.route_guide.v1.RouteGuideProto.internal_static_route_guide_v1_RecordRouteResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.route_guide.v1.RecordRouteResponse.class, io.grpc.route_guide.v1.RecordRouteResponse.Builder.class);
  }

  public static final int POINT_COUNT_FIELD_NUMBER = 1;
  private int pointCount_;
  /**
   * <pre>
   * The number of points received.
   * </pre>
   *
   * <code>int32 point_count = 1 [json_name = "pointCount"];</code>
   * @return The pointCount.
   */
  @java.lang.Override
  public int getPointCount() {
    return pointCount_;
  }

  public static final int FEATURE_COUNT_FIELD_NUMBER = 2;
  private int featureCount_;
  /**
   * <pre>
   * The number of known features passed while traversing the route.
   * </pre>
   *
   * <code>int32 feature_count = 2 [json_name = "featureCount"];</code>
   * @return The featureCount.
   */
  @java.lang.Override
  public int getFeatureCount() {
    return featureCount_;
  }

  public static final int DISTANCE_FIELD_NUMBER = 3;
  private int distance_;
  /**
   * <pre>
   * The distance covered in metres.
   * </pre>
   *
   * <code>int32 distance = 3 [json_name = "distance"];</code>
   * @return The distance.
   */
  @java.lang.Override
  public int getDistance() {
    return distance_;
  }

  public static final int ELAPSED_TIME_FIELD_NUMBER = 4;
  private int elapsedTime_;
  /**
   * <pre>
   * The duration of the traversal in seconds.
   * </pre>
   *
   * <code>int32 elapsed_time = 4 [json_name = "elapsedTime"];</code>
   * @return The elapsedTime.
   */
  @java.lang.Override
  public int getElapsedTime() {
    return elapsedTime_;
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
    if (pointCount_ != 0) {
      output.writeInt32(1, pointCount_);
    }
    if (featureCount_ != 0) {
      output.writeInt32(2, featureCount_);
    }
    if (distance_ != 0) {
      output.writeInt32(3, distance_);
    }
    if (elapsedTime_ != 0) {
      output.writeInt32(4, elapsedTime_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pointCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, pointCount_);
    }
    if (featureCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, featureCount_);
    }
    if (distance_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, distance_);
    }
    if (elapsedTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, elapsedTime_);
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
    if (!(obj instanceof io.grpc.route_guide.v1.RecordRouteResponse)) {
      return super.equals(obj);
    }
    io.grpc.route_guide.v1.RecordRouteResponse other = (io.grpc.route_guide.v1.RecordRouteResponse) obj;

    if (getPointCount()
        != other.getPointCount()) return false;
    if (getFeatureCount()
        != other.getFeatureCount()) return false;
    if (getDistance()
        != other.getDistance()) return false;
    if (getElapsedTime()
        != other.getElapsedTime()) return false;
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
    hash = (37 * hash) + POINT_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getPointCount();
    hash = (37 * hash) + FEATURE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getFeatureCount();
    hash = (37 * hash) + DISTANCE_FIELD_NUMBER;
    hash = (53 * hash) + getDistance();
    hash = (37 * hash) + ELAPSED_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getElapsedTime();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.route_guide.v1.RecordRouteResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.route_guide.v1.RecordRouteResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.route_guide.v1.RecordRouteResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.route_guide.v1.RecordRouteResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.route_guide.v1.RecordRouteResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.route_guide.v1.RecordRouteResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.route_guide.v1.RecordRouteResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.route_guide.v1.RecordRouteResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.route_guide.v1.RecordRouteResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.route_guide.v1.RecordRouteResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.route_guide.v1.RecordRouteResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.route_guide.v1.RecordRouteResponse parseFrom(
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
  public static Builder newBuilder(io.grpc.route_guide.v1.RecordRouteResponse prototype) {
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
   * <pre>
   * A RouteSummary is received in response to a RecordRoute rpc.
   * It contains the number of individual points received, the number of
   * detected features, and the total distance covered as the cumulative sum of
   * the distance between each point.
   * </pre>
   *
   * Protobuf type {@code route_guide.v1.RecordRouteResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:route_guide.v1.RecordRouteResponse)
      io.grpc.route_guide.v1.RecordRouteResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.route_guide.v1.RouteGuideProto.internal_static_route_guide_v1_RecordRouteResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.route_guide.v1.RouteGuideProto.internal_static_route_guide_v1_RecordRouteResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.route_guide.v1.RecordRouteResponse.class, io.grpc.route_guide.v1.RecordRouteResponse.Builder.class);
    }

    // Construct using io.grpc.route_guide.v1.RecordRouteResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      pointCount_ = 0;

      featureCount_ = 0;

      distance_ = 0;

      elapsedTime_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.route_guide.v1.RouteGuideProto.internal_static_route_guide_v1_RecordRouteResponse_descriptor;
    }

    @java.lang.Override
    public io.grpc.route_guide.v1.RecordRouteResponse getDefaultInstanceForType() {
      return io.grpc.route_guide.v1.RecordRouteResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.route_guide.v1.RecordRouteResponse build() {
      io.grpc.route_guide.v1.RecordRouteResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.route_guide.v1.RecordRouteResponse buildPartial() {
      io.grpc.route_guide.v1.RecordRouteResponse result = new io.grpc.route_guide.v1.RecordRouteResponse(this);
      result.pointCount_ = pointCount_;
      result.featureCount_ = featureCount_;
      result.distance_ = distance_;
      result.elapsedTime_ = elapsedTime_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.route_guide.v1.RecordRouteResponse) {
        return mergeFrom((io.grpc.route_guide.v1.RecordRouteResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.route_guide.v1.RecordRouteResponse other) {
      if (other == io.grpc.route_guide.v1.RecordRouteResponse.getDefaultInstance()) return this;
      if (other.getPointCount() != 0) {
        setPointCount(other.getPointCount());
      }
      if (other.getFeatureCount() != 0) {
        setFeatureCount(other.getFeatureCount());
      }
      if (other.getDistance() != 0) {
        setDistance(other.getDistance());
      }
      if (other.getElapsedTime() != 0) {
        setElapsedTime(other.getElapsedTime());
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
            case 8: {
              pointCount_ = input.readInt32();

              break;
            } // case 8
            case 16: {
              featureCount_ = input.readInt32();

              break;
            } // case 16
            case 24: {
              distance_ = input.readInt32();

              break;
            } // case 24
            case 32: {
              elapsedTime_ = input.readInt32();

              break;
            } // case 32
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

    private int pointCount_ ;
    /**
     * <pre>
     * The number of points received.
     * </pre>
     *
     * <code>int32 point_count = 1 [json_name = "pointCount"];</code>
     * @return The pointCount.
     */
    @java.lang.Override
    public int getPointCount() {
      return pointCount_;
    }
    /**
     * <pre>
     * The number of points received.
     * </pre>
     *
     * <code>int32 point_count = 1 [json_name = "pointCount"];</code>
     * @param value The pointCount to set.
     * @return This builder for chaining.
     */
    public Builder setPointCount(int value) {
      
      pointCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of points received.
     * </pre>
     *
     * <code>int32 point_count = 1 [json_name = "pointCount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPointCount() {
      
      pointCount_ = 0;
      onChanged();
      return this;
    }

    private int featureCount_ ;
    /**
     * <pre>
     * The number of known features passed while traversing the route.
     * </pre>
     *
     * <code>int32 feature_count = 2 [json_name = "featureCount"];</code>
     * @return The featureCount.
     */
    @java.lang.Override
    public int getFeatureCount() {
      return featureCount_;
    }
    /**
     * <pre>
     * The number of known features passed while traversing the route.
     * </pre>
     *
     * <code>int32 feature_count = 2 [json_name = "featureCount"];</code>
     * @param value The featureCount to set.
     * @return This builder for chaining.
     */
    public Builder setFeatureCount(int value) {
      
      featureCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of known features passed while traversing the route.
     * </pre>
     *
     * <code>int32 feature_count = 2 [json_name = "featureCount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFeatureCount() {
      
      featureCount_ = 0;
      onChanged();
      return this;
    }

    private int distance_ ;
    /**
     * <pre>
     * The distance covered in metres.
     * </pre>
     *
     * <code>int32 distance = 3 [json_name = "distance"];</code>
     * @return The distance.
     */
    @java.lang.Override
    public int getDistance() {
      return distance_;
    }
    /**
     * <pre>
     * The distance covered in metres.
     * </pre>
     *
     * <code>int32 distance = 3 [json_name = "distance"];</code>
     * @param value The distance to set.
     * @return This builder for chaining.
     */
    public Builder setDistance(int value) {
      
      distance_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The distance covered in metres.
     * </pre>
     *
     * <code>int32 distance = 3 [json_name = "distance"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDistance() {
      
      distance_ = 0;
      onChanged();
      return this;
    }

    private int elapsedTime_ ;
    /**
     * <pre>
     * The duration of the traversal in seconds.
     * </pre>
     *
     * <code>int32 elapsed_time = 4 [json_name = "elapsedTime"];</code>
     * @return The elapsedTime.
     */
    @java.lang.Override
    public int getElapsedTime() {
      return elapsedTime_;
    }
    /**
     * <pre>
     * The duration of the traversal in seconds.
     * </pre>
     *
     * <code>int32 elapsed_time = 4 [json_name = "elapsedTime"];</code>
     * @param value The elapsedTime to set.
     * @return This builder for chaining.
     */
    public Builder setElapsedTime(int value) {
      
      elapsedTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The duration of the traversal in seconds.
     * </pre>
     *
     * <code>int32 elapsed_time = 4 [json_name = "elapsedTime"];</code>
     * @return This builder for chaining.
     */
    public Builder clearElapsedTime() {
      
      elapsedTime_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:route_guide.v1.RecordRouteResponse)
  }

  // @@protoc_insertion_point(class_scope:route_guide.v1.RecordRouteResponse)
  private static final io.grpc.route_guide.v1.RecordRouteResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.route_guide.v1.RecordRouteResponse();
  }

  public static io.grpc.route_guide.v1.RecordRouteResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecordRouteResponse>
      PARSER = new com.google.protobuf.AbstractParser<RecordRouteResponse>() {
    @java.lang.Override
    public RecordRouteResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<RecordRouteResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecordRouteResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.route_guide.v1.RecordRouteResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
