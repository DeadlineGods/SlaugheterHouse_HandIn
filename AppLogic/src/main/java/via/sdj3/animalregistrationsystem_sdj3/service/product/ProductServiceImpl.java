package via.sdj3.animalregistrationsystem_sdj3.service.product;

import org.springframework.stereotype.Service;
import via.sdj3.animalregistrationsystem_sdj3.repository.AnimalRepository;
import via.sdj3.animalregistrationsystem_sdj3.repository.ProductRepository;
import via.sdj3.animalregistrationsystem_sdj3.repository.ProductRepositoryImpl;
import via.sdj3.animalregistrationsystem_sdj3.model.Product;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository;
    AnimalRepository animalRepository;
    public ProductServiceImpl(ProductRepositoryImpl productRepository) {
        this.productRepository = productRepository;
    }


    public Product create(Product product) {
        product.setRegistrationNo(productRepository.getMaxId());

        return productRepository.save(product);
    }


    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }


    public Optional<Product> findByRegistrationNo(Long registrationNo) {
        return productRepository.findByRegistrationNo(registrationNo);
    }


    public Product update(Product product) {
        return productRepository.update(product);
    }


    public void deleteByRegistrationNo(Long registrationNo) {
        productRepository.deleteByRegistrationNo(registrationNo);
    }


}
