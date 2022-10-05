package via.sdj3.animalregistrationsystem_sdj3.model;

import java.util.ArrayList;

public class Product {
    private Long registrationNo;
    private ArrayList<Tray> trayList;
    private ArrayList<Part> partList;

    public Product(Long registration, Tray tray, Part part){
        this.registrationNo=registration;
        trayList.add(tray);
        partList.add(part);
    }

    public Long getRegistrationNo() {
        return this.registrationNo;
    }

    public ArrayList<Part> getPartList() {
        return partList;
    }

    public ArrayList<Tray> getTrayList() {
        return trayList;
    }

    public void setPartList(ArrayList<Part> partList) {
        this.partList = partList;
    }

    public void setRegistrationNo(Long registration) {
        this.registrationNo = registration;
    }

    public void setTrayList(ArrayList<Tray> trayList) {
        this.trayList = trayList;
    }
}
