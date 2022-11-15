package via.sdj3.animalregistrationsystem_sdj3.model;

public class Part {
    private double weight;
    private int partNo;
    private String name;
    private Long animalNo;
    private Long trayId;

    public Part() {

    }

    public Part(double weight, String name, Long animalNo, Long trayId) {
        this.weight = weight;
        this.name = name;
        this.animalNo = animalNo;
        this.trayId = trayId;
    }

    public Long getTrayId() {
        return trayId;
    }

    public void setTrayId(Long trayId) {
        this.trayId = trayId;
    }

    public Part(double weight, int partNo, String name, Long animalNo, Long trayId) {
        this.weight = weight;
        this.partNo = partNo;
        this.name = name;
        this.animalNo = animalNo;
        this.trayId=trayId;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPartNo() {
        return partNo;
    }

    public void setPartNo(int partNo) {
        this.partNo = partNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAnimalNo() {
        return animalNo;
    }

    public void setAnimalNo(Long animalNo) {
        this.animalNo = animalNo;
    }

}
