package via.sdj3.animalregistrationsystem_sdj3.model;

public class Part {
    private double weight;
    private int partNo;
    private String name;
    private Long animalNo;

    public Part(double weight, int partNo, String name, Long animalNo) {
        this.weight = weight;
        this.partNo = partNo;
        this.name = name;
        this.animalNo = animalNo;
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


    public Long getAnimal() {
        return animalNo;
    }

    public void setAnimal(Long animalNo) {
        this.animalNo = animalNo;
    }
}
