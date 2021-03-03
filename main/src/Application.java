import java.lang.ref.Cleaner;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Client c = new Client("sdf", "df", "df", "dfd", "dfdf");
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n*****\n" +
                "Welcome to Bus Ticket Reservation System!\n" +
                "Please log in in the system or register to continue:\n" +
                "1- Log in\n" +
                "2- Register now\n");

        int input = scanner.nextInt();

        switch (input) {
            case 1: // Log in
                System.out.println("\n*****\n" +
                        "Please, choose the type of access to the system:\n" +
                        "1- Client\n" +
                        "2- Administrator\n");

                int access = scanner.nextInt();

                switch (access) {
                    case 1: // If it's an user
                        System.out.print("\n*****\n" +
                                "BIN: ");
                        String clientBin = scanner.nextLine();

                        // Check if we have such bin in database and if yes continue

                        System.out.print("\nPassword: ");
                        String clientPassword = scanner.nextLine();

                        // Finds info about client and continues code
                        break;
                    case 2: // If it's an admin
                        System.out.print("\n*****\n" +
                                "Username: ");
                        String adminUsername = scanner.nextLine();

                        System.out.print("Password: ");
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
