import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,-5,7,2};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            // find the max item in the remaining array and swap with correct index.
            int last = arr.length - i - 1;
            int max = 0;
            for(int j = 0; j <= last; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            int temp = arr[last];
            arr[last] = arr[max];
            arr[max] = temp;
        }
    }
}

