import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompts the user to enter a word or sentence and counts the number of vowels in it.
        System.out.print("Enter a word or sentence: ");
        String input = scanner.nextLine();

        int vowelCount = 0;

        // iterates through each character in the input string, converts it to lowercase, and checks if it is a vowel. If it is, increments the vowel count.
        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        // prints the total number of vowels found in the input string.
        System.out.println("Number of vowels: " + vowelCount);

        scanner.close();
    }
}