//Program to take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any two numbers : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.print("Enter the type of operation you want to perform (+,-,*,/) : ");
        char op = in.next().charAt(0);
        int ans = 0;
        if ( op == '+') {
            ans = num1 + num2;
        }
        else if ( op == '-') {
            ans = num1 - num2;
        }
        else if ( op == '*') {
            ans = num1 * num2;
        }
        else if ( op == '/') {
            ans = num1 / num2;
        }
        System.out.print("Therefore the answer is: " + ans);
    }
}