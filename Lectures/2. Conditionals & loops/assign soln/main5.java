// Program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;

public class main5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter any number to start (Enter 0 to terminate): ");
        int n;
        int sumNeg = 0, sumEven = 0, sumOdd = 0;

        do {
            n = sc.nextInt();
            if (n < 0) {
                sumNeg += n;
            }
            else if (n > 0 && n%2 == 0) {
               sumEven += n;
            }
            else if (n > 0 && n%2 != 0){
                sumOdd += n;
            }
        } while (n != 0);
        System.out.println("The sum of negative numbers are: " + sumNeg);
        System.out.println("The sum of even numbers are: " + sumEven);
        System.out.println("The sum of odd numbers are: " + sumOdd);
    }
}
