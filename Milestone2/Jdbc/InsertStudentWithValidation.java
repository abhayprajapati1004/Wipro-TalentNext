package Jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InsertStudentWithValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Roll Number (4 digits): ");
            int rollno = Integer.parseInt(scanner.nextLine());
            if (rollno < 1000 || rollno > 9999) {
                System.out.println("Error: Rollno must be a 4-digit number.");
                return;
            }

            System.out.print("Enter Student Name (max 20 chars, uppercase): ");
            String name = scanner.nextLine();
            if (name.length() > 20 || !name.equals(name.toUpperCase()) || name.trim().isEmpty()) {
                System.out.println("Error: Student name must be non-empty, uppercase, and max 20 characters.");
                return;
            }
            
            System.out.print("Enter Standard (Roman numeral I-X): ");
            String standard = scanner.nextLine().toUpperCase();
            List<String> validStandards = Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X");
            if (!validStandards.contains(standard)) {
                System.out.println("Error: Standard must be a valid Roman numeral from I to X.");
                return;
            }

            System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
            String dobStr = scanner.nextLine();
            if (!Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$", dobStr)) {
                 System.out.println("Error: Date must be in YYYY-MM-DD format.");
                 return;
            }
            Date dob = Date.valueOf(dobStr);

            System.out.print("Enter Fees: ");
            double fees = Double.parseDouble(scanner.nextLine());
            if (fees < 0) {
                 System.out.println("Error: Fees cannot be negative.");
                 return;
            }
            
            insertStudent(rollno, name, standard, dob, fees);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number input for rollno or fees.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Invalid date format. Please use YYYY-MM-DD.");
        } finally {
            scanner.close();
        }
    }

    private static void insertStudent(int rollno, String name, String standard, Date dob, double fees) {
        String sql = "INSERT INTO student VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, rollno);
            pstmt.setString(2, name);
            pstmt.setString(3, standard);
            pstmt.setDate(4, dob);
            pstmt.setDouble(5, fees);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Student record inserted successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Database error: Could not insert record.");
            e.printStackTrace();
        }
    }
}
