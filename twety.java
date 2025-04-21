import java.util.Scanner;

public class twety {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a character");
    char a = sc.next().charAt(0);
    char c = Character.toUpperCase(a);
    switch (c) {
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
            System.out.println("Vowel");
            break;
        default:
            System.out.println("Consonant");
            break;
    }
    sc.close();
 }   
}
