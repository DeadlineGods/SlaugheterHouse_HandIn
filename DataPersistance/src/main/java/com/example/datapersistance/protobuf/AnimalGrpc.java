package com.example.datapersistance.protobuf;

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
  private static volatile io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.SaveAnimalRequest,
      com.example.datapersistance.protobuf.SaveAnimalResponse> getSaveAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveAnimal",
      requestType = com.example.datapersistance.protobuf.SaveAnimalRequest.class,
      responseType = com.example.datapersistance.protobuf.SaveAnimalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.SaveAnimalRequest,
      com.example.datapersistance.protobuf.SaveAnimalResponse> getSaveAnimalMethod() {
    io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.SaveAnimalRequest, com.example.datapersistance.protobuf.SaveAnimalResponse> getSaveAnimalMethod;
    if ((getSaveAnimalMethod = AnimalGrpc.getSaveAnimalMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getSaveAnimalMethod = AnimalGrpc.getSaveAnimalMethod) == null) {
          AnimalGrpc.getSaveAnimalMethod = getSaveAnimalMethod =
              io.grpc.MethodDescriptor.<com.example.datapersistance.protobuf.SaveAnimalRequest, com.example.datapersistance.protobuf.SaveAnimalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.SaveAnimalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.SaveAnimalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("saveAnimal"))
              .build();
        }
      }
    }
    return getSaveAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.FindByIdRequestAnimal,
      com.example.datapersistance.protobuf.FindByIdResponseAnimal> getFindByIdAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByIdAnimal",
      requestType = com.example.datapersistance.protobuf.FindByIdRequestAnimal.class,
      responseType = com.example.datapersistance.protobuf.FindByIdResponseAnimal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.FindByIdRequestAnimal,
      com.example.datapersistance.protobuf.FindByIdResponseAnimal> getFindByIdAnimalMethod() {
    io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.FindByIdRequestAnimal, com.example.datapersistance.protobuf.FindByIdResponseAnimal> getFindByIdAnimalMethod;
    if ((getFindByIdAnimalMethod = AnimalGrpc.getFindByIdAnimalMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getFindByIdAnimalMethod = AnimalGrpc.getFindByIdAnimalMethod) == null) {
          AnimalGrpc.getFindByIdAnimalMethod = getFindByIdAnimalMethod =
              io.grpc.MethodDescriptor.<com.example.datapersistance.protobuf.FindByIdRequestAnimal, com.example.datapersistance.protobuf.FindByIdResponseAnimal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByIdAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.FindByIdRequestAnimal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.FindByIdResponseAnimal.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("findByIdAnimal"))
              .build();
        }
      }
    }
    return getFindByIdAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.UpdateAnimalRequest,
      com.example.datapersistance.protobuf.UpdateAnimalResponse> getUpdateAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateAnimal",
      requestType = com.example.datapersistance.protobuf.UpdateAnimalRequest.class,
      responseType = com.example.datapersistance.protobuf.UpdateAnimalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.UpdateAnimalRequest,
      com.example.datapersistance.protobuf.UpdateAnimalResponse> getUpdateAnimalMethod() {
    io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.UpdateAnimalRequest, com.example.datapersistance.protobuf.UpdateAnimalResponse> getUpdateAnimalMethod;
    if ((getUpdateAnimalMethod = AnimalGrpc.getUpdateAnimalMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getUpdateAnimalMethod = AnimalGrpc.getUpdateAnimalMethod) == null) {
          AnimalGrpc.getUpdateAnimalMethod = getUpdateAnimalMethod =
              io.grpc.MethodDescriptor.<com.example.datapersistance.protobuf.UpdateAnimalRequest, com.example.datapersistance.protobuf.UpdateAnimalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.UpdateAnimalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.UpdateAnimalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("updateAnimal"))
              .build();
        }
      }
    }
    return getUpdateAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.DeleteByIdRequestAnimal,
      com.example.datapersistance.protobuf.EmptyAnimal> getDeleteByIdAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteByIdAnimal",
      requestType = com.example.datapersistance.protobuf.DeleteByIdRequestAnimal.class,
      responseType = com.example.datapersistance.protobuf.EmptyAnimal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.DeleteByIdRequestAnimal,
      com.example.datapersistance.protobuf.EmptyAnimal> getDeleteByIdAnimalMethod() {
    io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.DeleteByIdRequestAnimal, com.example.datapersistance.protobuf.EmptyAnimal> getDeleteByIdAnimalMethod;
    if ((getDeleteByIdAnimalMethod = AnimalGrpc.getDeleteByIdAnimalMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getDeleteByIdAnimalMethod = AnimalGrpc.getDeleteByIdAnimalMethod) == null) {
          AnimalGrpc.getDeleteByIdAnimalMethod = getDeleteByIdAnimalMethod =
              io.grpc.MethodDescriptor.<com.example.datapersistance.protobuf.DeleteByIdRequestAnimal, com.example.datapersistance.protobuf.EmptyAnimal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteByIdAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.DeleteByIdRequestAnimal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.EmptyAnimal.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("deleteByIdAnimal"))
              .build();
        }
      }
    }
    return getDeleteByIdAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.EmptyAnimal,
      com.example.datapersistance.protobuf.AllAnimals> getFindAllAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAllAnimal",
      requestType = com.example.datapersistance.protobuf.EmptyAnimal.class,
      responseType = com.example.datapersistance.protobuf.AllAnimals.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.EmptyAnimal,
      com.example.datapersistance.protobuf.AllAnimals> getFindAllAnimalMethod() {
    io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.EmptyAnimal, com.example.datapersistance.protobuf.AllAnimals> getFindAllAnimalMethod;
    if ((getFindAllAnimalMethod = AnimalGrpc.getFindAllAnimalMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getFindAllAnimalMethod = AnimalGrpc.getFindAllAnimalMethod) == null) {
          AnimalGrpc.getFindAllAnimalMethod = getFindAllAnimalMethod =
              io.grpc.MethodDescriptor.<com.example.datapersistance.protobuf.EmptyAnimal, com.example.datapersistance.protobuf.AllAnimals>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAllAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.EmptyAnimal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.AllAnimals.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("findAllAnimal"))
              .build();
        }
      }
    }
    return getFindAllAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.FilterByDateRequestAnimal,
      com.example.datapersistance.protobuf.AllAnimals> getFindByDateAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByDateAnimal",
      requestType = com.example.datapersistance.protobuf.FilterByDateRequestAnimal.class,
      responseType = com.example.datapersistance.protobuf.AllAnimals.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.FilterByDateRequestAnimal,
      com.example.datapersistance.protobuf.AllAnimals> getFindByDateAnimalMethod() {
    io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.FilterByDateRequestAnimal, com.example.datapersistance.protobuf.AllAnimals> getFindByDateAnimalMethod;
    if ((getFindByDateAnimalMethod = AnimalGrpc.getFindByDateAnimalMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getFindByDateAnimalMethod = AnimalGrpc.getFindByDateAnimalMethod) == null) {
          AnimalGrpc.getFindByDateAnimalMethod = getFindByDateAnimalMethod =
              io.grpc.MethodDescriptor.<com.example.datapersistance.protobuf.FilterByDateRequestAnimal, com.example.datapersistance.protobuf.AllAnimals>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByDateAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.FilterByDateRequestAnimal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.AllAnimals.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("findByDateAnimal"))
              .build();
        }
      }
    }
    return getFindByDateAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.EmptyAnimal,
      com.example.datapersistance.protobuf.GetMaxIdResponseAnimal> getGetMaxIdAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMaxIdAnimal",
      requestType = com.example.datapersistance.protobuf.EmptyAnimal.class,
      responseType = com.example.datapersistance.protobuf.GetMaxIdResponseAnimal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.EmptyAnimal,
      com.example.datapersistance.protobuf.GetMaxIdResponseAnimal> getGetMaxIdAnimalMethod() {
    io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.EmptyAnimal, com.example.datapersistance.protobuf.GetMaxIdResponseAnimal> getGetMaxIdAnimalMethod;
    if ((getGetMaxIdAnimalMethod = AnimalGrpc.getGetMaxIdAnimalMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getGetMaxIdAnimalMethod = AnimalGrpc.getGetMaxIdAnimalMethod) == null) {
          AnimalGrpc.getGetMaxIdAnimalMethod = getGetMaxIdAnimalMethod =
              io.grpc.MethodDescriptor.<com.example.datapersistance.protobuf.EmptyAnimal, com.example.datapersistance.protobuf.GetMaxIdResponseAnimal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMaxIdAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.EmptyAnimal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.GetMaxIdResponseAnimal.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("getMaxIdAnimal"))
              .build();
        }
      }
    }
    return getGetMaxIdAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.GetFromOriginRequestAnimal,
      com.example.datapersistance.protobuf.AllAnimals> getFindByOriginAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByOriginAnimal",
      requestType = com.example.datapersistance.protobuf.GetFromOriginRequestAnimal.class,
      responseType = com.example.datapersistance.protobuf.AllAnimals.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.GetFromOriginRequestAnimal,
      com.example.datapersistance.protobuf.AllAnimals> getFindByOriginAnimalMethod() {
    io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.GetFromOriginRequestAnimal, com.example.datapersistance.protobuf.AllAnimals> getFindByOriginAnimalMethod;
    if ((getFindByOriginAnimalMethod = AnimalGrpc.getFindByOriginAnimalMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getFindByOriginAnimalMethod = AnimalGrpc.getFindByOriginAnimalMethod) == null) {
          AnimalGrpc.getFindByOriginAnimalMethod = getFindByOriginAnimalMethod =
              io.grpc.MethodDescriptor.<com.example.datapersistance.protobuf.GetFromOriginRequestAnimal, com.example.datapersistance.protobuf.AllAnimals>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByOriginAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.GetFromOriginRequestAnimal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.AllAnimals.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("findByOriginAnimal"))
              .build();
        }
      }
    }
    return getFindByOriginAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.FindByIdRequestAnimal,
      com.example.datapersistance.protobuf.Products> getFindAllProductsFromAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAllProductsFromAnimal",
      requestType = com.example.datapersistance.protobuf.FindByIdRequestAnimal.class,
      responseType = com.example.datapersistance.protobuf.Products.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.FindByIdRequestAnimal,
      com.example.datapersistance.protobuf.Products> getFindAllProductsFromAnimalMethod() {
    io.grpc.MethodDescriptor<com.example.datapersistance.protobuf.FindByIdRequestAnimal, com.example.datapersistance.protobuf.Products> getFindAllProductsFromAnimalMethod;
    if ((getFindAllProductsFromAnimalMethod = AnimalGrpc.getFindAllProductsFromAnimalMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getFindAllProductsFromAnimalMethod = AnimalGrpc.getFindAllProductsFromAnimalMethod) == null) {
          AnimalGrpc.getFindAllProductsFromAnimalMethod = getFindAllProductsFromAnimalMethod =
              io.grpc.MethodDescriptor.<com.example.datapersistance.protobuf.FindByIdRequestAnimal, com.example.datapersistance.protobuf.Products>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAllProductsFromAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.FindByIdRequestAnimal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.datapersistance.protobuf.Products.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("findAllProductsFromAnimal"))
              .build();
        }
      }
    }
    return getFindAllProductsFromAnimalMethod;
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
    public void saveAnimal(com.example.datapersistance.protobuf.SaveAnimalRequest request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.SaveAnimalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveAnimalMethod(), responseObserver);
    }

    /**
     */
    public void findByIdAnimal(com.example.datapersistance.protobuf.FindByIdRequestAnimal request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.FindByIdResponseAnimal> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByIdAnimalMethod(), responseObserver);
    }

    /**
     */
    public void updateAnimal(com.example.datapersistance.protobuf.UpdateAnimalRequest request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.UpdateAnimalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAnimalMethod(), responseObserver);
    }

    /**
     */
    public void deleteByIdAnimal(com.example.datapersistance.protobuf.DeleteByIdRequestAnimal request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.EmptyAnimal> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteByIdAnimalMethod(), responseObserver);
    }

    /**
     */
    public void findAllAnimal(com.example.datapersistance.protobuf.EmptyAnimal request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.AllAnimals> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllAnimalMethod(), responseObserver);
    }

    /**
     */
    public void findByDateAnimal(com.example.datapersistance.protobuf.FilterByDateRequestAnimal request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.AllAnimals> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByDateAnimalMethod(), responseObserver);
    }

    /**
     */
    public void getMaxIdAnimal(com.example.datapersistance.protobuf.EmptyAnimal request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.GetMaxIdResponseAnimal> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMaxIdAnimalMethod(), responseObserver);
    }

    /**
     */
    public void findByOriginAnimal(com.example.datapersistance.protobuf.GetFromOriginRequestAnimal request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.AllAnimals> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByOriginAnimalMethod(), responseObserver);
    }

    /**
     */
    public void findAllProductsFromAnimal(com.example.datapersistance.protobuf.FindByIdRequestAnimal request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.Products> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllProductsFromAnimalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.datapersistance.protobuf.SaveAnimalRequest,
                com.example.datapersistance.protobuf.SaveAnimalResponse>(
                  this, METHODID_SAVE_ANIMAL)))
          .addMethod(
            getFindByIdAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.datapersistance.protobuf.FindByIdRequestAnimal,
                com.example.datapersistance.protobuf.FindByIdResponseAnimal>(
                  this, METHODID_FIND_BY_ID_ANIMAL)))
          .addMethod(
            getUpdateAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.datapersistance.protobuf.UpdateAnimalRequest,
                com.example.datapersistance.protobuf.UpdateAnimalResponse>(
                  this, METHODID_UPDATE_ANIMAL)))
          .addMethod(
            getDeleteByIdAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.datapersistance.protobuf.DeleteByIdRequestAnimal,
                com.example.datapersistance.protobuf.EmptyAnimal>(
                  this, METHODID_DELETE_BY_ID_ANIMAL)))
          .addMethod(
            getFindAllAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.datapersistance.protobuf.EmptyAnimal,
                com.example.datapersistance.protobuf.AllAnimals>(
                  this, METHODID_FIND_ALL_ANIMAL)))
          .addMethod(
            getFindByDateAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.datapersistance.protobuf.FilterByDateRequestAnimal,
                com.example.datapersistance.protobuf.AllAnimals>(
                  this, METHODID_FIND_BY_DATE_ANIMAL)))
          .addMethod(
            getGetMaxIdAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.datapersistance.protobuf.EmptyAnimal,
                com.example.datapersistance.protobuf.GetMaxIdResponseAnimal>(
                  this, METHODID_GET_MAX_ID_ANIMAL)))
          .addMethod(
            getFindByOriginAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.datapersistance.protobuf.GetFromOriginRequestAnimal,
                com.example.datapersistance.protobuf.AllAnimals>(
                  this, METHODID_FIND_BY_ORIGIN_ANIMAL)))
          .addMethod(
            getFindAllProductsFromAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.datapersistance.protobuf.FindByIdRequestAnimal,
                com.example.datapersistance.protobuf.Products>(
                  this, METHODID_FIND_ALL_PRODUCTS_FROM_ANIMAL)))
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
    public void saveAnimal(com.example.datapersistance.protobuf.SaveAnimalRequest request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.SaveAnimalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByIdAnimal(com.example.datapersistance.protobuf.FindByIdRequestAnimal request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.FindByIdResponseAnimal> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByIdAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAnimal(com.example.datapersistance.protobuf.UpdateAnimalRequest request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.UpdateAnimalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteByIdAnimal(com.example.datapersistance.protobuf.DeleteByIdRequestAnimal request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.EmptyAnimal> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteByIdAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAllAnimal(com.example.datapersistance.protobuf.EmptyAnimal request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.AllAnimals> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAllAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByDateAnimal(com.example.datapersistance.protobuf.FilterByDateRequestAnimal request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.AllAnimals> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByDateAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMaxIdAnimal(com.example.datapersistance.protobuf.EmptyAnimal request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.GetMaxIdResponseAnimal> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMaxIdAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByOriginAnimal(com.example.datapersistance.protobuf.GetFromOriginRequestAnimal request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.AllAnimals> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByOriginAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAllProductsFromAnimal(com.example.datapersistance.protobuf.FindByIdRequestAnimal request,
        io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.Products> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAllProductsFromAnimalMethod(), getCallOptions()), request, responseObserver);
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
    public com.example.datapersistance.protobuf.SaveAnimalResponse saveAnimal(com.example.datapersistance.protobuf.SaveAnimalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.datapersistance.protobuf.FindByIdResponseAnimal findByIdAnimal(com.example.datapersistance.protobuf.FindByIdRequestAnimal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByIdAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.datapersistance.protobuf.UpdateAnimalResponse updateAnimal(com.example.datapersistance.protobuf.UpdateAnimalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.datapersistance.protobuf.EmptyAnimal deleteByIdAnimal(com.example.datapersistance.protobuf.DeleteByIdRequestAnimal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteByIdAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.datapersistance.protobuf.AllAnimals findAllAnimal(com.example.datapersistance.protobuf.EmptyAnimal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAllAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.datapersistance.protobuf.AllAnimals findByDateAnimal(com.example.datapersistance.protobuf.FilterByDateRequestAnimal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByDateAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.datapersistance.protobuf.GetMaxIdResponseAnimal getMaxIdAnimal(com.example.datapersistance.protobuf.EmptyAnimal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMaxIdAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.datapersistance.protobuf.AllAnimals findByOriginAnimal(com.example.datapersistance.protobuf.GetFromOriginRequestAnimal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByOriginAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.datapersistance.protobuf.Products findAllProductsFromAnimal(com.example.datapersistance.protobuf.FindByIdRequestAnimal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAllProductsFromAnimalMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.example.datapersistance.protobuf.SaveAnimalResponse> saveAnimal(
        com.example.datapersistance.protobuf.SaveAnimalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.datapersistance.protobuf.FindByIdResponseAnimal> findByIdAnimal(
        com.example.datapersistance.protobuf.FindByIdRequestAnimal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByIdAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.datapersistance.protobuf.UpdateAnimalResponse> updateAnimal(
        com.example.datapersistance.protobuf.UpdateAnimalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.datapersistance.protobuf.EmptyAnimal> deleteByIdAnimal(
        com.example.datapersistance.protobuf.DeleteByIdRequestAnimal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteByIdAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.datapersistance.protobuf.AllAnimals> findAllAnimal(
        com.example.datapersistance.protobuf.EmptyAnimal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAllAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.datapersistance.protobuf.AllAnimals> findByDateAnimal(
        com.example.datapersistance.protobuf.FilterByDateRequestAnimal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByDateAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.datapersistance.protobuf.GetMaxIdResponseAnimal> getMaxIdAnimal(
        com.example.datapersistance.protobuf.EmptyAnimal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMaxIdAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.datapersistance.protobuf.AllAnimals> findByOriginAnimal(
        com.example.datapersistance.protobuf.GetFromOriginRequestAnimal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByOriginAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.datapersistance.protobuf.Products> findAllProductsFromAnimal(
        com.example.datapersistance.protobuf.FindByIdRequestAnimal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAllProductsFromAnimalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_ANIMAL = 0;
  private static final int METHODID_FIND_BY_ID_ANIMAL = 1;
  private static final int METHODID_UPDATE_ANIMAL = 2;
  private static final int METHODID_DELETE_BY_ID_ANIMAL = 3;
  private static final int METHODID_FIND_ALL_ANIMAL = 4;
  private static final int METHODID_FIND_BY_DATE_ANIMAL = 5;
  private static final int METHODID_GET_MAX_ID_ANIMAL = 6;
  private static final int METHODID_FIND_BY_ORIGIN_ANIMAL = 7;
  private static final int METHODID_FIND_ALL_PRODUCTS_FROM_ANIMAL = 8;

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
          serviceImpl.saveAnimal((com.example.datapersistance.protobuf.SaveAnimalRequest) request,
              (io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.SaveAnimalResponse>) responseObserver);
          break;
        case METHODID_FIND_BY_ID_ANIMAL:
          serviceImpl.findByIdAnimal((com.example.datapersistance.protobuf.FindByIdRequestAnimal) request,
              (io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.FindByIdResponseAnimal>) responseObserver);
          break;
        case METHODID_UPDATE_ANIMAL:
          serviceImpl.updateAnimal((com.example.datapersistance.protobuf.UpdateAnimalRequest) request,
              (io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.UpdateAnimalResponse>) responseObserver);
          break;
        case METHODID_DELETE_BY_ID_ANIMAL:
          serviceImpl.deleteByIdAnimal((com.example.datapersistance.protobuf.DeleteByIdRequestAnimal) request,
              (io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.EmptyAnimal>) responseObserver);
          break;
        case METHODID_FIND_ALL_ANIMAL:
          serviceImpl.findAllAnimal((com.example.datapersistance.protobuf.EmptyAnimal) request,
              (io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.AllAnimals>) responseObserver);
          break;
        case METHODID_FIND_BY_DATE_ANIMAL:
          serviceImpl.findByDateAnimal((com.example.datapersistance.protobuf.FilterByDateRequestAnimal) request,
              (io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.AllAnimals>) responseObserver);
          break;
        case METHODID_GET_MAX_ID_ANIMAL:
          serviceImpl.getMaxIdAnimal((com.example.datapersistance.protobuf.EmptyAnimal) request,
              (io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.GetMaxIdResponseAnimal>) responseObserver);
          break;
        case METHODID_FIND_BY_ORIGIN_ANIMAL:
          serviceImpl.findByOriginAnimal((com.example.datapersistance.protobuf.GetFromOriginRequestAnimal) request,
              (io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.AllAnimals>) responseObserver);
          break;
        case METHODID_FIND_ALL_PRODUCTS_FROM_ANIMAL:
          serviceImpl.findAllProductsFromAnimal((com.example.datapersistance.protobuf.FindByIdRequestAnimal) request,
              (io.grpc.stub.StreamObserver<com.example.datapersistance.protobuf.Products>) responseObserver);
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
      return com.example.datapersistance.protobuf.AnimalOuterClass.getDescriptor();
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
              .addMethod(getFindByIdAnimalMethod())
              .addMethod(getUpdateAnimalMethod())
              .addMethod(getDeleteByIdAnimalMethod())
              .addMethod(getFindAllAnimalMethod())
              .addMethod(getFindByDateAnimalMethod())
              .addMethod(getGetMaxIdAnimalMethod())
              .addMethod(getFindByOriginAnimalMethod())
              .addMethod(getFindAllProductsFromAnimalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
