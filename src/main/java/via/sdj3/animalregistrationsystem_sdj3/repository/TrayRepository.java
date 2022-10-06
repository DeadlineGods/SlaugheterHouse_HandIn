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

        Tray t1 = new Tray(1L,700);
        Tray t2 = new Tray(2L,800);
        Tray t3 = new Tray(3L,900);
        Tray t4 = new Tray(4L,1000);

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
