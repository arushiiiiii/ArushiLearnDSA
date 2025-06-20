import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        // Take input of two numbers and print their sum.

        // int ans = sum2();
        // System.out.println(ans);

        // sum3();




        // First :
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number 1: ");
            int num1 = sc.nextInt();
            System.out.print("Enter number 2: ");
            int num2 = sc.nextInt();
            System.out.println("The sum is: " + sum(num1 , num2));
        }
    }

    static int sum (int a, int b) {
        return a + b;
    }


    // Second :
    static int sum2 () {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
//        System.out.println("This statement will never execute because it is placed after return.");
    }


    // Third :
    static void sum3 () {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
}
