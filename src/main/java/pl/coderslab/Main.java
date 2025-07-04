package pl.coderslab;

import pl.coderslab.util.DbUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {

    }
}







//        try (Connection conn = DbUtil.getConnection();
//             Statement stat = conn.createStatement()) {
//            ResultSet resultSet = stat.executeQuery("select id, email from users");
//
//            String[] columns = {"id", "email"};
//
//            while (resultSet.next()) {
//                for (String column : columns) {
//                    System.out.print(resultSet.getString(column) + " ");
//                }
//                System.out.println();
//            }
//        }