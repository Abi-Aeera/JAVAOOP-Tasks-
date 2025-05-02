import java.util.Scanner;

public class IsHarshadNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's a Harshad number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.close();
            return;
        }

        int number = scanner.nextInt();

        int sumOfDigits = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sumOfDigits += digit;
            temp /= 10;
        }

        boolean isHarshad = (sumOfDigits != 0) && (number % sumOfDigits == 0);

        System.out.println(number + " is a Harshad number: " + isHarshad);

        scanner.close();
    }
}