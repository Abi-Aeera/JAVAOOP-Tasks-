import java.util.Scanner;

public class twetone {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
       
        for (int i = 1; i < a; i++) {
            
            if (i * i == a) {
                System.out.println("perfect square");
                break;
            } 
            else {
                System.out.println("not a perfect square");
            }

            
            }
       
        
        
        sc.close();
        }
    
}
