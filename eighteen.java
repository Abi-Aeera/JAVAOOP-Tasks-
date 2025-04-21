import java.util.Scanner;

public class eighteen {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 2 numbera");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Enter operation");
    char c = sc.next().charAt(0);
    switch (c) {
        case '+':
            System.out.println("Sum of two numbers is: " + (a + b));
            break;
        case '-':
            System.out.println("Difference of two numbers is: " + (a - b));
            break;
        case '*':
            System.out.println("Product of two numbers is: " + (a * b));
            break;
        case '/':
            System.out.println("Quotient of two numbers is: " + (a / b));
            break;
        default:
            System.out.println("Invalid operation");
    }
 }   
}
