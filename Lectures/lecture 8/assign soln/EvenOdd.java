//Program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a whole number : ");
        int num = sc.nextInt();
        if (num > 0 ) {
            if ( num % 2 == 0) {
                System.out.println("The given number is even");
            } else {
                System.out.println("The given number is odd"); }
        }
        else System.out.println( "The given number is invalid");
    }
}