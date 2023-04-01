// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: route_guide/v1/route_guide.proto
// </auto-generated>
// Original file comments:
// Copyright 2015 gRPC authors.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
#pragma warning disable 0414, 1591, 8981
#region Designer generated code

using grpc = global::Grpc.Core;

namespace io.grpc.route_guide.v1 {
  /// <summary>
  /// Interface exported by the server.
  /// </summary>
  public static partial class RouteGuideService
  {
    static readonly string __ServiceName = "route_guide.v1.RouteGuideService";

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static void __Helper_SerializeMessage(global::Google.Protobuf.IMessage message, grpc::SerializationContext context)
    {
      #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
      if (message is global::Google.Protobuf.IBufferMessage)
      {
        context.SetPayloadLength(message.CalculateSize());
        global::Google.Protobuf.MessageExtensions.WriteTo(message, context.GetBufferWriter());
        context.Complete();
        return;
      }
      #endif
      context.Complete(global::Google.Protobuf.MessageExtensions.ToByteArray(message));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static class __Helper_MessageCache<T>
    {
      public static readonly bool IsBufferMessage = global::System.Reflection.IntrospectionExtensions.GetTypeInfo(typeof(global::Google.Protobuf.IBufferMessage)).IsAssignableFrom(typeof(T));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static T __Helper_DeserializeMessage<T>(grpc::DeserializationContext context, global::Google.Protobuf.MessageParser<T> parser) where T : global::Google.Protobuf.IMessage<T>
    {
      #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
      if (__Helper_MessageCache<T>.IsBufferMessage)
      {
        return parser.ParseFrom(context.PayloadAsReadOnlySequence());
      }
      #endif
      return parser.ParseFrom(context.PayloadAsNewBuffer());
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::io.grpc.route_guide.v1.GetFeatureRequest> __Marshaller_route_guide_v1_GetFeatureRequest = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::io.grpc.route_guide.v1.GetFeatureRequest.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::io.grpc.route_guide.v1.GetFeatureResponse> __Marshaller_route_guide_v1_GetFeatureResponse = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::io.grpc.route_guide.v1.GetFeatureResponse.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::io.grpc.route_guide.v1.ListFeaturesRequest> __Marshaller_route_guide_v1_ListFeaturesRequest = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::io.grpc.route_guide.v1.ListFeaturesRequest.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::io.grpc.route_guide.v1.ListFeaturesResponse> __Marshaller_route_guide_v1_ListFeaturesResponse = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::io.grpc.route_guide.v1.ListFeaturesResponse.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::io.grpc.route_guide.v1.RecordRouteRequest> __Marshaller_route_guide_v1_RecordRouteRequest = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::io.grpc.route_guide.v1.RecordRouteRequest.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::io.grpc.route_guide.v1.RecordRouteResponse> __Marshaller_route_guide_v1_RecordRouteResponse = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::io.grpc.route_guide.v1.RecordRouteResponse.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::io.grpc.route_guide.v1.RouteChatRequest> __Marshaller_route_guide_v1_RouteChatRequest = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::io.grpc.route_guide.v1.RouteChatRequest.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::io.grpc.route_guide.v1.RouteChatResponse> __Marshaller_route_guide_v1_RouteChatResponse = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::io.grpc.route_guide.v1.RouteChatResponse.Parser));

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::io.grpc.route_guide.v1.GetFeatureRequest, global::io.grpc.route_guide.v1.GetFeatureResponse> __Method_GetFeature = new grpc::Method<global::io.grpc.route_guide.v1.GetFeatureRequest, global::io.grpc.route_guide.v1.GetFeatureResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "GetFeature",
        __Marshaller_route_guide_v1_GetFeatureRequest,
        __Marshaller_route_guide_v1_GetFeatureResponse);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::io.grpc.route_guide.v1.ListFeaturesRequest, global::io.grpc.route_guide.v1.ListFeaturesResponse> __Method_ListFeatures = new grpc::Method<global::io.grpc.route_guide.v1.ListFeaturesRequest, global::io.grpc.route_guide.v1.ListFeaturesResponse>(
        grpc::MethodType.ServerStreaming,
        __ServiceName,
        "ListFeatures",
        __Marshaller_route_guide_v1_ListFeaturesRequest,
        __Marshaller_route_guide_v1_ListFeaturesResponse);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::io.grpc.route_guide.v1.RecordRouteRequest, global::io.grpc.route_guide.v1.RecordRouteResponse> __Method_RecordRoute = new grpc::Method<global::io.grpc.route_guide.v1.RecordRouteRequest, global::io.grpc.route_guide.v1.RecordRouteResponse>(
        grpc::MethodType.ClientStreaming,
        __ServiceName,
        "RecordRoute",
        __Marshaller_route_guide_v1_RecordRouteRequest,
        __Marshaller_route_guide_v1_RecordRouteResponse);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::io.grpc.route_guide.v1.RouteChatRequest, global::io.grpc.route_guide.v1.RouteChatResponse> __Method_RouteChat = new grpc::Method<global::io.grpc.route_guide.v1.RouteChatRequest, global::io.grpc.route_guide.v1.RouteChatResponse>(
        grpc::MethodType.DuplexStreaming,
        __ServiceName,
        "RouteChat",
        __Marshaller_route_guide_v1_RouteChatRequest,
        __Marshaller_route_guide_v1_RouteChatResponse);

