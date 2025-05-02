import java.util.Scanner;

public class CalculateCompoundInterest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.close();
            return;
        }
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (as a percentage): ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.close();
            return;
        }
        double rate = scanner.nextDouble();

        System.out.print("Enter the time in years: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.close();
            return;
        }
        double time = scanner.nextDouble();

        double amount = principal * Math.pow(1 + (rate / 100), time);
        double compoundInterest = amount - principal;

        System.out.println("Compound Interest: " + compoundInterest);

        scanner.close();
    }
}