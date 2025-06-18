// Position of an element in a sorted array of infinite length.
// Just how the top bottom approach is used in binary search, similarly here, bottom up approach is used.
public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 5, 7, 8, 9, 13, 45, 56, 67, 87, 99, 133};
        int target = 45;
        System.out.println(ans(nums, target));
    }
    static int ans(int[] arr, int target) {
        // first find the range
        //first start with a box of size 2.
        int start = 0;
        int end = 1;
        // condition for the target to lie in the range
        while (target > arr[end]) {
            int newStart = end + 1;
            // double the box value
            // end = previous end + 2 * sizeofbox
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch (int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
