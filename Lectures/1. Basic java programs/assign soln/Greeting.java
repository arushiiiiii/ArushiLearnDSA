//Program to take name as an input and print a greeting message for that particular name.

import java.util.Scanner;

 public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.println("Warm Greetings to" + " " + name + "." + " We are delighted to have you with us.");
    }
}
