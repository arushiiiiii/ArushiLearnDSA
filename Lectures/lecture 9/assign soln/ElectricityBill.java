// Program to calculate electricity bill
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the electricity unit used: ");
        int unit = sc.nextInt();
        // we have assumed the charge of 1 unit as Rs. 13
        int bill = unit * 13;
        System.out.println("The Electricity Bill is: Rs." + bill);
    }
}
