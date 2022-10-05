package via.sdj3.animalregistrationsystem_sdj3.service.tray;




import org.springframework.stereotype.Service;
import via.sdj3.animalregistrationsystem_sdj3.model.Tray;

import java.util.List;
import java.util.Optional;

@Service
public interface TrayService {
    Tray create(Tray trayService);
    List<Tray> findAll();  //  use List or Iterable
    Iterable<Tray> findAllItr(); // use List or Iterable
    Optional<Tray> findById(Long id);
    Tray update(Tray tray);
    void deleteById(Long id);
}
