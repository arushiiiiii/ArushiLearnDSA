public class Main {
    public static void main(String[] args) {
        int[] nums = {-1,0,2,3,5,6,12,34,56};
        System.out.println(binarySearch(nums,12));
    }

    //return the index
    // return -1 if element not found
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
//            int mid = (start+end)/2;    In this it might be possible that (start+end) exceeds the range of int in java.
            int mid = start + (end - start)/2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(target > arr[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}