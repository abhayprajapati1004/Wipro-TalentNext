package Jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class InvokeNetSalaryProcedure {

    public static void main(String[] args) {
        String getAllEmployeesSql = "SELECT empno, ename FROM emp ORDER BY empno";
        String procedureCall = "{call calculate_net_salary(?, ?)}";

        // Using try-with-resources for automatic resource management
        try (Connection conn = DBUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(getAllEmployeesSql);
             CallableStatement cstmt = conn.prepareCall(procedureCall)) {

            System.out.println("Employee Net Salary Details:");
            System.out.println("----------------------------------------");
            System.out.format("%-8s | %-10s | %s\n", "EMPNO", "ENAME", "NET SALARY");
            System.out.println("----------------------------------------");

            // Register the OUT parameter before the loop
            cstmt.registerOutParameter(2, Types.DOUBLE);

            // Iterate through all employees
            while (rs.next()) {
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");

                // Set the IN parameter (empno) for the stored procedure
                cstmt.setInt(1, empno);

                // Execute the stored procedure
                cstmt.execute();

                // Get the value of the OUT parameter (net salary)
                double netSalary = cstmt.getDouble(2);

                // Display the results
                System.out.format("%-8d | %-10s | %.2f\n", empno, ename, netSalary);
            }
            System.out.println("----------------------------------------");

        } catch (SQLException e) {
            System.err.println("Database operation failed.");
            e.printStackTrace();
        }
    }
}
