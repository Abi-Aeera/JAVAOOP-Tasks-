import java.util.Scanner;

public class fourteen {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a numbera");
    int a = sc.nextInt();
    int sum=0;

    for(int i=1; i<=a;i++){
        sum+=i;

    }
   System.out.println("Sum of first " + a + " numbers is: " + sum);
    sc.close();
 }   
    
}
