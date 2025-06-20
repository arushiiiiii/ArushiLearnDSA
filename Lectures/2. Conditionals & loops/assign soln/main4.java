import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any month: ");
        String month = sc.next();
        int n;
        if (month == "January" || month == "March" || month == "May" || month == "July" || month == "August" || month == "October" || month == "December") {
            n = 31;
        }
        else if (month == "Feburary") {
            n = 28;
        }
        else {
            n = 30;
        }
        System.out.println("Number of days kunal can go out are " + n/2);
    }
}
