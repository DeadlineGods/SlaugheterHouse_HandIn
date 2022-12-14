package via.sdj3.animalregistrationsystem_sdj3.model;

import java.util.ArrayList;

public class Product {
    private Long registrationNo;
    private Long trayId;
    private int partNo;

    public Product(Long trayId, int partNo){
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

    public int getPartNo() {
        return partNo;
    }

    public void setPartNo(int partNo) {
        this.partNo = partNo;
    }

    public void setRegistrationNo(Long registration) {
        this.registrationNo = registration;
    }


}
