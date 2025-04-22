import java.util.Scanner;

public class twent6 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
         // Store the original value of 'a'
        int count = 0;

        while (a != 0) {
            count++;
            a = a / 10;

        }
        System.out.println("The number of digits is: " + count);

        sc.close();
}
}