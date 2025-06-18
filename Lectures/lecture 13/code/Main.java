public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 34, 65, 1, 3, 6, 9, -12, 19, -3};
        int target = 19;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    // search the target and return the index.
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for(int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}