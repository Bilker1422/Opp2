import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class postgres {
    private static final String url = "jdbc:postgresql://localhost/java";
    private static final String user = "postgres";
    private static final String pwd = "postgres";

    public Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(url, user, pwd);
            return connection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}