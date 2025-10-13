package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayFilteredEmpData {

    // --- Database connection details - Change these to match your environment ---
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USER = "scott";
    private static final String PASS = "tiger";
    // -------------------------------------------------------------------------

    public static void main(String[] args) {
        // SQL query to select specific columns with a WHERE clause
        String sql = "SELECT ename, job, sal, comm FROM emp WHERE sal > 1000 AND sal < 2000";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            System.out.println("Successfully connected to the database.");
            System.out.println("Employees with salary between 1000 and 2000:");
            System.out.println("-------------------------------------------------");
            System.out.format("%-10s | %-10s | %-8s | %s%n", "ENAME", "JOB", "SAL", "COMM");
            System.out.println("-------------------------------------------------");

            while (rs.next()) {
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                double sal = rs.getDouble("sal");
                double comm = rs.getDouble("comm");

                // Handle NULL values for commission for cleaner display
                String commissionDisplay = rs.wasNull() ? "N/A" : String.valueOf(comm);

                System.out.format("%-10s | %-10s | %-8.2f | %s%n", ename, job, sal, commissionDisplay);
            }

        } catch (SQLException e) {
            System.err.println("Database connection or query failed.");
            e.printStackTrace();
        }
    }
}
