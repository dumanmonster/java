import java.sql.SQLException;

public class Ticket extends User {
    private int ticketId;
    private int busId;
    private String fName;
    private String sName;
    private int bin = 0;

    // Constructor
    public Ticket(int busId, String fName, String sName, int bin) {
        this.busId = busId;
        this.fName = fName;
        this.sName = sName;
        this.bin = bin;
        ticketId += 1;
    }

    public void printTicket(int busId) {
        SqlSelect sel = new SqlSelect();

        System.out.print("\n*****\n" +
                "BUS TICKET" +
                "Bus ID: " + busId +
                "\n*****\n" +
                "Name: " + fName +
                "\nSurname: " + sName +
                "\nBIN: " + bin + "\n*****\n" +
                "From: ");
        try {
            sel.findForTicketRouteFrom(busId);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.print("\nTo: ");

        try {
            sel.findForTicketRouteTo(busId);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.print("\n*****\nDepart Date: ");

        try {
            sel.findForTicketDepartDate(busId);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.print("Depart Time: ");

        try {
            sel.findForTicketDepartTime(busId);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.print("Arrive Date: ");

        try {
            sel.findForTicketArriveDate(busId);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.print("Arrive Time: ");

        try {
            sel.findForTicketArriveTime(busId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
