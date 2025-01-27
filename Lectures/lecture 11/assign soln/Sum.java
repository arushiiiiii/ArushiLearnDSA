import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        calculate(n);
    }

    static void calculate(int num) {
        int sum = num * (num + 1)/2;
        System.out.println("The sum of first " + num + " natural numbers is: " + sum);
    }
}
