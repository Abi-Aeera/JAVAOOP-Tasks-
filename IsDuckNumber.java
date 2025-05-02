import java.util.Scanner;

public class IsDuckNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's a Duck number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.close();
            return;
        }

        int number = scanner.nextInt();
        String numStr = String.valueOf(number);
        boolean isDuck = false;

        if (!numStr.startsWith("0")) {
            for (int i = 0; i < numStr.length(); i++) {
                if (numStr.charAt(i) == '0') {
                    isDuck = true;
                    break;
                }
            }
        }

        System.out.println(number + " is a Duck number: " + isDuck);

        scanner.close();
    }
}