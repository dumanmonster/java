import java.util.ArrayList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Ticket> tickets = new ArrayList<>();
        Validator v = new Validator();
        int input = 0;

        System.out.print("\n*****\n" +
                "\nWelcome to Bus Ticket Reservation System! by Duman and Jasmine" +
                "\nYou have 2 option to do:" +
                "\n1. Login" +
                "\n2. Register" +
                "\nPlease enter the id of operation you want to complete: ");

        try {
            input = scanner.nextInt();
        } catch (InputMismatchException e) {
            //Invalid input try again pls
            e.printStackTrace();
        }

        User u = new User();
        switch (input) {
            case 1: // Log in
                System.out.print("\nPlease, enter your login: ");
                String login = scanner.next();
                System.out.print("\nPlease, enter your password: ");
                String password = scanner.next();
                u.login(login, password);

                System.out.print("\nNow you have 2 options to do: " +

                        "\n1. Check all available buses" +
                        "\n2. Buy a ticket");
                int input2 = scanner.nextInt();

                switch (input2) {
                    case 1:
                        u.findBusesFULL();
                    case 2:
                        System.out.println("Enter bus ID which one you prefer to buy: ");
                        int userBusId = scanner.nextInt();
                        SqlUpdate upd = new SqlUpdate();
                        upd.updateBusSpace(userBusId); // --bus_space
                        System.out.println("Now please enter your bin one more time: ");
                        String userBin = scanner.next();
                        Ticket ticket = new Ticket(userBusId, u.getUserInformationByBin(userBin, "fname"),
                                u.getUserInformationByBin(userBin, "sname"), userBin);
                        tickets.add(ticket);
                        ticket.printTicket(userBusId);
                        break;
                }
                break;

            case 2: // Register
                System.out.print("WELCOME TO SYSTEM REGISTRATION");
                System.out.print("\n Enter preferred login: ");
                String regLogin = "";
                regLogin = scanner.next();
                while (u.checkLoginExistences(regLogin)) {
                    if (u.checkLoginExistences(regLogin)) {
                        System.out.println("Unique login good job!!!");
                        break;
                    } else {
                        System.out.println("User with such login already exist!!!");
                    }
                }
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

        }
    }
}
