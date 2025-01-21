// Compound interest calculation
import java.util.Scanner;

public class CompoundInterest {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter the annual interest rate as a percentage: ");
        double r = sc.nextDouble() / 100;
        System.out.print("Enter the number of times interest is compounded per year: ");
        int n = sc.nextInt();
        System.out.print("Enter the time in years: ");
        int t = sc.nextInt();

        double a = p * Math.pow((1 + (r/n)),n*t);
        double ci = a - p;

        System.out.printf("The compound interest is: %.2f\n", ci);      // Here %.2f/n is used to round the decimal places upto two digits.
        System.out.printf("The total amount (Principal + Interest) is: %.2f\n", a);
    }
}
