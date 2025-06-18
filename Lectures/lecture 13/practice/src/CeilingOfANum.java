// If the array is sorted then try to apply binary search first.
public class CeilingOfANum {
    // Ceiling is the smallest element in array greater than or equal to target.
    public static void main(String[] args) {
        int[] nums = {-2,3,14,15,18,24,29};
        System.out.println(Ceiling(nums,32));
    }
// This is a simple linear search approach.
//    static int Ceiling(int[] arr, int target) {
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] >= target) {
//                return arr[i];
//            }
//        }
//        return -1;
//    }

    static int Ceiling(int[] arr, int target) {
        if (target > arr[arr.length-1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid +1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
