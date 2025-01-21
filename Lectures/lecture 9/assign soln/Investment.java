import java.util.Scanner;

public class Investment {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Principal Value of the investment: ");
        int pv = sc.nextInt();
        System.out.print("Enter the annual interest rate in percentage: ");
        double r = sc.nextDouble() / 100;
        System.out.print("Enter the number of years the money is invested: ");
        int t = sc.nextInt();

        double fv = pv * Math.pow((1 + r),t);
        System.out.printf("The future investment value is: %.2f\n" , fv);
    }
}
