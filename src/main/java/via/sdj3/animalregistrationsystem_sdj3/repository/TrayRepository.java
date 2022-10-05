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
        Part p1 = new Part(200, 0, "Leg", 1L);
        Part p2 = new Part(200, 1, "Other Leg", 1L);
        Part p3 = new Part(245, 2, "Ribs", 2L);
        Part p4 = new Part(240, 3, "Wing", 3L);
        ArrayList<Part> parts1=new ArrayList<>();
        ArrayList<Part> parts2=new ArrayList<>();
        ArrayList<Part> parts3=new ArrayList<>();
        ArrayList<Part> parts4=new ArrayList<>();
        parts1.add(p1);
        parts2.add(p2);
        parts3.add(p3);
        parts4.add(p3);

        Tray t1 = new Tray(1,700,"Leg",parts1);
        Tray t2 = new Tray(2,800,"Other Leg",parts2);
        Tray t3 = new Tray(3,900,"Ribs",parts3);
        Tray t4 = new Tray(4,1000,"Wing",parts4);

        orderMap.put((long) t1.getTrayId(), t1);
        orderMap.put((long) t2.getTrayId(), t2);
        orderMap.put((long) t3.getTrayId(), t3);
        orderMap.put((long) t4.getTrayId(), t4);
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
