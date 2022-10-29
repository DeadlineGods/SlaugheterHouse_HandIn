package via.sdj3.animalregistrationsystem_sdj3.repository;

import org.springframework.cglib.core.Local;
import via.sdj3.animalregistrationsystem_sdj3.model.Animal;
import via.sdj3.animalregistrationsystem_sdj3.protobuf.AnimalMessage;
import via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdRequestAnimal;
import via.sdj3.animalregistrationsystem_sdj3.protobuf.FindByIdResponseAnimal;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface AnimalRepository {
    Animal save(Animal animal);

    AnimalMessage findById(Long id);

    Animal update(Animal a);

    void deleteById(Long id);

    List<Animal> findAll();

    List<Animal> findByDate(LocalDate date);

    Long getMaxId();

    List<Animal> findByOrigin(String origin);
}
