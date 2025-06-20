//Program to find Armstrong Number between two given number.
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a+1 ; i < b; i++) {
            // firstly finding the number of digits i.e. n
            int x = i;
            int n = 0;
            while (x != 0) {
                x /= 10;
                n++;
            }

            // computing the sum of nth power of its digits
            int pow_sum = 0;
            x = i;
            while (x != 0) {
                int digit = x % 10;
                pow_sum += Math.pow(digit, n);
                x /= 10;
            }

            // checking whether the number i is equal to the sum of nth power of its digits
            if ( i == pow_sum) {
                System.out.print(i + " ");
            }
        }
    }
}