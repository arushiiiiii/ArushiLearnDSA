import java.util.Scanner;

public class DigitsSum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();
        int sum = 0;
        while (num != 0) {
            double remain = num % 10;
            sum += remain;
            num /= 10;
        }
        System.out.println("The sum of digits is: " + sum);
    }
}
