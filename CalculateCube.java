import java.util.Scanner;

public class CalculateCube {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its cube: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.close();
            return;
        }

        int number = scanner.nextInt();

        int cube = number * number * number;

        System.out.println("Cube of " + number + " is: " + cube);

        scanner.close();
    }
}