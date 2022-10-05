package via.sdj3.animalregistrationsystem_sdj3.model;

import java.util.ArrayList;

public class Tray {
    private double maxWeightCapacity;
    private String partType;
    private long trayId;



    public Tray(long trayId,double maxWeightCapacity, String partType) {
        this.maxWeightCapacity = maxWeightCapacity;
        this.partType = partType;
        this.trayId=trayId;


    }

    public double getMaxWeightCapacity() {
        return maxWeightCapacity;
    }

    public void setMaxWeightCapacity(double maxWeightCapacity) {
        this.maxWeightCapacity = maxWeightCapacity;
    }

    public String getPartType() {
        return partType;
    }

    public void setPartType(String partType) {
        this.partType = partType;
    }




    public int getTrayId() {
        return (int) trayId;
    }

    public void setTrayId(Long trayId) {
        this.trayId = trayId;
    }
}
