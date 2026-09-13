import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int total = 0;

        // creates a do-while loop that prompts the user to enter numbers and adds them to a total until the user enters 0.
        do {
            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextInt();
            total += number;
        } while (number != 0);

        // prints the final total after the user enters 0.
        System.out.println("The final total is " + total);

        scanner.close();
    }
}
