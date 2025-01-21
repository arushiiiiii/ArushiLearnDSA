import java.util.Scanner;

public class Casecheck {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        // Case check program
        char ch = sc.next().trim().charAt(0);
        // .trim() removes the extra spaces at the end of the word to minimize memory usage.
        // .charAt(0) is used to convert the entered string into character.
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        }
        else {
            System.out.println("Uppercase");
        }
    }
}
