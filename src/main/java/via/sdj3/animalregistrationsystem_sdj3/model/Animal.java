package via.sdj3.animalregistrationsystem_sdj3.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Animal {

    private LocalDate arriveDate;
    private double weight;
    private Long animalNo;
    private String origin;

    public Animal(Long animalNo,double weight, String origin) {
        this.animalNo = animalNo;
        this.weight = weight;
        this.arriveDate = LocalDate.now();
        this.origin = origin;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Long getAnimalNo() {
        return animalNo;
    }

    public void setAnimalNo(Long animalNo) {
        this.animalNo = animalNo;
    }

    public LocalDate getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(LocalDate arriveDate) {
        this.arriveDate = arriveDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
