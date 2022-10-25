package com.example.datapersistance.service;

import com.example.datapersistance.protobuf.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class ProductImpl extends ProductGrpc.ProductImplBase {
    @Override
    public void saveProduct(SaveRequestProduct request, StreamObserver<SaveResponseProduct> responseObserver) {
        super.saveProduct(request, responseObserver);
    }

    @Override
    public void findByRegNoProduct(FindByRegNoRequestProduct request, StreamObserver<FindByRegNoResponseProduct> responseObserver) {
        super.findByRegNoProduct(request, responseObserver);
    }

    @Override
    public void updateProduct(UpdateRequestProduct request, StreamObserver<UpdateResponseProduct> responseObserver) {
        super.updateProduct(request, responseObserver);
    }

    @Override
    public void deleteByRegNoProduct(RequestDeleteByRegNoProduct request, StreamObserver<EmptyProduct> responseObserver) {
        super.deleteByRegNoProduct(request, responseObserver);
    }

    @Override
    public void findAllProduct(EmptyProduct request, StreamObserver<ResponseFindAllProduct> responseObserver) {
        super.findAllProduct(request, responseObserver);
    }

    @Override
    public void getMaxIdProduct(EmptyProduct request, StreamObserver<ResponseGetMaxIdProduct> responseObserver) {
        super.getMaxIdProduct(request, responseObserver);
    }
}
