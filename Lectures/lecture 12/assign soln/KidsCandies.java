import java.util.*;

public class KidsCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array candies: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements(number of candies) of array: ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the number of extra candies: ");
        int extraCandies = sc.nextInt();
        System.out.println("The required array is: " + kidsWithCandies(nums, extraCandies));
    }


    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        // Step 1: Find the max number of candies a kid currently has
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }

        // Step 2: Check if each kid can have max candies after extraCandies
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }
        return result;
    }
}


