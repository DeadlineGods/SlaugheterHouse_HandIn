package com.example.datapersistance.dao;

import com.example.datapersistance.protobuf.*;
import com.google.protobuf.Descriptors;
import org.checkerframework.checker.units.qual.A;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.context.annotation.Primary;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@GRpcService
@Primary
public class AnimalDatabase implements AnimalPersistence {


    public AnimalDatabase() throws SQLException {
        DriverManager.registerDriver(new org.postgresql.Driver());
    }

    @Override
    public void save(double weight, String origin, int day, int month, int year) throws SQLException {
        Connection connection = getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO animal(weight, arrivedate, origin) VALUES(?, ?, ?)");

            statement.setDouble(1, weight);

            try {
                String dateString = String.format("%d/%d/%d", year, month, day);
                Date date = new SimpleDateFormat("yyyy/MM/dd").parse(dateString);
                java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                System.out.println("Arrival date: " + sqlDate);
                statement.setDate(2, sqlDate);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }

            statement.setString(3, origin);

            statement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }


    @Override
    public FindByIdResponseAnimal findByIdAnimal(long id) throws SQLException {

        FindByIdResponseAnimal response = null;
        Connection connection = getConnection();

        try {
            PreparedStatement statement = connection.prepareStatement("""
                    SELECT *
                    FROM animal
                    WHERE animalNo = ?    
                    """);
            statement.setLong(1, id);

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {

                java.sql.Date sqlDate = resultSet.getDate("arrivedate");

                response = FindByIdResponseAnimal.newBuilder()
                        .setWeight(resultSet.getFloat("weight"))
                        .setOrigin(resultSet.getString("origin"))
                        .setAnimalNo(resultSet.getLong("animalno"))
                        .setDay(sqlDate.getDay())
                        .setMonth(sqlDate.getMonth())
                        .setYear(sqlDate.getYear())
                        .build();


            }
        } finally {
            connection.close();
        }

        return response;
    }

