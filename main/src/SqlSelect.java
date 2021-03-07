import java.sql.*;

public class SqlSelect {
    private static final String SELECT_ALL_BUS_SQL = "SELECT * FROM buses";
    private String url = "jdbc:postgresql://localhost:5432/Bus Ticket Reservation System";
    private String user = "postgres";
    private String password = "dukabest";


    // Outputs all info about BUSES from database
    public void findBusesFULL() throws SQLException {
        //Establishing a Connection
        try (Connection connection = DriverManager
                .getConnection(url, user, password);
             //Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BUS_SQL)) {
            //Execute the query
            ResultSet rs = preparedStatement.executeQuery();
            int i = 1;
            while (rs.next()){
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println(i+"| busId: " + rs.getInt(1) +
                        " | FROM: " + rs.getString(2) + " | TO: " + rs.getString(3) + " | DEPART DATE: " +
                        rs.getDate(4) + " | TIME: " + rs.getTime(5) + " | ARRIVE DATE: " +
                        rs.getDate(6) + " | TIME: " + rs.getTime(7) + " | AVAILABLE SPACE: " + rs.getInt(9) + " |");
                i++;
            }
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // For ticket
    private static final String SELECT_ROUTE_FROM = "SELECT route_from FROM buses WHERE bus_id = ?";
    private static final String SELECT_ROUTE_TO = "SELECT route_to FROM buses WHERE bus_id = ?";
    private static final String SELECT_DEPART_DATE = "SELECT depart_date FROM buses WHERE bus_id = ?";
    private static final String SELECT_DEPART_TIME = "SELECT depart_time FROM buses WHERE bus_id = ?";
    private static final String SELECT_ARRIVE_DATE = "SELECT arrive_date FROM buses WHERE bus_id = ?";
    private static final String SELECT_ARRIVE_TIME = "SELECT arrive_time FROM buses WHERE bus_id = ?";

    public void findForTicketRouteFrom(int busId) throws SQLException {
        //Establishing a Connection
        try (Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/Bus Ticket Reservation System", "postgres", "passwordforedb_0210");
             //Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ROUTE_FROM)) {
            preparedStatement.setInt(1, busId);
            //Execute the query
            ResultSet rs = preparedStatement.executeQuery();
            int i =1;
            while (rs.next()){
                System.out.println(i + ". ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void findForTicketRouteTo(int busId) throws SQLException {
        //Establishing a Connection
        try (Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/Bus Ticket Reservation System", "postgres", "passwordforedb_0210");
             //Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ROUTE_TO)) {
            preparedStatement.setInt(1, busId);
            //Execute the query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void findForTicketDepartDate(int busId) throws SQLException {
        //Establishing a Connection
        try (Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/Bus Ticket Reservation System", "postgres", "passwordforedb_0210");
             //Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_DEPART_DATE)) {
            preparedStatement.setInt(1, busId);
            //Execute the query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void findForTicketDepartTime(int busId) throws SQLException {
        //Establishing a Connection
        try (Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/Bus Ticket Reservation System", "postgres", "passwordforedb_0210");
             //Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_DEPART_TIME)) {
            preparedStatement.setInt(1, busId);
            //Execute the query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void findForTicketArriveDate(int busId) throws SQLException {
        //Establishing a Connection
        try (Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/Bus Ticket Reservation System", "postgres", "passwordforedb_0210");
             //Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ARRIVE_DATE)) {
            preparedStatement.setInt(1, busId);
            //Execute the query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

        public void findForTicketArriveTime(int busId) throws SQLException {
            //Establishing a Connection
            try (Connection connection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/Bus Ticket Reservation System", "postgres", "passwordforedb_0210");
                 //Create a statement using connection object
                 PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ARRIVE_TIME)) {
                preparedStatement.setInt(1, busId);
                //Execute the query
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
}
