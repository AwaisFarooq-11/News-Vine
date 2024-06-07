package src.business;

import java.sql.Connection;
import java.sql.SQLException;

import src.technical.DatabaseUtil;

public class TestConnection {

    public static void main(String[] args) {
        try (Connection conn = DatabaseUtil.getConnection()) {
            if (conn != null) {
                System.out.println("Connection established successfully!");
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
