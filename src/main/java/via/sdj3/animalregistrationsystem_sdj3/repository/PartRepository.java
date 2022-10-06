package via.sdj3.animalregistrationsystem_sdj3.repository;

import org.springframework.stereotype.Repository;
import via.sdj3.animalregistrationsystem_sdj3.model.Part;

import java.util.*;

@Repository
public class PartRepository {
    private static final Map<Integer, Part> partMap = new HashMap<>();

    static {
        initDataSource();
    }

    private static void initDataSource() {
        Part p1 = new Part(200, 0, "Leg", 1L, 1L);
        Part p2 = new Part(200, 1, "Other Leg", 1L, 1L);
        Part p3 = new Part(245, 2, "Ribs", 2L, 2L);
        Part p4 = new Part(240, 3, "Wing", 3L, 3L);

        partMap.put(p1.getPartNo(), p1);
        partMap.put(p2.getPartNo(), p2);
        partMap.put(p3.getPartNo(), p3);
        partMap.put(p4.getPartNo(), p4);
    }

    // C - Create
    public Part save(Part p){
        partMap.put(p.getPartNo(), p);
        return p;
    }

    // R - GET
    public Part findByPartNo(int partNo) {
        return partMap.get(partNo);
    }

    // U - Update
    public Part update(Part p){
        // simply saves the object
        partMap.put(p.getPartNo(), p);
        return p;
    }
    // D - Delete
    public void deleteById(int partNo) { // void just for test
        partMap.remove(partNo);
    }

    // R - find all
    public List<Part> findAll() {
        Collection<Part> c = partMap.values();
        return new ArrayList<>(c);
    }
}
