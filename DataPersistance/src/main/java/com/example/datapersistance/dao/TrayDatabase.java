package com.example.datapersistance.dao;

import com.example.datapersistance.protobuf.FindByIdResponseAnimal;
import com.example.datapersistance.protobuf.TrayData;
import com.example.datapersistance.protobuf.TrayFindAllResponse;
import com.example.datapersistance.protobuf.TrayFindByIdResponse;
import org.lognet.springboot.grpc.GRpcService;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@GRpcService
public class TrayDatabase implements TrayPersistence {

    public TrayDatabase() throws SQLException {
        DriverManager.registerDriver(new org.postgresql.Driver());
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

    @Override
    public void save(long trayId, double maxWeightCapacity) throws SQLException {
        Connection connection = getConnection();
        try {

            PreparedStatement statement = connection.prepareStatement("INSERT INTO tray(maxweightcapacity) VALUES (?)");
            statement.setDouble(1, maxWeightCapacity);
            statement.execute();

        }  catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }

    @Override
    public TrayFindByIdResponse findById(long id) throws SQLException {
        TrayFindByIdResponse response = null;
        Connection connection = getConnection();

        try {

            PreparedStatement statement = connection.prepareStatement("SELECT * FROM tray WHERE trayno = ?");
            statement.setLong(1, id);

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                TrayData trayData = TrayData.newBuilder()
                        .setTrayId(resultSet.getLong("trayno"))
                        .setMaxWeightCapacity(resultSet.getDouble("maxweightcapacity"))
                        .build();
                response  = TrayFindByIdResponse.newBuilder().setTray(trayData).build();
            }

        }  catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }

        return response;
    }

    @Override
    public void update(long trayId, double maxWeightCapacity) throws SQLException {
        Connection connection = getConnection();

        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE tray SET maxweightcapacity = ? WHERE trayno = ?");

            statement.setDouble(1, maxWeightCapacity);
            statement.setLong(2, trayId);

            statement.execute();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            connection.close();
        }
    }

    @Override
    public void delete(long id) throws SQLException {
        Connection connection = getConnection();
        try {

            PreparedStatement statement = connection.prepareStatement("""
                    DELETE from product_part_join
                    WHERE registrationno in (
                        SELECT p.registrationno
                        FROM product p,
                             tray t
                                 join product p2 on t.trayno = p2.trayno
                        WHERE p2.trayno = ?
                    )
                    """);

            statement.setLong(1, id);
            statement.execute();

            statement = connection.prepareStatement("""
                    DELETE FROM part WHERE animalNo = ?
                    """);

            statement.setLong(1, id);
            statement.execute();

            statement = connection.prepareStatement("""
                    DELETE FROM animal WHERE animalNo = ?
                    """);

            statement.setLong(1, id);

            statement = connection.prepareStatement("DELETE FROM tray WHERE trayno = ?");
            statement.setLong(1, id);
            statement.execute();

        }  catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }

    @Override
    public TrayFindAllResponse findAllAnimal() throws SQLException {
        TrayFindAllResponse response = null;
        Connection connection = getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM tray");

            ResultSet resultSet = preparedStatement.executeQuery();
            List<TrayData> trayDataList = new ArrayList<>();
            while (resultSet.next()) {
                TrayData trayData = TrayData.newBuilder()
                        .setTrayId(resultSet.getLong("trayno"))
                        .setMaxWeightCapacity(resultSet.getDouble("maxweightcapacity"))
                        .build();

                trayDataList.add(trayData);
            }
            response = TrayFindAllResponse.newBuilder().addAllTrays(trayDataList).build();
        }  catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
        return response;
    }
}
