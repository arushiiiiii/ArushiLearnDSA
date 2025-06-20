import java.util.Scanner;

public class SumAndProd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The sum of the given numbers is: " + calculateSum(num1, num2));
        System.out.println("The product of the given numbers is: " + calculateProduct(num1, num2));
    }

    static int calculateSum(int a, int b) {
        return a + b;
    }

    static int calculateProduct(int a, int b) {
        return a * b;
    }
}
