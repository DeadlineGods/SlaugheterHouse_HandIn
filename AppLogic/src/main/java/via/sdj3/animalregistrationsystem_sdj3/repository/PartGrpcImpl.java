package via.sdj3.animalregistrationsystem_sdj3.repository;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import via.sdj3.animalregistrationsystem_sdj3.model.Part;
import via.sdj3.animalregistrationsystem_sdj3.protobuf.*;

import java.util.ArrayList;
import java.util.List;

@Repository
@Primary
public class PartGrpcImpl implements PartRepository {

    PartGrpc.PartBlockingStub stub;

    public PartGrpcImpl()
    {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();
        stub = PartGrpc.newBlockingStub(channel);
    }

    @Override
    public Part save(Part p) {
        SavePartRequest request = SavePartRequest.newBuilder()
                .setWeight(p.getWeight())
                .setName(p.getName())
                .setAnimalNo(p.getAnimalNo())
                .setTrayId(p.getTrayId())
                .build();

        SavePartResponse response = stub.savePart(request);
        return new Part(response.getWeight(), (int)response.getPartno(), response.getName(), response.getAnimalNo(), request.getTrayId());
    }

    @Override
    public Part findByPartNo(int partNo) {
        FIndByIdRequestPart requestPart = FIndByIdRequestPart.newBuilder()
                .setId(partNo).build();
        FindByIdResponsePart response = stub.findByIdPart(requestPart);
        return new Part(response.getWeight(), (int)response.getPartno(), response.getName(), response.getAnimalNo(), response.getTrayId());
    }

    @Override
    public Part update(Part p) {
        UpdatePartRequest request = UpdatePartRequest.newBuilder()
                .setWeight(p.getWeight())
                .setName(p.getName())
                .setAnimalNo(p.getAnimalNo())
                .build();
        UpdatePartResponse response = stub.updatePart(request);

        return new Part(response.getWeight(), (int)response.getPartno(), response.getName(), response.getAnimalNo(), response.getTrayId());
    }

    @Override
    public void deleteById(int partNo) {
        DeleteByIdRequestPart request = DeleteByIdRequestPart.newBuilder()
                .setId(partNo).build();

        stub.deleteByIdPart(request);
    }

    @Override
    public List<Part> findAll() {
        EmptyPart request = EmptyPart.newBuilder().build();
        AllParts response = stub.findAllPart(request);
        List<Part> parts = new ArrayList<>();

        for (int i = 0; i < response.getPartsCount(); i++) {
            PartMessage partMessage = response.getParts(i);
            Part part = new Part(partMessage.getWeight(), (int)partMessage.getPartno() ,partMessage.getName(), partMessage.getAnimalNo(), partMessage.getTrayId());
            parts.add(part);

        }
        return parts;
    }

}
