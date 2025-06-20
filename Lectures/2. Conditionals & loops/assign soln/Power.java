// Power calculation
import java.util.Scanner;

public class Power {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int expo = sc.nextInt();
        int prod = 1;
        for ( int i=0 ; i < expo; i++ ){
            prod = prod *base;
        }
        System.out.println(base + " raised to the power of " + expo + " is: " + prod);

        // Close the scanner
        sc.close();
    }
}

/* this can also be calculated by using a direct method i.e. Math.pow().
--> double result = Math.pow(base, exponent);
 */
