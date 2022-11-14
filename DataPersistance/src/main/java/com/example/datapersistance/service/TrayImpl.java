package com.example.datapersistance.service;

import com.example.datapersistance.dao.TrayPersistence;
import com.example.datapersistance.protobuf.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Qualifier;

import java.sql.SQLException;

@GRpcService
public class TrayImpl extends TrayGrpc.TrayImplBase {

    private final TrayPersistence database;

    public TrayImpl(@Qualifier("trayDatabase") TrayPersistence database) {
        this.database = database;
    }

    @Override
    public void traySave(TraySaveRequest request, StreamObserver<TraySaveResponse> responseObserver) {
        System.out.println("Received Request =>\n" + request.toString());

        try {
            database.save(request.getTray().getTrayId(), request.getTray().getMaxWeightCapacity());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        TrayData data = TrayData
                .newBuilder()
                .setTrayId(request
                        .getTray()
                        .getTrayId())
                .setMaxWeightCapacity(request
                        .getTray()
                        .getMaxWeightCapacity())
                .build();
        TraySaveResponse response = TraySaveResponse.newBuilder()
                .setTray(data)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

        System.out.println("Saved =>\n" + request.toString());
    }

    @Override
    public void trayFindById(TrayFindByIdRequest request, StreamObserver<TrayFindByIdResponse> responseObserver) {
        System.out.println("Received Request =>\n" + request.toString());
        try {
            TrayFindByIdResponse response = database.findById(request.getId());
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
    public void trayUpdate(TrayUpdateRequest request, StreamObserver<TrayUpdateResponse> responseObserver) {
        System.out.println("Received Request =>\n" + request.toString());

        try {

            TrayFindByIdResponse findResponse = database.findById(request.getTray().getTrayId());

            if(findResponse == null) {
                System.out.println("No tray with id => " + request.getTray().getTrayId());

                responseObserver.onNext(null);
                responseObserver.onCompleted();
                return;
            } else {
                System.out.println("Updated =>\n" + request.toString());
            }

            database.update(request.getTray().getTrayId(), request.getTray().getMaxWeightCapacity());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        TrayData trayData = TrayData.newBuilder()
                .setTrayId(request.getTray().getTrayId())
                .setMaxWeightCapacity(request.getTray().getMaxWeightCapacity())
                .build();
        TrayUpdateResponse response = TrayUpdateResponse.newBuilder()
                .setTray(trayData)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void trayDeleteById(TrayDeleteByIdRequest request, StreamObserver<TrayEmpty> responseObserver) {
        System.out.println("Received Request =>\n" + request.toString());

        try {
            database.delete(request.getId());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        TrayEmpty response = TrayEmpty.newBuilder().build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

        System.out.println("Deleted =>\n" + request.toString());
    }

    @Override
    public void trayFindAll(TrayEmpty request, StreamObserver<TrayFindAllResponse> responseObserver) {
        System.out.println("Received Request =>\n" + request.toString());

        try
        {
            TrayFindAllResponse response = database.findAllAnimal();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            if (response != null){
                System.out.println("Found =>\n" + response.toString());
            } else {
                System.out.println("No animals found");
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
