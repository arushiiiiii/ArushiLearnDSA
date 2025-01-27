import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (checkPalindrome(num)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    static boolean checkPalindrome(int n) {
        int reverse = 0;
        int temp = n;
        while(temp != 0) {
            reverse = (reverse * 10) + temp % 10;
            temp /= 10;
        }

        return (reverse == n);
    }
}