    @Override
    public void update(long animalNo, double weight, String origin, int year, int month, int day) throws SQLException {
        Connection connection = getConnection();

        try {
            PreparedStatement statement = connection.prepareStatement("""
                    UPDATE animal
                    SET weight = ?, origin = ?, arrivedate = ?
                    WHERE animalNo = ?;
                    """);

            statement.setDouble(1, weight);
            statement.setString(2, origin);

            String dateString = String.format("%d/%d/%d", year, month, day);
            Date date = new SimpleDateFormat("yyyy/MM/dd").parse(dateString);
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            statement.setDate(3, sqlDate);

            statement.setLong(4, animalNo);

            statement.execute();
        } catch (ParseException e) {
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
                    DELETE FROM product_part_join WHERE partNo = (
                        Select partNo
                        FROM part
                        WHERE animalNo = ?
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
            statement.execute();
        } finally {
            connection.close();
        }

    }

    @Override
    public AllAnimals findAllAnimal() throws SQLException {
        AllAnimals response = null;
        Connection connection = getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("""
                    SELECT *
                    FROM animal 
                    """);

            List<AnimalMessage> animals = new ArrayList<>();
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                AnimalMessage animalMessage = null;
                java.sql.Date sqlDate = resultSet.getDate("arrivedate");
                animalMessage = AnimalMessage.newBuilder()
                        .setAnimalNo((resultSet.getLong("animalNo")))
                        .setWeight((resultSet.getFloat("weight")))
                        .setOrigin(resultSet.getString("origin"))
                        .setDay(sqlDate.getDay())
                        .setMonth(sqlDate.getMonth())
                        .setYear(sqlDate.getYear())
                        .build();


                animals.add(animalMessage);
            }
            response = AllAnimals.newBuilder().addAllAnimal(animals).build();
        } finally {
            connection.close();
        }
        return response;
    }

    @Override
    public AllAnimals findByDateAnimal(int year, int month, int day) throws SQLException {
        AllAnimals response = null;
        List<AnimalMessage> animals = new ArrayList<>();
        Connection connection = getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("""
                    SELECT *
                    FROM animal
                    WHERE arrivedate = ?
                    """);

            try {
                String dateString = String.format("%d/%d/%d", year, month, day);
                Date date = new SimpleDateFormat("yyyy/MM/dd").parse(dateString);
                java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                statement.setDate(1, sqlDate);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }

            ResultSet resultSet = statement.executeQuery();


            while (resultSet.next()) {
                java.sql.Date sqlDate = resultSet.getDate("arrivedate");
                AnimalMessage animalMessage = null;
                animalMessage = AnimalMessage.newBuilder()
                        .setAnimalNo((resultSet.getLong("animalNo")))
                        .setWeight((resultSet.getFloat("weight")))
                        .setOrigin(resultSet.getString("origin"))
                        .setDay(sqlDate.getDay())
                        .setMonth(sqlDate.getMonth())
                        .setYear(sqlDate.getYear())
                        .build();


                animals.add(animalMessage);
            }
            response = AllAnimals.newBuilder().addAllAnimal(animals).build();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
        return response;
    }

    @Override
    public GetMaxIdResponseAnimal getMaxIdAnimal() throws SQLException {
        GetMaxIdResponseAnimal response = null;
        Connection connection = getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("""
                    SELECT MAX(animalNo)
                    FROM animal
                    """);

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                response = GetMaxIdResponseAnimal.newBuilder().setMaxId(resultSet.getLong("max")).build();

            }
        } finally {
            connection.close();
        }
        return response;
    }

    @Override
    public AllAnimals findByOriginAnimal(String origin) throws SQLException {
        AllAnimals response = null;
        List<AnimalMessage> allAnimals = new ArrayList<>();
        Connection connection = getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("""
                    SELECT *
                    FROM animal
                    WHERE origin = ?
                    """);
            statement.setString(1, origin);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                java.sql.Date sqlDate = resultSet.getDate("arrivedate");

                AnimalMessage animalMessage = AnimalMessage.newBuilder()
                        .setWeight(resultSet.getFloat("weight"))
                        .setOrigin(resultSet.getString("origin"))
                        .setAnimalNo(resultSet.getLong("animalno"))
                        .setDay(sqlDate.getDay())
                        .setMonth(sqlDate.getMonth())
                        .setYear(sqlDate.getYear())
                        .build();
                allAnimals.add(animalMessage);
            }
            response = AllAnimals.newBuilder().addAllAnimal(allAnimals).build();
        } finally {
            connection.close();
        }
        return response;
    }

    @Override
    public Products findAllProductsFromAnimal(long animalNo) throws SQLException {
        List<ProductMessageAnimal> allProducts = new ArrayList<>();
        Products response = null;
        Connection connection = getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("""
                    SELECT *
                    FROM product
                    WHERE registrationno IN (
                        SELECT registrationno
                        FROM part_product
                        WHERE partno IN (
                            SELECT partno
                            FROM part
                            WHERE animalno = ?
                        )
                    )
                    """);
            statement.setLong(1, animalNo);
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


                ProductMessageAnimal productMessageAnimal = ProductMessageAnimal.newBuilder()
                        .setRegistrationNo(resultSet.getLong("registrationno"))
                        .setTrayId(resultSet.getLong("trayno"))
                        .addAllPartNo(partNos)
                        .build();
                allProducts.add(productMessageAnimal);
            }

            response = Products.newBuilder().addAllProducts(allProducts).build();
        } finally {
            connection.close();
        }
        return response;
    }

    @Override
    public AllAnimals getAnimalsInvolvedIntoProduct(long registrationNo) throws SQLException {
        Connection connection = getConnection();
        List<AnimalMessage> allAnimals = new ArrayList<>();
        AllAnimals response = null;
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT *\n" +
                    "FROM animal\n" +
                    "WHERE animalno IN (\n" +
                    "    SELECT animalno FROM part WHERE partno IN (\n" +
                    "        SELECT partno FROM part_product WHERE registrationno = ?\n" +
                    "        )\n" +
                    "    )");
            statement.setLong(1, registrationNo);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                java.sql.Date sqlDate = resultSet.getDate("arrivedate");

                AnimalMessage animalMessage = AnimalMessage.newBuilder()
                        .setWeight(resultSet.getFloat("weight"))
                        .setOrigin(resultSet.getString("origin"))
                        .setAnimalNo(resultSet.getLong("animalno"))
                        .setDay(sqlDate.getDay())
                        .setMonth(sqlDate.getMonth())
                        .setYear(sqlDate.getYear())
                        .build();
                allAnimals.add(animalMessage);
            }
            response = AllAnimals.newBuilder().addAllAnimal(allAnimals).build();

        } finally {
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
