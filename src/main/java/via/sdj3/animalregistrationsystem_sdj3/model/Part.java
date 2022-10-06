package via.sdj3.animalregistrationsystem_sdj3.model;

public class Part {
    private double weight;
    private int partNo;
    private String name;
    private Long animalNo;
    private Long trayNo;

    public Part(double weight, String name, Long animalNo, Long trayNo) {
        this.weight = weight;
        this.name = name;
        this.animalNo = animalNo;
        this.trayNo = trayNo;
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

    public Long getTrayNo() {
        return trayNo;
    }

    public void setTrayNo(Long trayNo) {
        this.trayNo = trayNo;
    }
}
