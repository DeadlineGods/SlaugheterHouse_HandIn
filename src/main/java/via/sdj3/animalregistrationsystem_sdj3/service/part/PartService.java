package via.sdj3.animalregistrationsystem_sdj3.service.part;

import via.sdj3.animalregistrationsystem_sdj3.model.Part;

import java.util.List;

public interface PartService {
    Part create(Part newPart);

    Part read(int partNo);

    List<Part> readAll();
}
