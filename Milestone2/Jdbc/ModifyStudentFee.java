package Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ModifyStudentFee {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java ModifyStudentFee <rollno> <new_fee>");
            return;
        }

        int rollno = 0;
        double newFee = 0.0;

        try {
            rollno = Integer.parseInt(args[0]);
            newFee = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.err.println("Error: Please provide a valid integer for rollno and a number for fee.");
            return;
        }

        String sql = "UPDATE student SET fees = ? WHERE rollno = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setDouble(1, newFee);
            pstmt.setInt(2, rollno);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Record for roll number " + rollno + " updated successfully.");
            } else {
                System.out.println("No student found with roll number " + rollno + ". No records updated.");
            }

        } catch (SQLException e) {
            System.err.println("Database error during update.");
            e.printStackTrace();
        }
    }
}
