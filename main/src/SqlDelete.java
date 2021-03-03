import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlDelete {
    private static final String DELETE_USERS_SQL = "DELETE from client where bin = ?;";

    public void deleteRecord(int binId) throws SQLException {
        try (Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/Bus Ticket Reservation System", "postgres", "dukabest");
             //Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USERS_SQL)) {
            preparedStatement.setInt(1, binId);
            //Execute the query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
