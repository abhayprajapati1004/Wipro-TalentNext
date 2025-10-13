package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayAllEmpData {

    // --- Database connection details - Change these to match your environment ---
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE"; // Or ORCL, etc.
    private static final String USER = "scott";
    private static final String PASS = "tiger";
    // -------------------------------------------------------------------------

    public static void main(String[] args) {
        String sql = "SELECT empno, ename FROM emp";

        // Using try-with-resources to automatically close the connection, statement, and result set
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("Successfully connected to the database.");
            System.out.println("Employee Details:");
            System.out.println("--------------------");
            System.out.println("EMPNO (by index) | ENAME (by name)");
            System.out.println("--------------------");

            // Loop through the result set and display the data
            while (rs.next()) {
                // Retrieve by column index for the first column
                int empno = rs.getInt(1);

                // Retrieve by column name for the second column
                String ename = rs.getString("ename");

                System.out.printf("%-16d | %s%n", empno, ename);
            }

        } catch (SQLException e) {
            System.err.println("Database connection or query failed.");
            e.printStackTrace();
        }
    }
}
