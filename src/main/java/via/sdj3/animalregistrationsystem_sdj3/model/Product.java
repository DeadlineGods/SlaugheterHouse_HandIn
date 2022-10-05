package via.sdj3.animalregistrationsystem_sdj3.model;

import java.util.ArrayList;

public class Product {
    private int registration;
    private ArrayList<Tray> trayList;
    private ArrayList<Part> partList;

    public Product(int registration, Tray tray, Part part){
        this.registration=registration;
        trayList.add(tray);
        partList.add(part);
    }

    public int getRegistration() {
        return this.registration;
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

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public void setTrayList(ArrayList<Tray> trayList) {
        this.trayList = trayList;
    }
}
