package via.sdj3.animalregistrationsystem_sdj3.repository;


import org.springframework.stereotype.Repository;
import via.sdj3.animalregistrationsystem_sdj3.model.Animal;

import java.time.LocalDate;
import java.util.*;

@Repository
public class AnimalRepositoryImpl implements AnimalRepository {

    private static final Map<Long, Animal> animalMap = new HashMap<>();
    static {
        initDataSource();
    }

    private static void initDataSource() {
        Animal pig1 = new Animal(80.10, "Argentina");
        Animal pig2 = new Animal( 75.90, "Pakistan");
        Animal pig3 = new Animal( 82.20, "Germany");

        pig1.setAnimalNo(1L);
        pig2.setAnimalNo(2L);
        pig3.setAnimalNo(3L);

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

    public Long getMaxId(){
        Long max = -1L;
        Iterator it = new HashMap<>(animalMap).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if((Long) pair.getKey() > max)
                max = (Long) pair.getKey();
            it.remove(); // avoids a ConcurrentModificationException
        }

        max++;
        return max;
    }

    @Override
    public List<Animal> findByOrigin(String origin) {
        List<Animal> arr = new ArrayList<>();

        Iterator it = new HashMap<>(animalMap).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            Animal value = (Animal) pair.getValue();

            if (value.getOrigin().equals(origin))
            {
                arr.add(value);
            }

            it.remove(); // avoids a ConcurrentModificationException
        }

        return arr;
    }

    public List<Animal> findByDate(LocalDate date)
    {
        List<Animal> arr = new ArrayList<>();

            Iterator it = new HashMap<>(animalMap).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                Animal value = (Animal) pair.getValue();
                if (value.getArriveDate().equals(date))
                {
                    arr.add(value);
                }

                it.remove(); // avoids a ConcurrentModificationException
            }

            return arr;
    }

}
