import java.util.Scanner;


public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompts the user to enter a number and prints its multiplication table from 1 to 12.
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // uses a for loop to iterate from 1 to 12 and prints the multiplication result for each iteration.
        for (int i = 1; i <= 12; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}