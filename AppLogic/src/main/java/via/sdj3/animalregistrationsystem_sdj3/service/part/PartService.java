package via.sdj3.animalregistrationsystem_sdj3.service.part;

import org.springframework.stereotype.Service;
import via.sdj3.animalregistrationsystem_sdj3.model.Part;

import java.util.List;

@Service
public interface PartService {
    Part create(Part newPart);

    Part read(int partNo);

    List<Part> readAll();
}
