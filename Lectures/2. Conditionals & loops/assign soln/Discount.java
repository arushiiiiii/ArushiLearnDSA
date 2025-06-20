// Program to calculate discount of product
import java.util.Scanner;

public class Discount {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original price of the product: ");
        double origPrice = sc.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discPercentage = sc.nextDouble();
        double discAmount = (origPrice * discPercentage)/100;
        double discPrice = origPrice - discAmount;

        System.out.println("Discounted Price = " + discPrice);
    }
}
