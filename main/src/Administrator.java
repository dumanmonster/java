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
    public void updateRoute() throws SQLException {
        SqlUpdate sqlUpdate = new SqlUpdate();
        // sqlUpdate.updateRoute();
    }

    /**
    // Adds customer to Database
    public void updatePayment() {
        SqlUpdate sqlUpdate = new SqlUpdate();
        sqlUpdate.updatePayment();
    } */

    // Adds customer to Database
    public void updateBus(int busSpaces, int busId) throws SQLException{
        SqlUpdate sqlUpdate = new SqlUpdate();
        sqlUpdate.updateBus(busSpaces, busId);
    }
}
