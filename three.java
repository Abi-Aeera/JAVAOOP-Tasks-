import java.util.Scanner;
public class three {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a numbers");
    int a = sc.nextInt();
    if (a>0) {
        System.out.println("+ve");
    } else if (a < 0) {
        System.out.println("-ve");
    } else {
        System.out.println("Zero");
    }
    
    sc.close();
 }   
}
