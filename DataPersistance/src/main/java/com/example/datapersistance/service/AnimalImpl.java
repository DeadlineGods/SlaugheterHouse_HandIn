package com.example.datapersistance.service;

import com.example.datapersistance.protobuf.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class AnimalImpl extends AnimalGrpc.AnimalImplBase {
    @Override
    public void saveAnimal(SaveAnimalRequest request, StreamObserver<SaveAnimalResponse> responseObserver) {
        System.out.println("Received Request => " + request.toString());
        System.out.println("Saved => " + request.toString());

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
    }

    @Override
    public void findByIdAnimal(FindByIdRequestAnimal request, StreamObserver<FindByIdResponseAnimal> responseObserver) {
        super.findByIdAnimal(request, responseObserver);
    }

    @Override
    public void updateAnimal(UpdateAnimalRequest request, StreamObserver<UpdateAnimalResponse> responseObserver) {
        super.updateAnimal(request, responseObserver);
    }

    @Override
    public void deleteByIdAnimal(DeleteByIdRequestAnimal request, StreamObserver<EmptyAnimal> responseObserver) {
        super.deleteByIdAnimal(request, responseObserver);
    }

    @Override
    public void findAllAnimal(EmptyAnimal request, StreamObserver<AllAnimals> responseObserver) {
        super.findAllAnimal(request, responseObserver);
    }

    @Override
    public void findByDateAnimal(FilterByDateRequestAnimal request, StreamObserver<AllAnimals> responseObserver) {
        super.findByDateAnimal(request, responseObserver);
    }

    @Override
    public void getMaxIdAnimal(EmptyAnimal request, StreamObserver<GetMaxIdResponseAnimal> responseObserver) {
        super.getMaxIdAnimal(request, responseObserver);
    }

    @Override
    public void findByOriginAnimal(GetFromOriginRequestAnimal request, StreamObserver<AllAnimals> responseObserver) {
        super.findByOriginAnimal(request, responseObserver);
    }
}
