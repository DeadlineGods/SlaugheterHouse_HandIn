package via.sdj3.animalregistrationsystem_sdj3.repository;


import org.springframework.stereotype.Repository;
import via.sdj3.animalregistrationsystem_sdj3.model.Tray;

import java.util.*;


@Repository
public class TrayRepositoryImpl implements TrayRepository {
    private static final Map<Long, Tray> trayMap = new HashMap<>();

    static {
        initDataSource();
    }

    private static void initDataSource() {

        Tray t1 = new Tray(0L,700);
        Tray t2 = new Tray(1L,800);
        Tray t3 = new Tray(2L,900);
        Tray t4 = new Tray(3L,1000);


        trayMap.put((long) t1.getTrayId(), t1);
        trayMap.put((long) t2.getTrayId(), t2);
        trayMap.put((long) t3.getTrayId(), t3);
        trayMap.put((long) t4.getTrayId(), t4);
    }

    public Tray save(Tray t){
        trayMap.put((long) t.getTrayId(), t);
        return t;
    }

    // R - GET
    public Tray findById(Long id) {
        return trayMap.get(id);
    }

    // U - Update
    public Tray update(Tray t){
        // simply saves the object
        trayMap.put((long) t.getTrayId(), t);
        return t;
    }
    // D - Delete
    public void deleteById(Long id) { // void just for test
        trayMap.remove(id);
    }

    // R - find all
    public List<Tray> findAll() {
        Collection<Tray> t = trayMap.values();
        List<Tray> trayList = new ArrayList<>();
        trayList.addAll(t);
        return trayList;
    }

    public long getMaxId(){
        long max = -1L;
        Iterator it = new HashMap<>(trayMap).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if((long) pair.getKey() > max)
                max = (long) pair.getKey();
            it.remove(); // avoids a ConcurrentModificationException
        }

        max++;
        return max;
    }
}
