package ua.goit.service;

import ua.goit.util.Database;
import ua.goit.util.FileReader;

import java.nio.file.Path;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitService {
    public static void main(String[] args) {

        String initScript = new FileReader().readFile(Path.of("sql/init_db.sql"));

        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(initScript)) {
             statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException("Failed to execute SQL script",e);
        }

    }
}
