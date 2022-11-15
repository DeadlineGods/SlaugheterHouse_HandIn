package via.sdj3.animalregistrationsystem_sdj3.repository;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Repository;
import via.sdj3.animalregistrationsystem_sdj3.model.Animal;
import via.sdj3.animalregistrationsystem_sdj3.model.Product;
import via.sdj3.animalregistrationsystem_sdj3.protobuf.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductGrpcImpl implements ProductRepository{

    ProductGrpc.ProductBlockingStub stub;

    public ProductGrpcImpl() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();
        stub = ProductGrpc.newBlockingStub(channel);
    }

    @Override
    public Product save(Product p) {
        SaveRequestProduct request = SaveRequestProduct.newBuilder()
                .setRegistrationNo(p.getRegistrationNo())
                .setTrayId(p.getTrayId())
                .setPartNo(p.getPartNo())
                .build();

        SaveResponseProduct response = stub.saveProduct(request);

        return new Product(response.getRegistrationNo(),response.getTrayId(),response.getPartNo());

    }

    @Override
    public Optional<Product> findByRegistrationNo(Long partNo) {
        FindByRegNoRequestProduct requestProduct = FindByRegNoRequestProduct.newBuilder()
                .setRegistrationNo(partNo).build();
        FindByRegNoResponseProduct response = stub.findByRegNoProduct(requestProduct);
        return Optional.of(new Product(response.getRegistrationNo(), response.getTrayId(), response.getPartNo()));

    }

    @Override
    public Product update(Product p) {
        UpdateRequestProduct request = UpdateRequestProduct.newBuilder()
                .setRegistrationNo(p.getRegistrationNo())
                .setTrayId(p.getTrayId())
                .setPartNo(p.getPartNo()).build();
        UpdateResponseProduct response = stub.updateProduct(request);
        return new Product(response.getRegistrationNo(),response.getTrayId(),response.getPartNo());


    }

    @Override
    public void deleteByRegistrationNo(Long registrationNo) {
        RequestDeleteByRegNoProduct request = RequestDeleteByRegNoProduct.newBuilder()
                .setPartNo(registrationNo)
                .build();

        stub.deleteByRegNoProduct(request);
    }

    @Override
    public List<Product> findAll() {
        EmptyProduct request = EmptyProduct.newBuilder().build();
        ResponseFindAllProduct response = stub.findAllProduct(request);
        List<Product> products = new ArrayList<>();

        for (int i = 0; i < response.getProductListCount(); i++) {
            ProductMessage productMessage = response.getProductList(i);
            Product product = new Product(productMessage.getRegistrationNo(),productMessage.getTrayId(),productMessage.getPartNo());
            products.add(product);
        }
        return products;
    }


}
