package via.sdj3.animalregistrationsystem_sdj3.model;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private Long registrationNo;
    private Long trayId;
    private List<Integer> partNo;

    public Product() {
    }

    public Product(Long trayId, List<Integer> partNo){
        this.trayId = trayId;
        this.partNo = partNo;
    }

    public Product(Long registrationNo, Long trayId, List<Integer> partNo) {
        this.registrationNo = registrationNo;
        this.trayId = trayId;
        this.partNo = partNo;
    }

    public Long getRegistrationNo() {
        return this.registrationNo;
    }

    public Long getTrayId() {
        return trayId;
    }

    public void setTrayId(Long trayId) {
        this.trayId = trayId;
    }

    public List<Integer> getPartNo() {
        return partNo;
    }

    public void setPartNo(List<Integer> partNo) {
        this.partNo = partNo;
    }

    public void setRegistrationNo(Long registration) {
        this.registrationNo = registration;
    }


}
