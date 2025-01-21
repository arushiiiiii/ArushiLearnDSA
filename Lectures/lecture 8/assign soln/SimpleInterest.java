//Program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Principal Amount : ");
        float p = sc.nextFloat();
        System.out.print("Input Time : ");
        float t = sc.nextFloat();
        System.out.print("Input Rate : ");
        float r = sc.nextFloat();

        float si = (p*t*r)/100;
        System.out.println("The Simple Interest is: " + si);
    }
}
