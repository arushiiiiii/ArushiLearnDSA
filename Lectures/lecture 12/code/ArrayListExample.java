import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list = new ArrayList<>(5);
        // a list is created with initial capacity 5

        list.add(7);
        list.add(13);
        list.add(18);
        list.add(99);

        System.out.println(list.contains(98));
        System.out.println(list);
        list.set(3,44);

        list.remove(1);  // 13 will be removed
        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));  // pass index here, list[index] will not work here
        }
        System.out.println(list);  // Although you have declared the size of the ArrayList still it can change. It doubles its size when more than half of the list is filled. and hence [7, 18, 44, 1, 2, 3, 4, 5] is the output.
    }
}
