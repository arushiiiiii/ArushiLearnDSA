import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Find the largest of three numbers.
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("The largest number is:" + max);
    }
}

// We can also use the Math class.
// int max = Math.max(a , b);      returns the max value among a & b.
// int max = Math.max(c , Math.max(a , b));      returns the max value among a , b & c.