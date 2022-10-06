package via.sdj3.animalregistrationsystem_sdj3.repository;

import org.springframework.stereotype.Repository;
import via.sdj3.animalregistrationsystem_sdj3.model.Part;

import java.util.*;

@Repository
public class PartRepositoryImpl implements PartRepository {
    private static final Map<Integer, Part> partMap = new HashMap<>();

    static {
        initDataSource();
    }

    private static void initDataSource() {
        Part p1 = new Part(200, "Leg", 1L, 1L);
        Part p2 = new Part(200, "Other Leg", 1L, 1L);
        Part p3 = new Part(245, "Ribs", 2L, 2L);
        Part p4 = new Part(240, "Wing", 3L, 3L);

        p1.setPartNo(0);
        p2.setPartNo(1);
        p3.setPartNo(2);
        p4.setPartNo(3);

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

    public int getMaxId(){
        int max = -1;
        Iterator it = new HashMap<>(partMap).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if((int) pair.getKey() > max)
                max = (int) pair.getKey();
            it.remove(); // avoids a ConcurrentModificationException
        }

        max++;
        return max;
    }
}
