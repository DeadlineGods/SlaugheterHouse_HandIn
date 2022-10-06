package via.sdj3.animalregistrationsystem_sdj3.repository;

import via.sdj3.animalregistrationsystem_sdj3.model.Tray;

import java.util.*;

public interface TrayRepository {
    Tray save(Tray t);

    // R - GET
    Tray findById(Long id);

    // U - Update
    Tray update(Tray t);

    // D - Delete
    void deleteById(Long id);

    // R - find all
    List<Tray> findAll();

    long getMaxId();
}
