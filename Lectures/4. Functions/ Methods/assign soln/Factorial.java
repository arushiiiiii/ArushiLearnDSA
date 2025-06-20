import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The factorial of the given number is: " + calculateFactorial(n));
    }

    static int calculateFactorial(int num) {
        int mul = 1;
        for(int i = 1; i <= num; i++) {
            mul *= i;
        }
        return mul;
    }
}
