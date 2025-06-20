// Program to take integer inputs till the user enters 0 and print the sum of all numbers
import java.util.Scanner;

public class main2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;
        System.out.println("Enter numbers to sum: ");

        // Loop to take integer inputs until the user enters 0
        while (true) {
            num = sc.nextInt();
            if(num == 0) {
                break;
            }
            sum += num;
        }
        System.out.println("The sum of the numbers entered is: " + sum);
    }
}
