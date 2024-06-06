import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readServlet")
public class ReadUserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Connection connection;

    public void init() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "test");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("dopost()");
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM product");
            PrintWriter out = response.getWriter();
            out.print("<table border='1'>");
            out.print("<tr>");
            out.print("<th>Id</th>");
            out.print("<th>Name</th>");
            out.print("<th>Description</th>");
            out.print("<th>Price</th>");
            out.print("</tr>");
            while (resultSet.next()) {
                out.println("<tr>");
                out.println("<td bgcolor=\"lightblue\">" + resultSet.getString(1) + "</td>");
                out.println("<td bgcolor=\"lightblue\">" + resultSet.getString(2) + "</td>");
                out.println("<td bgcolor=\"lightblue\">" + resultSet.getString(3) + "</td>");
                out.println("<td bgcolor=\"lightblue\">" + resultSet.getString(4) + "</td>");
                out.println("</tr>");
            }
            out.print("</table>");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void destroy() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}