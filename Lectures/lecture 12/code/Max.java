public class Max {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        System.out.println(maxRange(arr, 1, 3));
        System.out.println(max(arr));
    }

    static int maxRange(int[] arr, int start, int end) {
        // work on edge cases here, like array being null
        if (start > end) {
            return -1;
        }

        if (arr == null) {
            return -1;
        }

        int maxVal = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
