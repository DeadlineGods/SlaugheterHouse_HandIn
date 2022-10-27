package com.example.datapersistance.service;

import com.example.datapersistance.dao.ProductPersistence;
import com.example.datapersistance.protobuf.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Qualifier;

import java.sql.SQLException;

@GRpcService
public class ProductImpl extends ProductGrpc.ProductImplBase {

    private final ProductPersistence database;

    public ProductImpl(@Qualifier("productDatabase") ProductPersistence database) {
        this.database = database;
    }

    @Override
    public void saveProduct(SaveRequestProduct request, StreamObserver<SaveResponseProduct> responseObserver) {
        System.out.println("Received Request =>\n" + request.toString());

        try {
            database.saveProduct(request.getTrayId(), request.getPartNo());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        SaveResponseProduct response = SaveResponseProduct.newBuilder().setRegistrationNo(request.getRegistrationNo())
                .setRegistrationNo(request.getRegistrationNo())
                .setTrayId(request.getTrayId())
                .setPartNo(request.getPartNo()).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

        System.out.println("Saved =>\n" + request.toString());

    }

    @Override
    public void findByRegNoProduct(FindByRegNoRequestProduct request, StreamObserver<FindByRegNoResponseProduct> responseObserver) {
        System.out.println("Received Request =>\n" + request.toString());

        try {
            FindByRegNoResponseProduct response = database.findByRegNo(request.getRegistrationNo());

            responseObserver.onNext(response);
            responseObserver.onCompleted();

            if (response != null){
                System.out.println("Found =>\n" + response.toString());
            } else {
                System.out.println("Not item with registration no => " + request.getRegistrationNo());
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }    }

    @Override
    public void updateProduct(UpdateRequestProduct request, StreamObserver<UpdateResponseProduct> responseObserver) {
        System.out.println("Received Request =>\n" + request.toString());

        try {
            FindByRegNoResponseProduct findResponse = this.database.findByRegNo(request.getRegistrationNo());
            if (findResponse == null) {
                System.out.println("No product with id => " + request.getRegistrationNo());
                responseObserver.onNext((UpdateResponseProduct) null);
                responseObserver.onCompleted();
                return;
            }

            System.out.println("Updated =>\n" + request.toString());
            this.database.updateProduct(request.getRegistrationNo(), request.getTrayId(), request.getPartNo());
        } catch (SQLException var4) {
            throw new RuntimeException(var4);
        }

        UpdateResponseProduct response = UpdateResponseProduct.newBuilder().setRegistrationNo(request.getRegistrationNo()).setTrayId(request.getTrayId()).setPartNo(request.getPartNo()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void deleteByRegNoProduct(RequestDeleteByRegNoProduct request, StreamObserver<EmptyProduct> responseObserver) {
        System.out.println("Received Request =>\n" + request.toString());

        try {
            this.database.deleteByRegNoProduct(request.getPartNo());
        } catch (SQLException var4) {
            throw new RuntimeException(var4);
        }
        EmptyProduct response = EmptyProduct.newBuilder().build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        System.out.println("Deleted =>\n" + request.toString());
    }

    @Override
    public void findAllProduct(EmptyProduct request, StreamObserver<ResponseFindAllProduct> responseObserver) {
        System.out.println("Received Request =>\n" + request.toString());
        try
        {
            ResponseFindAllProduct response = database.findAllProduct();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            if (response != null){
                System.out.println("Found =>\n" + response.toString());
            } else {
                System.out.println("No products found");
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void getMaxIdProduct(EmptyProduct request, StreamObserver<ResponseGetMaxIdProduct> responseObserver)
    {
        System.out.println("Received Request =>\n" + request.toString());

        try
        {
            ResponseGetMaxIdProduct response = database.getMAxIdProduct();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            if(response != null)
            {
                System.out.println("Found =>\n" + response.toString());
            }
            else
            {
                System.out.println("No item");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
