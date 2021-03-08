import java.sql.*;

public class Ticket extends User {
    private static final String SELECT_ROUTE_FROM = "SELECT route_from FROM buses WHERE bus_id = ?";
    private static final String SELECT_ROUTE_TO = "SELECT route_to FROM buses WHERE bus_id = ?";
    private static final String SELECT_DEPART_DATE = "SELECT depart_date FROM buses WHERE bus_id = ?";
    private static final String SELECT_DEPART_TIME = "SELECT depart_time FROM buses WHERE bus_id = ?";
    private static final String SELECT_ARRIVE_DATE = "SELECT arrive_date FROM buses WHERE bus_id = ?";
    private static final String SELECT_ARRIVE_TIME = "SELECT arrive_time FROM buses WHERE bus_id = ?";

    private String url = "jdbc:postgresql://localhost:5432/Bus Ticket Reservation System";
    private String user = "postgres";
    private String password = "dukabest";
    private int ticketId;
    private int busId;
    private String fName;
    private String sName;
    private String bin;

    // Constructor
    public Ticket(int busId, String fName, String sName, String bin) {
        this.busId = busId;
        this.fName = fName;
        this.sName = sName;
        this.bin = bin;
        ticketId += 1;
    }
    public void findForTicketRouteFrom(int busId) throws SQLException {
        //Establishing a Connection
        try (Connection connection = DriverManager
                .getConnection(url, user, password);
             //Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ROUTE_FROM)) {
            preparedStatement.setInt(1, busId);
            //Execute the query
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                System.out.println("FROM: " + rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void findForTicketRouteTo(int busId) throws SQLException {
        //Establishing a Connection
        try (Connection connection = DriverManager
                .getConnection(url, user, password);
             //Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ROUTE_TO)) {
            preparedStatement.setInt(1, busId);
            //Execute the query
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                System.out.println("TO: " + rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void findForTicketDepartDate(int busId) throws SQLException {
        //Establishing a Connection
        try (Connection connection = DriverManager
                .getConnection(url, user, password);
             //Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_DEPART_DATE)) {
            preparedStatement.setInt(1, busId);
            //Execute the query
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                System.out.println("DEPART DATE: " + rs.getDate(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void findForTicketDepartTime(int busId) throws SQLException {
        //Establishing a Connection
        try (Connection connection = DriverManager
                .getConnection(url, user, password);
             //Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_DEPART_TIME)) {
            preparedStatement.setInt(1, busId);
            //Execute the query
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                System.out.println("DEPART TIME: " + rs.getTime(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void findForTicketArriveDate(int busId) throws SQLException {
        //Establishing a Connection
        try (Connection connection = DriverManager
                .getConnection(url, user, password);
             //Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ARRIVE_DATE)) {
            preparedStatement.setInt(1, busId);
            //Execute the query
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                System.out.println("ARRIVE DATE: " + rs.getDate(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void findForTicketArriveTime(int busId) throws SQLException {
        //Establishing a Connection
        try (Connection connection = DriverManager
                .getConnection(url, user, password);
             //Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ARRIVE_TIME)) {
            preparedStatement.setInt(1, busId);
            //Execute the query
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                System.out.println("ARRIVE TIME: " + rs.getTime(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void printTicket(int busId) {

        System.out.print("*****************************************\n" +
                "BUS TICKET " +
                "\nBus ID: " + busId +
                "\n*****************************************\n" +
                "Name: " + fName +
                "\nSurname: " + sName +
                "\nBIN: " + bin + "\n*****************************************\n" +
                "From: ");
        try {
            findForTicketRouteFrom(busId);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.print("\nTo: ");

        try {
            findForTicketRouteTo(busId);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.print("\n*****************************************\nDepart Date: ");

        try {
            findForTicketDepartDate(busId);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.print("Depart Time: ");

        try {
            findForTicketDepartTime(busId);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.print("Arrive Date: ");

        try {
            findForTicketArriveDate(busId);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.print("Arrive Time: ");

        try {
            findForTicketArriveTime(busId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
