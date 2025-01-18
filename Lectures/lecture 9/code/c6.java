import java.util.Scanner;

public class c6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input from user till user presses X or x.
        int ans = 0;
        while (true) {
            // take the operator as input
            System.out.print("Enter the operator: ");
            char op = sc.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();

                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    ans = a / b;
                }
                if (op == '%') {
                    ans = a % b;
                }
                else if (op == 'x' || op == 'X') {
                    break;
                }
                else {
                    System.out.println("Invalid operation");
                }
            }
            System.out.println(ans);
        }
    }
}
