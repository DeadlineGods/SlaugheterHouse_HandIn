package com.example.datapersistance.service;

import com.example.datapersistance.dao.PartPersistence;
import com.example.datapersistance.protobuf.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Qualifier;

import java.sql.SQLException;

@GRpcService
public class PartImpl extends PartGrpc.PartImplBase {

    private final PartPersistence database;

    public PartImpl(@Qualifier("partDatabase") PartPersistence database)
    {
        this.database = database;
    }
    @Override
    public void savePart(SavePartRequest request, StreamObserver<SavePartResponse> responseObserver) {
        System.out.println("Received Request =>\n" + request.toString());

        try {
            database.save(request.getWeight(), request.getName(), request.getAnimalNo());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        SavePartResponse response = SavePartResponse.newBuilder()
                .setAnimalNo(request.getAnimalNo())
                .setWeight(request.getWeight())
                .setName(request.getName())
                .setPartno(request.getPartno())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

        System.out.println("Saved =>\n" + request.toString());

    }

    @Override
    public void findByIdPart(FIndByIdRequestPart request, StreamObserver<FindByIdResponsePart> responseObserver) {
        System.out.println("Received Request =>\n" + request.toString());

        try {
            FindByIdResponsePart response = database.findByIdPart((int)request.getId());
            responseObserver.onNext(response);
            responseObserver.onCompleted();

            if (response != null){
                System.out.println("Found =>\n" + response.toString());
            } else {
                System.out.println("Not item with id => " + request.getId());
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updatePart(UpdatePartRequest request, StreamObserver<UpdatePartResponse> responseObserver) {
        System.out.println("Received Request =>\n" + request.toString());

        try {

            FindByIdResponsePart findResponse = database.findByIdPart((int)request.getPartno());

            if(findResponse == null) {
                System.out.println("No part with id => " + request.getPartno());

                responseObserver.onNext(null);
                responseObserver.onCompleted();
                return;
            } else {
                System.out.println("Updated =>\n" + request.toString());
            }

            database.update((int)request.getPartno(), request.getWeight(), request.getName(), request.getAnimalNo());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        UpdatePartResponse response = UpdatePartResponse.newBuilder()
                .setAnimalNo(request.getAnimalNo())
                .setWeight(request.getWeight())
                .setName(request.getName())
                .setPartno(request.getPartno())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteByIdPart(DeleteByIdRequestPart request, StreamObserver<EmptyPart> responseObserver) {
        System.out.println("Received Request =>\n" + request.toString());

        try {
            database.delete((int)request.getId());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        EmptyPart response = EmptyPart.newBuilder().build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

        System.out.println("Deleted =>\n" + request.toString());   }

    @Override
    public void findAllPart(EmptyPart request, StreamObserver<AllParts> responseObserver) {
        System.out.println("Received Request =>\n" + request.toString());
        try
        {
            AllParts response = database.findAllParts();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            if (response != null){
                System.out.println("Found =>\n" + response.toString());
            } else {
                System.out.println("No parts found");
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }    }
}
