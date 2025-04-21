import java.util.Scanner;

public class four {
        public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a numbers");
    int a = sc.nextInt();
    if (a%5== 0 && a%11 == 0) {
        System.out.println("Divisible by both 5 and 11");
    } 
    else {
        System.out.println("Not divisible by either 5 or 11");
    }
    
    sc.close();
    }
}
