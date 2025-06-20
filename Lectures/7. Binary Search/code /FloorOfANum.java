// Floor of a number is the biggest number smaller than or equal to the target number.
public class FloorOfANum {
    public static void main(String[] args) {
        int[] nums = {-4,-1,5,8,12,34,67,90};
        System.out.println(Floor(nums, -5));
    }
    static int Floor(int[] arr, int target) {
        if (target < arr[0]) {
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[end];
    }
}
