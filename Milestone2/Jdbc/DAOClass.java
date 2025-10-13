package Jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class DAOClass {

    public void insert(int rollno, String sname, String std, String dobStr, double fees) {
        String sql = "INSERT INTO student VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            java.util.Date utilDate = sdf.parse(dobStr);
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

            pstmt.setInt(1, rollno);
            pstmt.setString(2, sname);
            pstmt.setString(3, std);
            pstmt.setDate(4, sqlDate);
            pstmt.setDouble(5, fees);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Record inserted successfully.");
            }
        } catch (SQLException | ParseException e) {
            e.printStackTrace();
        }
    }

    public void delete(int rollno) {
        String sql = "DELETE FROM student WHERE rollno = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, rollno);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Record with rollno " + rollno + " deleted successfully.");
            } else {
                System.out.println("No record found with rollno " + rollno + ".");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void modify(int rollno, double newFees) {
        String sql = "UPDATE student SET fees = ? WHERE rollno = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setDouble(1, newFees);
            pstmt.setInt(2, rollno);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Fees for rollno " + rollno + " updated successfully.");
            } else {
                System.out.println("No record found with rollno " + rollno + ".");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void printStudentDetails(ResultSet rs) throws SQLException {
        System.out.format("%-8s %-20s %-10s %-12s %s\n", "ROLLNO", "NAME", "STANDARD", "DOB", "FEES");
        System.out.println("------------------------------------------------------------------");
         while (rs.next()) {
            System.out.format("%-8d %-20s %-10s %-12s %.2f\n",
                    rs.getInt("rollno"),
                    rs.getString("studentname"),
                    rs.getString("standard"),
                    rs.getDate("dob").toString(),
                    rs.getDouble("fees"));
        }
    }

    public void display(int rollno) {
        String sql = "SELECT * FROM student WHERE rollno = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, rollno);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (!rs.isBeforeFirst() ) {    
                    System.out.println("No record found for rollno " + rollno);
                    return;
                } 
                printStudentDetails(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void display() {
        String sql = "SELECT * FROM student ORDER BY rollno";
        try (Connection conn = DBUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (!rs.isBeforeFirst() ) {    
                System.out.println("No records found in the student table.");
                return;
            } 
            printStudentDetails(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}