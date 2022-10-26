package via.sdj3.animalregistrationsystem_sdj3.repository;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Repository;
import via.sdj3.animalregistrationsystem_sdj3.model.Animal;
import via.sdj3.animalregistrationsystem_sdj3.protobuf.AnimalGrpc;
import via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalRequest;
import via.sdj3.animalregistrationsystem_sdj3.protobuf.SaveAnimalResponse;
import via.sdj3.animalregistrationsystem_sdj3.repository.AnimalRepository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class AnimalGrpcImpl implements AnimalRepository {

    AnimalGrpc.AnimalBlockingStub stub;

    public AnimalGrpcImpl() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();
        stub = AnimalGrpc.newBlockingStub(channel);
    }

    // Notice how I do not pass in the AnimalNo, that is because in postgresSQL I have said that
    // id should be set automatically :)
    @Override
    public Animal save(Animal animal) {

        System.out.println("Ett");

        SaveAnimalRequest request = SaveAnimalRequest.newBuilder()
                .setWeight(animal.getWeight())
                .setOrigin(animal.getOrigin())
                .setYear(animal.getArriveDate().getYear())
                .setDay(animal.getArriveDate().getDay())
                .setMonth(animal.getArriveDate().getMonth())
                .build();

        SaveAnimalResponse response = stub.saveAnimal(request);

        return new Animal(response.getWeight(), response.getOrigin(), response.getDay(), response.getMonth(), response.getYear(), response.getAnimalNo());
    }

    @Override
    public Animal findById(Long id) {
        return null;
    }

    @Override
    public Animal update(Animal a) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Animal> findAll() {
        return null;
    }

    @Override
    public List<Animal> findByDate(LocalDate date) {
        return null;
    }

    @Override
    public Long getMaxId() {
        return null;
    }

    @Override
    public List<Animal> findByOrigin(String origin) {
        return null;
    }
}
