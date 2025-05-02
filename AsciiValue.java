import java.util.Scanner;

public class AsciiValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character to get its ASCII value: ");
        String input = scanner.next(); // Read the first word/character
        if (input.length() == 0) {
            System.out.println("No character entered.");
            scanner.close();
            return;
        }
        char ch = input.charAt(0); // Get the first character

        int asciiValue = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + asciiValue);

        scanner.close();
    }
}