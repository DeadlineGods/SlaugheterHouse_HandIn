package via.sdj3.animalregistrationsystem_sdj3.repository;

import org.springframework.stereotype.Repository;
import via.sdj3.animalregistrationsystem_sdj3.model.Product;
import via.sdj3.animalregistrationsystem_sdj3.model.Tray;

import java.util.*;

@Repository
public class ProductRepository {
    private static final Map<Long, Product> productMap = new HashMap<>();
    static
    {
        initDataSource();
    }

    public static void initDataSource()
    {
        Product p1 = new Product(1L, 1L, 1);
        Product p2 = new Product(2L, 2L, 2);
        Product p3 = new Product(3L, 3L, 3);

        productMap.put(p1.getRegistrationNo(), p1);
        productMap.put(p2.getRegistrationNo(), p2);
        productMap.put(p3.getRegistrationNo(), p3);
    }

    // CRUD
    public Product save(Product p)
    {
        productMap.put(p.getRegistrationNo(), p);
        return p;
    }

    public Optional<Product> findByRegistrationNo(Long registrationNo)
    {
        return Optional.ofNullable(productMap.get(registrationNo));
    }

    public Product update(Product p)
    {
        productMap.put(p.getRegistrationNo(), p);
        return p;
    }

    public void deleteByRegistrationNo(Long registrationNo)
    {
        productMap.remove(registrationNo);
    }

    public List<Product> findAll()
    {
        Collection<Product> p = productMap.values();
        List<Product> productList = new ArrayList<>();
        productList.addAll(p);
        return productList;
    }


}
