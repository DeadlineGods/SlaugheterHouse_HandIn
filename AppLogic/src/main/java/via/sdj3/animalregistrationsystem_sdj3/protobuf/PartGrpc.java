package via.sdj3.animalregistrationsystem_sdj3.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Part.proto")
public final class PartGrpc {

  private PartGrpc() {}

  public static final String SERVICE_NAME = "Part";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.SavePartRequest,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.SavePartResponse> getSavePartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "savePart",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.SavePartRequest.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.SavePartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.SavePartRequest,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.SavePartResponse> getSavePartMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.SavePartRequest, via.sdj3.animalregistrationsystem_sdj3.protobuf.SavePartResponse> getSavePartMethod;
    if ((getSavePartMethod = PartGrpc.getSavePartMethod) == null) {
      synchronized (PartGrpc.class) {
        if ((getSavePartMethod = PartGrpc.getSavePartMethod) == null) {
          PartGrpc.getSavePartMethod = getSavePartMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.SavePartRequest, via.sdj3.animalregistrationsystem_sdj3.protobuf.SavePartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "savePart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.SavePartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.SavePartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PartMethodDescriptorSupplier("savePart"))
              .build();
        }
      }
    }
    return getSavePartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.FIndByIdRequestPart,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdResponsePart> getFindByIdPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByIdPart",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.FIndByIdRequestPart.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdResponsePart.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.FIndByIdRequestPart,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdResponsePart> getFindByIdPartMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.FIndByIdRequestPart, via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdResponsePart> getFindByIdPartMethod;
    if ((getFindByIdPartMethod = PartGrpc.getFindByIdPartMethod) == null) {
      synchronized (PartGrpc.class) {
        if ((getFindByIdPartMethod = PartGrpc.getFindByIdPartMethod) == null) {
          PartGrpc.getFindByIdPartMethod = getFindByIdPartMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.FIndByIdRequestPart, via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdResponsePart>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByIdPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.FIndByIdRequestPart.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdResponsePart.getDefaultInstance()))
              .setSchemaDescriptor(new PartMethodDescriptorSupplier("findByIdPart"))
              .build();
        }
      }
    }
    return getFindByIdPartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdatePartRequest,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdatePartResponse> getUpdatePartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updatePart",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdatePartRequest.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdatePartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdatePartRequest,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdatePartResponse> getUpdatePartMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdatePartRequest, via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdatePartResponse> getUpdatePartMethod;
    if ((getUpdatePartMethod = PartGrpc.getUpdatePartMethod) == null) {
      synchronized (PartGrpc.class) {
        if ((getUpdatePartMethod = PartGrpc.getUpdatePartMethod) == null) {
          PartGrpc.getUpdatePartMethod = getUpdatePartMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdatePartRequest, via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdatePartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updatePart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdatePartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdatePartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PartMethodDescriptorSupplier("updatePart"))
              .build();
        }
      }
    }
    return getUpdatePartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.DeleteByIdRequestPart,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyPart> getDeleteByIdPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteByIdPart",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.DeleteByIdRequestPart.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyPart.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.DeleteByIdRequestPart,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyPart> getDeleteByIdPartMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.DeleteByIdRequestPart, via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyPart> getDeleteByIdPartMethod;
    if ((getDeleteByIdPartMethod = PartGrpc.getDeleteByIdPartMethod) == null) {
      synchronized (PartGrpc.class) {
        if ((getDeleteByIdPartMethod = PartGrpc.getDeleteByIdPartMethod) == null) {
          PartGrpc.getDeleteByIdPartMethod = getDeleteByIdPartMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.DeleteByIdRequestPart, via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyPart>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteByIdPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.DeleteByIdRequestPart.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyPart.getDefaultInstance()))
              .setSchemaDescriptor(new PartMethodDescriptorSupplier("deleteByIdPart"))
              .build();
        }
      }
    }
    return getDeleteByIdPartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyPart,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.AllParts> getFindAllPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAllPart",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyPart.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.AllParts.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyPart,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.AllParts> getFindAllPartMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyPart, via.sdj3.animalregistrationsystem_sdj3.protobuf.AllParts> getFindAllPartMethod;
    if ((getFindAllPartMethod = PartGrpc.getFindAllPartMethod) == null) {
      synchronized (PartGrpc.class) {
        if ((getFindAllPartMethod = PartGrpc.getFindAllPartMethod) == null) {
          PartGrpc.getFindAllPartMethod = getFindAllPartMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyPart, via.sdj3.animalregistrationsystem_sdj3.protobuf.AllParts>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAllPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyPart.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.AllParts.getDefaultInstance()))
              .setSchemaDescriptor(new PartMethodDescriptorSupplier("findAllPart"))
              .build();
        }
      }
    }
    return getFindAllPartMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PartStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PartStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PartStub>() {
        @java.lang.Override
        public PartStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PartStub(channel, callOptions);
        }
      };
    return PartStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PartBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PartBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PartBlockingStub>() {
        @java.lang.Override
        public PartBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PartBlockingStub(channel, callOptions);
        }
      };
    return PartBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PartFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PartFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PartFutureStub>() {
        @java.lang.Override
        public PartFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PartFutureStub(channel, callOptions);
        }
      };
    return PartFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PartImplBase implements io.grpc.BindableService {

    /**
     */
    public void savePart(via.sdj3.animalregistrationsystem_sdj3.protobuf.SavePartRequest request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.SavePartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSavePartMethod(), responseObserver);
    }

    /**
     */
    public void findByIdPart(via.sdj3.animalregistrationsystem_sdj3.protobuf.FIndByIdRequestPart request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdResponsePart> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByIdPartMethod(), responseObserver);
    }

    /**
     */
    public void updatePart(via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdatePartRequest request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdatePartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePartMethod(), responseObserver);
    }

    /**
     */
    public void deleteByIdPart(via.sdj3.animalregistrationsystem_sdj3.protobuf.DeleteByIdRequestPart request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyPart> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteByIdPartMethod(), responseObserver);
    }

    /**
     */
    public void findAllPart(via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyPart request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.AllParts> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllPartMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSavePartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.SavePartRequest,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.SavePartResponse>(
                  this, METHODID_SAVE_PART)))
          .addMethod(
            getFindByIdPartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.FIndByIdRequestPart,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdResponsePart>(
                  this, METHODID_FIND_BY_ID_PART)))
          .addMethod(
            getUpdatePartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdatePartRequest,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdatePartResponse>(
                  this, METHODID_UPDATE_PART)))
          .addMethod(
            getDeleteByIdPartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.DeleteByIdRequestPart,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyPart>(
                  this, METHODID_DELETE_BY_ID_PART)))
          .addMethod(
            getFindAllPartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyPart,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.AllParts>(
                  this, METHODID_FIND_ALL_PART)))
          .build();
    }
  }

  /**
   */
  public static final class PartStub extends io.grpc.stub.AbstractAsyncStub<PartStub> {
    private PartStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PartStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PartStub(channel, callOptions);
    }

    /**
     */
    public void savePart(via.sdj3.animalregistrationsystem_sdj3.protobuf.SavePartRequest request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.SavePartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSavePartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByIdPart(via.sdj3.animalregistrationsystem_sdj3.protobuf.FIndByIdRequestPart request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdResponsePart> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByIdPartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePart(via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdatePartRequest request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdatePartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteByIdPart(via.sdj3.animalregistrationsystem_sdj3.protobuf.DeleteByIdRequestPart request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyPart> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteByIdPartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAllPart(via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyPart request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.AllParts> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAllPartMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PartBlockingStub extends io.grpc.stub.AbstractBlockingStub<PartBlockingStub> {
    private PartBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PartBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PartBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.SavePartResponse savePart(via.sdj3.animalregistrationsystem_sdj3.protobuf.SavePartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSavePartMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdResponsePart findByIdPart(via.sdj3.animalregistrationsystem_sdj3.protobuf.FIndByIdRequestPart request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByIdPartMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdatePartResponse updatePart(via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdatePartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePartMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyPart deleteByIdPart(via.sdj3.animalregistrationsystem_sdj3.protobuf.DeleteByIdRequestPart request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteByIdPartMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.AllParts findAllPart(via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyPart request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAllPartMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PartFutureStub extends io.grpc.stub.AbstractFutureStub<PartFutureStub> {
    private PartFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PartFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PartFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.SavePartResponse> savePart(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.SavePartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSavePartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdResponsePart> findByIdPart(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.FIndByIdRequestPart request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByIdPartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdatePartResponse> updatePart(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdatePartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyPart> deleteByIdPart(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.DeleteByIdRequestPart request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteByIdPartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.AllParts> findAllPart(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyPart request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAllPartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_PART = 0;
  private static final int METHODID_FIND_BY_ID_PART = 1;
  private static final int METHODID_UPDATE_PART = 2;
  private static final int METHODID_DELETE_BY_ID_PART = 3;
  private static final int METHODID_FIND_ALL_PART = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PartImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PartImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_PART:
          serviceImpl.savePart((via.sdj3.animalregistrationsystem_sdj3.protobuf.SavePartRequest) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.SavePartResponse>) responseObserver);
          break;
        case METHODID_FIND_BY_ID_PART:
          serviceImpl.findByIdPart((via.sdj3.animalregistrationsystem_sdj3.protobuf.FIndByIdRequestPart) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdResponsePart>) responseObserver);
          break;
        case METHODID_UPDATE_PART:
          serviceImpl.updatePart((via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdatePartRequest) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdatePartResponse>) responseObserver);
          break;
        case METHODID_DELETE_BY_ID_PART:
          serviceImpl.deleteByIdPart((via.sdj3.animalregistrationsystem_sdj3.protobuf.DeleteByIdRequestPart) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyPart>) responseObserver);
          break;
        case METHODID_FIND_ALL_PART:
          serviceImpl.findAllPart((via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyPart) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.AllParts>) responseObserver);
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

  private static abstract class PartBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PartBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sdj3.animalregistrationsystem_sdj3.protobuf.PartOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Part");
    }
  }

  private static final class PartFileDescriptorSupplier
      extends PartBaseDescriptorSupplier {
    PartFileDescriptorSupplier() {}
  }

  private static final class PartMethodDescriptorSupplier
      extends PartBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PartMethodDescriptorSupplier(String methodName) {
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
      synchronized (PartGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PartFileDescriptorSupplier())
              .addMethod(getSavePartMethod())
              .addMethod(getFindByIdPartMethod())
              .addMethod(getUpdatePartMethod())
              .addMethod(getDeleteByIdPartMethod())
              .addMethod(getFindAllPartMethod())
              .build();
        }
      }
    }
    return result;
  }
}
