package ua.goit.util;

import lombok.experimental.UtilityClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public final class Database {
    private static final String DB_URL = "jdbc:postgresql://localhost:5438/test_database";
    private static final String DB_USER = "TestUser";
    private static final String DB_PASSWORD = "testpwd";

    private static Database instance;

    private Database(){}

    public static Database getInstance(){
        if (instance == null){
            instance = new Database();
        }
        return instance;
    }

    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
}
