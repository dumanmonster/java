import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlInsert {
    private static final String INSERT_USERS_SQL = "INSERT INTO users(login, email, password)" +
            "VALUES " +
            " (?, ?, ?);";

    public void addUser(String login, String email, String password) throws SQLException {
        //Establishing a Connection
        try (Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/Bus Ticket Reservation System", "postgres", "passwordforedb_0210");
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
        System.out.println("User is added");
    }

    private static final String INSERT_PERSON_SQL = "INSERT INTO persons(fname, sname, bin, gender)" +
            "VALUES" +
            "(?, ?, ?, ?);";

    public void addPerson(String fName, String sName, String bin, String gender) throws SQLException {
        try (Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/Bus Ticket Reservation System", "postgres", "passwordforedb_0210");
             //Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PERSON_SQL)) {
            preparedStatement.setString(1, fName);
            preparedStatement.setString(2, sName);
            preparedStatement.setString(3, bin);
            preparedStatement.setString(4, gender);
            //Execute the query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Person is added");
    }
}