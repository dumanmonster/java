import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlSelect {
    private static final String SELECT_ALL_BUS_SQL = "SELECT * FROM buses";

    /* private static final String SELECT_ALL_USER_SQL = "SELECT * FROM users";
    private static final String SELECT_ALL_BUS_SQL = "SELECT * FROM buses";
    private static final String SELECT_ALL_TICKET_SQL = "SELECT * FROM tickets";
    private static final String SELECT_ALL_PERSON_SQL = "SELECT * FROM persons";
     */

    // Outputs all info about BUSES from database
    public void findBusesFULL() throws SQLException {
        //Establishing a Connection
        try (Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/Bus Ticket Reservation System", "postgres", "passwordforedb_0210");
             //Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BUS_SQL)) {
            //Execute the query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
