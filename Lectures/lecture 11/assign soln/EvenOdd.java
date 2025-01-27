import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        number(num);
    }

    static void number(int a) {
        if (a % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
