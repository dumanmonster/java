import java.sql.SQLException;

public class Administrator implements Person {
    private String name;
    private String surname;
    private String username;
    private String password;

    // Constructor
    public Administrator(String name, String surname, String username, String password) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
    }

    // Getter-setters for each variable
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
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
        sqlUpdate.updateRoute();
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
