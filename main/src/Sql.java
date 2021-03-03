import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Sql {
    /** private static final String LOGIN_CHECK_SQL = "";
     public void logger(String login, String password) throws SQLException {
     //Establishing a Connection
     try (Connection connection = DriverManager
     .getConnection("jdbc:postgresql://localhost:5432/BusTicketBooking", "postgres", "dukabest");
     //Create a statement using connection object
     PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
     preparedStatement.setString(1, login);
     preparedStatement.setString(2, email);
     preparedStatement.setString(3, password);
     //Execute the query
     preparedStatement.executeUpdate();
     } catch (SQLException e) {
     e.printStackTrace();

     }
     }*/
}
