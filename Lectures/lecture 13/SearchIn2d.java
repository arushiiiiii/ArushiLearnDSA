import java.util.Arrays;

public class SearchIn2d {
    public static void main(String[] args) {
        int [][] arr = {
                {1, 43, 35},
                {3, 5, 34, 87},
                {2, 43, 87, 344},
                {18, 12}
        };
        int target = 18;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search (int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
