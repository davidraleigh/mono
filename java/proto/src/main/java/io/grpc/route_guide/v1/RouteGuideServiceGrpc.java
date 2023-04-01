package io.grpc.route_guide.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: route_guide/v1/route_guide.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RouteGuideServiceGrpc {

  private RouteGuideServiceGrpc() {}

  public static final String SERVICE_NAME = "route_guide.v1.RouteGuideService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.route_guide.v1.GetFeatureRequest,
      io.grpc.route_guide.v1.GetFeatureResponse> getGetFeatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeature",
      requestType = io.grpc.route_guide.v1.GetFeatureRequest.class,
      responseType = io.grpc.route_guide.v1.GetFeatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.route_guide.v1.GetFeatureRequest,
      io.grpc.route_guide.v1.GetFeatureResponse> getGetFeatureMethod() {
    io.grpc.MethodDescriptor<io.grpc.route_guide.v1.GetFeatureRequest, io.grpc.route_guide.v1.GetFeatureResponse> getGetFeatureMethod;
    if ((getGetFeatureMethod = RouteGuideServiceGrpc.getGetFeatureMethod) == null) {
      synchronized (RouteGuideServiceGrpc.class) {
        if ((getGetFeatureMethod = RouteGuideServiceGrpc.getGetFeatureMethod) == null) {
          RouteGuideServiceGrpc.getGetFeatureMethod = getGetFeatureMethod =
              io.grpc.MethodDescriptor.<io.grpc.route_guide.v1.GetFeatureRequest, io.grpc.route_guide.v1.GetFeatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFeature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.route_guide.v1.GetFeatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.route_guide.v1.GetFeatureResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RouteGuideServiceMethodDescriptorSupplier("GetFeature"))
              .build();
        }
      }
    }
    return getGetFeatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.route_guide.v1.ListFeaturesRequest,
      io.grpc.route_guide.v1.ListFeaturesResponse> getListFeaturesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFeatures",
      requestType = io.grpc.route_guide.v1.ListFeaturesRequest.class,
      responseType = io.grpc.route_guide.v1.ListFeaturesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.route_guide.v1.ListFeaturesRequest,
      io.grpc.route_guide.v1.ListFeaturesResponse> getListFeaturesMethod() {
    io.grpc.MethodDescriptor<io.grpc.route_guide.v1.ListFeaturesRequest, io.grpc.route_guide.v1.ListFeaturesResponse> getListFeaturesMethod;
    if ((getListFeaturesMethod = RouteGuideServiceGrpc.getListFeaturesMethod) == null) {
      synchronized (RouteGuideServiceGrpc.class) {
        if ((getListFeaturesMethod = RouteGuideServiceGrpc.getListFeaturesMethod) == null) {
          RouteGuideServiceGrpc.getListFeaturesMethod = getListFeaturesMethod =
              io.grpc.MethodDescriptor.<io.grpc.route_guide.v1.ListFeaturesRequest, io.grpc.route_guide.v1.ListFeaturesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFeatures"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.route_guide.v1.ListFeaturesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.route_guide.v1.ListFeaturesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RouteGuideServiceMethodDescriptorSupplier("ListFeatures"))
              .build();
        }
      }
    }
    return getListFeaturesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.route_guide.v1.RecordRouteRequest,
      io.grpc.route_guide.v1.RecordRouteResponse> getRecordRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecordRoute",
      requestType = io.grpc.route_guide.v1.RecordRouteRequest.class,
      responseType = io.grpc.route_guide.v1.RecordRouteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.route_guide.v1.RecordRouteRequest,
      io.grpc.route_guide.v1.RecordRouteResponse> getRecordRouteMethod() {
    io.grpc.MethodDescriptor<io.grpc.route_guide.v1.RecordRouteRequest, io.grpc.route_guide.v1.RecordRouteResponse> getRecordRouteMethod;
    if ((getRecordRouteMethod = RouteGuideServiceGrpc.getRecordRouteMethod) == null) {
      synchronized (RouteGuideServiceGrpc.class) {
        if ((getRecordRouteMethod = RouteGuideServiceGrpc.getRecordRouteMethod) == null) {
          RouteGuideServiceGrpc.getRecordRouteMethod = getRecordRouteMethod =
              io.grpc.MethodDescriptor.<io.grpc.route_guide.v1.RecordRouteRequest, io.grpc.route_guide.v1.RecordRouteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecordRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.route_guide.v1.RecordRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.route_guide.v1.RecordRouteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RouteGuideServiceMethodDescriptorSupplier("RecordRoute"))
              .build();
        }
      }
    }
    return getRecordRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.route_guide.v1.RouteChatRequest,
      io.grpc.route_guide.v1.RouteChatResponse> getRouteChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RouteChat",
      requestType = io.grpc.route_guide.v1.RouteChatRequest.class,
      responseType = io.grpc.route_guide.v1.RouteChatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.route_guide.v1.RouteChatRequest,
      io.grpc.route_guide.v1.RouteChatResponse> getRouteChatMethod() {
    io.grpc.MethodDescriptor<io.grpc.route_guide.v1.RouteChatRequest, io.grpc.route_guide.v1.RouteChatResponse> getRouteChatMethod;
    if ((getRouteChatMethod = RouteGuideServiceGrpc.getRouteChatMethod) == null) {
      synchronized (RouteGuideServiceGrpc.class) {
        if ((getRouteChatMethod = RouteGuideServiceGrpc.getRouteChatMethod) == null) {
          RouteGuideServiceGrpc.getRouteChatMethod = getRouteChatMethod =
              io.grpc.MethodDescriptor.<io.grpc.route_guide.v1.RouteChatRequest, io.grpc.route_guide.v1.RouteChatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RouteChat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.route_guide.v1.RouteChatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.route_guide.v1.RouteChatResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RouteGuideServiceMethodDescriptorSupplier("RouteChat"))
              .build();
        }
      }
    }
    return getRouteChatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RouteGuideServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RouteGuideServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RouteGuideServiceStub>() {
        @java.lang.Override
        public RouteGuideServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RouteGuideServiceStub(channel, callOptions);
        }
      };
    return RouteGuideServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RouteGuideServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RouteGuideServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RouteGuideServiceBlockingStub>() {
        @java.lang.Override
        public RouteGuideServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RouteGuideServiceBlockingStub(channel, callOptions);
        }
      };
    return RouteGuideServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RouteGuideServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RouteGuideServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RouteGuideServiceFutureStub>() {
        @java.lang.Override
        public RouteGuideServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RouteGuideServiceFutureStub(channel, callOptions);
        }
      };
    return RouteGuideServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class RouteGuideServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * A simple RPC.
     * Obtains the feature at a given position.
     * A feature with an empty name is returned if there's no feature at the given
     * position.
     * </pre>
     */
    public void getFeature(io.grpc.route_guide.v1.GetFeatureRequest request,
        io.grpc.stub.StreamObserver<io.grpc.route_guide.v1.GetFeatureResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFeatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * Obtains the Features available within the given Rectangle.  Results are
     * streamed rather than returned at once (e.g. in a response message with a
     * repeated field), as the rectangle may cover a large area and contain a
     * huge number of features.
     * </pre>
     */
    public void listFeatures(io.grpc.route_guide.v1.ListFeaturesRequest request,
        io.grpc.stub.StreamObserver<io.grpc.route_guide.v1.ListFeaturesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFeaturesMethod(), responseObserver);
    }

    /**
     * <pre>
     * A client-to-server streaming RPC.
     * Accepts a stream of Points on a route being traversed, returning a
     * RouteSummary when traversal is completed.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.grpc.route_guide.v1.RecordRouteRequest> recordRoute(
        io.grpc.stub.StreamObserver<io.grpc.route_guide.v1.RecordRouteResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getRecordRouteMethod(), responseObserver);
    }

    /**
     * <pre>
     * A Bidirectional streaming RPC.
     * Accepts a stream of RouteNotes sent while a route is being traversed,
     * while receiving other RouteNotes (e.g. from other users).
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.grpc.route_guide.v1.RouteChatRequest> routeChat(
        io.grpc.stub.StreamObserver<io.grpc.route_guide.v1.RouteChatResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getRouteChatMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFeatureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.route_guide.v1.GetFeatureRequest,
                io.grpc.route_guide.v1.GetFeatureResponse>(
                  this, METHODID_GET_FEATURE)))
          .addMethod(
            getListFeaturesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                io.grpc.route_guide.v1.ListFeaturesRequest,
                io.grpc.route_guide.v1.ListFeaturesResponse>(
                  this, METHODID_LIST_FEATURES)))
          .addMethod(
            getRecordRouteMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                io.grpc.route_guide.v1.RecordRouteRequest,
                io.grpc.route_guide.v1.RecordRouteResponse>(
                  this, METHODID_RECORD_ROUTE)))
          .addMethod(
            getRouteChatMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                io.grpc.route_guide.v1.RouteChatRequest,
                io.grpc.route_guide.v1.RouteChatResponse>(
                  this, METHODID_ROUTE_CHAT)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class RouteGuideServiceStub extends io.grpc.stub.AbstractAsyncStub<RouteGuideServiceStub> {
    private RouteGuideServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteGuideServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RouteGuideServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * A simple RPC.
     * Obtains the feature at a given position.
     * A feature with an empty name is returned if there's no feature at the given
     * position.
     * </pre>
     */
    public void getFeature(io.grpc.route_guide.v1.GetFeatureRequest request,
        io.grpc.stub.StreamObserver<io.grpc.route_guide.v1.GetFeatureResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFeatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * Obtains the Features available within the given Rectangle.  Results are
     * streamed rather than returned at once (e.g. in a response message with a
     * repeated field), as the rectangle may cover a large area and contain a
     * huge number of features.
     * </pre>
     */
    public void listFeatures(io.grpc.route_guide.v1.ListFeaturesRequest request,
        io.grpc.stub.StreamObserver<io.grpc.route_guide.v1.ListFeaturesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListFeaturesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A client-to-server streaming RPC.
     * Accepts a stream of Points on a route being traversed, returning a
     * RouteSummary when traversal is completed.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.grpc.route_guide.v1.RecordRouteRequest> recordRoute(
        io.grpc.stub.StreamObserver<io.grpc.route_guide.v1.RecordRouteResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getRecordRouteMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * A Bidirectional streaming RPC.
     * Accepts a stream of RouteNotes sent while a route is being traversed,
     * while receiving other RouteNotes (e.g. from other users).
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.grpc.route_guide.v1.RouteChatRequest> routeChat(
        io.grpc.stub.StreamObserver<io.grpc.route_guide.v1.RouteChatResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getRouteChatMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class RouteGuideServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RouteGuideServiceBlockingStub> {
    private RouteGuideServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteGuideServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RouteGuideServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * A simple RPC.
     * Obtains the feature at a given position.
     * A feature with an empty name is returned if there's no feature at the given
     * position.
     * </pre>
     */
    public io.grpc.route_guide.v1.GetFeatureResponse getFeature(io.grpc.route_guide.v1.GetFeatureRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFeatureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * Obtains the Features available within the given Rectangle.  Results are
     * streamed rather than returned at once (e.g. in a response message with a
     * repeated field), as the rectangle may cover a large area and contain a
     * huge number of features.
     * </pre>
     */
    public java.util.Iterator<io.grpc.route_guide.v1.ListFeaturesResponse> listFeatures(
        io.grpc.route_guide.v1.ListFeaturesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListFeaturesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class RouteGuideServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RouteGuideServiceFutureStub> {
    private RouteGuideServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteGuideServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RouteGuideServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * A simple RPC.
     * Obtains the feature at a given position.
     * A feature with an empty name is returned if there's no feature at the given
     * position.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.route_guide.v1.GetFeatureResponse> getFeature(
        io.grpc.route_guide.v1.GetFeatureRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFeatureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FEATURE = 0;
  private static final int METHODID_LIST_FEATURES = 1;
  private static final int METHODID_RECORD_ROUTE = 2;
  private static final int METHODID_ROUTE_CHAT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RouteGuideServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RouteGuideServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FEATURE:
          serviceImpl.getFeature((io.grpc.route_guide.v1.GetFeatureRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.route_guide.v1.GetFeatureResponse>) responseObserver);
          break;
        case METHODID_LIST_FEATURES:
          serviceImpl.listFeatures((io.grpc.route_guide.v1.ListFeaturesRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.route_guide.v1.ListFeaturesResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECORD_ROUTE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.recordRoute(
              (io.grpc.stub.StreamObserver<io.grpc.route_guide.v1.RecordRouteResponse>) responseObserver);
        case METHODID_ROUTE_CHAT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.routeChat(
              (io.grpc.stub.StreamObserver<io.grpc.route_guide.v1.RouteChatResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RouteGuideServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RouteGuideServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.route_guide.v1.RouteGuideProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RouteGuideService");
    }
  }

  private static final class RouteGuideServiceFileDescriptorSupplier
      extends RouteGuideServiceBaseDescriptorSupplier {
    RouteGuideServiceFileDescriptorSupplier() {}
  }

  private static final class RouteGuideServiceMethodDescriptorSupplier
      extends RouteGuideServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RouteGuideServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RouteGuideServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RouteGuideServiceFileDescriptorSupplier())
              .addMethod(getGetFeatureMethod())
              .addMethod(getListFeaturesMethod())
              .addMethod(getRecordRouteMethod())
              .addMethod(getRouteChatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
