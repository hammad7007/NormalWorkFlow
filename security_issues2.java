import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HardcodedCredentialsExample {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin123";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Connected to the database successfully.");
            // Perform database operations
        } catch (SQLException e) {
            System.out.println("Database connection failed.");
            e.printStackTrace();
        }
    }
}
