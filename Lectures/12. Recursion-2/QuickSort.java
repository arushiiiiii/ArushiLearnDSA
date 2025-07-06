import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int mid = high;
        int pivot = nums[mid];

        while (s <= e){
            // Also a reason why if its already sorted it will not swap.
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        // Now the pivot is at correct index, therefore sort the next two halves.
        sort(nums, low, e);
        sort(nums, s, high);
    }
}
