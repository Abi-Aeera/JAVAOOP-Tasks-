import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age");
    int a = sc.nextInt();
    if (a<18) {
        System.out.println("Minor(not elegible for voting)");
    } 
    else {
        System.out.println("Eligible for voting");
    }
    
    sc.close();
}}
