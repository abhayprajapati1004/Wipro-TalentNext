package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {

    public static void main(String[] args) {
        // Database connection details
        // Note: Using 'XE' as the SID is common for Oracle Express Edition.
        // If you use a different SID, change it here (e.g., ORCL).
        final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
        final String USER = "abhishek";
        final String PASS = "1111";

        Connection conn = null;

        try {
            // Step 1: Register the Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Step 2: Establish the connection to the database
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            if (conn != null) {
                System.out.println("Connection Established successfully");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Connection could not be established");
            System.out.println("Exception description: Oracle JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection could not be established");
            System.out.println("Exception description: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Step 3: Close the connection
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
