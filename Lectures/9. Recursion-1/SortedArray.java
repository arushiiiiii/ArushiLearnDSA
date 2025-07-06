public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {2,4,5,9,7,8,9};
        System.out.println(helper(arr));
    }

    static boolean helper(int[] arr) {
        return sort(arr, 0);
    }

    static boolean sort(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] < arr[i + 1] && sort(arr, i + 1)) {
            return true;
        }
        else {
            return false;
        }
    }
}
