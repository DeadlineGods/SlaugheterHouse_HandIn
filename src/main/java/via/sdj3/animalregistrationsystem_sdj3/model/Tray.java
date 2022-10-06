package via.sdj3.animalregistrationsystem_sdj3.model;

import java.util.ArrayList;

public class Tray {
    private double maxWeightCapacity;
    private long trayId;



    public Tray(long trayId,double maxWeightCapacity) {
        this.maxWeightCapacity = maxWeightCapacity;
        this.trayId=trayId;
    }

    public double getMaxWeightCapacity() {
        return maxWeightCapacity;
    }

    public void setMaxWeightCapacity(double maxWeightCapacity) {
        this.maxWeightCapacity = maxWeightCapacity;
    }

    public int getTrayId() {
        return (int) trayId;
    }

    public void setTrayId(Long trayId) {
        this.trayId = trayId;
    }
}
