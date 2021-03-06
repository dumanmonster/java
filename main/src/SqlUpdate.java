import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlUpdate {
    private static final String UPDATE_ROUTE_SQL = "UPDATE buses SET routefrom = ?, routeto = ? WHERE busId = ?;";

    // To update bus routes
    public void updateRoute(String startPoint, String endPoint, int busId) throws SQLException {
        try (Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/Bus Ticket Reservation System", "postgres", "passwordforedb_0210");
             //Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_ROUTE_SQL)) {
            preparedStatement.setString(1, startPoint);
            preparedStatement.setString(2, endPoint);
            preparedStatement.setInt(3, busId);
            //Execute the query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static final String UPDATE_BUS_SQL = "UPDATE buses SET bus_space = bus_space - 1 WHERE bus_id = ?;";

    // To update bus spaces
    public void updateBusSpace(int busId) throws SQLException {
        try (Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/Bus Ticket Reservation System", "postgres", "passwordforedb_0210");
             //Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BUS_SQL)) {
            preparedStatement.setInt(1, busId);
            //Execute the query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
