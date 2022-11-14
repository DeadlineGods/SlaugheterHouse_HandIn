package com.example.datapersistance.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Tray.proto")
public final class TrayGrpc {

  private TrayGrpc() {}

  public static final String SERVICE_NAME = "Tray";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.TraySaveRequest,
      com.example.datapersistance.protobuf.TraySaveResponse> getTraySaveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TraySave",
      requestType = com.example.datapersistance.protobuf.TraySaveRequest.class,
      responseType = com.example.datapersistance.protobuf.TraySaveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.TraySaveRequest,
      com.example.datapersistance.protobuf.TraySaveResponse> getTraySaveMethod() {
    io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.TraySaveRequest, com.example.datapersistance.protobuf.TraySaveResponse> getTraySaveMethod;
    if ((getTraySaveMethod = TrayGrpc.getTraySaveMethod) == null) {
      synchronized (TrayGrpc.class) {
        if ((getTraySaveMethod = TrayGrpc.getTraySaveMethod) == null) {
          TrayGrpc.getTraySaveMethod = getTraySaveMethod =
              io.grpc.MethodDescriptor.<com.example.datapersistance.protobuf.TraySaveRequest, com.example.datapersistance.protobuf.TraySaveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TraySave"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.TraySaveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.TraySaveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrayMethodDescriptorSupplier("TraySave"))
              .build();
        }
      }
    }
    return getTraySaveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.TrayFindByIdRequest,
      com.example.datapersistance.protobuf.TrayFindByIdResponse> getTrayFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrayFindById",
      requestType = com.example.datapersistance.protobuf.TrayFindByIdRequest.class,
      responseType = com.example.datapersistance.protobuf.TrayFindByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.TrayFindByIdRequest,
      com.example.datapersistance.protobuf.TrayFindByIdResponse> getTrayFindByIdMethod() {
    io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.TrayFindByIdRequest, com.example.datapersistance.protobuf.TrayFindByIdResponse> getTrayFindByIdMethod;
    if ((getTrayFindByIdMethod = TrayGrpc.getTrayFindByIdMethod) == null) {
      synchronized (TrayGrpc.class) {
        if ((getTrayFindByIdMethod = TrayGrpc.getTrayFindByIdMethod) == null) {
          TrayGrpc.getTrayFindByIdMethod = getTrayFindByIdMethod =
              io.grpc.MethodDescriptor.<com.example.datapersistance.protobuf.TrayFindByIdRequest, com.example.datapersistance.protobuf.TrayFindByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TrayFindById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.TrayFindByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.TrayFindByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrayMethodDescriptorSupplier("TrayFindById"))
              .build();
        }
      }
    }
    return getTrayFindByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.TrayUpdateRequest,
      com.example.datapersistance.protobuf.TrayUpdateResponse> getTrayUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrayUpdate",
      requestType = com.example.datapersistance.protobuf.TrayUpdateRequest.class,
      responseType = com.example.datapersistance.protobuf.TrayUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.TrayUpdateRequest,
      com.example.datapersistance.protobuf.TrayUpdateResponse> getTrayUpdateMethod() {
    io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.TrayUpdateRequest, com.example.datapersistance.protobuf.TrayUpdateResponse> getTrayUpdateMethod;
    if ((getTrayUpdateMethod = TrayGrpc.getTrayUpdateMethod) == null) {
      synchronized (TrayGrpc.class) {
        if ((getTrayUpdateMethod = TrayGrpc.getTrayUpdateMethod) == null) {
          TrayGrpc.getTrayUpdateMethod = getTrayUpdateMethod =
              io.grpc.MethodDescriptor.<com.example.datapersistance.protobuf.TrayUpdateRequest, com.example.datapersistance.protobuf.TrayUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TrayUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.TrayUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.TrayUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrayMethodDescriptorSupplier("TrayUpdate"))
              .build();
        }
      }
    }
    return getTrayUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.TrayDeleteByIdRequest,
      com.example.datapersistance.protobuf.TrayEmpty> getTrayDeleteByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrayDeleteById",
      requestType = com.example.datapersistance.protobuf.TrayDeleteByIdRequest.class,
      responseType = com.example.datapersistance.protobuf.TrayEmpty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.TrayDeleteByIdRequest,
      com.example.datapersistance.protobuf.TrayEmpty> getTrayDeleteByIdMethod() {
    io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.TrayDeleteByIdRequest, com.example.datapersistance.protobuf.TrayEmpty> getTrayDeleteByIdMethod;
    if ((getTrayDeleteByIdMethod = TrayGrpc.getTrayDeleteByIdMethod) == null) {
      synchronized (TrayGrpc.class) {
        if ((getTrayDeleteByIdMethod = TrayGrpc.getTrayDeleteByIdMethod) == null) {
          TrayGrpc.getTrayDeleteByIdMethod = getTrayDeleteByIdMethod =
              io.grpc.MethodDescriptor.<com.example.datapersistance.protobuf.TrayDeleteByIdRequest, com.example.datapersistance.protobuf.TrayEmpty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TrayDeleteById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.TrayDeleteByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.TrayEmpty.getDefaultInstance()))
              .setSchemaDescriptor(new TrayMethodDescriptorSupplier("TrayDeleteById"))
              .build();
        }
      }
    }
    return getTrayDeleteByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.TrayEmpty,
      com.example.datapersistance.protobuf.TrayFindAllResponse> getTrayFindAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrayFindAll",
      requestType = com.example.datapersistance.protobuf.TrayEmpty.class,
      responseType = com.example.datapersistance.protobuf.TrayFindAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.TrayEmpty,
      com.example.datapersistance.protobuf.TrayFindAllResponse> getTrayFindAllMethod() {
    io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.TrayEmpty, com.example.datapersistance.protobuf.TrayFindAllResponse> getTrayFindAllMethod;
    if ((getTrayFindAllMethod = TrayGrpc.getTrayFindAllMethod) == null) {
      synchronized (TrayGrpc.class) {
        if ((getTrayFindAllMethod = TrayGrpc.getTrayFindAllMethod) == null) {
          TrayGrpc.getTrayFindAllMethod = getTrayFindAllMethod =
              io.grpc.MethodDescriptor.<com.example.datapersistance.protobuf.TrayEmpty, com.example.datapersistance.protobuf.TrayFindAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TrayFindAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.TrayEmpty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.TrayFindAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrayMethodDescriptorSupplier("TrayFindAll"))
              .build();
        }
      }
    }
    return getTrayFindAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrayStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrayStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrayStub>() {
        @java.lang.Override
        public TrayStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrayStub(channel, callOptions);
        }
      };
    return TrayStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrayBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrayBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrayBlockingStub>() {
        @java.lang.Override
        public TrayBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrayBlockingStub(channel, callOptions);
        }
      };
    return TrayBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrayFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrayFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrayFutureStub>() {
        @java.lang.Override
        public TrayFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrayFutureStub(channel, callOptions);
        }
      };
    return TrayFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TrayImplBase implements io.grpc.BindableService {

    /**
     */
    public void traySave(com.example.datapersistance.protobuf.TraySaveRequest request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.TraySaveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTraySaveMethod(), responseObserver);
    }

    /**
     */
    public void trayFindById(com.example.datapersistance.protobuf.TrayFindByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.TrayFindByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTrayFindByIdMethod(), responseObserver);
    }

    /**
     */
    public void trayUpdate(com.example.datapersistance.protobuf.TrayUpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.TrayUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTrayUpdateMethod(), responseObserver);
    }

    /**
     */
    public void trayDeleteById(com.example.datapersistance.protobuf.TrayDeleteByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.TrayEmpty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTrayDeleteByIdMethod(), responseObserver);
    }

    /**
     */
    public void trayFindAll(com.example.datapersistance.protobuf.TrayEmpty request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.TrayFindAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTrayFindAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTraySaveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.datapersistance.protobuf.TraySaveRequest,
                com.example.datapersistance.protobuf.TraySaveResponse>(
                  this, METHODID_TRAY_SAVE)))
          .addMethod(
            getTrayFindByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.datapersistance.protobuf.TrayFindByIdRequest,
                com.example.datapersistance.protobuf.TrayFindByIdResponse>(
                  this, METHODID_TRAY_FIND_BY_ID)))
          .addMethod(
            getTrayUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.datapersistance.protobuf.TrayUpdateRequest,
                com.example.datapersistance.protobuf.TrayUpdateResponse>(
                  this, METHODID_TRAY_UPDATE)))
          .addMethod(
            getTrayDeleteByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.datapersistance.protobuf.TrayDeleteByIdRequest,
                com.example.datapersistance.protobuf.TrayEmpty>(
                  this, METHODID_TRAY_DELETE_BY_ID)))
          .addMethod(
            getTrayFindAllMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.datapersistance.protobuf.TrayEmpty,
                com.example.datapersistance.protobuf.TrayFindAllResponse>(
                  this, METHODID_TRAY_FIND_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class TrayStub extends io.grpc.stub.AbstractAsyncStub<TrayStub> {
    private TrayStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrayStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrayStub(channel, callOptions);
    }

    /**
     */
    public void traySave(com.example.datapersistance.protobuf.TraySaveRequest request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.TraySaveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTraySaveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void trayFindById(com.example.datapersistance.protobuf.TrayFindByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.TrayFindByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTrayFindByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void trayUpdate(com.example.datapersistance.protobuf.TrayUpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.TrayUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTrayUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void trayDeleteById(com.example.datapersistance.protobuf.TrayDeleteByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.TrayEmpty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTrayDeleteByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void trayFindAll(com.example.datapersistance.protobuf.TrayEmpty request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.TrayFindAllResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTrayFindAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TrayBlockingStub extends io.grpc.stub.AbstractBlockingStub<TrayBlockingStub> {
    private TrayBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrayBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrayBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.datapersistance.protobuf.TraySaveResponse traySave(com.example.datapersistance.protobuf.TraySaveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTraySaveMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.datapersistance.protobuf.TrayFindByIdResponse trayFindById(com.example.datapersistance.protobuf.TrayFindByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTrayFindByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.datapersistance.protobuf.TrayUpdateResponse trayUpdate(com.example.datapersistance.protobuf.TrayUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTrayUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.datapersistance.protobuf.TrayEmpty trayDeleteById(com.example.datapersistance.protobuf.TrayDeleteByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTrayDeleteByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.datapersistance.protobuf.TrayFindAllResponse trayFindAll(com.example.datapersistance.protobuf.TrayEmpty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTrayFindAllMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TrayFutureStub extends io.grpc.stub.AbstractFutureStub<TrayFutureStub> {
    private TrayFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrayFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrayFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.datapersistance.protobuf.TraySaveResponse> traySave(
        com.example.datapersistance.protobuf.TraySaveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTraySaveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.datapersistance.protobuf.TrayFindByIdResponse> trayFindById(
        com.example.datapersistance.protobuf.TrayFindByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTrayFindByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.datapersistance.protobuf.TrayUpdateResponse> trayUpdate(
        com.example.datapersistance.protobuf.TrayUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTrayUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.datapersistance.protobuf.TrayEmpty> trayDeleteById(
        com.example.datapersistance.protobuf.TrayDeleteByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTrayDeleteByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.datapersistance.protobuf.TrayFindAllResponse> trayFindAll(
        com.example.datapersistance.protobuf.TrayEmpty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTrayFindAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TRAY_SAVE = 0;
  private static final int METHODID_TRAY_FIND_BY_ID = 1;
  private static final int METHODID_TRAY_UPDATE = 2;
  private static final int METHODID_TRAY_DELETE_BY_ID = 3;
  private static final int METHODID_TRAY_FIND_ALL = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrayImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrayImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TRAY_SAVE:
          serviceImpl.traySave((com.example.datapersistance.protobuf.TraySaveRequest) request,
              (io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.TraySaveResponse>) responseObserver);
          break;
        case METHODID_TRAY_FIND_BY_ID:
          serviceImpl.trayFindById((com.example.datapersistance.protobuf.TrayFindByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.TrayFindByIdResponse>) responseObserver);
          break;
        case METHODID_TRAY_UPDATE:
          serviceImpl.trayUpdate((com.example.datapersistance.protobuf.TrayUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.TrayUpdateResponse>) responseObserver);
          break;
        case METHODID_TRAY_DELETE_BY_ID:
          serviceImpl.trayDeleteById((com.example.datapersistance.protobuf.TrayDeleteByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.TrayEmpty>) responseObserver);
          break;
        case METHODID_TRAY_FIND_ALL:
          serviceImpl.trayFindAll((com.example.datapersistance.protobuf.TrayEmpty) request,
              (io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.TrayFindAllResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TrayBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrayBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.datapersistance.protobuf.TrayOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Tray");
    }
  }

  private static final class TrayFileDescriptorSupplier
      extends TrayBaseDescriptorSupplier {
    TrayFileDescriptorSupplier() {}
  }

  private static final class TrayMethodDescriptorSupplier
      extends TrayBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TrayMethodDescriptorSupplier(String methodName) {
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
      synchronized (TrayGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrayFileDescriptorSupplier())
              .addMethod(getTraySaveMethod())
              .addMethod(getTrayFindByIdMethod())
              .addMethod(getTrayUpdateMethod())
              .addMethod(getTrayDeleteByIdMethod())
              .addMethod(getTrayFindAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
