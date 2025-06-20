import java.util.Arrays;

public class Max2d {
    public static void main(String[] args) {
        int [][] arr = {
                {1, 43, 35},
                {3, 5, 34, 87},
                {2, 43, 87, 344},
                {18, 12}
        };

        System.out.println(search(arr));
    }

    static int search (int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int el : ints) {
                if (el > max) {
                    max = el;
                }
            }
        }
        return max;
    }
}

