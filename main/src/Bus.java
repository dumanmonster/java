import javax.xml.transform.Result;
import java.sql.*;
import java.text.SimpleDateFormat;

public class Bus {
    private String url = "jdbc:postgresql://localhost:5432/Bus Ticket Reservation System";
    private String user = "postgres";
    private String password = "passwordforedb_0210";
    public static final String CHECK_SPACE_SQL = "SELECT available FROM buses WHERE bus_id = ?";
    public boolean checkAvailable(int busId){
        try (Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/Bus Ticket Reservation System", "postgres", "passwordforedb_0210");
             //Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(CHECK_SPACE_SQL)) {
            preparedStatement.setInt(1, busId);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                return rs.getBoolean(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
    private static final String UPDATE_ROUTE_SQL = "UPDATE buses SET route_from = ?, route_to = ? WHERE bus_id = ?;";

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



