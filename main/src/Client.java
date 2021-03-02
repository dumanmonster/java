import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Client implements Person {
    private String name;
    private String surname;
    private String bin; // Is an universal id of citizen of Republic of Kazakhstan
    private String password; // For logging in the system
    private String phone;

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

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String getBin() {
        return bin;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    // Constructor
    public Client(String name, String surname, String bin, String phone) {
        this.name = name;
        this.surname = surname;
        this.bin = bin;
        this.phone = phone;
    }

    // Adds customer to Database
    public void newPassenger() throws SQLException {
        InsertStatement insertStatement = new InsertStatement();
        insertStatement.insertRecord(this.name, this.bin, this.phone);
    }

    public void orderTicket(int busId) {

    }

    public void returnTicket(int ticketId) {
        //
    }

    public void printTicket(int ticketId) {
    }

    // Displays how many free places are available in current transport
    public void freeSpace(int busId) {
        // Сколько осталось мест
    }

    // Displays table with buses with its' ids and their destination
    public void displayTable() {
        // Displays list of bus with destinations

    }

    // Deletes the user from database
    public void deleteCustomer(int bin) {
        // SQL
    }


}


