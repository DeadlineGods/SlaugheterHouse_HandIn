package via.sdj3.animalregistrationsystem_sdj3.model;

import java.util.ArrayList;
import java.util.Date;

public class Animal {

    private Date arriveDate;
    private double weight;
    private Long animalNo;

    public Animal(Long animalNo,double weight, Date arriveDate) {
        this.animalNo = animalNo;
        this.weight = weight;
        this.arriveDate = arriveDate;
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

    public Date getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(Date arriveDate) {
        this.arriveDate = arriveDate;
    }

}
