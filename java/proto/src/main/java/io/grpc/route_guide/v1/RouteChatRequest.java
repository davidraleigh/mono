// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route_guide/v1/route_guide.proto

package io.grpc.route_guide.v1;

/**
 * Protobuf type {@code route_guide.v1.RouteChatRequest}
 */
public final class RouteChatRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:route_guide.v1.RouteChatRequest)
    RouteChatRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RouteChatRequest.newBuilder() to construct.
  private RouteChatRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RouteChatRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RouteChatRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.route_guide.v1.RouteGuideProto.internal_static_route_guide_v1_RouteChatRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.route_guide.v1.RouteGuideProto.internal_static_route_guide_v1_RouteChatRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.route_guide.v1.RouteChatRequest.class, io.grpc.route_guide.v1.RouteChatRequest.Builder.class);
  }

  public static final int ROUTE_NOTE_FIELD_NUMBER = 1;
  private io.grpc.route_guide.v1.RouteNote routeNote_;
  /**
   * <code>.route_guide.v1.RouteNote route_note = 1 [json_name = "routeNote"];</code>
   * @return Whether the routeNote field is set.
   */
  @java.lang.Override
  public boolean hasRouteNote() {
    return routeNote_ != null;
  }
  /**
   * <code>.route_guide.v1.RouteNote route_note = 1 [json_name = "routeNote"];</code>
   * @return The routeNote.
   */
  @java.lang.Override
  public io.grpc.route_guide.v1.RouteNote getRouteNote() {
    return routeNote_ == null ? io.grpc.route_guide.v1.RouteNote.getDefaultInstance() : routeNote_;
  }
  /**
   * <code>.route_guide.v1.RouteNote route_note = 1 [json_name = "routeNote"];</code>
   */
  @java.lang.Override
  public io.grpc.route_guide.v1.RouteNoteOrBuilder getRouteNoteOrBuilder() {
    return routeNote_ == null ? io.grpc.route_guide.v1.RouteNote.getDefaultInstance() : routeNote_;
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
    if (routeNote_ != null) {
      output.writeMessage(1, getRouteNote());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (routeNote_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRouteNote());
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
    if (!(obj instanceof io.grpc.route_guide.v1.RouteChatRequest)) {
      return super.equals(obj);
    }
    io.grpc.route_guide.v1.RouteChatRequest other = (io.grpc.route_guide.v1.RouteChatRequest) obj;

    if (hasRouteNote() != other.hasRouteNote()) return false;
    if (hasRouteNote()) {
      if (!getRouteNote()
          .equals(other.getRouteNote())) return false;
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
    if (hasRouteNote()) {
      hash = (37 * hash) + ROUTE_NOTE_FIELD_NUMBER;
      hash = (53 * hash) + getRouteNote().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.route_guide.v1.RouteChatRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.route_guide.v1.RouteChatRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.route_guide.v1.RouteChatRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.route_guide.v1.RouteChatRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.route_guide.v1.RouteChatRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.route_guide.v1.RouteChatRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.route_guide.v1.RouteChatRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.route_guide.v1.RouteChatRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.route_guide.v1.RouteChatRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.route_guide.v1.RouteChatRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.route_guide.v1.RouteChatRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.route_guide.v1.RouteChatRequest parseFrom(
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
  public static Builder newBuilder(io.grpc.route_guide.v1.RouteChatRequest prototype) {
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
   * Protobuf type {@code route_guide.v1.RouteChatRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:route_guide.v1.RouteChatRequest)
      io.grpc.route_guide.v1.RouteChatRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.route_guide.v1.RouteGuideProto.internal_static_route_guide_v1_RouteChatRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.route_guide.v1.RouteGuideProto.internal_static_route_guide_v1_RouteChatRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.route_guide.v1.RouteChatRequest.class, io.grpc.route_guide.v1.RouteChatRequest.Builder.class);
    }

    // Construct using io.grpc.route_guide.v1.RouteChatRequest.newBuilder()
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
      routeNote_ = null;
      if (routeNoteBuilder_ != null) {
        routeNoteBuilder_.dispose();
        routeNoteBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.route_guide.v1.RouteGuideProto.internal_static_route_guide_v1_RouteChatRequest_descriptor;
    }

    @java.lang.Override
    public io.grpc.route_guide.v1.RouteChatRequest getDefaultInstanceForType() {
      return io.grpc.route_guide.v1.RouteChatRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.route_guide.v1.RouteChatRequest build() {
      io.grpc.route_guide.v1.RouteChatRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.route_guide.v1.RouteChatRequest buildPartial() {
      io.grpc.route_guide.v1.RouteChatRequest result = new io.grpc.route_guide.v1.RouteChatRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.grpc.route_guide.v1.RouteChatRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.routeNote_ = routeNoteBuilder_ == null
            ? routeNote_
            : routeNoteBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.route_guide.v1.RouteChatRequest) {
        return mergeFrom((io.grpc.route_guide.v1.RouteChatRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.route_guide.v1.RouteChatRequest other) {
      if (other == io.grpc.route_guide.v1.RouteChatRequest.getDefaultInstance()) return this;
      if (other.hasRouteNote()) {
        mergeRouteNote(other.getRouteNote());
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
                  getRouteNoteFieldBuilder().getBuilder(),
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

    private io.grpc.route_guide.v1.RouteNote routeNote_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.route_guide.v1.RouteNote, io.grpc.route_guide.v1.RouteNote.Builder, io.grpc.route_guide.v1.RouteNoteOrBuilder> routeNoteBuilder_;
    /**
     * <code>.route_guide.v1.RouteNote route_note = 1 [json_name = "routeNote"];</code>
     * @return Whether the routeNote field is set.
     */
    public boolean hasRouteNote() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.route_guide.v1.RouteNote route_note = 1 [json_name = "routeNote"];</code>
     * @return The routeNote.
     */
    public io.grpc.route_guide.v1.RouteNote getRouteNote() {
      if (routeNoteBuilder_ == null) {
        return routeNote_ == null ? io.grpc.route_guide.v1.RouteNote.getDefaultInstance() : routeNote_;
      } else {
        return routeNoteBuilder_.getMessage();
      }
    }
    /**
     * <code>.route_guide.v1.RouteNote route_note = 1 [json_name = "routeNote"];</code>
     */
    public Builder setRouteNote(io.grpc.route_guide.v1.RouteNote value) {
      if (routeNoteBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        routeNote_ = value;
      } else {
        routeNoteBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.route_guide.v1.RouteNote route_note = 1 [json_name = "routeNote"];</code>
     */
    public Builder setRouteNote(
        io.grpc.route_guide.v1.RouteNote.Builder builderForValue) {
      if (routeNoteBuilder_ == null) {
        routeNote_ = builderForValue.build();
      } else {
        routeNoteBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.route_guide.v1.RouteNote route_note = 1 [json_name = "routeNote"];</code>
     */
    public Builder mergeRouteNote(io.grpc.route_guide.v1.RouteNote value) {
      if (routeNoteBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          routeNote_ != null &&
          routeNote_ != io.grpc.route_guide.v1.RouteNote.getDefaultInstance()) {
          getRouteNoteBuilder().mergeFrom(value);
        } else {
          routeNote_ = value;
        }
      } else {
        routeNoteBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.route_guide.v1.RouteNote route_note = 1 [json_name = "routeNote"];</code>
     */
    public Builder clearRouteNote() {
      bitField0_ = (bitField0_ & ~0x00000001);
      routeNote_ = null;
      if (routeNoteBuilder_ != null) {
        routeNoteBuilder_.dispose();
        routeNoteBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.route_guide.v1.RouteNote route_note = 1 [json_name = "routeNote"];</code>
     */
    public io.grpc.route_guide.v1.RouteNote.Builder getRouteNoteBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRouteNoteFieldBuilder().getBuilder();
    }
    /**
     * <code>.route_guide.v1.RouteNote route_note = 1 [json_name = "routeNote"];</code>
     */
    public io.grpc.route_guide.v1.RouteNoteOrBuilder getRouteNoteOrBuilder() {
      if (routeNoteBuilder_ != null) {
        return routeNoteBuilder_.getMessageOrBuilder();
      } else {
        return routeNote_ == null ?
            io.grpc.route_guide.v1.RouteNote.getDefaultInstance() : routeNote_;
      }
    }
    /**
     * <code>.route_guide.v1.RouteNote route_note = 1 [json_name = "routeNote"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.route_guide.v1.RouteNote, io.grpc.route_guide.v1.RouteNote.Builder, io.grpc.route_guide.v1.RouteNoteOrBuilder> 
        getRouteNoteFieldBuilder() {
      if (routeNoteBuilder_ == null) {
        routeNoteBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grpc.route_guide.v1.RouteNote, io.grpc.route_guide.v1.RouteNote.Builder, io.grpc.route_guide.v1.RouteNoteOrBuilder>(
                getRouteNote(),
                getParentForChildren(),
                isClean());
        routeNote_ = null;
      }
      return routeNoteBuilder_;
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


    // @@protoc_insertion_point(builder_scope:route_guide.v1.RouteChatRequest)
  }

  // @@protoc_insertion_point(class_scope:route_guide.v1.RouteChatRequest)
  private static final io.grpc.route_guide.v1.RouteChatRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.route_guide.v1.RouteChatRequest();
  }

  public static io.grpc.route_guide.v1.RouteChatRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RouteChatRequest>
      PARSER = new com.google.protobuf.AbstractParser<RouteChatRequest>() {
    @java.lang.Override
    public RouteChatRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RouteChatRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RouteChatRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.route_guide.v1.RouteChatRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

