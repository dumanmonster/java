

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Customer{
    private String name;
    private String bin;
    private String phone;

    // Constructorп
    public Customer(String name, String bin, String phone) {
        this.name = name;
        this.bin = bin;
        this.phone = phone;
    }
    public void newCustomer() throws SQLException {
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


