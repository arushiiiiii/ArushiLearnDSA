// Program to calculate batting average.
import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of hits: ");
        int hits = sc.nextInt();
        System.out.print("Enter the number of at-bats: ");
        int atBats = sc.nextInt();

        double battingAverage;
        if (atBats == 0){
            battingAverage = 0.0;
        }
        else {
            battingAverage = (double) hits / atBats;
            System.out.println("The player's batting average is: " + battingAverage);
        }
    }
}
