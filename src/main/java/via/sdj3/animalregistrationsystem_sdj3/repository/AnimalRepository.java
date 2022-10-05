package via.sdj3.animalregistrationsystem_sdj3.repository;

import via.sdj3.animalregistrationsystem_sdj3.model.Animal;

import java.util.List;

public interface AnimalRepository {
    Animal save(Animal animal);

    Animal findById(Long id);

    Animal update(Animal a);

    void deleteById(Long id);

    List<Animal> findAll();

}
