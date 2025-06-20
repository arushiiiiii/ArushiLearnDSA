import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();  // This declares a list of lists. unlike a traditional 2D array, this structure allows dynamic row sizes.

        // initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());  // This loop creates 3 separate inner lists inside list, making it a 2D structure.
        }

        // add elements
        for (int i = 0; i < 3; i++) {  // The outer loop runs 3 times, representing 3 rows.
            for (int j = 0; j < 3; j++) {  // The  inner loop runs 3 times for each row, adding user input to the corresponding row (list.get(i)).
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);  // The output will be displayed as a list of lists.
    }
}
