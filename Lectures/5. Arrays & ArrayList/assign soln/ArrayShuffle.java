import java.util.Arrays;
import java.util.Scanner;

public class ArrayShuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] nums = new int[2 * size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < (2 * size); i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("The new array is formed as follows: " + Arrays.toString(shuffle(nums, size)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2 * n];
        for (int i = 0; i < n; i++) {
            arr[2 * i] = nums[i];
            arr[2 * i + 1] = nums[n + i];
        }
        return arr;
    }
}
