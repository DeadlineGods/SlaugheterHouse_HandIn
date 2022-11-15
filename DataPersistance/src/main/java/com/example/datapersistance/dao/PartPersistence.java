package com.example.datapersistance.dao;

import com.example.datapersistance.protobuf.AllParts;
import com.example.datapersistance.protobuf.FindByIdResponsePart;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public interface PartPersistence {

    void save(double weight, String name, long animalNo, long trayId) throws SQLException;
    FindByIdResponsePart findByIdPart(long id) throws SQLException;
    void update(int id, double weight, String name, long animalNo) throws SQLException;
    void delete(int id) throws SQLException;
    AllParts findAllParts() throws SQLException;

}
