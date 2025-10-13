package Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayStudent {

    public static void main(String[] args) {
        if (args.length == 0) {
            displayAllStudents();
        } else if (args.length == 1) {
            try {
                int rollno = Integer.parseInt(args[0]);
                displaySingleStudent(rollno);
            } catch (NumberFormatException e) {
                System.err.println("Error: Roll number must be a valid integer.");
            }
        } else {
            System.out.println("Usage: java DisplayStudent [rollno]");
        }
    }

    private static void displayAllStudents() {
        String sql = "SELECT * FROM student ORDER BY rollno";
        try (Connection conn = DBUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            printResults(rs);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void displaySingleStudent(int rollno) {
        String sql = "SELECT * FROM student WHERE rollno = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, rollno);
            try (ResultSet rs = pstmt.executeQuery()) {
                printResults(rs);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void printResults(ResultSet rs) throws SQLException {
        if (!rs.isBeforeFirst()) {
            System.out.println("No student records found.");
            return;
        }
        
        System.out.format("%-8s %-20s %-10s %-12s %s\n", "ROLLNO", "NAME", "STANDARD", "DOB", "FEES");
        System.out.println("------------------------------------------------------------------");
        
        while (rs.next()) {
            System.out.format("%-8d %-20s %-10s %-12s %.2f\n",
                    rs.getInt("rollno"),
                    rs.getString("studentname"),
                    rs.getString("standard"),
                    rs.getDate("dob"),
                    rs.getDouble("fees"));
        }
    }
}
