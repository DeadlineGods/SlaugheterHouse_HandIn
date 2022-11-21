package com.example.datapersistance.dao;

import com.example.datapersistance.protobuf.*;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.context.annotation.Primary;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@GRpcService
@Primary
public class ProductDatabase implements ProductPersistence {

    public ProductDatabase() throws SQLException {
        DriverManager.registerDriver(new org.postgresql.Driver());
    }

    @Override
    public void saveProduct(long trayNo, List<Integer> partNo) throws SQLException {
        Connection connection = getConnection();
        long productId = 0;

        try {
            String sql = "INSERT INTO product (trayNo) VALUES (?)";

            PreparedStatement ps = connection.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);

            ps.setLong(1, trayNo);

            ps.execute();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                productId = rs.getInt(1);
            }

            for (int i = 0; i < partNo.size(); i++) {
                PreparedStatement statement = connection.prepareStatement("INSERT INTO part_product (partNo, registrationNo) VALUES (?, ?)");
                statement.setLong(1, partNo.get(i));
                statement.setLong(2, productId);
                statement.execute();
            }
        } finally {
            connection.close();
        }
    }

    @Override
    public void updateProduct(long registrationNo, long trayId, int partNo) throws SQLException {
        Connection connection = getConnection();

        try {
            PreparedStatement statement = connection.prepareStatement("""
                    UPDATE product
                    SET trayno = ?, partNo = ?
                    WHERE registrationno = ?;
                    """);

            statement.setLong(1, trayId);
            statement.setInt(2, partNo);
            statement.setLong(3, registrationNo);

            statement.execute();
        } finally {
            connection.close();
        }
    }

    @Override
    public void deleteByRegNoProduct(long registrationNo) throws SQLException {
        Connection connection = getConnection();

        try {
            PreparedStatement statement = connection.prepareStatement("""
                    DELETE FROM product WHERE registrationno = ?""");


            statement.setLong(1, registrationNo);
            statement.execute();

        } finally {
            connection.close();
        }
    }

    @Override
    public FindByRegNoResponseProduct findByRegNo(long registrationNo) throws SQLException {
        FindByRegNoResponseProduct response = null;
        Connection connection = getConnection();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT *\nFROM product\nWHERE registrationno = ?");
            statement.setLong(1, registrationNo);

            ResultSet resultSet = statement.executeQuery();
            ProductMessage productMessage;
            while (resultSet.next()) {

                statement = connection.prepareStatement("""
                        SELECT partno
                        FROM part_product
                        WHERE registrationno = ?
                        """);
                statement.setLong(1, resultSet.getLong("registrationno"));

                List<Integer> partNos = new ArrayList<>();
                ResultSet resultSetPartNos = statement.executeQuery();
                while (resultSetPartNos.next()) {
                    partNos.add((int) resultSetPartNos.getLong("partno"));
                }

                response = FindByRegNoResponseProduct.newBuilder()
                        .setRegistrationNo(resultSet.getLong("registrationno"))
                        .setTrayId(resultSet.getLong("trayno"))
                        .addAllPartNo(partNos)
                        .build();
            }
        } finally {
            connection.close();
        }

        return response;
    }

    @Override
    public ResponseFindAllProduct findAllProduct() throws SQLException {
        ResponseFindAllProduct response;
        Connection connection = getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("""
                    SELECT *
                    FROM product
                    """);

            List<ProductMessage> products = new ArrayList<>();
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                statement = connection.prepareStatement("""
                        SELECT partno
                        FROM part_product
                        WHERE registrationno = ?
                        """);
                statement.setLong(1, resultSet.getLong("registrationno"));

                List<Integer> partNos = new ArrayList<>();
                ResultSet resultSetPartNos = statement.executeQuery();
                while (resultSetPartNos.next()) {
                    partNos.add((int) resultSetPartNos.getLong("partno"));
                }

                ProductMessage productMessage;
                productMessage = ProductMessage.newBuilder()
                        .setRegistrationNo((resultSet.getLong("registrationno")))
                        .setTrayId(resultSet.getLong("trayno"))
                        .addAllPartNo(partNos)
                        .build();
                products.add(productMessage);
            }
            response = ResponseFindAllProduct.newBuilder().addAllProductList(products).build();
        } finally {
            connection.close();
        }
        return response;
    }

    @Override
    public ResponseGetMaxIdProduct getMAxIdProduct() throws SQLException {
        ResponseGetMaxIdProduct response = null;
        Connection connection = getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("""
                    SELECT MAX(registrationno)
                    FROM product
                    """);

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                response = ResponseGetMaxIdProduct.newBuilder().setMaxId(resultSet.getInt("max")).build();
            }
        } finally {
            connection.close();
        }
        return response;
    }

    /*@Override
    public ResponseAnimals getAnimalsInvolvedIntoProduct(long registrationNo) throws SQLException
    {
        Connection connection = getConnection();
        List<AnimalMessage> allAnimals = new ArrayList<>();
        ResponseAnimals response = null;
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT *\n" +
                    "FROM animal\n" +
                    "WHERE animalno IN (\n" +
                    "    SELECT animalno FROM part WHERE partno IN (\n" +
                    "        SELECT partno FROM part_product WHERE registrationno = ?\n" +
                    "        )\n" +
                    "    )");
            statement.setLong(1, registrationNo);
            ResultSet resultSet= statement.executeQuery();
            while(resultSet.next())
            {
                java.sql.Date sqlDate = resultSet.getDate("arrivedate");

                AnimalMessage animalMessage = AnimalMessage.newBuilder()
                        .setWeight(resultSet.getFloat("weight"))
                        .setOrigin(resultSet.getString("origin"))
                        .setAnimalNo(resultSet.getLong("animalno"))
                        .setDay(sqlDate.getDay())
                        .setMonth(sqlDate.getMonth())
                        .setYear(sqlDate.getYear())
                        .build();

                //response = ResponseAnimals.newBuilder().add
            }

        }
        finally {
            connection.close();
        }
        return response;
    }*/


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
