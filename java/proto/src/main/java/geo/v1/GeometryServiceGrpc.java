package geo.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * gRPC Interfaces for working with geometry operators
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.0)",
    comments = "Source: proto/geo/v1/geometry.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GeometryServiceGrpc {

  private GeometryServiceGrpc() {}

  public static final String SERVICE_NAME = "geo.v1.GeometryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<geo.v1.GeometryRequest,
      geo.v1.GeometryResponse> getOperateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Operate",
      requestType = geo.v1.GeometryRequest.class,
      responseType = geo.v1.GeometryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<geo.v1.GeometryRequest,
      geo.v1.GeometryResponse> getOperateMethod() {
    io.grpc.MethodDescriptor<geo.v1.GeometryRequest, geo.v1.GeometryResponse> getOperateMethod;
    if ((getOperateMethod = GeometryServiceGrpc.getOperateMethod) == null) {
      synchronized (GeometryServiceGrpc.class) {
        if ((getOperateMethod = GeometryServiceGrpc.getOperateMethod) == null) {
          GeometryServiceGrpc.getOperateMethod = getOperateMethod =
              io.grpc.MethodDescriptor.<geo.v1.GeometryRequest, geo.v1.GeometryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Operate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  geo.v1.GeometryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  geo.v1.GeometryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeometryServiceMethodDescriptorSupplier("Operate"))
              .build();
        }
      }
    }
    return getOperateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<geo.v1.GeometryRequest,
      geo.v1.GeometryResponse> getOperateBiStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OperateBiStream",
      requestType = geo.v1.GeometryRequest.class,
      responseType = geo.v1.GeometryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<geo.v1.GeometryRequest,
      geo.v1.GeometryResponse> getOperateBiStreamMethod() {
    io.grpc.MethodDescriptor<geo.v1.GeometryRequest, geo.v1.GeometryResponse> getOperateBiStreamMethod;
    if ((getOperateBiStreamMethod = GeometryServiceGrpc.getOperateBiStreamMethod) == null) {
      synchronized (GeometryServiceGrpc.class) {
        if ((getOperateBiStreamMethod = GeometryServiceGrpc.getOperateBiStreamMethod) == null) {
          GeometryServiceGrpc.getOperateBiStreamMethod = getOperateBiStreamMethod =
              io.grpc.MethodDescriptor.<geo.v1.GeometryRequest, geo.v1.GeometryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OperateBiStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  geo.v1.GeometryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  geo.v1.GeometryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeometryServiceMethodDescriptorSupplier("OperateBiStream"))
              .build();
        }
      }
    }
    return getOperateBiStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<geo.v1.GeometryRequest,
      geo.v1.GeometryResponse> getOperateBiStreamFlowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OperateBiStreamFlow",
      requestType = geo.v1.GeometryRequest.class,
      responseType = geo.v1.GeometryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<geo.v1.GeometryRequest,
      geo.v1.GeometryResponse> getOperateBiStreamFlowMethod() {
    io.grpc.MethodDescriptor<geo.v1.GeometryRequest, geo.v1.GeometryResponse> getOperateBiStreamFlowMethod;
    if ((getOperateBiStreamFlowMethod = GeometryServiceGrpc.getOperateBiStreamFlowMethod) == null) {
      synchronized (GeometryServiceGrpc.class) {
        if ((getOperateBiStreamFlowMethod = GeometryServiceGrpc.getOperateBiStreamFlowMethod) == null) {
          GeometryServiceGrpc.getOperateBiStreamFlowMethod = getOperateBiStreamFlowMethod =
              io.grpc.MethodDescriptor.<geo.v1.GeometryRequest, geo.v1.GeometryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OperateBiStreamFlow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  geo.v1.GeometryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  geo.v1.GeometryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeometryServiceMethodDescriptorSupplier("OperateBiStreamFlow"))
              .build();
        }
      }
    }
    return getOperateBiStreamFlowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<geo.v1.GeometryRequest,
      geo.v1.GeometryResponse> getOperateServerStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OperateServerStream",
      requestType = geo.v1.GeometryRequest.class,
      responseType = geo.v1.GeometryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<geo.v1.GeometryRequest,
      geo.v1.GeometryResponse> getOperateServerStreamMethod() {
    io.grpc.MethodDescriptor<geo.v1.GeometryRequest, geo.v1.GeometryResponse> getOperateServerStreamMethod;
    if ((getOperateServerStreamMethod = GeometryServiceGrpc.getOperateServerStreamMethod) == null) {
      synchronized (GeometryServiceGrpc.class) {
        if ((getOperateServerStreamMethod = GeometryServiceGrpc.getOperateServerStreamMethod) == null) {
          GeometryServiceGrpc.getOperateServerStreamMethod = getOperateServerStreamMethod =
              io.grpc.MethodDescriptor.<geo.v1.GeometryRequest, geo.v1.GeometryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OperateServerStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  geo.v1.GeometryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  geo.v1.GeometryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeometryServiceMethodDescriptorSupplier("OperateServerStream"))
              .build();
        }
      }
    }
    return getOperateServerStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<geo.v1.GeometryRequest,
      geo.v1.GeometryResponse> getOperateClientStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OperateClientStream",
      requestType = geo.v1.GeometryRequest.class,
      responseType = geo.v1.GeometryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<geo.v1.GeometryRequest,
      geo.v1.GeometryResponse> getOperateClientStreamMethod() {
    io.grpc.MethodDescriptor<geo.v1.GeometryRequest, geo.v1.GeometryResponse> getOperateClientStreamMethod;
    if ((getOperateClientStreamMethod = GeometryServiceGrpc.getOperateClientStreamMethod) == null) {
      synchronized (GeometryServiceGrpc.class) {
        if ((getOperateClientStreamMethod = GeometryServiceGrpc.getOperateClientStreamMethod) == null) {
          GeometryServiceGrpc.getOperateClientStreamMethod = getOperateClientStreamMethod =
              io.grpc.MethodDescriptor.<geo.v1.GeometryRequest, geo.v1.GeometryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OperateClientStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  geo.v1.GeometryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  geo.v1.GeometryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeometryServiceMethodDescriptorSupplier("OperateClientStream"))
              .build();
        }
      }
    }
    return getOperateClientStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<geo.v1.FileRequestChunk,
      geo.v1.GeometryResponse> getFileOperateBiStreamFlowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FileOperateBiStreamFlow",
      requestType = geo.v1.FileRequestChunk.class,
      responseType = geo.v1.GeometryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<geo.v1.FileRequestChunk,
      geo.v1.GeometryResponse> getFileOperateBiStreamFlowMethod() {
    io.grpc.MethodDescriptor<geo.v1.FileRequestChunk, geo.v1.GeometryResponse> getFileOperateBiStreamFlowMethod;
    if ((getFileOperateBiStreamFlowMethod = GeometryServiceGrpc.getFileOperateBiStreamFlowMethod) == null) {
      synchronized (GeometryServiceGrpc.class) {
        if ((getFileOperateBiStreamFlowMethod = GeometryServiceGrpc.getFileOperateBiStreamFlowMethod) == null) {
          GeometryServiceGrpc.getFileOperateBiStreamFlowMethod = getFileOperateBiStreamFlowMethod =
              io.grpc.MethodDescriptor.<geo.v1.FileRequestChunk, geo.v1.GeometryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FileOperateBiStreamFlow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  geo.v1.FileRequestChunk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  geo.v1.GeometryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeometryServiceMethodDescriptorSupplier("FileOperateBiStreamFlow"))
              .build();
        }
      }
    }
    return getFileOperateBiStreamFlowMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GeometryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeometryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeometryServiceStub>() {
        @java.lang.Override
        public GeometryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeometryServiceStub(channel, callOptions);
        }
      };
    return GeometryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GeometryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeometryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeometryServiceBlockingStub>() {
        @java.lang.Override
        public GeometryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeometryServiceBlockingStub(channel, callOptions);
        }
      };
    return GeometryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GeometryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeometryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeometryServiceFutureStub>() {
        @java.lang.Override
        public GeometryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeometryServiceFutureStub(channel, callOptions);
        }
      };
    return GeometryServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * gRPC Interfaces for working with geometry operators
   * </pre>
   */
  public static abstract class GeometryServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Execute a single blocking geometry operation
     * </pre>
     */
    public void operate(geo.v1.GeometryRequest request,
        io.grpc.stub.StreamObserver<geo.v1.GeometryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOperateMethod(), responseObserver);
    }

    /**
     * <pre>
     * stream in operator requests and get back a stream of results
     * </pre>
     */
    public io.grpc.stub.StreamObserver<geo.v1.GeometryRequest> operateBiStream(
        io.grpc.stub.StreamObserver<geo.v1.GeometryResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getOperateBiStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * manual flow control bi-directional stream. example
     * go shouldn't use this because of https://groups.google.com/forum/#!topic/grpc-io/6_B46Oszb4k ?
     * </pre>
     */
    public io.grpc.stub.StreamObserver<geo.v1.GeometryRequest> operateBiStreamFlow(
        io.grpc.stub.StreamObserver<geo.v1.GeometryResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getOperateBiStreamFlowMethod(), responseObserver);
    }

    /**
     * <pre>
     * Maybe a cut operation that returns a lot of different geometries? for now, this is not implemented.
     * </pre>
     */
    public void operateServerStream(geo.v1.GeometryRequest request,
        io.grpc.stub.StreamObserver<geo.v1.GeometryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOperateServerStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Maybe something like a union operation. for now, this is not implemented.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<geo.v1.GeometryRequest> operateClientStream(
        io.grpc.stub.StreamObserver<geo.v1.GeometryResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getOperateClientStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * stream in file chunks for a geometry file type and stream back results for each geometry encountered
     * </pre>
     */
    public io.grpc.stub.StreamObserver<geo.v1.FileRequestChunk> fileOperateBiStreamFlow(
        io.grpc.stub.StreamObserver<geo.v1.GeometryResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getFileOperateBiStreamFlowMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOperateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                geo.v1.GeometryRequest,
                geo.v1.GeometryResponse>(
                  this, METHODID_OPERATE)))
          .addMethod(
            getOperateBiStreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                geo.v1.GeometryRequest,
                geo.v1.GeometryResponse>(
                  this, METHODID_OPERATE_BI_STREAM)))
          .addMethod(
            getOperateBiStreamFlowMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                geo.v1.GeometryRequest,
                geo.v1.GeometryResponse>(
                  this, METHODID_OPERATE_BI_STREAM_FLOW)))
          .addMethod(
            getOperateServerStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                geo.v1.GeometryRequest,
                geo.v1.GeometryResponse>(
                  this, METHODID_OPERATE_SERVER_STREAM)))
          .addMethod(
            getOperateClientStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                geo.v1.GeometryRequest,
                geo.v1.GeometryResponse>(
                  this, METHODID_OPERATE_CLIENT_STREAM)))
          .addMethod(
            getFileOperateBiStreamFlowMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                geo.v1.FileRequestChunk,
                geo.v1.GeometryResponse>(
                  this, METHODID_FILE_OPERATE_BI_STREAM_FLOW)))
          .build();
    }
  }

  /**
   * <pre>
   * gRPC Interfaces for working with geometry operators
   * </pre>
   */
  public static final class GeometryServiceStub extends io.grpc.stub.AbstractAsyncStub<GeometryServiceStub> {
    private GeometryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeometryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeometryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Execute a single blocking geometry operation
     * </pre>
     */
    public void operate(geo.v1.GeometryRequest request,
        io.grpc.stub.StreamObserver<geo.v1.GeometryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOperateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * stream in operator requests and get back a stream of results
     * </pre>
     */
    public io.grpc.stub.StreamObserver<geo.v1.GeometryRequest> operateBiStream(
        io.grpc.stub.StreamObserver<geo.v1.GeometryResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getOperateBiStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * manual flow control bi-directional stream. example
     * go shouldn't use this because of https://groups.google.com/forum/#!topic/grpc-io/6_B46Oszb4k ?
     * </pre>
     */
    public io.grpc.stub.StreamObserver<geo.v1.GeometryRequest> operateBiStreamFlow(
        io.grpc.stub.StreamObserver<geo.v1.GeometryResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getOperateBiStreamFlowMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Maybe a cut operation that returns a lot of different geometries? for now, this is not implemented.
     * </pre>
     */
    public void operateServerStream(geo.v1.GeometryRequest request,
        io.grpc.stub.StreamObserver<geo.v1.GeometryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getOperateServerStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Maybe something like a union operation. for now, this is not implemented.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<geo.v1.GeometryRequest> operateClientStream(
        io.grpc.stub.StreamObserver<geo.v1.GeometryResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getOperateClientStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * stream in file chunks for a geometry file type and stream back results for each geometry encountered
     * </pre>
     */
    public io.grpc.stub.StreamObserver<geo.v1.FileRequestChunk> fileOperateBiStreamFlow(
        io.grpc.stub.StreamObserver<geo.v1.GeometryResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getFileOperateBiStreamFlowMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * gRPC Interfaces for working with geometry operators
   * </pre>
   */
  public static final class GeometryServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GeometryServiceBlockingStub> {
    private GeometryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeometryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeometryServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Execute a single blocking geometry operation
     * </pre>
     */
    public geo.v1.GeometryResponse operate(geo.v1.GeometryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOperateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Maybe a cut operation that returns a lot of different geometries? for now, this is not implemented.
     * </pre>
     */
    public java.util.Iterator<geo.v1.GeometryResponse> operateServerStream(
        geo.v1.GeometryRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getOperateServerStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * gRPC Interfaces for working with geometry operators
   * </pre>
   */
  public static final class GeometryServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GeometryServiceFutureStub> {
    private GeometryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeometryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeometryServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Execute a single blocking geometry operation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<geo.v1.GeometryResponse> operate(
        geo.v1.GeometryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOperateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OPERATE = 0;
  private static final int METHODID_OPERATE_SERVER_STREAM = 1;
  private static final int METHODID_OPERATE_BI_STREAM = 2;
  private static final int METHODID_OPERATE_BI_STREAM_FLOW = 3;
  private static final int METHODID_OPERATE_CLIENT_STREAM = 4;
  private static final int METHODID_FILE_OPERATE_BI_STREAM_FLOW = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GeometryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GeometryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OPERATE:
          serviceImpl.operate((geo.v1.GeometryRequest) request,
              (io.grpc.stub.StreamObserver<geo.v1.GeometryResponse>) responseObserver);
          break;
        case METHODID_OPERATE_SERVER_STREAM:
          serviceImpl.operateServerStream((geo.v1.GeometryRequest) request,
              (io.grpc.stub.StreamObserver<geo.v1.GeometryResponse>) responseObserver);
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
        case METHODID_OPERATE_BI_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.operateBiStream(
              (io.grpc.stub.StreamObserver<geo.v1.GeometryResponse>) responseObserver);
        case METHODID_OPERATE_BI_STREAM_FLOW:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.operateBiStreamFlow(
              (io.grpc.stub.StreamObserver<geo.v1.GeometryResponse>) responseObserver);
        case METHODID_OPERATE_CLIENT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.operateClientStream(
              (io.grpc.stub.StreamObserver<geo.v1.GeometryResponse>) responseObserver);
        case METHODID_FILE_OPERATE_BI_STREAM_FLOW:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.fileOperateBiStreamFlow(
              (io.grpc.stub.StreamObserver<geo.v1.GeometryResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GeometryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GeometryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return geo.v1.GeometryProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GeometryService");
    }
  }

  private static final class GeometryServiceFileDescriptorSupplier
      extends GeometryServiceBaseDescriptorSupplier {
    GeometryServiceFileDescriptorSupplier() {}
  }

  private static final class GeometryServiceMethodDescriptorSupplier
      extends GeometryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GeometryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GeometryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GeometryServiceFileDescriptorSupplier())
              .addMethod(getOperateMethod())
              .addMethod(getOperateBiStreamMethod())
              .addMethod(getOperateBiStreamFlowMethod())
              .addMethod(getOperateServerStreamMethod())
              .addMethod(getOperateClientStreamMethod())
              .addMethod(getFileOperateBiStreamFlowMethod())
              .build();
        }
      }
    }
    return result;
  }
}
