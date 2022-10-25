package via.sdj3.animalregistrationsystem_sdj3.model;

public class Tray {
    private double maxWeightCapacity;
    private Long trayId;

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

    public long getTrayId() {
        return  trayId;
    }

    public void setTrayId(Long trayId) {
        this.trayId = trayId;
    }
}
