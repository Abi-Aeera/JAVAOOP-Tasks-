import java.util.Scanner;
public class ten {


    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 5 subject marks: ");
        float sc = scan.nextFloat();
        float ma = scan.nextFloat();
        float ne = scan.nextFloat();
        float eng = scan.nextFloat();
        float so  = scan.nextFloat();
        scan.close();
        float total = sc + ma + ne + eng + so;
        float percentage = (total / 500) * 100;
        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + percentage);
        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {  
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B+");
        } else if (percentage >= 60) {
            System.out.println("Grade: B");
        } else if (percentage >= 50) {
            System.out.println("Grade: C+");
        } else if (percentage >= 40) {
            System.out.println("Grade: C");
        } else if (percentage >= 33) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: Fail");
            
            }
    }


}

