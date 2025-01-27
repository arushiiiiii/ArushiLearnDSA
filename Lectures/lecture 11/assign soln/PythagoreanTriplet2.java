import java.util.Scanner;

public class PythagoreanTriplet2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        check(a,b,c);
    }

    static void check(int a, int b, int c) {
        int x = a * a;
        int y = b * b;
        int z = c * c;
        if (x == y + z || y == x + z || z == x + y) {
            System.out.println("These numbers are pythagorean triplets");
        }
        else {
            System.out.println("These numbers are not pythagorean triplets");
        }
    }
}
