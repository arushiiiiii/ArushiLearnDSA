import java.util.*;

public class RunningSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("The new array is formed as follows: " + Arrays.toString(Sum(nums)));
    }
    public static int[] Sum(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        arr[0] = nums[0];
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + nums[i];
        }
        return arr;
    }
}
