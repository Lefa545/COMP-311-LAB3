import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompts the user to enter a positive whole number.
        System.out.print("Enter a positive whole number: ");
        int limit = scanner.nextInt();

        // initializes sum and i to 0 and 1 respectively.
        int sum = 0;
        int i = 1;
        while (i <= limit) {
            sum += i;
            i++;
        }

        // prints the sum of all whole numbers from 1 to the user-defined limit.
        System.out.println("The sum of all whole numbers from 1 to " + limit + " is " + sum);

        scanner.close();
    }
}
