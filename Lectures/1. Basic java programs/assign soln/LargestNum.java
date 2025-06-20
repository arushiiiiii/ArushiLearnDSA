//Program to take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any two numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        if (a>b) {
            System.out.println("The larger number is " + a);
        }
        else {
            System.out.println("The larger number is " + b);
        }
    }
}