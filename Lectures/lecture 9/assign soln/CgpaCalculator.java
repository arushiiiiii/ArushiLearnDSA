// CGPA calculator
import java.util.Scanner;

public class CgpaCalculator {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of courses: ");
        int courses = sc.nextInt();
        int result = 0;
        int totalCredits = 0;
        for (int i = 1; i <= courses; i++) {
            System.out.print("Enter grade points for course " + i + ": ");
            int gradePoints = sc.nextInt();
            System.out.print("Enter credits for course " + i + ": ");
            int credits = sc.nextInt();
            totalCredits += credits;
            result += gradePoints * credits;
        }
        double cgpa = (double) result/totalCredits;
        System.out.println("The CGPA is: " + cgpa);
    }
}
