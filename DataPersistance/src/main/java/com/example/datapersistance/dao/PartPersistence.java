package com.example.datapersistance.dao;

import com.example.datapersistance.protobuf.AllParts;
import com.example.datapersistance.protobuf.FIndByIdRequestPart;
import com.example.datapersistance.protobuf.FindByIdResponsePart;

import java.sql.SQLException;

public interface PartPersistence {

    void save(double weight, String name, long animalNo) throws SQLException;
    FindByIdResponsePart findByIdPart(int id) throws SQLException;
    void update(int id, double weight, String name, long animalNo) throws SQLException;
    void delete(int id) throws SQLException;
    AllParts findAllParts() throws SQLException;

}
