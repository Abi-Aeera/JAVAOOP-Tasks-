import java.util.Scanner;

public class ConvertDays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of days: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.close();
            return;
        }

        int totalDays = scanner.nextInt();

        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int months = remainingDays / 30;
        int days = remainingDays % 30;

        System.out.println(totalDays + " days is approximately:");
        System.out.println(years + " years, " + months + " months, and " + days + " days.");

        scanner.close();
    }
}