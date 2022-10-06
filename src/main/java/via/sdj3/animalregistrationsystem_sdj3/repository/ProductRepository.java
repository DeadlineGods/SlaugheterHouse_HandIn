package via.sdj3.animalregistrationsystem_sdj3.repository;

import via.sdj3.animalregistrationsystem_sdj3.model.Part;
import via.sdj3.animalregistrationsystem_sdj3.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    Product save(Product p);

    // R - GET
    Optional<Product> findByRegistrationNo(Long partNo);

    // U - Update
    Product update(Product p);

    // D - Delete
    void deleteByRegistrationNo(Long registrationNo);


    // R - find all
    List<Product> findAll();

    Long getMaxId();
}
