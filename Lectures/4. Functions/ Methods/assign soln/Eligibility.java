import java.util.Scanner;

public class Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter age of the person: ");
        int age = sc.nextInt();
        vote(age);
    }

    static void vote(int n) {
        if (n >= 18) {
            System.out.println("The person is eligible is vote.");
        }
        else {
            System.out.println("The person is not eligible to vote.");
        }

    }
}
