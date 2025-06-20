import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // x.equals("word") --> here equals only checks value not reference.
        // x == "word" --> here it checks reference
        /* String fruits = sc.next();

        // Basic Method

        switch (fruits) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("Healthy Fruit");
                break;
            case "Oranges":
                System.out.println("Round Fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit");
                break;
        }   */




        /* This is enhanced switch statement. It is done using (option+control).
        Also we can explore various other options. though we need to use break after every case.

        switch (fruits) {
                   case "Mango" -> System.out.println("King of fruits");
                   case "Apple" -> System.out.println("Healthy Fruit");
                   case "Oranges" -> System.out.println("Round Fruit");
                   case "Grapes" -> System.out.println("Small fruit");
                   default -> System.out.println("Please enter a valid fruit");
               }  */


        int day = sc.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }
//
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}