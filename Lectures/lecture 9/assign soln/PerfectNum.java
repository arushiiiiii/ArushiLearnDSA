import java.util.Scanner;

public class PerfectNum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++){
            if (num%i == 0) {
                sum += i;
            }
        }
        if (num == sum) {
            System.out.println("The given number is a perfect number.");
        }
        else {
            System.out.println("The given number is not a perfect number.");
        }
    }
}
