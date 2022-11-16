package via.sdj3.animalregistrationsystem_sdj3.repository;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import via.sdj3.animalregistrationsystem_sdj3.model.Tray;
import via.sdj3.animalregistrationsystem_sdj3.protobuf.*;

import java.util.ArrayList;
import java.util.List;

@Repository
@Primary
public class TrayGrpcImpl implements TrayRepository{

    TrayGrpc.TrayBlockingStub stub;

    public TrayGrpcImpl() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();
        stub = TrayGrpc.newBlockingStub(channel);
    }

    @Override
    public Tray save(Tray t) {
        TrayData trayData = TrayData.newBuilder()
                .setTrayId(t.getTrayId())
                .setMaxWeightCapacity(t.getMaxWeightCapacity())
                .build();
        TraySaveRequest request = TraySaveRequest.newBuilder()
                .setTray(trayData)
                .build();

        TraySaveResponse response = stub.traySave(request);

        return new Tray(response.getTray().getTrayId(), response.getTray().getMaxWeightCapacity());
    }

    @Override
    public Tray findById(Long id) {
        TrayFindByIdRequest request = TrayFindByIdRequest.newBuilder()
                .setId(id)
                .build();

        TrayFindByIdResponse response = stub.trayFindById(request);

        return new Tray(response.getTray().getTrayId(), response.getTray().getMaxWeightCapacity());
    }

    @Override
    public Tray update(Tray t) {
        TrayData trayData = TrayData.newBuilder()
                .setTrayId(t.getTrayId())
                .setMaxWeightCapacity(t.getMaxWeightCapacity())
                .build();
        TrayUpdateRequest request = TrayUpdateRequest.newBuilder()
                .setTray(trayData)
                .build();

        TrayUpdateResponse response = stub.trayUpdate(request);

        return new Tray(response.getTray().getTrayId(), response.getTray().getMaxWeightCapacity());
    }

    @Override
    public void deleteById(Long id) {
        TrayDeleteByIdRequest request = TrayDeleteByIdRequest.newBuilder()
                .setId(id)
                .build();

        TrayEmpty response = stub.trayDeleteById(request);
    }

    @Override
    public List<Tray> findAll() {
        TrayEmpty request = TrayEmpty.newBuilder().build();
        TrayFindAllResponse response = stub.trayFindAll(request);

        List<Tray> trays = new ArrayList<>();

        for (int i = 0; i < response.getTraysCount(); i++) {
            TrayData trayData = response.getTrays(i);
            Tray tray = new Tray(trayData.getTrayId(), trayData.getMaxWeightCapacity());
            trays.add(tray);
        }

        return trays;
    }
}