    /// <summary>Service descriptor</summary>
    public static global::Google.Protobuf.Reflection.ServiceDescriptor Descriptor
    {
      get { return global::io.grpc.route_guide.v1.RouteGuideReflection.Descriptor.Services[0]; }
    }

    /// <summary>Base class for server-side implementations of RouteGuideService</summary>
    [grpc::BindServiceMethod(typeof(RouteGuideService), "BindService")]
    public abstract partial class RouteGuideServiceBase
    {
      /// <summary>
      /// A simple RPC.
      ///
      /// Obtains the feature at a given position.
      ///
      /// A feature with an empty name is returned if there's no feature at the given
      /// position.
      /// </summary>
      /// <param name="request">The request received from the client.</param>
      /// <param name="context">The context of the server-side call handler being invoked.</param>
      /// <returns>The response to send back to the client (wrapped by a task).</returns>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::io.grpc.route_guide.v1.GetFeatureResponse> GetFeature(global::io.grpc.route_guide.v1.GetFeatureRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      /// <summary>
      /// A server-to-client streaming RPC.
      ///
      /// Obtains the Features available within the given Rectangle.  Results are
      /// streamed rather than returned at once (e.g. in a response message with a
      /// repeated field), as the rectangle may cover a large area and contain a
      /// huge number of features.
      /// </summary>
      /// <param name="request">The request received from the client.</param>
      /// <param name="responseStream">Used for sending responses back to the client.</param>
      /// <param name="context">The context of the server-side call handler being invoked.</param>
      /// <returns>A task indicating completion of the handler.</returns>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task ListFeatures(global::io.grpc.route_guide.v1.ListFeaturesRequest request, grpc::IServerStreamWriter<global::io.grpc.route_guide.v1.ListFeaturesResponse> responseStream, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      /// <summary>
      /// A client-to-server streaming RPC.
      ///
      /// Accepts a stream of Points on a route being traversed, returning a
      /// RouteSummary when traversal is completed.
      /// </summary>
      /// <param name="requestStream">Used for reading requests from the client.</param>
      /// <param name="context">The context of the server-side call handler being invoked.</param>
      /// <returns>The response to send back to the client (wrapped by a task).</returns>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::io.grpc.route_guide.v1.RecordRouteResponse> RecordRoute(grpc::IAsyncStreamReader<global::io.grpc.route_guide.v1.RecordRouteRequest> requestStream, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      /// <summary>
      /// A Bidirectional streaming RPC.
      ///
      /// Accepts a stream of RouteNotes sent while a route is being traversed,
      /// while receiving other RouteNotes (e.g. from other users).
      /// </summary>
      /// <param name="requestStream">Used for reading requests from the client.</param>
      /// <param name="responseStream">Used for sending responses back to the client.</param>
      /// <param name="context">The context of the server-side call handler being invoked.</param>
      /// <returns>A task indicating completion of the handler.</returns>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task RouteChat(grpc::IAsyncStreamReader<global::io.grpc.route_guide.v1.RouteChatRequest> requestStream, grpc::IServerStreamWriter<global::io.grpc.route_guide.v1.RouteChatResponse> responseStream, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

    }

