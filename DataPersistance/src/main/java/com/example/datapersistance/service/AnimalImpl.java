package com.example.datapersistance.service;

import com.example.datapersistance.dao.AnimalDatabase;
import com.example.datapersistance.dao.AnimalPersistence;
import com.example.datapersistance.protobuf.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Qualifier;

import java.sql.SQLException;

@GRpcService
public class AnimalImpl extends AnimalGrpc.AnimalImplBase {


    private final AnimalPersistence database;

    public AnimalImpl(@Qualifier("animalDatabase") AnimalPersistence database) {
        this.database = database;
    }

    @Override
    public void saveAnimal(SaveAnimalRequest request, StreamObserver<SaveAnimalResponse> responseObserver) {
        System.out.println("Received Request =>\n" + request.toString());

        try {
            database.save(request.getWeight(), request.getOrigin(), request.getDay(), request.getMonth(), request.getYear());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        SaveAnimalResponse response = SaveAnimalResponse.newBuilder()
                .setAnimalNo(request.getAnimalNo())
                .setWeight(request.getWeight())

                .setOrigin(request.getOrigin())
                .setDay(request.getDay())
                .setMonth(request.getMonth())
                .setYear(request.getYear())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

        System.out.println("Saved =>\n" + request.toString());

    }

    @Override
    public void findByIdAnimal(FindByIdRequestAnimal request, StreamObserver<FindByIdResponseAnimal> responseObserver) {
        System.out.println("Received Request =>\n" + request.toString());

        try {
            FindByIdResponseAnimal response = database.findByIdAnimal(request.getId());
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
    public void updateAnimal(UpdateAnimalRequest request, StreamObserver<UpdateAnimalResponse> responseObserver) {
        System.out.println("Received Request =>\n" + request.toString());

        try {

            FindByIdResponseAnimal findResponse = database.findByIdAnimal(request.getAnimalNo());

            if(findResponse == null) {
                System.out.println("No animal with id => " + request.getAnimalNo());

                responseObserver.onNext(null);
                responseObserver.onCompleted();
                return;
            } else {
                System.out.println("Updated =>\n" + request.toString());
            }

             database.update(request.getAnimalNo(), request.getWeight(), request.getOrigin(), request.getYear(), request.getMonth(), request.getDay());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        UpdateAnimalResponse response = UpdateAnimalResponse.newBuilder()
                .setAnimalNo(request.getAnimalNo())
                .setWeight(request.getWeight())
                .setOrigin(request.getOrigin())
                .setYear(request.getYear())
                .setMonth(request.getMonth())
                .setDay(request.getDay())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteByIdAnimal(DeleteByIdRequestAnimal request, StreamObserver<EmptyAnimal> responseObserver) {
        System.out.println("Received Request =>\n" + request.toString());

        try {
            database.delete(request.getId());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        EmptyAnimal response = EmptyAnimal.newBuilder().build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

        System.out.println("Deleted =>\n" + request.toString());
    }

    @Override
    public void findAllAnimal(EmptyAnimal request, StreamObserver<AllAnimals> responseObserver) {
        System.out.println("Received Request =>\n" + request.toString());
        try
        {
            AllAnimals response = database.findAllAnimal();
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

    @Override
    public void findByDateAnimal(FilterByDateRequestAnimal request, StreamObserver<AllAnimals> responseObserver) {
        System.out.println("Received Request =>\n" + request.toString());
        try
        {
            AllAnimals response = database.findByDateAnimal(request.getYear(), request.getMonth(), request.getDay());
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            if (response != null){
                System.out.println("Found =>\n" + response.toString());
            } else {
                System.out.println("No animals found from date => " + request.getYear() + "/" + request.getMonth() + "/" + request.getDay());
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }    }

    @Override
    public void getMaxIdAnimal(EmptyAnimal request, StreamObserver<GetMaxIdResponseAnimal> responseObserver) {
        System.out.println("Received Request =>\n" + request.toString());

        try
        {
            GetMaxIdResponseAnimal response = database.getMaxIdAnimal();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            if (response != null){
                System.out.println("Found =>\n" + response.toString());
            } else {
                System.out.println("Not item");
            }
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void findByOriginAnimal(GetFromOriginRequestAnimal request, StreamObserver<AllAnimals> responseObserver) {
        System.out.println("Received Request =>\n" + request.toString());
        try
        {
            AllAnimals response = database.findByOriginAnimal(request.getOrigin());
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            if (response != null){
                System.out.println("Found =>\n" + response.toString());
            } else {
                System.out.println("No animals found from origin => " + request.getOrigin());
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
