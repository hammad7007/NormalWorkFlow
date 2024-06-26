import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SqlInjectionExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password")) {
            
            System.out.println("Enter username to search:");
            String username = scanner.nextLine();
            System.out.println(username);
            String query = "SELECT * FROM users WHERE username = '" + username + "'";
            Statement stmt = conn.createStatement();
            stmt.executeQuery(query);
            System.out.println("User data retrieved successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
