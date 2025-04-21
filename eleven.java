import java.util.Scanner;

public class eleven {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year");
        int year = scan.nextInt();
        scan.close();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {
            System.out.print("Year is leap year");
        }
        else
        {
            System.out.print("Year is not leap year");
        }
    }
}
