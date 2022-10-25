package com.example;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Animal.proto")
public final class AnimalGrpc {

  private AnimalGrpc() {}

  public static final String SERVICE_NAME = "Animal";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.SaveAnimalRequest,
      com.example.SaveAnimalResponse> getSaveAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveAnimal",
      requestType = com.example.SaveAnimalRequest.class,
      responseType = com.example.SaveAnimalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.SaveAnimalRequest,
      com.example.SaveAnimalResponse> getSaveAnimalMethod() {
    io.grpc.MethodDescriptor<com.example.SaveAnimalRequest, com.example.SaveAnimalResponse> getSaveAnimalMethod;
    if ((getSaveAnimalMethod = AnimalGrpc.getSaveAnimalMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getSaveAnimalMethod = AnimalGrpc.getSaveAnimalMethod) == null) {
          AnimalGrpc.getSaveAnimalMethod = getSaveAnimalMethod =
              io.grpc.MethodDescriptor.<com.example.SaveAnimalRequest, com.example.SaveAnimalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.SaveAnimalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.SaveAnimalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("saveAnimal"))
              .build();
        }
      }
    }
    return getSaveAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.FindByIdRequest,
      com.example.FindByIdResponse> getFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findById",
      requestType = com.example.FindByIdRequest.class,
      responseType = com.example.FindByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.FindByIdRequest,
      com.example.FindByIdResponse> getFindByIdMethod() {
    io.grpc.MethodDescriptor<com.example.FindByIdRequest, com.example.FindByIdResponse> getFindByIdMethod;
    if ((getFindByIdMethod = AnimalGrpc.getFindByIdMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getFindByIdMethod = AnimalGrpc.getFindByIdMethod) == null) {
          AnimalGrpc.getFindByIdMethod = getFindByIdMethod =
              io.grpc.MethodDescriptor.<com.example.FindByIdRequest, com.example.FindByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.FindByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.FindByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("findById"))
              .build();
        }
      }
    }
    return getFindByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.UpdateAnimalRequest,
      com.example.UpdateAnimalResponse> getUpdateAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateAnimal",
      requestType = com.example.UpdateAnimalRequest.class,
      responseType = com.example.UpdateAnimalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.UpdateAnimalRequest,
      com.example.UpdateAnimalResponse> getUpdateAnimalMethod() {
    io.grpc.MethodDescriptor<com.example.UpdateAnimalRequest, com.example.UpdateAnimalResponse> getUpdateAnimalMethod;
    if ((getUpdateAnimalMethod = AnimalGrpc.getUpdateAnimalMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getUpdateAnimalMethod = AnimalGrpc.getUpdateAnimalMethod) == null) {
          AnimalGrpc.getUpdateAnimalMethod = getUpdateAnimalMethod =
              io.grpc.MethodDescriptor.<com.example.UpdateAnimalRequest, com.example.UpdateAnimalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.UpdateAnimalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.UpdateAnimalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("updateAnimal"))
              .build();
        }
      }
    }
    return getUpdateAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.DeleteByIdRequest,
      com.example.Empty> getDeleteByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteById",
      requestType = com.example.DeleteByIdRequest.class,
      responseType = com.example.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.DeleteByIdRequest,
      com.example.Empty> getDeleteByIdMethod() {
    io.grpc.MethodDescriptor<com.example.DeleteByIdRequest, com.example.Empty> getDeleteByIdMethod;
    if ((getDeleteByIdMethod = AnimalGrpc.getDeleteByIdMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getDeleteByIdMethod = AnimalGrpc.getDeleteByIdMethod) == null) {
          AnimalGrpc.getDeleteByIdMethod = getDeleteByIdMethod =
              io.grpc.MethodDescriptor.<com.example.DeleteByIdRequest, com.example.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.DeleteByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("deleteById"))
              .build();
        }
      }
    }
    return getDeleteByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.Empty,
      com.example.AllAnimals> getFindAllAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAllAnimal",
      requestType = com.example.Empty.class,
      responseType = com.example.AllAnimals.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.Empty,
      com.example.AllAnimals> getFindAllAnimalMethod() {
    io.grpc.MethodDescriptor<com.example.Empty, com.example.AllAnimals> getFindAllAnimalMethod;
    if ((getFindAllAnimalMethod = AnimalGrpc.getFindAllAnimalMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getFindAllAnimalMethod = AnimalGrpc.getFindAllAnimalMethod) == null) {
          AnimalGrpc.getFindAllAnimalMethod = getFindAllAnimalMethod =
              io.grpc.MethodDescriptor.<com.example.Empty, com.example.AllAnimals>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAllAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.AllAnimals.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("findAllAnimal"))
              .build();
        }
      }
    }
    return getFindAllAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.FilterByDateRequest,
      com.example.AllAnimals> getFindByDateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByDate",
      requestType = com.example.FilterByDateRequest.class,
      responseType = com.example.AllAnimals.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.FilterByDateRequest,
      com.example.AllAnimals> getFindByDateMethod() {
    io.grpc.MethodDescriptor<com.example.FilterByDateRequest, com.example.AllAnimals> getFindByDateMethod;
    if ((getFindByDateMethod = AnimalGrpc.getFindByDateMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getFindByDateMethod = AnimalGrpc.getFindByDateMethod) == null) {
          AnimalGrpc.getFindByDateMethod = getFindByDateMethod =
              io.grpc.MethodDescriptor.<com.example.FilterByDateRequest, com.example.AllAnimals>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByDate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.FilterByDateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.AllAnimals.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("findByDate"))
              .build();
        }
      }
    }
    return getFindByDateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.Empty,
      com.example.GetMaxIdResponse> getGetMaxIdAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMaxIdAnimal",
      requestType = com.example.Empty.class,
      responseType = com.example.GetMaxIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.Empty,
      com.example.GetMaxIdResponse> getGetMaxIdAnimalMethod() {
    io.grpc.MethodDescriptor<com.example.Empty, com.example.GetMaxIdResponse> getGetMaxIdAnimalMethod;
    if ((getGetMaxIdAnimalMethod = AnimalGrpc.getGetMaxIdAnimalMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getGetMaxIdAnimalMethod = AnimalGrpc.getGetMaxIdAnimalMethod) == null) {
          AnimalGrpc.getGetMaxIdAnimalMethod = getGetMaxIdAnimalMethod =
              io.grpc.MethodDescriptor.<com.example.Empty, com.example.GetMaxIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMaxIdAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.GetMaxIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("getMaxIdAnimal"))
              .build();
        }
      }
    }
    return getGetMaxIdAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.GetFromOriginRequest,
      com.example.AllAnimals> getFindByOriginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByOrigin",
      requestType = com.example.GetFromOriginRequest.class,
      responseType = com.example.AllAnimals.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.GetFromOriginRequest,
      com.example.AllAnimals> getFindByOriginMethod() {
    io.grpc.MethodDescriptor<com.example.GetFromOriginRequest, com.example.AllAnimals> getFindByOriginMethod;
    if ((getFindByOriginMethod = AnimalGrpc.getFindByOriginMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getFindByOriginMethod = AnimalGrpc.getFindByOriginMethod) == null) {
          AnimalGrpc.getFindByOriginMethod = getFindByOriginMethod =
              io.grpc.MethodDescriptor.<com.example.GetFromOriginRequest, com.example.AllAnimals>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByOrigin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.GetFromOriginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.AllAnimals.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("findByOrigin"))
              .build();
        }
      }
    }
    return getFindByOriginMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnimalStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalStub>() {
        @java.lang.Override
        public AnimalStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalStub(channel, callOptions);
        }
      };
    return AnimalStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnimalBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalBlockingStub>() {
        @java.lang.Override
        public AnimalBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalBlockingStub(channel, callOptions);
        }
      };
    return AnimalBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnimalFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalFutureStub>() {
        @java.lang.Override
        public AnimalFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalFutureStub(channel, callOptions);
        }
      };
    return AnimalFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AnimalImplBase implements io.grpc.BindableService {

    /**
     */
    public void saveAnimal(com.example.SaveAnimalRequest request,
        io.grpc.stub.StreamObserver<com.example.SaveAnimalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveAnimalMethod(), responseObserver);
    }

    /**
     */
    public void findById(com.example.FindByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.FindByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateAnimal(com.example.UpdateAnimalRequest request,
        io.grpc.stub.StreamObserver<com.example.UpdateAnimalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAnimalMethod(), responseObserver);
    }

    /**
     */
    public void deleteById(com.example.DeleteByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteByIdMethod(), responseObserver);
    }

    /**
     */
    public void findAllAnimal(com.example.Empty request,
        io.grpc.stub.StreamObserver<com.example.AllAnimals> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllAnimalMethod(), responseObserver);
    }

    /**
     */
    public void findByDate(com.example.FilterByDateRequest request,
        io.grpc.stub.StreamObserver<com.example.AllAnimals> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByDateMethod(), responseObserver);
    }

    /**
     */
    public void getMaxIdAnimal(com.example.Empty request,
        io.grpc.stub.StreamObserver<com.example.GetMaxIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMaxIdAnimalMethod(), responseObserver);
    }

    /**
     */
    public void findByOrigin(com.example.GetFromOriginRequest request,
        io.grpc.stub.StreamObserver<com.example.AllAnimals> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByOriginMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.SaveAnimalRequest,
                com.example.SaveAnimalResponse>(
                  this, METHODID_SAVE_ANIMAL)))
          .addMethod(
            getFindByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.FindByIdRequest,
                com.example.FindByIdResponse>(
                  this, METHODID_FIND_BY_ID)))
          .addMethod(
            getUpdateAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.UpdateAnimalRequest,
                com.example.UpdateAnimalResponse>(
                  this, METHODID_UPDATE_ANIMAL)))
          .addMethod(
            getDeleteByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.DeleteByIdRequest,
                com.example.Empty>(
                  this, METHODID_DELETE_BY_ID)))
          .addMethod(
            getFindAllAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.Empty,
                com.example.AllAnimals>(
                  this, METHODID_FIND_ALL_ANIMAL)))
          .addMethod(
            getFindByDateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.FilterByDateRequest,
                com.example.AllAnimals>(
                  this, METHODID_FIND_BY_DATE)))
          .addMethod(
            getGetMaxIdAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.Empty,
                com.example.GetMaxIdResponse>(
                  this, METHODID_GET_MAX_ID_ANIMAL)))
          .addMethod(
            getFindByOriginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.GetFromOriginRequest,
                com.example.AllAnimals>(
                  this, METHODID_FIND_BY_ORIGIN)))
          .build();
    }
  }

  /**
   */
  public static final class AnimalStub extends io.grpc.stub.AbstractAsyncStub<AnimalStub> {
    private AnimalStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalStub(channel, callOptions);
    }

    /**
     */
    public void saveAnimal(com.example.SaveAnimalRequest request,
        io.grpc.stub.StreamObserver<com.example.SaveAnimalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findById(com.example.FindByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.FindByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAnimal(com.example.UpdateAnimalRequest request,
        io.grpc.stub.StreamObserver<com.example.UpdateAnimalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteById(com.example.DeleteByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAllAnimal(com.example.Empty request,
        io.grpc.stub.StreamObserver<com.example.AllAnimals> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAllAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByDate(com.example.FilterByDateRequest request,
        io.grpc.stub.StreamObserver<com.example.AllAnimals> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByDateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMaxIdAnimal(com.example.Empty request,
        io.grpc.stub.StreamObserver<com.example.GetMaxIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMaxIdAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByOrigin(com.example.GetFromOriginRequest request,
        io.grpc.stub.StreamObserver<com.example.AllAnimals> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByOriginMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AnimalBlockingStub extends io.grpc.stub.AbstractBlockingStub<AnimalBlockingStub> {
    private AnimalBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.SaveAnimalResponse saveAnimal(com.example.SaveAnimalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.FindByIdResponse findById(com.example.FindByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.UpdateAnimalResponse updateAnimal(com.example.UpdateAnimalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.Empty deleteById(com.example.DeleteByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.AllAnimals findAllAnimal(com.example.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAllAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.AllAnimals findByDate(com.example.FilterByDateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByDateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.GetMaxIdResponse getMaxIdAnimal(com.example.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMaxIdAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.AllAnimals findByOrigin(com.example.GetFromOriginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByOriginMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AnimalFutureStub extends io.grpc.stub.AbstractFutureStub<AnimalFutureStub> {
    private AnimalFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.SaveAnimalResponse> saveAnimal(
        com.example.SaveAnimalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.FindByIdResponse> findById(
        com.example.FindByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.UpdateAnimalResponse> updateAnimal(
        com.example.UpdateAnimalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.Empty> deleteById(
        com.example.DeleteByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.AllAnimals> findAllAnimal(
        com.example.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAllAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.AllAnimals> findByDate(
        com.example.FilterByDateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByDateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.GetMaxIdResponse> getMaxIdAnimal(
        com.example.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMaxIdAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.AllAnimals> findByOrigin(
        com.example.GetFromOriginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByOriginMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_ANIMAL = 0;
  private static final int METHODID_FIND_BY_ID = 1;
  private static final int METHODID_UPDATE_ANIMAL = 2;
  private static final int METHODID_DELETE_BY_ID = 3;
  private static final int METHODID_FIND_ALL_ANIMAL = 4;
  private static final int METHODID_FIND_BY_DATE = 5;
  private static final int METHODID_GET_MAX_ID_ANIMAL = 6;
  private static final int METHODID_FIND_BY_ORIGIN = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AnimalImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AnimalImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_ANIMAL:
          serviceImpl.saveAnimal((com.example.SaveAnimalRequest) request,
              (io.grpc.stub.StreamObserver<com.example.SaveAnimalResponse>) responseObserver);
          break;
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((com.example.FindByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.FindByIdResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ANIMAL:
          serviceImpl.updateAnimal((com.example.UpdateAnimalRequest) request,
              (io.grpc.stub.StreamObserver<com.example.UpdateAnimalResponse>) responseObserver);
          break;
        case METHODID_DELETE_BY_ID:
          serviceImpl.deleteById((com.example.DeleteByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.Empty>) responseObserver);
          break;
        case METHODID_FIND_ALL_ANIMAL:
          serviceImpl.findAllAnimal((com.example.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.AllAnimals>) responseObserver);
          break;
        case METHODID_FIND_BY_DATE:
          serviceImpl.findByDate((com.example.FilterByDateRequest) request,
              (io.grpc.stub.StreamObserver<com.example.AllAnimals>) responseObserver);
          break;
        case METHODID_GET_MAX_ID_ANIMAL:
          serviceImpl.getMaxIdAnimal((com.example.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.GetMaxIdResponse>) responseObserver);
          break;
        case METHODID_FIND_BY_ORIGIN:
          serviceImpl.findByOrigin((com.example.GetFromOriginRequest) request,
              (io.grpc.stub.StreamObserver<com.example.AllAnimals>) responseObserver);
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

  private static abstract class AnimalBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnimalBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.AnimalOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Animal");
    }
  }

  private static final class AnimalFileDescriptorSupplier
      extends AnimalBaseDescriptorSupplier {
    AnimalFileDescriptorSupplier() {}
  }

  private static final class AnimalMethodDescriptorSupplier
      extends AnimalBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AnimalMethodDescriptorSupplier(String methodName) {
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
      synchronized (AnimalGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnimalFileDescriptorSupplier())
              .addMethod(getSaveAnimalMethod())
              .addMethod(getFindByIdMethod())
              .addMethod(getUpdateAnimalMethod())
              .addMethod(getDeleteByIdMethod())
              .addMethod(getFindAllAnimalMethod())
              .addMethod(getFindByDateMethod())
              .addMethod(getGetMaxIdAnimalMethod())
              .addMethod(getFindByOriginMethod())
              .build();
        }
      }
    }
    return result;
  }
}
