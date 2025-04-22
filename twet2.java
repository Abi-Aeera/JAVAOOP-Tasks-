import java.util.Scanner;

public class twet2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int sum = 0;
        String s = Integer.toString(a);
        for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                int z = Character.getNumericValue(c);
             sum += z;
            }
        System.out.println("Sum of digits is: " + sum);
        sc.close();
    }
}