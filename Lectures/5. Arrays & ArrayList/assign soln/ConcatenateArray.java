// Concatenation of array
import java.util.Arrays;
import java.util.Scanner;

public class ConcatenateArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array: ");
            int size = sc.nextInt();
            int[] nums = new int[size];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.println("The array ans is formed as follows: " + Arrays.toString(getConcatenation(nums)));
        }
        public static int[] getConcatenation(int[] arr) {
            int n = arr.length;
            int[] ans = new int[2*n];
            for (int j = 0; j < n; j++) {
                    ans[j] = arr[j];
                    ans[j + n] = arr[j];
                }
            return ans;
//            System.arraycopy();   This can also be used in this question. It copies the given number of elements for original array to the resulting array. It also reduces the complexity of the solution.
        }
}
