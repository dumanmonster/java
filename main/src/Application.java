import org.postgresql.util.PSQLException;

import java.lang.ref.Cleaner;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
        Bus b = new Bus();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat DATE = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat TIME = new SimpleDateFormat("hh:mm:ss");
        System.out.print("\n*****\n" + "Добро пожаловать в приложение бронирования билетов на автобусы\n");;
        System.out.print("\n************* РАСПИСАНИЕ *************\n");
        b.showAll();
        System.out.print("\nНапишите город отправки: ");
        String startPoint = scanner.next();
        System.out.print("\nНапишите город прибытия: ");
        String endPoint = scanner.next();
        b.showTime(startPoint, endPoint);
        System.out.print("\nВыберите удобную дату: " );
        String date = scanner.next();
        System.out.print("\nВыберите удобное время: ");
        String time = scanner.next();
        Date date1 = null;
        Date time2 = null;
        try {
            time2 = TIME.parse(time);
            date1 = DATE.parse(date);
        }catch (ParseException e){
            e.printStackTrace();
        }





    }
}
