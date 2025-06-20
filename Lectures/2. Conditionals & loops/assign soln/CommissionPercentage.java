// Program to calculate commission percentage.
import java.util.Scanner;

public class CommissionPercentage {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sale amount: ");
        double saleAmt = sc.nextDouble();
        System.out.print("Enter the commission received: ");
        double commAmt = sc.nextDouble();
        double commPercentage = (commAmt * 100)/saleAmt;
        System.out.println("The commission percentage is: " + commPercentage + "%");
    }
}
