

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Client {
    private String name;
    private String bin;
    private String phone;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getBin() {
        return bin;
    }

    public String getPhone() {
        return phone;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Constructor
    public Client(String name, String bin, String phone) {
        this.name = name;
        this.bin = bin;
        this.phone = phone;
    }
    //method to add customer to DataBase
    public void newPassenger() throws SQLException {
        InsertStatement insertStatement = new InsertStatement();
        insertStatement.insertRecord(this.name, this.bin, this.phone);
    }

    public void orderTicket(int busId) {

    }

    public void returnTicket(int ticketId) {
        //
    }

    public void freeSpace(int busId) {
        // Сколько осталось мест
    }

    public void displayTable() {
        // Displays list of bus with destinations

    }

    public void deleteCustomer(int bin) {
        // SQL
    }


}


