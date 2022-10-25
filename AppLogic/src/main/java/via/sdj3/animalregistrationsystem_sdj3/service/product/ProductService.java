package via.sdj3.animalregistrationsystem_sdj3.service.product;

import org.springframework.stereotype.Service;
import via.sdj3.animalregistrationsystem_sdj3.model.Product;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {
    Product create(Product productService);
    List<Product> findAll();
    Optional<Product> findByRegistrationNo(Long registrationNo);
    Product update(Product productService);
    void deleteByRegistrationNo(Long registrationNo);

}
