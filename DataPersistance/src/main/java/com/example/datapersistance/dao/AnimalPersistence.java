package com.example.datapersistance.dao;

import com.example.datapersistance.protobuf.FindByIdResponseAnimal;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public interface AnimalPersistence {

    void save(double weight, String origin, int day, int month, int year) throws SQLException;
    FindByIdResponseAnimal findByIdAnimal(long id) throws SQLException;

    void update(long animalNo, double weight, String origin, int year, int month, int day) throws SQLException;
    void delete(long id) throws SQLException;

}
