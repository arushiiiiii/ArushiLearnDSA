import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter any three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("The maximum number is: " + maximum(num1, num2, num3));
        System.out.println("The minimum number is: " + minimum(num1, num2, num3));
    }

    static int maximum(int a, int b, int c) {
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        return max;
    }

    static int minimum(int a, int b, int c) {
       int min = a;
       if (min > b) {
           min = b;
       }
       if (min > c) {
           min = c;
       }
       return min;
    }
}
