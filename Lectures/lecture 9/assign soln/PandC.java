// Combination and permutation program.
import java.util.Scanner;

public class PandC {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        // Taking Input.
        System.out.print("Enter the value of n (Total items): ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r (items to choose or arrange): ");
        int r = sc.nextInt();
        // variables to calculate nCr and nPr
        int nCr = 1;
        int nPr = 1;

        // calculating factorial
        int factN = 1, factR = 1, factNR = 1;

        // calculate n!
        for (int i = 1; i<=n; i++){
            factN *= i;
        }
        // calculate r!
        for (int i = 1; i<=r; i++) {
            factR *= i;
        }
        // calculate (n-r)!
        for (int i = 1; i<=(n-r); i++) {
            factNR *= i;
        }

        nCr = factN / (factR * factNR);
        nPr = factN / factNR;

        System.out.println("nCr = " + nCr);
        System.out.println("nPr = " + nPr);

        sc.close();
    }
}
