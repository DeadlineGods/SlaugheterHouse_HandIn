package via.sdj3.animalregistrationsystem_sdj3.model;

import java.util.ArrayList;
import java.util.Date;

public class Animal {

    private Date arriveDate;
    private double weight;
    private int animalNo;
    private ArrayList<Part> parts;

    public Animal(double weight, int animalNo, Date arriveDate) {
        this.animalNo = animalNo;
        this.weight = weight;
        this.arriveDate = arriveDate;
        parts = new ArrayList<>();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAnimalNo() {
        return animalNo;
    }

    public void setAnimalNo(int animalNo) {
        this.animalNo = animalNo;
    }

    public Date getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(Date arriveDate) {
        this.arriveDate = arriveDate;
    }

    public ArrayList<Part> getParts() {
        return parts;
    }

    public void setParts(ArrayList<Part> parts) {
        this.parts = parts;
    }
}