    /// <summary>Client for RouteGuideService</summary>
    public partial class RouteGuideServiceClient : grpc::ClientBase<RouteGuideServiceClient>
    {
      /// <summary>Creates a new client for RouteGuideService</summary>
      /// <param name="channel">The channel to use to make remote calls.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public RouteGuideServiceClient(grpc::ChannelBase channel) : base(channel)
      {
      }
      /// <summary>Creates a new client for RouteGuideService that uses a custom <c>CallInvoker</c>.</summary>
      /// <param name="callInvoker">The callInvoker to use to make remote calls.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public RouteGuideServiceClient(grpc::CallInvoker callInvoker) : base(callInvoker)
      {
      }
      /// <summary>Protected parameterless constructor to allow creation of test doubles.</summary>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected RouteGuideServiceClient() : base()
      {
      }
      /// <summary>Protected constructor to allow creation of configured clients.</summary>
      /// <param name="configuration">The client configuration.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected RouteGuideServiceClient(ClientBaseConfiguration configuration) : base(configuration)
      {
      }

      /// <summary>
      /// A simple RPC.
      ///
      /// Obtains the feature at a given position.
      ///
      /// A feature with an empty name is returned if there's no feature at the given
      /// position.
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The response received from the server.</returns>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::io.grpc.route_guide.v1.GetFeatureResponse GetFeature(global::io.grpc.route_guide.v1.GetFeatureRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return GetFeature(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// A simple RPC.
      ///
      /// Obtains the feature at a given position.
      ///
      /// A feature with an empty name is returned if there's no feature at the given
      /// position.
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The response received from the server.</returns>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::io.grpc.route_guide.v1.GetFeatureResponse GetFeature(global::io.grpc.route_guide.v1.GetFeatureRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_GetFeature, null, options, request);
      }
      /// <summary>
      /// A simple RPC.
      ///
      /// Obtains the feature at a given position.
      ///
      /// A feature with an empty name is returned if there's no feature at the given
      /// position.
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::io.grpc.route_guide.v1.GetFeatureResponse> GetFeatureAsync(global::io.grpc.route_guide.v1.GetFeatureRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return GetFeatureAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// A simple RPC.
      ///
      /// Obtains the feature at a given position.
      ///
      /// A feature with an empty name is returned if there's no feature at the given
      /// position.
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::io.grpc.route_guide.v1.GetFeatureResponse> GetFeatureAsync(global::io.grpc.route_guide.v1.GetFeatureRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_GetFeature, null, options, request);
      }
      /// <summary>
      /// A server-to-client streaming RPC.
      ///
      /// Obtains the Features available within the given Rectangle.  Results are
      /// streamed rather than returned at once (e.g. in a response message with a
      /// repeated field), as the rectangle may cover a large area and contain a
      /// huge number of features.
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncServerStreamingCall<global::io.grpc.route_guide.v1.ListFeaturesResponse> ListFeatures(global::io.grpc.route_guide.v1.ListFeaturesRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return ListFeatures(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// A server-to-client streaming RPC.
      ///
      /// Obtains the Features available within the given Rectangle.  Results are
      /// streamed rather than returned at once (e.g. in a response message with a
      /// repeated field), as the rectangle may cover a large area and contain a
      /// huge number of features.
      /// </summary>
      /// <param name="request">The request to send to the server.</param>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncServerStreamingCall<global::io.grpc.route_guide.v1.ListFeaturesResponse> ListFeatures(global::io.grpc.route_guide.v1.ListFeaturesRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncServerStreamingCall(__Method_ListFeatures, null, options, request);
      }
      /// <summary>
      /// A client-to-server streaming RPC.
      ///
      /// Accepts a stream of Points on a route being traversed, returning a
      /// RouteSummary when traversal is completed.
      /// </summary>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncClientStreamingCall<global::io.grpc.route_guide.v1.RecordRouteRequest, global::io.grpc.route_guide.v1.RecordRouteResponse> RecordRoute(grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return RecordRoute(new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// A client-to-server streaming RPC.
      ///
      /// Accepts a stream of Points on a route being traversed, returning a
      /// RouteSummary when traversal is completed.
      /// </summary>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncClientStreamingCall<global::io.grpc.route_guide.v1.RecordRouteRequest, global::io.grpc.route_guide.v1.RecordRouteResponse> RecordRoute(grpc::CallOptions options)
      {
        return CallInvoker.AsyncClientStreamingCall(__Method_RecordRoute, null, options);
      }
      /// <summary>
      /// A Bidirectional streaming RPC.
      ///
      /// Accepts a stream of RouteNotes sent while a route is being traversed,
      /// while receiving other RouteNotes (e.g. from other users).
      /// </summary>
      /// <param name="headers">The initial metadata to send with the call. This parameter is optional.</param>
      /// <param name="deadline">An optional deadline for the call. The call will be cancelled if deadline is hit.</param>
      /// <param name="cancellationToken">An optional token for canceling the call.</param>
      /// <returns>The call object.</returns>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncDuplexStreamingCall<global::io.grpc.route_guide.v1.RouteChatRequest, global::io.grpc.route_guide.v1.RouteChatResponse> RouteChat(grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return RouteChat(new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      /// <summary>
      /// A Bidirectional streaming RPC.
      ///
      /// Accepts a stream of RouteNotes sent while a route is being traversed,
      /// while receiving other RouteNotes (e.g. from other users).
      /// </summary>
      /// <param name="options">The options for the call.</param>
      /// <returns>The call object.</returns>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncDuplexStreamingCall<global::io.grpc.route_guide.v1.RouteChatRequest, global::io.grpc.route_guide.v1.RouteChatResponse> RouteChat(grpc::CallOptions options)
      {
        return CallInvoker.AsyncDuplexStreamingCall(__Method_RouteChat, null, options);
      }
      /// <summary>Creates a new instance of client from given <c>ClientBaseConfiguration</c>.</summary>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected override RouteGuideServiceClient NewInstance(ClientBaseConfiguration configuration)
      {
        return new RouteGuideServiceClient(configuration);
      }
    }

    /// <summary>Creates service definition that can be registered with a server</summary>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public static grpc::ServerServiceDefinition BindService(RouteGuideServiceBase serviceImpl)
    {
      return grpc::ServerServiceDefinition.CreateBuilder()
          .AddMethod(__Method_GetFeature, serviceImpl.GetFeature)
          .AddMethod(__Method_ListFeatures, serviceImpl.ListFeatures)
          .AddMethod(__Method_RecordRoute, serviceImpl.RecordRoute)
          .AddMethod(__Method_RouteChat, serviceImpl.RouteChat).Build();
    }

    /// <summary>Register service method with a service binder with or without implementation. Useful when customizing the service binding logic.
    /// Note: this method is part of an experimental API that can change or be removed without any prior notice.</summary>
    /// <param name="serviceBinder">Service methods will be bound by calling <c>AddMethod</c> on this object.</param>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public static void BindService(grpc::ServiceBinderBase serviceBinder, RouteGuideServiceBase serviceImpl)
    {
      serviceBinder.AddMethod(__Method_GetFeature, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::io.grpc.route_guide.v1.GetFeatureRequest, global::io.grpc.route_guide.v1.GetFeatureResponse>(serviceImpl.GetFeature));
      serviceBinder.AddMethod(__Method_ListFeatures, serviceImpl == null ? null : new grpc::ServerStreamingServerMethod<global::io.grpc.route_guide.v1.ListFeaturesRequest, global::io.grpc.route_guide.v1.ListFeaturesResponse>(serviceImpl.ListFeatures));
      serviceBinder.AddMethod(__Method_RecordRoute, serviceImpl == null ? null : new grpc::ClientStreamingServerMethod<global::io.grpc.route_guide.v1.RecordRouteRequest, global::io.grpc.route_guide.v1.RecordRouteResponse>(serviceImpl.RecordRoute));
      serviceBinder.AddMethod(__Method_RouteChat, serviceImpl == null ? null : new grpc::DuplexStreamingServerMethod<global::io.grpc.route_guide.v1.RouteChatRequest, global::io.grpc.route_guide.v1.RouteChatResponse>(serviceImpl.RouteChat));
    }

  }
}
#endregion
