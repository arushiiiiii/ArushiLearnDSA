import java.util.Scanner;

public class Lcm {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter any two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = a * b;
        while (a != 0) {
            int temp = a;
            a = b % a;
            b = temp;
        }
        int lcm = (mul)/b;
        System.out.println("The LCM is: " + lcm);
    }
}
