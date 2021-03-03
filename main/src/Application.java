import java.lang.ref.Cleaner;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 0;
        System.out.print("\n*****\n" +
                "Welcome to Bus Ticket Reservation System!\n" +
                "1- Log in\n" +
                "2- Register now\n" +
                "Please enter the id of operation you want to complete: ");

        try {
            input = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        }

        switch (input) {
            case 1: // Log in
                System.out.print("\n*****\n" +
                        "Please, choose the type of access to the system:\n" +
                        "1- Client\n" +
                        "2- Administrator");

                int access = scanner.nextInt();

                switch (access) {
                    case 1: // If it's an user
                        System.out.print("\nLogin: ");
                        String clientLogin = scanner.nextLine();

                        // Check if we have such bin in database and if yes continue

                        System.out.print("\nPassword: ");
                        String clientPassword = scanner.nextLine();

                        // Finds info about client and continues code
                        break;
                    case 2: // If it's an admin
                        System.out.print("\nUsername: ");
                        String adminUsername = scanner.nextLine();

                        System.out.print("\nPassword: ");
                        String adminPassword = scanner.nextLine();

                        // Finds info about admin and continues code
                        break;
                }
                break;
            // End of the first case
            case 2: // Register
                System.out.print("\n*****\n" +
                        "Please, input your personal data below:");

                System.out.print("\nFirst name: ");
                String regName = scanner.nextLine();

                System.out.print("\nSecond name: ");
                String regSurname = scanner.nextLine();

                System.out.print("\nBIN: ");
                String regBin = scanner.nextLine();

                System.out.print("\nPassword: ");
                String regPassword = scanner.nextLine();

                System.out.print("\nPhone: ");
                String regPhone = scanner.nextLine();
                break;
            // End of the second case
        }
    }
}
