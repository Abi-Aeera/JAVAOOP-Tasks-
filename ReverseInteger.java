import java.util.Scanner;

public class ReverseInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer to reverse: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.close();
            return;
        }
        int number = scanner.nextInt();

        int reversedNumber = 0;
        int originalNumber = number;  // Keep the original number for output

        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }

        System.out.println("Reversed of " + originalNumber + " is: " + reversedNumber);

        scanner.close();
    }
}