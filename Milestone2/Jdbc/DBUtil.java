package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USER = "scott";
    private static final String PASS = "tiger";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
}
