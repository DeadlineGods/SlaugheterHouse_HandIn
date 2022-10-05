package via.sdj3.animalregistrationsystem_sdj3.model;

public class Part {
    private double weight;
    private int partNo;
    private String name;
    private Animal fromAnimal;

    public Part(double weight, int partNo, String name) {
        this.weight = weight;
        this.partNo = partNo;
        this.name = name;
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


    public Animal getAnimal() {
        return fromAnimal;
    }

    public void setAnimal(Animal fromAnimal) {
        this.fromAnimal = fromAnimal;
    }
}
