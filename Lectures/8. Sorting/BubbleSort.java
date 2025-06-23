import java.util.Arrays;

// Bubble sort is also known as Sinking Sort or Exchange Sort.
public class BubbleSort {
    public static void main(String[] args) {
        boolean swapped;
        int[] arr = {-3,5,1,-4,7,2};
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            swapped = false;
            for(int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            // If you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if(!swapped) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}