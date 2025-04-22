import java.util.Scanner;

public class twent4 {
    // Java program to reverse a number
    // using while loop
    // using Scanner class
    // using Integer.toString() method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int original = a; // Store the original value of 'a'
        int rev = 0;

        while (a != 0) {
            rev = rev * 10 + a % 10;
            a = a / 10;
        }

        if (rev == original) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }
        sc.close();
    }
}
