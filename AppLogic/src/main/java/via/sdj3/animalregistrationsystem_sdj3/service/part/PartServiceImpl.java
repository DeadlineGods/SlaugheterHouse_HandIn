package via.sdj3.animalregistrationsystem_sdj3.service.part;

import org.springframework.stereotype.Service;
import via.sdj3.animalregistrationsystem_sdj3.model.Part;
import via.sdj3.animalregistrationsystem_sdj3.repository.PartRepository;
import via.sdj3.animalregistrationsystem_sdj3.repository.PartRepositoryImpl;

import java.util.List;
import java.util.Optional;

@Service
public class PartServiceImpl implements PartService {

    PartRepository partRepository;

    public PartServiceImpl(PartRepositoryImpl partRepository) {
        this.partRepository = partRepository;
    }

    @Override
    public Part create(Part newPart) {
        return partRepository.save(newPart);
    }

    @Override
    public List<Part> findAll() {
        return partRepository.findAll();
    }

    @Override
    public Optional<Part> findById(int id) {
        return Optional.ofNullable(partRepository.findByPartNo(id));
    }

    @Override
    public Part update(Part part) {
        return partRepository.save(part);
    }

    @Override
    public void deleteById(int id) {
        partRepository.deleteById(id);
    }

}
