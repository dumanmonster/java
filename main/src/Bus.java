import javax.xml.transform.Result;
import java.sql.*;
import java.text.SimpleDateFormat;

public class Bus {
    private int busId;
    private String startPoint;
    private String endPoint;
    private SimpleDateFormat date;
    private SimpleDateFormat time;
    private static final String SHOWING_TIMETABLE_SQL = "SELECT busId, date, time FROM buses WHERE startPoint = ? and endPoint = ?";
    public Bus(){
    }
    public void showAll() throws SQLException {
        try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Bus Ticket Reservation System", "postgres", "dukabest");
            Statement stmt = connection.createStatement();) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM buses");
            int i = 1;
            while (rs.next()){
                System.out.println("__________________________________________");
                System.out.println(i + ". BUSID: " + rs.getInt(1) + "|FROM " + rs.getString(2) + " TO " + rs.getString(3) + "|DATE: " + rs.getDate(4) + " TIME: " + rs.getTime(5) + "|");
                i++;

            }
        }catch (SQLException e){
                e.printStackTrace();
        }

    }
    public void showTime(String startPoint, String endPoint) throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Bus Ticket Reservation System", "postgres", "dukabest");
             //Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SHOWING_TIMETABLE_SQL)) {
            preparedStatement.setString(1, startPoint);
            preparedStatement.setString(2, endPoint);
            ResultSet rs = preparedStatement.executeQuery();
            int i = 1;
            while (rs.next()){
                System.out.println("__________________________________________");
                System.out.println(i + ". BusNo: " + rs.getInt(1) + " | DATE: " + rs.getDate(2) + "| TIME: " + rs.getTime(3));
                i++;
            }
            System.out.println("__________________________________________");
            //Execute the query



        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}



