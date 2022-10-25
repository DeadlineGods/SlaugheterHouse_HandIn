package com.example.datapersistance.service;

import com.example.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class AnimalImpl extends AnimalGrpc.AnimalImplBase {
    @Override
    public void saveAnimal(SaveAnimalRequest request, StreamObserver<SaveAnimalResponse> responseObserver) {
        super.saveAnimal(request, responseObserver);
    }

    @Override
    public void findById(FindByIdRequest request, StreamObserver<FindByIdResponse> responseObserver) {
        super.findById(request, responseObserver);
    }

    @Override
    public void updateAnimal(UpdateAnimalRequest request, StreamObserver<UpdateAnimalResponse> responseObserver) {
        super.updateAnimal(request, responseObserver);
    }

    @Override
    public void deleteById(DeleteByIdRequest request, StreamObserver<Empty> responseObserver) {
        super.deleteById(request, responseObserver);
    }

    @Override
    public void findAllAnimal(Empty request, StreamObserver<AllAnimals> responseObserver) {
        super.findAllAnimal(request, responseObserver);
    }

    @Override
    public void findByDate(FilterByDateRequest request, StreamObserver<AllAnimals> responseObserver) {
        super.findByDate(request, responseObserver);
    }

    @Override
    public void getMaxIdAnimal(Empty request, StreamObserver<GetMaxIdResponse> responseObserver) {
        super.getMaxIdAnimal(request, responseObserver);
    }

    @Override
    public void findByOrigin(GetFromOriginRequest request, StreamObserver<AllAnimals> responseObserver) {
        super.findByOrigin(request, responseObserver);
    }
}
