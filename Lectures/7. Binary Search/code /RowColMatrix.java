// This question is not done using binary search because the array was not strictly sorted. Here sorting is done row wise and column wise.
import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(arr,37)));
    }
    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }
            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
// The time complexity here will be O(n+n) = O(2n) = O(n), here n is the number of rows and cols, since we are traversing once for an entire number of rows and once for the total number of columns therefore n+n; and space O(1).
