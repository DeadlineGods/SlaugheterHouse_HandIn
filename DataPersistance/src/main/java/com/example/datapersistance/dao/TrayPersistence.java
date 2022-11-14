package com.example.datapersistance.dao;

import com.example.datapersistance.protobuf.TrayFindAllResponse;
import com.example.datapersistance.protobuf.TrayFindByIdResponse;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public interface TrayPersistence {

    void save(long trayId, double maxWeightCapacity) throws SQLException;

    TrayFindByIdResponse findById(long id) throws SQLException;

    void update(long trayId, double maxWeightCapacity) throws SQLException;

    void delete(long id) throws SQLException;

    TrayFindAllResponse findAllAnimal() throws SQLException;
}
