import java.util.Scanner;


public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // creates a do-while loop that prompts the user to continue or exit.
        do {
            System.out.println("1. Continue");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // checks the user's choice and responds accordingly.
            if (choice == 1) {
                System.out.println("Continuing...");
            } else if (choice != 2) {
                System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 2);

        // prints a goodbye message when the user chooses to exit.
        System.out.println("Goodbye!");

        scanner.close();
    }
}
