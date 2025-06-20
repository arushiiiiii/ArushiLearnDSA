import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array of primitives
        int[] arr = new int[5];
        arr[0] = 34;
        arr[1] = 74;
        arr[2] = 35;
        arr[3] = 76;
        arr[4] = 76;

        System.out.println(arr[3]);

        // input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        // output using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int num : arr) {  // for every element in array, print the element
            System.out.print(num + " ");  // here num represents element of the array
        }
        System.out.println();

//        System.out.println(arr[5]);  // index out of the bound error

        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));

        // modify
        str[2] = "Arushi";

        System.out.println(Arrays.toString(str));
    }
}
