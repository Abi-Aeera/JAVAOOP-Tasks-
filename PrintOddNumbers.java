import java.util.Scanner;

public class PrintOddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.close();
            return; // Exit if input is invalid
        }

        int n = scanner.nextInt();

        System.out.println("Odd numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        scanner.close(); // Close the scanner
    }
}