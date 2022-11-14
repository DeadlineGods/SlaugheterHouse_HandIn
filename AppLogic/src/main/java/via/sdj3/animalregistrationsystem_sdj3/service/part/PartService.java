package via.sdj3.animalregistrationsystem_sdj3.service.part;

import org.springframework.stereotype.Service;
import via.sdj3.animalregistrationsystem_sdj3.model.Part;

import java.util.List;
import java.util.Optional;

@Service
public interface PartService {
    Part create(Part newPart);
    List<Part> findAll();
    Optional<Part> findById(int id);
    Part update (Part part);
    void deleteById(int id);

}
