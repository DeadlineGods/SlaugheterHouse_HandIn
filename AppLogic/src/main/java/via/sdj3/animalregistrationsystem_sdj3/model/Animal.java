package via.sdj3.animalregistrationsystem_sdj3.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Animal {

    private Date arriveDate;
    private double weight;
    private Long animalNo;
    private String origin;

    public Animal(double weight, String origin) {
        this.weight = weight;
        this.arriveDate = new Date();
        this.origin = origin;
    }

    public Animal(double weight, String origin, int day, int month, int year, long animalNo) {
        this.weight = weight;
        this.origin = origin;
        this.animalNo = animalNo;

        try {
            String dateString = String.format("%d/%d/%d", year, month, day);
            arriveDate = new SimpleDateFormat("yyyy/MM/dd").parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
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

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
