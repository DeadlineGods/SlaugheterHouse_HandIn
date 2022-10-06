package via.sdj3.animalregistrationsystem_sdj3.repository;

import via.sdj3.animalregistrationsystem_sdj3.model.Part;

import java.util.*;

public interface PartRepository {
    Part save(Part p);

    // R - GET
    Part findByPartNo(int partNo);

    // U - Update
    Part update(Part p);
    // D - Delete
    void deleteById(int partNo);

    // R - find all
    List<Part> findAll();

    int getMaxId();
}
