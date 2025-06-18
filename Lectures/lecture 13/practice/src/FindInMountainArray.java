public class FindInMountainArray {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6,8,4,2};
        int target = 7;
        int peak = peakElement(nums);
        if(orderAgon(nums,target,0,peak) != -1) {
            System.out.println(orderAgon(nums,target,0,peak));
        }
        else {
            System.out.println(orderAgon(nums,target,peak, nums.length-1));
        }
    }

    static int peakElement(int[] arr) {
        int start = 0;
        int end = arr.length;
        while(start < end) {
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid+1]) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }

    static int orderAgon(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target) {
                return mid;
            }
            if(isAsc) {
                if(target < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if(target < arr[mid]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
