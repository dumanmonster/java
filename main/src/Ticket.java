import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ticket extends Client {
    private int ticketId;
    ArrayList<Bus> busArrayList = new ArrayList<>();

    public Ticket(String name, String surname, String bin, String password, String phone) {
        super(name, surname, bin, password, phone);
    }


}
