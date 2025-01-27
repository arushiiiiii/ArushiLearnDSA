import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks(out of 100): ");
        int marks = sc.nextInt();
        grade(marks);
    }

    static void grade(int n) {
        if(n>90 && n<=100) {
            System.out.println("Grade AA");
        }
        else if(n>80) {
            System.out.println("Grade AB");
        }
        else if(n>70) {
            System.out.println("Grade BB");
        }
        else if(n>60) {
            System.out.println("Grade BC");
        }
        else if(n>50) {
            System.out.println("Grade CD");
        }
        else if(n>40) {
            System.out.println("Grade DD");
        }
        else {
            System.out.println("Fail");
        }
    }
}
