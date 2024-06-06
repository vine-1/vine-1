import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionUtil {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Context context = new InitialContext();
            DataSource dataSource = (DataSource) context.lookup("java:comp/env/myds");
            connection = dataSource.getConnection();
            System.out.println(connection);
        } catch (NamingException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}