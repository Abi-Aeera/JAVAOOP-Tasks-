import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.close();
            return;
        }
        int n = scanner.nextInt();

        int sum = n * (n + 1) / 2;

        System.out.println("Sum of first " + n + " natural numbers: " + sum);

        scanner.close();
    }
}