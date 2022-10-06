package via.sdj3.animalregistrationsystem_sdj3.service.part;

import org.springframework.stereotype.Service;
import via.sdj3.animalregistrationsystem_sdj3.model.Part;
import via.sdj3.animalregistrationsystem_sdj3.repository.PartRepository;

import java.util.List;

@Service
public class PartServiceImpl implements PartService {

    PartRepository partRepository;

    public PartServiceImpl(PartRepository partRepository) {
        this.partRepository = partRepository;
    }

    @Override
    public Part create(Part newPart) {
        newPart.setPartNo(partRepository.getMaxId());

        return partRepository.save(newPart);
    }

    @Override
    public Part read(int partNo){
        return partRepository.findByPartNo(partNo);
    }

    @Override
    public List<Part> readAll(){
        return partRepository.findAll();
    }
}
