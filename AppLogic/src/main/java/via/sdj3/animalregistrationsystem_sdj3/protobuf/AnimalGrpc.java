package via.sdj3.animalregistrationsystem_sdj3.protobuf;

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
  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalRequest,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalResponse> getSaveAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveAnimal",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalRequest.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalRequest,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalResponse> getSaveAnimalMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalRequest, via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalResponse> getSaveAnimalMethod;
    if ((getSaveAnimalMethod = AnimalGrpc.getSaveAnimalMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getSaveAnimalMethod = AnimalGrpc.getSaveAnimalMethod) == null) {
          AnimalGrpc.getSaveAnimalMethod = getSaveAnimalMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalRequest, via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("saveAnimal"))
              .build();
        }
      }
    }
    return getSaveAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdResponseAnimal> getFindByIdAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByIdAnimal",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdResponseAnimal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdResponseAnimal> getFindByIdAnimalMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal, via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdResponseAnimal> getFindByIdAnimalMethod;
    if ((getFindByIdAnimalMethod = AnimalGrpc.getFindByIdAnimalMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getFindByIdAnimalMethod = AnimalGrpc.getFindByIdAnimalMethod) == null) {
          AnimalGrpc.getFindByIdAnimalMethod = getFindByIdAnimalMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal, via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdResponseAnimal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByIdAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdResponseAnimal.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("findByIdAnimal"))
              .build();
        }
      }
    }
    return getFindByIdAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateAnimalRequest,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateAnimalResponse> getUpdateAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateAnimal",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateAnimalRequest.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateAnimalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateAnimalRequest,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateAnimalResponse> getUpdateAnimalMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateAnimalRequest, via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateAnimalResponse> getUpdateAnimalMethod;
    if ((getUpdateAnimalMethod = AnimalGrpc.getUpdateAnimalMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getUpdateAnimalMethod = AnimalGrpc.getUpdateAnimalMethod) == null) {
          AnimalGrpc.getUpdateAnimalMethod = getUpdateAnimalMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateAnimalRequest, via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateAnimalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateAnimalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateAnimalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("updateAnimal"))
              .build();
        }
      }
    }
    return getUpdateAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.DeleteByIdRequestAnimal,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal> getDeleteByIdAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteByIdAnimal",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.DeleteByIdRequestAnimal.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.DeleteByIdRequestAnimal,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal> getDeleteByIdAnimalMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.DeleteByIdRequestAnimal, via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal> getDeleteByIdAnimalMethod;
    if ((getDeleteByIdAnimalMethod = AnimalGrpc.getDeleteByIdAnimalMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getDeleteByIdAnimalMethod = AnimalGrpc.getDeleteByIdAnimalMethod) == null) {
          AnimalGrpc.getDeleteByIdAnimalMethod = getDeleteByIdAnimalMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.DeleteByIdRequestAnimal, via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteByIdAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.DeleteByIdRequestAnimal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("deleteByIdAnimal"))
              .build();
        }
      }
    }
    return getDeleteByIdAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals> getFindAllAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAllAnimal",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals> getFindAllAnimalMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal, via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals> getFindAllAnimalMethod;
    if ((getFindAllAnimalMethod = AnimalGrpc.getFindAllAnimalMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getFindAllAnimalMethod = AnimalGrpc.getFindAllAnimalMethod) == null) {
          AnimalGrpc.getFindAllAnimalMethod = getFindAllAnimalMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal, via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAllAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("findAllAnimal"))
              .build();
        }
      }
    }
    return getFindAllAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.FilterByDateRequestAnimal,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals> getFindByDateAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByDateAnimal",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.FilterByDateRequestAnimal.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.FilterByDateRequestAnimal,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals> getFindByDateAnimalMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.FilterByDateRequestAnimal, via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals> getFindByDateAnimalMethod;
    if ((getFindByDateAnimalMethod = AnimalGrpc.getFindByDateAnimalMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getFindByDateAnimalMethod = AnimalGrpc.getFindByDateAnimalMethod) == null) {
          AnimalGrpc.getFindByDateAnimalMethod = getFindByDateAnimalMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.FilterByDateRequestAnimal, via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByDateAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.FilterByDateRequestAnimal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("findByDateAnimal"))
              .build();
        }
      }
    }
    return getFindByDateAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.GetMaxIdResponseAnimal> getGetMaxIdAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMaxIdAnimal",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.GetMaxIdResponseAnimal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.GetMaxIdResponseAnimal> getGetMaxIdAnimalMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal, via.sdj3.animalregistrationsystem_sdj3.protobuf.GetMaxIdResponseAnimal> getGetMaxIdAnimalMethod;
    if ((getGetMaxIdAnimalMethod = AnimalGrpc.getGetMaxIdAnimalMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getGetMaxIdAnimalMethod = AnimalGrpc.getGetMaxIdAnimalMethod) == null) {
          AnimalGrpc.getGetMaxIdAnimalMethod = getGetMaxIdAnimalMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal, via.sdj3.animalregistrationsystem_sdj3.protobuf.GetMaxIdResponseAnimal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMaxIdAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.GetMaxIdResponseAnimal.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("getMaxIdAnimal"))
              .build();
        }
      }
    }
    return getGetMaxIdAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.GetFromOriginRequestAnimal,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals> getFindByOriginAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByOriginAnimal",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.GetFromOriginRequestAnimal.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.GetFromOriginRequestAnimal,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals> getFindByOriginAnimalMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.GetFromOriginRequestAnimal, via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals> getFindByOriginAnimalMethod;
    if ((getFindByOriginAnimalMethod = AnimalGrpc.getFindByOriginAnimalMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getFindByOriginAnimalMethod = AnimalGrpc.getFindByOriginAnimalMethod) == null) {
          AnimalGrpc.getFindByOriginAnimalMethod = getFindByOriginAnimalMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.GetFromOriginRequestAnimal, via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByOriginAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.GetFromOriginRequestAnimal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("findByOriginAnimal"))
              .build();
        }
      }
    }
    return getFindByOriginAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.Products> getFindAllProductsFromAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAllProductsFromAnimal",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.Products.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.Products> getFindAllProductsFromAnimalMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal, via.sdj3.animalregistrationsystem_sdj3.protobuf.Products> getFindAllProductsFromAnimalMethod;
    if ((getFindAllProductsFromAnimalMethod = AnimalGrpc.getFindAllProductsFromAnimalMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getFindAllProductsFromAnimalMethod = AnimalGrpc.getFindAllProductsFromAnimalMethod) == null) {
          AnimalGrpc.getFindAllProductsFromAnimalMethod = getFindAllProductsFromAnimalMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal, via.sdj3.animalregistrationsystem_sdj3.protobuf.Products>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAllProductsFromAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.Products.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("findAllProductsFromAnimal"))
              .build();
        }
      }
    }
    return getFindAllProductsFromAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals> getGetAnimalsInvolvedIntoProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnimalsInvolvedIntoProduct",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals> getGetAnimalsInvolvedIntoProductMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal, via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals> getGetAnimalsInvolvedIntoProductMethod;
    if ((getGetAnimalsInvolvedIntoProductMethod = AnimalGrpc.getGetAnimalsInvolvedIntoProductMethod) == null) {
      synchronized (AnimalGrpc.class) {
        if ((getGetAnimalsInvolvedIntoProductMethod = AnimalGrpc.getGetAnimalsInvolvedIntoProductMethod) == null) {
          AnimalGrpc.getGetAnimalsInvolvedIntoProductMethod = getGetAnimalsInvolvedIntoProductMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal, via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAnimalsInvolvedIntoProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalMethodDescriptorSupplier("getAnimalsInvolvedIntoProduct"))
              .build();
        }
      }
    }
    return getGetAnimalsInvolvedIntoProductMethod;
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
    public void saveAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalRequest request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveAnimalMethod(), responseObserver);
    }

    /**
     */
    public void findByIdAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdResponseAnimal> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByIdAnimalMethod(), responseObserver);
    }

    /**
     */
    public void updateAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateAnimalRequest request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateAnimalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAnimalMethod(), responseObserver);
    }

    /**
     */
    public void deleteByIdAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.DeleteByIdRequestAnimal request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteByIdAnimalMethod(), responseObserver);
    }

    /**
     */
    public void findAllAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllAnimalMethod(), responseObserver);
    }

    /**
     */
    public void findByDateAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.FilterByDateRequestAnimal request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByDateAnimalMethod(), responseObserver);
    }

    /**
     */
    public void getMaxIdAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.GetMaxIdResponseAnimal> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMaxIdAnimalMethod(), responseObserver);
    }

    /**
     */
    public void findByOriginAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.GetFromOriginRequestAnimal request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByOriginAnimalMethod(), responseObserver);
    }

    /**
     */
    public void findAllProductsFromAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.Products> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllProductsFromAnimalMethod(), responseObserver);
    }

    /**
     */
    public void getAnimalsInvolvedIntoProduct(via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalsInvolvedIntoProductMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalRequest,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalResponse>(
                  this, METHODID_SAVE_ANIMAL)))
          .addMethod(
            getFindByIdAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdResponseAnimal>(
                  this, METHODID_FIND_BY_ID_ANIMAL)))
          .addMethod(
            getUpdateAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateAnimalRequest,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateAnimalResponse>(
                  this, METHODID_UPDATE_ANIMAL)))
          .addMethod(
            getDeleteByIdAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.DeleteByIdRequestAnimal,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal>(
                  this, METHODID_DELETE_BY_ID_ANIMAL)))
          .addMethod(
            getFindAllAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals>(
                  this, METHODID_FIND_ALL_ANIMAL)))
          .addMethod(
            getFindByDateAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.FilterByDateRequestAnimal,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals>(
                  this, METHODID_FIND_BY_DATE_ANIMAL)))
          .addMethod(
            getGetMaxIdAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.GetMaxIdResponseAnimal>(
                  this, METHODID_GET_MAX_ID_ANIMAL)))
          .addMethod(
            getFindByOriginAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.GetFromOriginRequestAnimal,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals>(
                  this, METHODID_FIND_BY_ORIGIN_ANIMAL)))
          .addMethod(
            getFindAllProductsFromAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.Products>(
                  this, METHODID_FIND_ALL_PRODUCTS_FROM_ANIMAL)))
          .addMethod(
            getGetAnimalsInvolvedIntoProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals>(
                  this, METHODID_GET_ANIMALS_INVOLVED_INTO_PRODUCT)))
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
    public void saveAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalRequest request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByIdAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdResponseAnimal> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByIdAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateAnimalRequest request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateAnimalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteByIdAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.DeleteByIdRequestAnimal request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteByIdAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAllAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAllAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByDateAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.FilterByDateRequestAnimal request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByDateAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMaxIdAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.GetMaxIdResponseAnimal> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMaxIdAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByOriginAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.GetFromOriginRequestAnimal request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByOriginAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAllProductsFromAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.Products> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAllProductsFromAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimalsInvolvedIntoProduct(via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalsInvolvedIntoProductMethod(), getCallOptions()), request, responseObserver);
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
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalResponse saveAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdResponseAnimal findByIdAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByIdAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateAnimalResponse updateAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateAnimalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal deleteByIdAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.DeleteByIdRequestAnimal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteByIdAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals findAllAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAllAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals findByDateAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.FilterByDateRequestAnimal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByDateAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.GetMaxIdResponseAnimal getMaxIdAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMaxIdAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals findByOriginAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.GetFromOriginRequestAnimal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByOriginAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.Products findAllProductsFromAnimal(via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAllProductsFromAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals getAnimalsInvolvedIntoProduct(via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalsInvolvedIntoProductMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalResponse> saveAnimal(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdResponseAnimal> findByIdAnimal(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByIdAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateAnimalResponse> updateAnimal(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateAnimalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal> deleteByIdAnimal(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.DeleteByIdRequestAnimal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteByIdAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals> findAllAnimal(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAllAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals> findByDateAnimal(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.FilterByDateRequestAnimal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByDateAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.GetMaxIdResponseAnimal> getMaxIdAnimal(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMaxIdAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals> findByOriginAnimal(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.GetFromOriginRequestAnimal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByOriginAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.Products> findAllProductsFromAnimal(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAllProductsFromAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals> getAnimalsInvolvedIntoProduct(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalsInvolvedIntoProductMethod(), getCallOptions()), request);
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
  private static final int METHODID_GET_ANIMALS_INVOLVED_INTO_PRODUCT = 9;

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
          serviceImpl.saveAnimal((via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalRequest) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalResponse>) responseObserver);
          break;
        case METHODID_FIND_BY_ID_ANIMAL:
          serviceImpl.findByIdAnimal((via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdResponseAnimal>) responseObserver);
          break;
        case METHODID_UPDATE_ANIMAL:
          serviceImpl.updateAnimal((via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateAnimalRequest) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateAnimalResponse>) responseObserver);
          break;
        case METHODID_DELETE_BY_ID_ANIMAL:
          serviceImpl.deleteByIdAnimal((via.sdj3.animalregistrationsystem_sdj3.protobuf.DeleteByIdRequestAnimal) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal>) responseObserver);
          break;
        case METHODID_FIND_ALL_ANIMAL:
          serviceImpl.findAllAnimal((via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals>) responseObserver);
          break;
        case METHODID_FIND_BY_DATE_ANIMAL:
          serviceImpl.findByDateAnimal((via.sdj3.animalregistrationsystem_sdj3.protobuf.FilterByDateRequestAnimal) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals>) responseObserver);
          break;
        case METHODID_GET_MAX_ID_ANIMAL:
          serviceImpl.getMaxIdAnimal((via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyAnimal) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.GetMaxIdResponseAnimal>) responseObserver);
          break;
        case METHODID_FIND_BY_ORIGIN_ANIMAL:
          serviceImpl.findByOriginAnimal((via.sdj3.animalregistrationsystem_sdj3.protobuf.GetFromOriginRequestAnimal) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals>) responseObserver);
          break;
        case METHODID_FIND_ALL_PRODUCTS_FROM_ANIMAL:
          serviceImpl.findAllProductsFromAnimal((via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.Products>) responseObserver);
          break;
        case METHODID_GET_ANIMALS_INVOLVED_INTO_PRODUCT:
          serviceImpl.getAnimalsInvolvedIntoProduct((via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.AllAnimals>) responseObserver);
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
      return via.sdj3.animalregistrationsystem_sdj3.protobuf.AnimalOuterClass.getDescriptor();
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
              .addMethod(getGetAnimalsInvolvedIntoProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
