package via.sdj3.animalregistrationsystem_sdj3.controller;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import via.sdj3.animalregistrationsystem_sdj3.model.Product;
import via.sdj3.animalregistrationsystem_sdj3.service.product.ProductService;
import via.sdj3.animalregistrationsystem_sdj3.service.product.ProductServiceImpl;

import java.util.Optional;

@RestController
public class ProductController {
    private Logger logger = LoggerFactory.getLogger(ProductController.class);
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // CRUD
    @PostMapping("/products")
    public ResponseEntity<Object> createProduct(@RequestBody Product product) {
        try {
            Product createdProduct = productService.create(product);
            return new ResponseEntity<Object>(createdProduct, HttpStatus.OK);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/products")
    public ResponseEntity<Object> getAllProducts()
    {
        try
        {
            Iterable<Product> products = productService.findAll();
            return new ResponseEntity<Object>(products, HttpStatus.OK);
        }
        catch (Exception e)
        {
            logger.error(e.getMessage(), e);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }


    @GetMapping("/products/{registrationNo}")
    public ResponseEntity<Object> getProductByRegistrationNo(@PathVariable Long registrationNo)
    {
        try
        {
            Optional<Product> product = productService.findByRegistrationNo(registrationNo);
            if (product.isPresent()) {
                return new ResponseEntity<Object>(product.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/products/{registrationNo}")
    public ResponseEntity<Object> updateProduct(@PathVariable Long registrationNo, @RequestBody Product product)
    {
        try
        {
            product.setRegistrationNo(registrationNo);
            Product savedProduct = productService.update(product);
            return new ResponseEntity<Object>(savedProduct, HttpStatus.OK);
        }
        catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/products/{registrationNo}")
    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable Long registrationNo) {
        try {
            productService.deleteByRegistrationNo(registrationNo);
            return new ResponseEntity<HttpStatus>(HttpStatus.OK);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
        }
    }

}
