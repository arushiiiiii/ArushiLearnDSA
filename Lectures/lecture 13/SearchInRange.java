public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {2, 4, 23, -5, 5, -65};
        int target = 5;
        int start = 1;
        int end = 4;
        System.out.println(search(nums, target, start, end));
    }

    static int search(int[] arr, int target, int start, int end){
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
