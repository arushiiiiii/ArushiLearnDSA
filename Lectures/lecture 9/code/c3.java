import java.util.Scanner;

public class c3 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        //Print the nth term of the fibonacci series
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        if (n == 1) {
            System.out.print(a);
        }
        else if (n == 2) {
            System.out.print(b);
        }
        else {
            int i = 3;
            while (i <= n) {
                int temp = b;
                b = a + b;
                a = temp;
                i++;
            }
            System.out.println(b);
        }
    }
}
