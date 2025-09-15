import java.util.Scanner;

public class Hcf {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println("HCF is: " + num1);
    }
}
