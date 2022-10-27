package com.example.datapersistance.dao;

import com.example.datapersistance.protobuf.FindByRegNoResponseProduct;
import com.example.datapersistance.protobuf.ResponseFindAllProduct;
import com.example.datapersistance.protobuf.ResponseGetMaxIdProduct;

import java.sql.*;

public class ProductDatabase implements ProductPersistence{

    public ProductDatabase() throws SQLException
    {
        DriverManager.registerDriver(new org.postgresql.Driver());
    }

    @Override
    public void saveProduct(long registrationNo, long trayId, int partNo) throws SQLException {
        Connection connection = getConnection();
        //try {
         //   PreparedStatement statement = connection.prepareStatement("
           // INSERT INTO product(registrationno, weight, name, trayno) VALUES(?, ?, ?)");
        //}
        //catch ()
        //{

        //}
    }

    @Override
    public void updateProduct(long registrationNo, long trayId, int partNo) throws SQLException {

    }

    @Override
    public void deleteByRegNoProduct(long registrationNo) throws SQLException {

    }

    @Override
    public FindByRegNoResponseProduct findByRegNo(long registrationNo) throws SQLException {
        return null;
    }

    @Override
    public ResponseFindAllProduct findAllProduct() throws SQLException {
        return null;
    }

    @Override
    public ResponseGetMaxIdProduct getMAxIdProduct() throws SQLException {
        return null;
    }


    private Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/postgres?currentSchema=slaughterhouse";

        //Remember guys you have to have the same user and password in your postgres for this to work
        String user = "postgres";
        String pw = "admin";

        Connection connection = null;
        connection = DriverManager.getConnection(url, user, pw);

        return connection;
    }
}
