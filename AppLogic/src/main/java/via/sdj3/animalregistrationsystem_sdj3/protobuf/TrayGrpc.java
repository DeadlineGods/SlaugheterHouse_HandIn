package via.sdj3.animalregistrationsystem_sdj3.protobuf;

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
  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.TraySaveRequest,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.TraySaveResponse> getTraySaveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TraySave",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.TraySaveRequest.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.TraySaveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.TraySaveRequest,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.TraySaveResponse> getTraySaveMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.TraySaveRequest, via.sdj3.animalregistrationsystem_sdj3.protobuf.TraySaveResponse> getTraySaveMethod;
    if ((getTraySaveMethod = TrayGrpc.getTraySaveMethod) == null) {
      synchronized (TrayGrpc.class) {
        if ((getTraySaveMethod = TrayGrpc.getTraySaveMethod) == null) {
          TrayGrpc.getTraySaveMethod = getTraySaveMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.TraySaveRequest, via.sdj3.animalregistrationsystem_sdj3.protobuf.TraySaveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TraySave"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.TraySaveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.TraySaveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrayMethodDescriptorSupplier("TraySave"))
              .build();
        }
      }
    }
    return getTraySaveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindByIdRequest,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindByIdResponse> getTrayFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrayFindById",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindByIdRequest.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindByIdRequest,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindByIdResponse> getTrayFindByIdMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindByIdRequest, via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindByIdResponse> getTrayFindByIdMethod;
    if ((getTrayFindByIdMethod = TrayGrpc.getTrayFindByIdMethod) == null) {
      synchronized (TrayGrpc.class) {
        if ((getTrayFindByIdMethod = TrayGrpc.getTrayFindByIdMethod) == null) {
          TrayGrpc.getTrayFindByIdMethod = getTrayFindByIdMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindByIdRequest, via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TrayFindById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrayMethodDescriptorSupplier("TrayFindById"))
              .build();
        }
      }
    }
    return getTrayFindByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayUpdateRequest,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayUpdateResponse> getTrayUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrayUpdate",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayUpdateRequest.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayUpdateRequest,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayUpdateResponse> getTrayUpdateMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayUpdateRequest, via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayUpdateResponse> getTrayUpdateMethod;
    if ((getTrayUpdateMethod = TrayGrpc.getTrayUpdateMethod) == null) {
      synchronized (TrayGrpc.class) {
        if ((getTrayUpdateMethod = TrayGrpc.getTrayUpdateMethod) == null) {
          TrayGrpc.getTrayUpdateMethod = getTrayUpdateMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayUpdateRequest, via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TrayUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrayMethodDescriptorSupplier("TrayUpdate"))
              .build();
        }
      }
    }
    return getTrayUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayDeleteByIdRequest,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayEmpty> getTrayDeleteByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrayDeleteById",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayDeleteByIdRequest.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayEmpty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayDeleteByIdRequest,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayEmpty> getTrayDeleteByIdMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayDeleteByIdRequest, via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayEmpty> getTrayDeleteByIdMethod;
    if ((getTrayDeleteByIdMethod = TrayGrpc.getTrayDeleteByIdMethod) == null) {
      synchronized (TrayGrpc.class) {
        if ((getTrayDeleteByIdMethod = TrayGrpc.getTrayDeleteByIdMethod) == null) {
          TrayGrpc.getTrayDeleteByIdMethod = getTrayDeleteByIdMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayDeleteByIdRequest, via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayEmpty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TrayDeleteById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayDeleteByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayEmpty.getDefaultInstance()))
              .setSchemaDescriptor(new TrayMethodDescriptorSupplier("TrayDeleteById"))
              .build();
        }
      }
    }
    return getTrayDeleteByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayEmpty,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindAllResponse> getTrayFindAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrayFindAll",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayEmpty.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayEmpty,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindAllResponse> getTrayFindAllMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayEmpty, via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindAllResponse> getTrayFindAllMethod;
    if ((getTrayFindAllMethod = TrayGrpc.getTrayFindAllMethod) == null) {
      synchronized (TrayGrpc.class) {
        if ((getTrayFindAllMethod = TrayGrpc.getTrayFindAllMethod) == null) {
          TrayGrpc.getTrayFindAllMethod = getTrayFindAllMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayEmpty, via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TrayFindAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayEmpty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindAllResponse.getDefaultInstance()))
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
    public void traySave(via.sdj3.animalregistrationsystem_sdj3.protobuf.TraySaveRequest request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.TraySaveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTraySaveMethod(), responseObserver);
    }

    /**
     */
    public void trayFindById(via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindByIdRequest request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTrayFindByIdMethod(), responseObserver);
    }

    /**
     */
    public void trayUpdate(via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayUpdateRequest request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTrayUpdateMethod(), responseObserver);
    }

    /**
     */
    public void trayDeleteById(via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayDeleteByIdRequest request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayEmpty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTrayDeleteByIdMethod(), responseObserver);
    }

    /**
     */
    public void trayFindAll(via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayEmpty request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTrayFindAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTraySaveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.TraySaveRequest,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.TraySaveResponse>(
                  this, METHODID_TRAY_SAVE)))
          .addMethod(
            getTrayFindByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindByIdRequest,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindByIdResponse>(
                  this, METHODID_TRAY_FIND_BY_ID)))
          .addMethod(
            getTrayUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayUpdateRequest,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayUpdateResponse>(
                  this, METHODID_TRAY_UPDATE)))
          .addMethod(
            getTrayDeleteByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayDeleteByIdRequest,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayEmpty>(
                  this, METHODID_TRAY_DELETE_BY_ID)))
          .addMethod(
            getTrayFindAllMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayEmpty,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindAllResponse>(
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
    public void traySave(via.sdj3.animalregistrationsystem_sdj3.protobuf.TraySaveRequest request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.TraySaveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTraySaveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void trayFindById(via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindByIdRequest request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTrayFindByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void trayUpdate(via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayUpdateRequest request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTrayUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void trayDeleteById(via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayDeleteByIdRequest request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayEmpty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTrayDeleteByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void trayFindAll(via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayEmpty request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindAllResponse> responseObserver) {
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
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.TraySaveResponse traySave(via.sdj3.animalregistrationsystem_sdj3.protobuf.TraySaveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTraySaveMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindByIdResponse trayFindById(via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTrayFindByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayUpdateResponse trayUpdate(via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTrayUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayEmpty trayDeleteById(via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayDeleteByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTrayDeleteByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindAllResponse trayFindAll(via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayEmpty request) {
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
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.TraySaveResponse> traySave(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.TraySaveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTraySaveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindByIdResponse> trayFindById(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTrayFindByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayUpdateResponse> trayUpdate(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTrayUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayEmpty> trayDeleteById(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayDeleteByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTrayDeleteByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindAllResponse> trayFindAll(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayEmpty request) {
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
          serviceImpl.traySave((via.sdj3.animalregistrationsystem_sdj3.protobuf.TraySaveRequest) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.TraySaveResponse>) responseObserver);
          break;
        case METHODID_TRAY_FIND_BY_ID:
          serviceImpl.trayFindById((via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindByIdRequest) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindByIdResponse>) responseObserver);
          break;
        case METHODID_TRAY_UPDATE:
          serviceImpl.trayUpdate((via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayUpdateRequest) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayUpdateResponse>) responseObserver);
          break;
        case METHODID_TRAY_DELETE_BY_ID:
          serviceImpl.trayDeleteById((via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayDeleteByIdRequest) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayEmpty>) responseObserver);
          break;
        case METHODID_TRAY_FIND_ALL:
          serviceImpl.trayFindAll((via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayEmpty) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayFindAllResponse>) responseObserver);
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
      return via.sdj3.animalregistrationsystem_sdj3.protobuf.TrayOuterClass.getDescriptor();
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
