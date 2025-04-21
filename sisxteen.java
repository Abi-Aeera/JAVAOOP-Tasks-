import java.util.Scanner;

public class sisxteen {
 public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbera");
        int a = sc.nextInt();
        long sum=1;
    
        for(int i=1; i<=a;i++){
            sum*=i;
    
        }
       System.out.println("factorial of " + a + "  is: " + sum);
        sc.close();
      
 }      
}
