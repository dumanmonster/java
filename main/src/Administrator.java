import java.sql.SQLException;

public class Administrator{
    private String login;
    private String email;
    private String password;

    // Constructor
    public Administrator(String login, String email, String password){
        this.email= email;
        this.password = password;
        this.login = login;
    }

    public void orderTicket(int busId) {

    }

    public void returnTicket(int ticketId) {
        //
    }

    public void printTicket(int ticketId) {
    }

    // Need to add Login

    // Adds customer to Database
    public void updateRoute(String startPoint, String endPoint, int busId) throws SQLException{
        SqlUpdate sqlUpdate = new SqlUpdate();
        sqlUpdate.updateRoute(startPoint, endPoint, busId);
    }

    // Adds customer to Database
    public void updatePayment(String startPoint, String endPoint, int busId) throws SQLException{
        SqlUpdate sqlUpdate = new SqlUpdate();
        sqlUpdate.updateRoute(startPoint, endPoint, busId);
    }

    // Adds customer to Database
    public void updateBus(int busId) throws SQLException{
        SqlUpdate sqlUpdate = new SqlUpdate();
        sqlUpdate.updateBusSpace(busId);
    }
}
