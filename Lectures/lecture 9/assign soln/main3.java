import java.util.Scanner;

// Program to take integer inputs till the user enters 0 and print the largest number from all.
public class main3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        int max = 0;
        System.out.println("Enter numbers: ");
        while (true) {
            num = sc.nextInt();
            if(num == 0) {
                break;
            }
            if (max < num) {
                max = num;
            }
        }
        System.out.println("The largest number is: " + max);
    }
}
