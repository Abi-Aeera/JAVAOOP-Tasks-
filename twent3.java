import java.util.Scanner;

public class twent3 {
    
 public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int c = Integer.toString(a).length();
        int rev = 0;
        
        for (int i = 0; i < c; i++) {
            rev = rev * 10 + a % 10;
            a = a / 10;
            }
        System.out.println("reverse is: "+rev);
        sc.close();
    }}
