//Program to find out whether the given String is Palindrome or not.
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String word = sc.next();
        int a = word.length();
        int i = 0;
        while(i<a/2) {
           if (word.charAt(i) == word.charAt(a-i-1)) {
               i++;
           }
           else {
               System.out.println("The given string is not Palindrome");
               return;
           }
        }
        System.out.println("The given string is Palindrome");
    }
}