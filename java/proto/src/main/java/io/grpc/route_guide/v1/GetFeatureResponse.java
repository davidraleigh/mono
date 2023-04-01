// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route_guide/v1/route_guide.proto

package io.grpc.route_guide.v1;

/**
 * Protobuf type {@code route_guide.v1.GetFeatureResponse}
 */
public final class GetFeatureResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:route_guide.v1.GetFeatureResponse)
    GetFeatureResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetFeatureResponse.newBuilder() to construct.
  private GetFeatureResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetFeatureResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetFeatureResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.route_guide.v1.RouteGuideProto.internal_static_route_guide_v1_GetFeatureResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.route_guide.v1.RouteGuideProto.internal_static_route_guide_v1_GetFeatureResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.route_guide.v1.GetFeatureResponse.class, io.grpc.route_guide.v1.GetFeatureResponse.Builder.class);
  }

  public static final int FEATURE_FIELD_NUMBER = 1;
  private io.grpc.route_guide.v1.Feature feature_;
  /**
   * <code>.route_guide.v1.Feature feature = 1 [json_name = "feature"];</code>
   * @return Whether the feature field is set.
   */
  @java.lang.Override
  public boolean hasFeature() {
    return feature_ != null;
  }
  /**
   * <code>.route_guide.v1.Feature feature = 1 [json_name = "feature"];</code>
   * @return The feature.
   */
  @java.lang.Override
  public io.grpc.route_guide.v1.Feature getFeature() {
    return feature_ == null ? io.grpc.route_guide.v1.Feature.getDefaultInstance() : feature_;
  }
  /**
   * <code>.route_guide.v1.Feature feature = 1 [json_name = "feature"];</code>
   */
  @java.lang.Override
  public io.grpc.route_guide.v1.FeatureOrBuilder getFeatureOrBuilder() {
    return getFeature();
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
    if (feature_ != null) {
      output.writeMessage(1, getFeature());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (feature_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFeature());
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
    if (!(obj instanceof io.grpc.route_guide.v1.GetFeatureResponse)) {
      return super.equals(obj);
    }
    io.grpc.route_guide.v1.GetFeatureResponse other = (io.grpc.route_guide.v1.GetFeatureResponse) obj;

    if (hasFeature() != other.hasFeature()) return false;
    if (hasFeature()) {
      if (!getFeature()
          .equals(other.getFeature())) return false;
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
    if (hasFeature()) {
      hash = (37 * hash) + FEATURE_FIELD_NUMBER;
      hash = (53 * hash) + getFeature().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.route_guide.v1.GetFeatureResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.route_guide.v1.GetFeatureResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.route_guide.v1.GetFeatureResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.route_guide.v1.GetFeatureResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.route_guide.v1.GetFeatureResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.route_guide.v1.GetFeatureResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.route_guide.v1.GetFeatureResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.route_guide.v1.GetFeatureResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.route_guide.v1.GetFeatureResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.route_guide.v1.GetFeatureResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.route_guide.v1.GetFeatureResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.route_guide.v1.GetFeatureResponse parseFrom(
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
  public static Builder newBuilder(io.grpc.route_guide.v1.GetFeatureResponse prototype) {
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
   * Protobuf type {@code route_guide.v1.GetFeatureResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:route_guide.v1.GetFeatureResponse)
      io.grpc.route_guide.v1.GetFeatureResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.route_guide.v1.RouteGuideProto.internal_static_route_guide_v1_GetFeatureResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.route_guide.v1.RouteGuideProto.internal_static_route_guide_v1_GetFeatureResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.route_guide.v1.GetFeatureResponse.class, io.grpc.route_guide.v1.GetFeatureResponse.Builder.class);
    }

    // Construct using io.grpc.route_guide.v1.GetFeatureResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (featureBuilder_ == null) {
        feature_ = null;
      } else {
        feature_ = null;
        featureBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.route_guide.v1.RouteGuideProto.internal_static_route_guide_v1_GetFeatureResponse_descriptor;
    }

    @java.lang.Override
    public io.grpc.route_guide.v1.GetFeatureResponse getDefaultInstanceForType() {
      return io.grpc.route_guide.v1.GetFeatureResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.route_guide.v1.GetFeatureResponse build() {
      io.grpc.route_guide.v1.GetFeatureResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.route_guide.v1.GetFeatureResponse buildPartial() {
      io.grpc.route_guide.v1.GetFeatureResponse result = new io.grpc.route_guide.v1.GetFeatureResponse(this);
      if (featureBuilder_ == null) {
        result.feature_ = feature_;
      } else {
        result.feature_ = featureBuilder_.build();
      }
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
      if (other instanceof io.grpc.route_guide.v1.GetFeatureResponse) {
        return mergeFrom((io.grpc.route_guide.v1.GetFeatureResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.route_guide.v1.GetFeatureResponse other) {
      if (other == io.grpc.route_guide.v1.GetFeatureResponse.getDefaultInstance()) return this;
      if (other.hasFeature()) {
        mergeFeature(other.getFeature());
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
                  getFeatureFieldBuilder().getBuilder(),
                  extensionRegistry);

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

    private io.grpc.route_guide.v1.Feature feature_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.route_guide.v1.Feature, io.grpc.route_guide.v1.Feature.Builder, io.grpc.route_guide.v1.FeatureOrBuilder> featureBuilder_;
    /**
     * <code>.route_guide.v1.Feature feature = 1 [json_name = "feature"];</code>
     * @return Whether the feature field is set.
     */
    public boolean hasFeature() {
      return featureBuilder_ != null || feature_ != null;
    }
    /**
     * <code>.route_guide.v1.Feature feature = 1 [json_name = "feature"];</code>
     * @return The feature.
     */
    public io.grpc.route_guide.v1.Feature getFeature() {
      if (featureBuilder_ == null) {
        return feature_ == null ? io.grpc.route_guide.v1.Feature.getDefaultInstance() : feature_;
      } else {
        return featureBuilder_.getMessage();
      }
    }
    /**
     * <code>.route_guide.v1.Feature feature = 1 [json_name = "feature"];</code>
     */
    public Builder setFeature(io.grpc.route_guide.v1.Feature value) {
      if (featureBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        feature_ = value;
        onChanged();
      } else {
        featureBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.route_guide.v1.Feature feature = 1 [json_name = "feature"];</code>
     */
    public Builder setFeature(
        io.grpc.route_guide.v1.Feature.Builder builderForValue) {
      if (featureBuilder_ == null) {
        feature_ = builderForValue.build();
        onChanged();
      } else {
        featureBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.route_guide.v1.Feature feature = 1 [json_name = "feature"];</code>
     */
    public Builder mergeFeature(io.grpc.route_guide.v1.Feature value) {
      if (featureBuilder_ == null) {
        if (feature_ != null) {
          feature_ =
            io.grpc.route_guide.v1.Feature.newBuilder(feature_).mergeFrom(value).buildPartial();
        } else {
          feature_ = value;
        }
        onChanged();
      } else {
        featureBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.route_guide.v1.Feature feature = 1 [json_name = "feature"];</code>
     */
    public Builder clearFeature() {
      if (featureBuilder_ == null) {
        feature_ = null;
        onChanged();
      } else {
        feature_ = null;
        featureBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.route_guide.v1.Feature feature = 1 [json_name = "feature"];</code>
     */
    public io.grpc.route_guide.v1.Feature.Builder getFeatureBuilder() {
      
      onChanged();
      return getFeatureFieldBuilder().getBuilder();
    }
    /**
     * <code>.route_guide.v1.Feature feature = 1 [json_name = "feature"];</code>
     */
    public io.grpc.route_guide.v1.FeatureOrBuilder getFeatureOrBuilder() {
      if (featureBuilder_ != null) {
        return featureBuilder_.getMessageOrBuilder();
      } else {
        return feature_ == null ?
            io.grpc.route_guide.v1.Feature.getDefaultInstance() : feature_;
      }
    }
    /**
     * <code>.route_guide.v1.Feature feature = 1 [json_name = "feature"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.route_guide.v1.Feature, io.grpc.route_guide.v1.Feature.Builder, io.grpc.route_guide.v1.FeatureOrBuilder> 
        getFeatureFieldBuilder() {
      if (featureBuilder_ == null) {
        featureBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grpc.route_guide.v1.Feature, io.grpc.route_guide.v1.Feature.Builder, io.grpc.route_guide.v1.FeatureOrBuilder>(
                getFeature(),
                getParentForChildren(),
                isClean());
        feature_ = null;
      }
      return featureBuilder_;
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


    // @@protoc_insertion_point(builder_scope:route_guide.v1.GetFeatureResponse)
  }

  // @@protoc_insertion_point(class_scope:route_guide.v1.GetFeatureResponse)
  private static final io.grpc.route_guide.v1.GetFeatureResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.route_guide.v1.GetFeatureResponse();
  }

  public static io.grpc.route_guide.v1.GetFeatureResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetFeatureResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetFeatureResponse>() {
    @java.lang.Override
    public GetFeatureResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetFeatureResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetFeatureResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.route_guide.v1.GetFeatureResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

