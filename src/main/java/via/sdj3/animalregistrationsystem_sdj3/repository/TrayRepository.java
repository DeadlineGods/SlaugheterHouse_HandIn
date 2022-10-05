package via.sdj3.animalregistrationsystem_sdj3.repository;


import org.springframework.stereotype.Repository;
import via.sdj3.animalregistrationsystem_sdj3.model.Part;
import via.sdj3.animalregistrationsystem_sdj3.model.Tray;

import java.util.*;


@Repository
public class TrayRepository {
    private static final Map<Long, Tray> orderMap = new HashMap<>();

    static {
        initDataSource();
    }

    private static void initDataSource() {
        Part p1=new Part(100,1,"Leg");
        Part p2=new Part(200,2,"Leg");
        Part p3=new Part(300,3,"Leg");
        ArrayList<Part> parts=new ArrayList<>();
        parts.add(p1);
        parts.add(p2);
        parts.add(p3);

        Tray t1 = new Tray(1,500,"Leg",parts);

        orderMap.put((long) t1.getTrayId(), t1);
    }

    public Tray save(Tray t){
        orderMap.put((long) t.getTrayId(), t);
        return t;
    }

    // R - GET
    public Tray findById(Long id) {
        return orderMap.get(id);
    }

    // U - Update
    public Tray update(Tray t){
        // simply saves the object
        orderMap.put((long) t.getTrayId(), t);
        return t;
    }
    // D - Delete
    public void deleteById(Long id) { // void just for test
        orderMap.remove(id);
    }

    // R - find all
    public List<Tray> findAll() {
        Collection<Tray> t = orderMap.values();
        List<Tray> trayList = new ArrayList<>();
        trayList.addAll(t);
        return trayList;
    }
}
