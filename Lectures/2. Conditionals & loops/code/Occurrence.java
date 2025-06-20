import java.util.Scanner;

public class Occurrence {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        // occurrences counting program
        System.out.print("Enter the number:");
        long num = sc.nextLong();
        System.out.print("Enter the number whose occurrences needs to be checked: ");
        int n = sc.nextInt();
        int count = 0;
        while ( num > 0) {
            if (n == num%10) {
                count++;
            }
           num /= 10;
        }
        System.out.println(count);
    }
}
