package via.sdj3.animalregistrationsystem_sdj3.service.product;

import via.sdj3.animalregistrationsystem_sdj3.repository.ProductRepository;
import via.sdj3.animalregistrationsystem_sdj3.model.Product;

import java.util.List;
import java.util.Optional;

public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public Product create(Product product) {
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
