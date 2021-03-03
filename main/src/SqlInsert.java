import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlInsert {
    private static final String INSERT_USERS_SQL = "INSERT INTO customers" +
            "  (name, bin, phone) VALUES " +
            " (?, ?, ?);";

    public void insertRecord(String name, String bin, String phone) throws SQLException {
        //Establishing a Connection
        try (Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/Bus Ticket Reservation System", "postgres", "dukabest");
             //Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, bin);
            preparedStatement.setString(3, phone);
            //Execute the query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}