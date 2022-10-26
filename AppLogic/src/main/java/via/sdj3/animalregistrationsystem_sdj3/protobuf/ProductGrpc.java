package via.sdj3.animalregistrationsystem_sdj3.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Product.proto")
public final class ProductGrpc {

  private ProductGrpc() {}

  public static final String SERVICE_NAME = "Product";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveRequestProduct,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveResponseProduct> getSaveProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveProduct",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveRequestProduct.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveResponseProduct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveRequestProduct,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveResponseProduct> getSaveProductMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveRequestProduct, via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveResponseProduct> getSaveProductMethod;
    if ((getSaveProductMethod = ProductGrpc.getSaveProductMethod) == null) {
      synchronized (ProductGrpc.class) {
        if ((getSaveProductMethod = ProductGrpc.getSaveProductMethod) == null) {
          ProductGrpc.getSaveProductMethod = getSaveProductMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveRequestProduct, via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveResponseProduct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveRequestProduct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveResponseProduct.getDefaultInstance()))
              .setSchemaDescriptor(new ProductMethodDescriptorSupplier("saveProduct"))
              .build();
        }
      }
    }
    return getSaveProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByRegNoRequestProduct,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByRegNoResponseProduct> getFindByRegNoProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByRegNoProduct",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByRegNoRequestProduct.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByRegNoResponseProduct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByRegNoRequestProduct,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByRegNoResponseProduct> getFindByRegNoProductMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByRegNoRequestProduct, via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByRegNoResponseProduct> getFindByRegNoProductMethod;
    if ((getFindByRegNoProductMethod = ProductGrpc.getFindByRegNoProductMethod) == null) {
      synchronized (ProductGrpc.class) {
        if ((getFindByRegNoProductMethod = ProductGrpc.getFindByRegNoProductMethod) == null) {
          ProductGrpc.getFindByRegNoProductMethod = getFindByRegNoProductMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByRegNoRequestProduct, via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByRegNoResponseProduct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByRegNoProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByRegNoRequestProduct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByRegNoResponseProduct.getDefaultInstance()))
              .setSchemaDescriptor(new ProductMethodDescriptorSupplier("findByRegNoProduct"))
              .build();
        }
      }
    }
    return getFindByRegNoProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateRequestProduct,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateResponseProduct> getUpdateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateProduct",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateRequestProduct.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateResponseProduct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateRequestProduct,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateResponseProduct> getUpdateProductMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateRequestProduct, via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateResponseProduct> getUpdateProductMethod;
    if ((getUpdateProductMethod = ProductGrpc.getUpdateProductMethod) == null) {
      synchronized (ProductGrpc.class) {
        if ((getUpdateProductMethod = ProductGrpc.getUpdateProductMethod) == null) {
          ProductGrpc.getUpdateProductMethod = getUpdateProductMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateRequestProduct, via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateResponseProduct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateRequestProduct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateResponseProduct.getDefaultInstance()))
              .setSchemaDescriptor(new ProductMethodDescriptorSupplier("updateProduct"))
              .build();
        }
      }
    }
    return getUpdateProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.RequestDeleteByRegNoProduct,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct> getDeleteByRegNoProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteByRegNoProduct",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.RequestDeleteByRegNoProduct.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.RequestDeleteByRegNoProduct,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct> getDeleteByRegNoProductMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.RequestDeleteByRegNoProduct, via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct> getDeleteByRegNoProductMethod;
    if ((getDeleteByRegNoProductMethod = ProductGrpc.getDeleteByRegNoProductMethod) == null) {
      synchronized (ProductGrpc.class) {
        if ((getDeleteByRegNoProductMethod = ProductGrpc.getDeleteByRegNoProductMethod) == null) {
          ProductGrpc.getDeleteByRegNoProductMethod = getDeleteByRegNoProductMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.RequestDeleteByRegNoProduct, via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteByRegNoProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.RequestDeleteByRegNoProduct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct.getDefaultInstance()))
              .setSchemaDescriptor(new ProductMethodDescriptorSupplier("deleteByRegNoProduct"))
              .build();
        }
      }
    }
    return getDeleteByRegNoProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.ResponseFindAllProduct> getFindAllProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAllProduct",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.ResponseFindAllProduct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.ResponseFindAllProduct> getFindAllProductMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct, via.sdj3.animalregistrationsystem_sdj3.protobuf.ResponseFindAllProduct> getFindAllProductMethod;
    if ((getFindAllProductMethod = ProductGrpc.getFindAllProductMethod) == null) {
      synchronized (ProductGrpc.class) {
        if ((getFindAllProductMethod = ProductGrpc.getFindAllProductMethod) == null) {
          ProductGrpc.getFindAllProductMethod = getFindAllProductMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct, via.sdj3.animalregistrationsystem_sdj3.protobuf.ResponseFindAllProduct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAllProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.ResponseFindAllProduct.getDefaultInstance()))
              .setSchemaDescriptor(new ProductMethodDescriptorSupplier("findAllProduct"))
              .build();
        }
      }
    }
    return getFindAllProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.ResponseGetMaxIdProduct> getGetMaxIdProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMaxIdProduct",
      requestType = via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct.class,
      responseType = via.sdj3.animalregistrationsystem_sdj3.protobuf.ResponseGetMaxIdProduct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct,
      via.sdj3.animalregistrationsystem_sdj3.protobuf.ResponseGetMaxIdProduct> getGetMaxIdProductMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct, via.sdj3.animalregistrationsystem_sdj3.protobuf.ResponseGetMaxIdProduct> getGetMaxIdProductMethod;
    if ((getGetMaxIdProductMethod = ProductGrpc.getGetMaxIdProductMethod) == null) {
      synchronized (ProductGrpc.class) {
        if ((getGetMaxIdProductMethod = ProductGrpc.getGetMaxIdProductMethod) == null) {
          ProductGrpc.getGetMaxIdProductMethod = getGetMaxIdProductMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct, via.sdj3.animalregistrationsystem_sdj3.protobuf.ResponseGetMaxIdProduct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMaxIdProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationsystem_sdj3.protobuf.ResponseGetMaxIdProduct.getDefaultInstance()))
              .setSchemaDescriptor(new ProductMethodDescriptorSupplier("getMaxIdProduct"))
              .build();
        }
      }
    }
    return getGetMaxIdProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductStub>() {
        @java.lang.Override
        public ProductStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductStub(channel, callOptions);
        }
      };
    return ProductStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductBlockingStub>() {
        @java.lang.Override
        public ProductBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductBlockingStub(channel, callOptions);
        }
      };
    return ProductBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductFutureStub>() {
        @java.lang.Override
        public ProductFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductFutureStub(channel, callOptions);
        }
      };
    return ProductFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProductImplBase implements io.grpc.BindableService {

    /**
     */
    public void saveProduct(via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveRequestProduct request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveResponseProduct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveProductMethod(), responseObserver);
    }

    /**
     */
    public void findByRegNoProduct(via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByRegNoRequestProduct request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByRegNoResponseProduct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByRegNoProductMethod(), responseObserver);
    }

    /**
     */
    public void updateProduct(via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateRequestProduct request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateResponseProduct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProductMethod(), responseObserver);
    }

    /**
     */
    public void deleteByRegNoProduct(via.sdj3.animalregistrationsystem_sdj3.protobuf.RequestDeleteByRegNoProduct request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteByRegNoProductMethod(), responseObserver);
    }

    /**
     */
    public void findAllProduct(via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.ResponseFindAllProduct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllProductMethod(), responseObserver);
    }

    /**
     */
    public void getMaxIdProduct(via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.ResponseGetMaxIdProduct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMaxIdProductMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveRequestProduct,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveResponseProduct>(
                  this, METHODID_SAVE_PRODUCT)))
          .addMethod(
            getFindByRegNoProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByRegNoRequestProduct,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByRegNoResponseProduct>(
                  this, METHODID_FIND_BY_REG_NO_PRODUCT)))
          .addMethod(
            getUpdateProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateRequestProduct,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateResponseProduct>(
                  this, METHODID_UPDATE_PRODUCT)))
          .addMethod(
            getDeleteByRegNoProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.RequestDeleteByRegNoProduct,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct>(
                  this, METHODID_DELETE_BY_REG_NO_PRODUCT)))
          .addMethod(
            getFindAllProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.ResponseFindAllProduct>(
                  this, METHODID_FIND_ALL_PRODUCT)))
          .addMethod(
            getGetMaxIdProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct,
                via.sdj3.animalregistrationsystem_sdj3.protobuf.ResponseGetMaxIdProduct>(
                  this, METHODID_GET_MAX_ID_PRODUCT)))
          .build();
    }
  }

  /**
   */
  public static final class ProductStub extends io.grpc.stub.AbstractAsyncStub<ProductStub> {
    private ProductStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductStub(channel, callOptions);
    }

    /**
     */
    public void saveProduct(via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveRequestProduct request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveResponseProduct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByRegNoProduct(via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByRegNoRequestProduct request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByRegNoResponseProduct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByRegNoProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProduct(via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateRequestProduct request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateResponseProduct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteByRegNoProduct(via.sdj3.animalregistrationsystem_sdj3.protobuf.RequestDeleteByRegNoProduct request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteByRegNoProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAllProduct(via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.ResponseFindAllProduct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAllProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMaxIdProduct(via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.ResponseGetMaxIdProduct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMaxIdProductMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProductBlockingStub> {
    private ProductBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveResponseProduct saveProduct(via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveRequestProduct request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByRegNoResponseProduct findByRegNoProduct(via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByRegNoRequestProduct request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByRegNoProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateResponseProduct updateProduct(via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateRequestProduct request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct deleteByRegNoProduct(via.sdj3.animalregistrationsystem_sdj3.protobuf.RequestDeleteByRegNoProduct request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteByRegNoProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.ResponseFindAllProduct findAllProduct(via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAllProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationsystem_sdj3.protobuf.ResponseGetMaxIdProduct getMaxIdProduct(via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMaxIdProductMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductFutureStub extends io.grpc.stub.AbstractFutureStub<ProductFutureStub> {
    private ProductFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveResponseProduct> saveProduct(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveRequestProduct request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByRegNoResponseProduct> findByRegNoProduct(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByRegNoRequestProduct request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByRegNoProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateResponseProduct> updateProduct(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateRequestProduct request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct> deleteByRegNoProduct(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.RequestDeleteByRegNoProduct request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteByRegNoProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.ResponseFindAllProduct> findAllProduct(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAllProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationsystem_sdj3.protobuf.ResponseGetMaxIdProduct> getMaxIdProduct(
        via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMaxIdProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_PRODUCT = 0;
  private static final int METHODID_FIND_BY_REG_NO_PRODUCT = 1;
  private static final int METHODID_UPDATE_PRODUCT = 2;
  private static final int METHODID_DELETE_BY_REG_NO_PRODUCT = 3;
  private static final int METHODID_FIND_ALL_PRODUCT = 4;
  private static final int METHODID_GET_MAX_ID_PRODUCT = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_PRODUCT:
          serviceImpl.saveProduct((via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveRequestProduct) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveResponseProduct>) responseObserver);
          break;
        case METHODID_FIND_BY_REG_NO_PRODUCT:
          serviceImpl.findByRegNoProduct((via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByRegNoRequestProduct) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByRegNoResponseProduct>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCT:
          serviceImpl.updateProduct((via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateRequestProduct) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.UpdateResponseProduct>) responseObserver);
          break;
        case METHODID_DELETE_BY_REG_NO_PRODUCT:
          serviceImpl.deleteByRegNoProduct((via.sdj3.animalregistrationsystem_sdj3.protobuf.RequestDeleteByRegNoProduct) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct>) responseObserver);
          break;
        case METHODID_FIND_ALL_PRODUCT:
          serviceImpl.findAllProduct((via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.ResponseFindAllProduct>) responseObserver);
          break;
        case METHODID_GET_MAX_ID_PRODUCT:
          serviceImpl.getMaxIdProduct((via.sdj3.animalregistrationsystem_sdj3.protobuf.EmptyProduct) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationsystem_sdj3.protobuf.ResponseGetMaxIdProduct>) responseObserver);
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

  private static abstract class ProductBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sdj3.animalregistrationsystem_sdj3.protobuf.ProductOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Product");
    }
  }

  private static final class ProductFileDescriptorSupplier
      extends ProductBaseDescriptorSupplier {
    ProductFileDescriptorSupplier() {}
  }

  private static final class ProductMethodDescriptorSupplier
      extends ProductBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProductGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductFileDescriptorSupplier())
              .addMethod(getSaveProductMethod())
              .addMethod(getFindByRegNoProductMethod())
              .addMethod(getUpdateProductMethod())
              .addMethod(getDeleteByRegNoProductMethod())
              .addMethod(getFindAllProductMethod())
              .addMethod(getGetMaxIdProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
