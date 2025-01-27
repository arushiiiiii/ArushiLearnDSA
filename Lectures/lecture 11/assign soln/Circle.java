import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        circumArea(radius);
    }

    static void circumArea(double r) {
        double circum = 2 * 3.14 * r;
        double area = 3.14 * r * r;
        System.out.println("The circumference of the circle is: " + circum);
        System.out.println("The area if the circle is: " + area);
    }
}
