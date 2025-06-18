public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] nums = {100,98,54,32,22,13,12,11,4,2,-1};
        System.out.println(orderAgo(nums,12));
    }
    static int orderAgo(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
