// This code is not correct yet.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double n = sc.nextDouble();
        checkPalindrome(n);
    }

    static void checkPalindrome(double number) {
        String str = Double.toString(number);

        // Remove the decimal part if present.
        str = String.format("%.0f", number).replace(".", "");
        int len = str.length();
        int i = 0;
        while(i < len/2) {
            if(str.charAt(i) == str.charAt(len-i-1)) {
                i++;
            }
            else {
                System.out.println("The number is not a palindrome");
                return;
            }
        }
        System.out.println("The number is a palindrome");
    }
}
