package via.sdj3.animalregistrationsystem_sdj3.service.product;

import via.sdj3.animalregistrationsystem_sdj3.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product create(Product productService);
    List<Product> findAll();
    Optional<Product> findByRegistrationNo(Long registrationNo);
    Product update(Product productService);
    void deleteByRegistrationNo(Long registrationNo);

}
