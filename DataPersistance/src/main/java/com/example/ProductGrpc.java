package com.example;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Product.proto")
public final class ProductGrpc {

  private ProductGrpc() {}

  public static final String SERVICE_NAME = "product.Product";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.SaveRequest,
      com.example.SaveResponse> getSaveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "save",
      requestType = com.example.SaveRequest.class,
      responseType = com.example.SaveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.SaveRequest,
      com.example.SaveResponse> getSaveMethod() {
    io.grpc.MethodDescriptor<com.example.SaveRequest, com.example.SaveResponse> getSaveMethod;
    if ((getSaveMethod = ProductGrpc.getSaveMethod) == null) {
      synchronized (ProductGrpc.class) {
        if ((getSaveMethod = ProductGrpc.getSaveMethod) == null) {
          ProductGrpc.getSaveMethod = getSaveMethod =
              io.grpc.MethodDescriptor.<com.example.SaveRequest, com.example.SaveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "save"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.SaveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.SaveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductMethodDescriptorSupplier("save"))
              .build();
        }
      }
    }
    return getSaveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.FindByRegNoRequest,
      com.example.FindByRegNoResponse> getFindByRegNoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByRegNo",
      requestType = com.example.FindByRegNoRequest.class,
      responseType = com.example.FindByRegNoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.FindByRegNoRequest,
      com.example.FindByRegNoResponse> getFindByRegNoMethod() {
    io.grpc.MethodDescriptor<com.example.FindByRegNoRequest, com.example.FindByRegNoResponse> getFindByRegNoMethod;
    if ((getFindByRegNoMethod = ProductGrpc.getFindByRegNoMethod) == null) {
      synchronized (ProductGrpc.class) {
        if ((getFindByRegNoMethod = ProductGrpc.getFindByRegNoMethod) == null) {
          ProductGrpc.getFindByRegNoMethod = getFindByRegNoMethod =
              io.grpc.MethodDescriptor.<com.example.FindByRegNoRequest, com.example.FindByRegNoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByRegNo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.FindByRegNoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.FindByRegNoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductMethodDescriptorSupplier("findByRegNo"))
              .build();
        }
      }
    }
    return getFindByRegNoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.UpdateRequest,
      com.example.UpdateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "update",
      requestType = com.example.UpdateRequest.class,
      responseType = com.example.UpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.UpdateRequest,
      com.example.UpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.example.UpdateRequest, com.example.UpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = ProductGrpc.getUpdateMethod) == null) {
      synchronized (ProductGrpc.class) {
        if ((getUpdateMethod = ProductGrpc.getUpdateMethod) == null) {
          ProductGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.example.UpdateRequest, com.example.UpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.UpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.UpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductMethodDescriptorSupplier("update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.RequestDeleteByRegNo,
      com.example.Empty> getDeleteByRegNoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteByRegNo",
      requestType = com.example.RequestDeleteByRegNo.class,
      responseType = com.example.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.RequestDeleteByRegNo,
      com.example.Empty> getDeleteByRegNoMethod() {
    io.grpc.MethodDescriptor<com.example.RequestDeleteByRegNo, com.example.Empty> getDeleteByRegNoMethod;
    if ((getDeleteByRegNoMethod = ProductGrpc.getDeleteByRegNoMethod) == null) {
      synchronized (ProductGrpc.class) {
        if ((getDeleteByRegNoMethod = ProductGrpc.getDeleteByRegNoMethod) == null) {
          ProductGrpc.getDeleteByRegNoMethod = getDeleteByRegNoMethod =
              io.grpc.MethodDescriptor.<com.example.RequestDeleteByRegNo, com.example.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteByRegNo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.RequestDeleteByRegNo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ProductMethodDescriptorSupplier("deleteByRegNo"))
              .build();
        }
      }
    }
    return getDeleteByRegNoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.Empty,
      com.example.ResponseFindAll> getFindAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAll",
      requestType = com.example.Empty.class,
      responseType = com.example.ResponseFindAll.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.Empty,
      com.example.ResponseFindAll> getFindAllMethod() {
    io.grpc.MethodDescriptor<com.example.Empty, com.example.ResponseFindAll> getFindAllMethod;
    if ((getFindAllMethod = ProductGrpc.getFindAllMethod) == null) {
      synchronized (ProductGrpc.class) {
        if ((getFindAllMethod = ProductGrpc.getFindAllMethod) == null) {
          ProductGrpc.getFindAllMethod = getFindAllMethod =
              io.grpc.MethodDescriptor.<com.example.Empty, com.example.ResponseFindAll>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.ResponseFindAll.getDefaultInstance()))
              .setSchemaDescriptor(new ProductMethodDescriptorSupplier("findAll"))
              .build();
        }
      }
    }
    return getFindAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.Empty,
      com.example.ResponseGetMaxId> getGetMaxIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMaxId",
      requestType = com.example.Empty.class,
      responseType = com.example.ResponseGetMaxId.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.Empty,
      com.example.ResponseGetMaxId> getGetMaxIdMethod() {
    io.grpc.MethodDescriptor<com.example.Empty, com.example.ResponseGetMaxId> getGetMaxIdMethod;
    if ((getGetMaxIdMethod = ProductGrpc.getGetMaxIdMethod) == null) {
      synchronized (ProductGrpc.class) {
        if ((getGetMaxIdMethod = ProductGrpc.getGetMaxIdMethod) == null) {
          ProductGrpc.getGetMaxIdMethod = getGetMaxIdMethod =
              io.grpc.MethodDescriptor.<com.example.Empty, com.example.ResponseGetMaxId>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMaxId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.ResponseGetMaxId.getDefaultInstance()))
              .setSchemaDescriptor(new ProductMethodDescriptorSupplier("getMaxId"))
              .build();
        }
      }
    }
    return getGetMaxIdMethod;
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
    public void save(com.example.SaveRequest request,
        io.grpc.stub.StreamObserver<com.example.SaveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveMethod(), responseObserver);
    }

    /**
     */
    public void findByRegNo(com.example.FindByRegNoRequest request,
        io.grpc.stub.StreamObserver<com.example.FindByRegNoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByRegNoMethod(), responseObserver);
    }

    /**
     */
    public void update(com.example.UpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.UpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void deleteByRegNo(com.example.RequestDeleteByRegNo request,
        io.grpc.stub.StreamObserver<com.example.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteByRegNoMethod(), responseObserver);
    }

    /**
     */
    public void findAll(com.example.Empty request,
        io.grpc.stub.StreamObserver<com.example.ResponseFindAll> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllMethod(), responseObserver);
    }

    /**
     */
    public void getMaxId(com.example.Empty request,
        io.grpc.stub.StreamObserver<com.example.ResponseGetMaxId> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMaxIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.SaveRequest,
                com.example.SaveResponse>(
                  this, METHODID_SAVE)))
          .addMethod(
            getFindByRegNoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.FindByRegNoRequest,
                com.example.FindByRegNoResponse>(
                  this, METHODID_FIND_BY_REG_NO)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.UpdateRequest,
                com.example.UpdateResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteByRegNoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.RequestDeleteByRegNo,
                com.example.Empty>(
                  this, METHODID_DELETE_BY_REG_NO)))
          .addMethod(
            getFindAllMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.Empty,
                com.example.ResponseFindAll>(
                  this, METHODID_FIND_ALL)))
          .addMethod(
            getGetMaxIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.Empty,
                com.example.ResponseGetMaxId>(
                  this, METHODID_GET_MAX_ID)))
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
    public void save(com.example.SaveRequest request,
        io.grpc.stub.StreamObserver<com.example.SaveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByRegNo(com.example.FindByRegNoRequest request,
        io.grpc.stub.StreamObserver<com.example.FindByRegNoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByRegNoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.example.UpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.UpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteByRegNo(com.example.RequestDeleteByRegNo request,
        io.grpc.stub.StreamObserver<com.example.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteByRegNoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAll(com.example.Empty request,
        io.grpc.stub.StreamObserver<com.example.ResponseFindAll> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMaxId(com.example.Empty request,
        io.grpc.stub.StreamObserver<com.example.ResponseGetMaxId> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMaxIdMethod(), getCallOptions()), request, responseObserver);
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
    public com.example.SaveResponse save(com.example.SaveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.FindByRegNoResponse findByRegNo(com.example.FindByRegNoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByRegNoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.UpdateResponse update(com.example.UpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.Empty deleteByRegNo(com.example.RequestDeleteByRegNo request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteByRegNoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.ResponseFindAll findAll(com.example.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.ResponseGetMaxId getMaxId(com.example.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMaxIdMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.example.SaveResponse> save(
        com.example.SaveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.FindByRegNoResponse> findByRegNo(
        com.example.FindByRegNoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByRegNoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.UpdateResponse> update(
        com.example.UpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.Empty> deleteByRegNo(
        com.example.RequestDeleteByRegNo request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteByRegNoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.ResponseFindAll> findAll(
        com.example.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.ResponseGetMaxId> getMaxId(
        com.example.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMaxIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE = 0;
  private static final int METHODID_FIND_BY_REG_NO = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_DELETE_BY_REG_NO = 3;
  private static final int METHODID_FIND_ALL = 4;
  private static final int METHODID_GET_MAX_ID = 5;

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
        case METHODID_SAVE:
          serviceImpl.save((com.example.SaveRequest) request,
              (io.grpc.stub.StreamObserver<com.example.SaveResponse>) responseObserver);
          break;
        case METHODID_FIND_BY_REG_NO:
          serviceImpl.findByRegNo((com.example.FindByRegNoRequest) request,
              (io.grpc.stub.StreamObserver<com.example.FindByRegNoResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.example.UpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.example.UpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE_BY_REG_NO:
          serviceImpl.deleteByRegNo((com.example.RequestDeleteByRegNo) request,
              (io.grpc.stub.StreamObserver<com.example.Empty>) responseObserver);
          break;
        case METHODID_FIND_ALL:
          serviceImpl.findAll((com.example.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.ResponseFindAll>) responseObserver);
          break;
        case METHODID_GET_MAX_ID:
          serviceImpl.getMaxId((com.example.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.ResponseGetMaxId>) responseObserver);
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
      return com.example.ProductOuterClass.getDescriptor();
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
              .addMethod(getSaveMethod())
              .addMethod(getFindByRegNoMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteByRegNoMethod())
              .addMethod(getFindAllMethod())
              .addMethod(getGetMaxIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
