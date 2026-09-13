import java.util.Scanner;


public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // creates a do-while loop that prompts the user to enter a number between 1 and 10.
        do {
            System.out.print("Enter a number between 1 and 10: ");
            number = scanner.nextInt();

            // checks if the entered number is valid and responds accordingly.
            if (number < 1 || number > 10) {
                System.out.println("Invalid number, please try again.");
            }
            // continues to prompt the user until a valid number is entered.
        } while (number < 1 || number > 10);

        System.out.println("You entered a valid number: " + number);

        scanner.close();
    }
}
