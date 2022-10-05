package via.sdj3.animalregistrationsystem_sdj3.service.tray;





import org.springframework.stereotype.Service;
import via.sdj3.animalregistrationsystem_sdj3.model.Tray;
import via.sdj3.animalregistrationsystem_sdj3.repository.TrayRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TrayServiceImpl implements TrayService {
    TrayRepository trayRepository;

    public TrayServiceImpl(TrayRepository trayRepository) {
        this.trayRepository = trayRepository;
    }
    @Override
    public Tray create(Tray tray) {
        return trayRepository.save(tray);
    }

    @Override
    public List<Tray> findAll() {
        return (List<Tray>) trayRepository.findAll();
    }

    @Override
    public Iterable<Tray> findAllItr() {
        return trayRepository.findAll();
    }

    @Override
    public Optional<Tray> findById(Long id) {
        return Optional.ofNullable(trayRepository.findById(id));
    }

    @Override
    public Tray update(Tray tray) {
        return trayRepository.save(tray);
    }

    @Override
    public void deleteById(Long id) {
        trayRepository.deleteById(id);
    }
}
