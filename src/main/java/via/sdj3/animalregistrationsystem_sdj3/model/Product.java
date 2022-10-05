package via.sdj3.animalregistrationsystem_sdj3.model;

import java.util.ArrayList;

public class Product {
    private Long registrationNo;
    private Long trayId;
    private Long partNo;
    private Tray tray;

    public Product(Long registration, Long trayId, Long partNo){
        this.registrationNo=registration;
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

    public Long getPartNo() {
        return partNo;
    }

    public void setPartNo(Long partNo) {
        this.partNo = partNo;
    }

    public void setRegistrationNo(Long registration) {
        this.registrationNo = registration;
    }


}
