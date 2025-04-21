import java.util.Scanner;

public class twelve {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    boolean sum = false;
    for (int i = 2; i < a; i++) {
        
        if (a % i == 0) {
            sum = true;
        } else {
        continue;}
        
        }
    if (sum) {
        System.out.println("not prime");
    } 
    else {
        System.out.println("prime");
    }
    
    sc.close();
    }
}
