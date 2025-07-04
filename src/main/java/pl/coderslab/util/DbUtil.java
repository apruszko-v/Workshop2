package pl.coderslab.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/workshop2?useSSL=false&characterEncoding=utf8";
    private static final String DB_USER = "new root";
    private static final String DB_PASSWORD = "coderslab";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

}
