import java.util.Scanner;

public class StringReversal {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        // string reversal program
        int n = sc.nextInt();
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            ans = ans * 10 + rem;
        }

        System.out.println(ans);
    }
}
