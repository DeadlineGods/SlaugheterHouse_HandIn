package com.example.datapersistance.dao;

import com.example.datapersistance.protobuf.TrayFindAllResponse;
import com.example.datapersistance.protobuf.TrayFindByIdResponse;
import org.lognet.springboot.grpc.GRpcService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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

    }

    @Override
    public TrayFindByIdResponse findById(long id) throws SQLException {
        return null;
    }

    @Override
    public void update(long trayId, double maxWeightCapacity) throws SQLException {

    }

    @Override
    public void delete(long id) throws SQLException {

    }

    @Override
    public TrayFindAllResponse findAllAnimal() throws SQLException {
        return null;
    }
}
