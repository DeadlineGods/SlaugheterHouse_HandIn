package via.sdj3.animalregistrationsystem_sdj3.repository;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import via.sdj3.animalregistrationsystem_sdj3.model.Animal;
import via.sdj3.animalregistrationsystem_sdj3.model.Product;
import via.sdj3.animalregistrationsystem_sdj3.protobuf.*;
import via.sdj3.animalregistrationsystem_sdj3.repository.AnimalRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
@Primary
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
        SaveAnimalRequest request = SaveAnimalRequest.newBuilder()
                .setWeight(animal.getWeight())
                .setOrigin(animal.getOrigin())
                .setYear(animal.getYear())
                .setDay(animal.getDay())
                .setMonth(animal.getMonth())
                .build();

        SaveAnimalResponse response = stub.saveAnimal(request);

        return new Animal(response.getWeight(), response.getOrigin(), response.getDay(), response.getMonth(), response.getYear(), response.getAnimalNo());
    }

    @Override
    public Animal findById(Long id) {
        FindByIdRequestAnimal requestAnimal = FindByIdRequestAnimal.newBuilder()
                .setId(id).build();
        FindByIdResponseAnimal response = stub.findByIdAnimal(requestAnimal);

        return new Animal(response.getWeight(), response.getOrigin(), response.getDay(), response.getMonth(), response.getYear(), response.getAnimalNo());
    }

    @Override
    public Animal update(Animal a) {
        UpdateAnimalRequest request = UpdateAnimalRequest.newBuilder()
                .setAnimalNo(a.getAnimalNo())
                .setDay(a.getDay())
                .setMonth(a.getMonth())
                .setYear(a.getYear())
                .setWeight(a.getWeight())
                .setOrigin(a.getOrigin()).build();
        UpdateAnimalResponse response = stub.updateAnimal(request);

        return new Animal(response.getWeight(), response.getOrigin(), response.getDay(), response.getMonth(), response.getYear(), response.getAnimalNo());
    }

    @Override
    public void deleteById(Long id) {
        DeleteByIdRequestAnimal request = DeleteByIdRequestAnimal.newBuilder()
                .setId(id).build();

        stub.deleteByIdAnimal(request);
    }

    @Override
    public List<Animal> findAll() {
        EmptyAnimal request = EmptyAnimal.newBuilder().build();
        AllAnimals response = stub.findAllAnimal(request);
        List<Animal> animals = new ArrayList<>();

        for (int i = 0; i < response.getAnimalCount(); i++) {
            AnimalMessage animalMessage = response.getAnimal(i);
            Animal animal = new Animal(animalMessage.getWeight(), animalMessage.getOrigin(), animalMessage.getDay(), animalMessage.getMonth(), animalMessage.getYear(), animalMessage.getAnimalNo());
            animals.add(animal);
        }
        return animals;
    }

    @Override
    public List<Animal> findByDate(LocalDate date) {
        FilterByDateRequestAnimal request = FilterByDateRequestAnimal.newBuilder()
                .setDay(date.getDayOfMonth())
                .setMonth(date.getMonthValue())
                .setYear(date.getYear())
                .build();

        AllAnimals response = stub.findByDateAnimal(request);

        List<Animal> animals = new ArrayList<>();

        for (int i = 0; i < response.getAnimalCount(); i++) {
            AnimalMessage animalMessage = response.getAnimal(i);
            Animal animal = new Animal(animalMessage.getWeight(), animalMessage.getOrigin(), animalMessage.getDay(), animalMessage.getMonth(), animalMessage.getYear(), animalMessage.getAnimalNo());
            animals.add(animal);
        }

        return animals;
    }

    @Override
    public List<Animal> findByOrigin(String origin) {
        GetFromOriginRequestAnimal request = GetFromOriginRequestAnimal.newBuilder()
                .setOrigin(origin)
                .build();

        AllAnimals response = stub.findByOriginAnimal(request);

        List<Animal> animals = new ArrayList<>();

        for (int i = 0; i < response.getAnimalCount(); i++) {
            AnimalMessage animalMessage = response.getAnimal(i);
            Animal animal = new Animal(animalMessage.getWeight(), animalMessage.getOrigin(), animalMessage.getDay(), animalMessage.getMonth(), animalMessage.getYear(), animalMessage.getAnimalNo());
            animals.add(animal);
        }

        return animals;
    }

    @Override
    public List<Product> findAllProductsFromAnimal(int id) {
        FindByIdRequestAnimal request = FindByIdRequestAnimal.newBuilder()
                .setId(id).build();

        Products response = stub.findAllProductsFromAnimal(request);
        List<Product> products = new ArrayList<>();

        for (int i = 0; i < response.getProductsCount(); i++) {
            ProductMessageAnimal productMessageAnimal = response.getProducts(i);
           Product product = new Product(productMessageAnimal.getRegistrationNo(), productMessageAnimal.getTrayId(), productMessageAnimal.getPartNoList());
           products.add(product);
        }
        return products;
    }

    @Override
    public List<Animal> getAnimalsInvolvedIntoProduct(long id) {
        FindByIdRequestAnimal request = FindByIdRequestAnimal.newBuilder().setId(id).build();

        AllAnimals response = stub.getAnimalsInvolvedIntoProduct(request);

        List<Animal> animals = new ArrayList<>();

        for (int i = 0; i < response.getAnimalCount(); i++) {
            AnimalMessage animalMessage = response.getAnimal(i);
            Animal animal = new Animal(animalMessage.getWeight(), animalMessage.getOrigin(), animalMessage.getDay(), animalMessage.getMonth(), animalMessage.getYear(), animalMessage.getAnimalNo());
            animals.add(animal);
        }

        return animals;
    }
}
