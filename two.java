import java.util.Scanner;
public class two {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Sum of two numbers is: " + (a + b));
      System.out.println("Difference of two numbers is: " + (a - b));
      System.out.println("Product of two numbers is: " + (a * b));
      System.out.println("Quotient of two numbers is: " + (a / b));
      
    
    sc.close();
 }   
}
