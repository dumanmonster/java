/** import org.postgresql.util.PSQLException; */

import java.lang.ref.Cleaner;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Validator v = new Validator();
        int input = 0;
        System.out.print("\n*****\n" +
                "Welcome to Bus Ticket Reservation System!\n" +
                "1. Check the routes table\n" +
                "2. Buy the ticket\n" +
                "3. Return the ticket\n" +
                "4. Print existing ticket\n" +
                "5. Log in\n" +
                "6. Register now\n" +
                "Please enter the id of operation you want to complete: ");

        try {
            input = scanner.nextInt();
        } catch (InputMismatchException e) {
            //Invalid input try again pls
            e.printStackTrace();
        }

        switch (input) {
            case 1: // Check the routes table
                SqlSelect sqlS = new SqlSelect();
                sqlS.findBusesFULL();
                break;

            case 2: // Buy the ticket
                System.out.print("\n*****\n" +
                        "Please, enter Bus ID: ");
                String userBusId = scanner.next();



                break;

            case 5: // Log in
                System.out.print("\n*****\n" +
                        "Please, choose the type of access to the system:\n" +
                        "1- User\n" +
                        "2- Administrator\n");

                int access = scanner.nextInt();

                switch (access) {
                    case 1: // If it's an user
                        System.out.print("\nLogin: ");
                        String clientLogin = scanner.next();

                        // Check if we have such login in database and if yes continue

                        System.out.print("\nPassword: ");
                        String clientPassword = scanner.next();

                        // Finds info about client and continues code
                        break;
                    case 2: // If it's an admin
                        System.out.print("\nUsername: ");
                        String adminUsername = scanner.next();

                        System.out.print("\nPassword: ");
                        String adminPassword = scanner.next();

                        // Finds info about admin and continues code
                        break;
                }
                break;

            // End of the case
            case 6: // Register
                System.out.println("WELCOME TO SYSTEM REGISTRATION");
                User u = new User();
                System.out.print("\n Enter preferred login: ");
                String regLogin = scanner.next();
                //if login already exist , return "user with such login already exist else.."
                System.out.print("\nEmail: ");
                String regEmail = scanner.next();

                System.out.print("\nEnter password: ");
                String regPassword = scanner.next();
                if (!v.checkPassword(regPassword)) {
                    System.out.print("\nStrong password");
                } else {
                    System.out.print("\nTry again password don't match requirement");
                    break;
                }
                System.out.print("\nEnter password second time");
                String regPassword2 = scanner.next();
                if (regPassword.equals(regPassword2)) {
                    System.out.print("\nPasswords matched");
                } else {
                    System.out.print("\nTry again passwords don't matched");
                    break;
                }

                System.out.print("\n*****\n" +
                        "Now please, input your personal data below:\n");

                System.out.print("\nFirst name: ");
                String regName = scanner.next();

                System.out.print("\nSecond name: ");
                String regSurname = scanner.next();

                System.out.print("\nBIN: ");
                String regBin = scanner.next();

                System.out.print("\nSex: ");
                String regSex = scanner.next();

                u.registrationNewUser(regLogin, regPassword, regEmail, regName, regSurname, regBin, regSex);
                break;
            // End of the case
        }
    }
}
