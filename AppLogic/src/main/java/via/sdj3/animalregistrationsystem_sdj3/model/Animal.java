package via.sdj3.animalregistrationsystem_sdj3.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Animal {

    private int year;
    private int month;
    private int day;
    private double weight;
    private Long animalNo;
    private String origin;
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }



    public Animal()
    {

    }
    public Animal(double weight, String origin, int year, int month, int day) {
        this.weight = weight;
        this.year=year;
        this.month = month;
        this.day = day;
        this.origin = origin;
    }

    public Animal(double weight, String origin, int day, int month, int year, long animalNo) {
        this.weight = weight;
        this.origin = origin;
        this.animalNo = animalNo;
        this.year = year;
        this.month = month;
        this.day = day;
        /*try {
            String dateString = String.format("%d/%d/%d", year, month, day);
            arriveDate = new SimpleDateFormat("yyyy/MM/dd").parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }*/
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

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
