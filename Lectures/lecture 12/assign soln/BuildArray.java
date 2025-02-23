import java.util.Arrays;
import java.util.Scanner;

public class BuildArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < size; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("The array ans is built as follows: " + Arrays.toString(permutation(nums)));
    }

//  If a method modifies the original array (without creating a new one), you don’t need to return it.
//  If a method creates a new array, you must return it and reassign it in main() to reflect the changes.
     public static int[] permutation(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
