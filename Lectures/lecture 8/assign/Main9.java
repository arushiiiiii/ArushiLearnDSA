//Program to find Armstrong Number between two given number.
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a+1; i < b; ++i) {
            int x = i;
            int n = 0;
            while (x != 0) {
                x /= 10;
                ++n;
            }
            int pow_sum = 0;
            x = i;
            while (x != 0) {
                int digit = x % 10;
                pow_sum += Math.pow(digit, n);
                x /= 10;
            }
            if (pow_sum == i)
                System.out.print(i + " ");
        }
    }
}