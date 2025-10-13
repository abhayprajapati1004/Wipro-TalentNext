package Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteAndLogStudent {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java DeleteAndLogStudent <rollno>");
            return;
        }

        int rollnoToDelete = 0;
        try {
            rollnoToDelete = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("Error: Roll number must be an integer.");
            return;
        }

        Connection conn = null;
        try {
            conn = DBUtil.getConnection();
            conn.setAutoCommit(false); // Start transaction

            String selectSql = "SELECT studentname, standard FROM student WHERE rollno = ?";
            String logSql = "INSERT INTO studentlog VALUES (?, ?, ?, ?)";
            String deleteSql = "DELETE FROM student WHERE rollno = ?";
            
            String studentName = null;
            String standard = null;

            try (PreparedStatement selectPstmt = conn.prepareStatement(selectSql)) {
                selectPstmt.setInt(1, rollnoToDelete);
                try (ResultSet rs = selectPstmt.executeQuery()) {
                    if (rs.next()) {
                        studentName = rs.getString("studentname");
                        standard = rs.getString("standard");
                    }
                }
            }

            if (studentName != null) {
                try (PreparedStatement logPstmt = conn.prepareStatement(logSql)) {
                    logPstmt.setInt(1, rollnoToDelete);
                    logPstmt.setString(2, studentName);
                    logPstmt.setString(3, standard);
                    logPstmt.setDate(4, new java.sql.Date(System.currentTimeMillis()));
                    logPstmt.executeUpdate();
                }

                try (PreparedStatement deletePstmt = conn.prepareStatement(deleteSql)) {
                    deletePstmt.setInt(1, rollnoToDelete);
                    int rowsDeleted = deletePstmt.executeUpdate();
                    if (rowsDeleted > 0) {
                        conn.commit(); // Commit transaction
                        System.out.println("Student record deleted and logged successfully.");
                    }
                }
            } else {
                System.out.println("Student with roll number " + rollnoToDelete + " not found.");
            }

        } catch (SQLException e) {
            System.err.println("Database error occurred.");
            e.printStackTrace();
            if (conn != null) {
                try {
                    conn.rollback(); // Rollback on error
                    System.err.println("Transaction rolled back.");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}