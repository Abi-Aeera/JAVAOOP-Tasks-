import java.util.Scanner;

public class IsKaprekarNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's a Kaprekar number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.close();
            return;
        }

        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println(number + " is a Kaprekar number: false");
            scanner.close();
            return;
        }

        long square = (long)number * number;
        String squareStr = String.valueOf(square);

        int length = squareStr.length();
        int mid = length / 2;

        String right = squareStr.substring(mid);
        String left = (mid > 0) ? squareStr.substring(0, mid) : "0";

        int sum = Integer.parseInt(left) + Integer.parseInt(right);
        boolean isKaprekar = sum == number;

        System.out.println(number + " is a Kaprekar number: " + isKaprekar);

        scanner.close();
    }
}