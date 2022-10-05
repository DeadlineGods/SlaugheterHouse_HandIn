package via.sdj3.animalregistrationsystem_sdj3.repository;


import org.springframework.stereotype.Repository;
import via.sdj3.animalregistrationsystem_sdj3.model.Animal;

import java.util.*;

@Repository
public class AnimalRepositoryImpl implements AnimalRepository {

    private static final Map<Long, Animal> animalMap = new HashMap<>();
    static {
        initDataSource();
    }

    private static void initDataSource() {
        Animal pig1 = new Animal(1L, 80.10, new Date());
        Animal pig2 = new Animal(2L, 75.90, new Date());
        Animal pig3 = new Animal(3L, 82.20, new Date());

        animalMap.put(pig1.getAnimalNo(), pig1);
        animalMap.put(pig2.getAnimalNo(), pig2);
        animalMap.put(pig3.getAnimalNo(), pig3);
    }

    //CRUD

    // C - Create
    public Animal save(Animal a)
    {
        animalMap.put(a.getAnimalNo(), a);
        return a;
    }

    // R - GET
    public Animal findById(Long id)
    {
        return animalMap.get(id);
    }

    // U - Update
    public Animal update(Animal a)
    {
        animalMap.put(a.getAnimalNo(), a);
        return a;
    }

    // D - Delete
    public void deleteById(Long id)
    {
        animalMap.remove(id);
    }

    public List<Animal> findAll()
    {
        Collection<Animal> a = animalMap.values();
        List<Animal> animalList = new ArrayList<>();
        animalList.addAll(a);
        return animalList;
    }

}
