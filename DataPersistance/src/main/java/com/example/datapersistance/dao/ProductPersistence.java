package com.example.datapersistance.dao;

import com.example.datapersistance.protobuf.*;

import java.sql.SQLException;

public interface ProductPersistence
{
    void saveProduct(long registrationNo, long trayId, int partNo) throws SQLException;
    void updateProduct(long registrationNo, long trayId, int partNo) throws SQLException;
    void deleteByRegNoProduct(long registrationNo) throws SQLException;
    FindByRegNoResponseProduct findByRegNo(long registrationNo) throws SQLException;
    ResponseFindAllProduct findAllProduct() throws SQLException;
    ResponseGetMaxIdProduct getMAxIdProduct() throws SQLException;
}
