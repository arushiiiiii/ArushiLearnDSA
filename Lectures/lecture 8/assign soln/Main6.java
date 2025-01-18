//Program to input currency in rupees and output in USD.
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter currency in rupees : ");
        float curr = in.nextFloat();
        System.out.println(curr + " rupees in USD = " + curr*0.012);
    }
}