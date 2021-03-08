import java.sql.SQLException;

public class Administrator {
    private String login;
    private String email;
    private String password;

    // Constructor
    public Administrator(String login, String email, String password) {
        this.email = email;
        this.password = password;
        this.login = login;
    }

    // Adds customer to Database
    public void updateRoute(String startPoint, String endPoint, int busId) throws SQLException {
        SqlUpdate sqlUpdate = new SqlUpdate();
        sqlUpdate.updateRoute(startPoint, endPoint, busId);
    }

    // Adds customer to Database
    public void updatePayment(String startPoint, String endPoint, int busId) throws SQLException {
        SqlUpdate sqlUpdate = new SqlUpdate();
        sqlUpdate.updateRoute(startPoint, endPoint, busId);
    }

    // Adds customer to Database
    public void updateBus(int busId) throws SQLException {
        SqlUpdate sqlUpdate = new SqlUpdate();
        sqlUpdate.updateBusSpace(busId);
    }
}
