package com.example.datapersistance.dao;

import com.example.datapersistance.protobuf.*;
import org.checkerframework.checker.units.qual.A;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.context.annotation.Primary;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;

import static java.sql.DriverManager.getConnection;

@GRpcService
@Primary
public class PartDatabase implements PartPersistence{

    public PartDatabase() throws SQLException
    {
        DriverManager.registerDriver(new org.postgresql.Driver());
    }

    @Override
    public void save(double weight, String name, long animalNo, long trayId) throws SQLException {
        Connection connection = getConnection();
        try
        {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO part(weight, name, animalno, trayno) VALUES (?, ?, ?, ?)");

            statement.setDouble(1, weight);
            statement.setString(2, name);
            statement.setLong(3, animalNo);
            statement.setLong(4, trayId);

            statement.execute();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            connection.close();
        }

    }

    @Override
    public FindByIdResponsePart findByIdPart(long id) throws SQLException {
        FindByIdResponsePart response = null;
        Connection connection = getConnection();

        try
        {
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * " +
                            "FROM part " +
                            "WHERE partno = ?");
            statement.setLong(1, id);

            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next())
            {
                response = FindByIdResponsePart.newBuilder()
                        .setWeight(resultSet.getDouble("weight"))
                        .setName(resultSet.getString("name"))
                        .setAnimalNo(resultSet.getLong("animalno"))
                        .setPartno(resultSet.getInt("partno"))
                        .setTrayId(resultSet.getLong("trayno"))
                        .build();
            }
        }
        finally {
            connection.close();
        }

        return response;
    }

    @Override
    public void update(int id, double weight, String name, long animalNo) throws SQLException {
        Connection connection = getConnection();

        try {
            PreparedStatement statement = connection.prepareStatement("""
                    UPDATE part
                    SET weight = ?, name = ?, animalno
                    WHERE partno = ?;
                    """);

            statement.setDouble(1, weight);
            statement.setString(2, name);
            statement.setInt(3, id);


            statement.execute();
        } finally {
            connection.close();
        }
    }

    @Override
    public void delete(int id) throws SQLException {
        Connection connection = getConnection();

        try {
            PreparedStatement statement = connection.prepareStatement("""
                    DELETE FROM product_part_join WHERE partno = ?
                    """);

            statement.setInt(1, id);
            statement.execute();

            statement = connection.prepareStatement("""
                    DELETE FROM product WHERE partno = ?
                    """);

            statement.setInt(1, id);
            statement.execute();

            statement = connection.prepareStatement("""
                    DELETE FROM part WHERE partno = ?
                    """);

            statement.setInt(1, id);
            statement.execute();


        } finally {
            connection.close();
        }
    }

    @Override
    public AllParts findAllParts() throws SQLException {
        AllParts response;
        Connection connection = getConnection();
        try
        {
            PreparedStatement statement = connection.prepareStatement("""
            SELECT *
            FROM part
            """);

            List<PartMessage> parts = new ArrayList<>();
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next())
            {
                PartMessage partMessage;
                partMessage = PartMessage.newBuilder()
                        .setPartno(resultSet.getInt("partno"))
                        .setWeight(resultSet.getDouble("weight"))
                        .setName(resultSet.getString("name"))
                        .setAnimalNo(resultSet.getLong("animalno"))
                        .setTrayId(resultSet.getLong("trayno"))
                        .build();
                parts.add(partMessage);
            }
            response = AllParts.newBuilder().addAllParts(parts).build();
        }
        finally {
            connection.close();
        }
        return response;
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
