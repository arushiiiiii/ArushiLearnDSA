//Program to calculate Fibonacci Series up to n numbers.
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print("The fibonacci series is : ");
        if (n == 1) {
            System.out.println(a);
        }
        else if (n == 2) {
            System.out.println(a + "," + b);
        }
        else {
            System.out.print(a + "," + b);
            while(n>2) {
                int temp = a + b;
                System.out.print("," + temp);
                a = b;
                b = temp;
                n--;
            }
        }

    }
}