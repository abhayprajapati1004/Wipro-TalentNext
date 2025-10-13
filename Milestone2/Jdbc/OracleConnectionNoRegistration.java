package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnectionNoRegistration {

    public static void main(String[] args) {
        final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
        final String USER = "abhishek";
        final String PASS = "1111";

        Connection conn = null;

        try {
            // The driver registration line is now commented out.
            // Class.forName("oracle.jdbc.driver.OracleDriver");

            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            if (conn != null) {
                System.out.println("Connection Established successfully");
            }

        } catch (SQLException e) {
            System.out.println("Connection could not be established");
            System.out.println("Exception description: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}