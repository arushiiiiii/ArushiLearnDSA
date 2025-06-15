// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNum(nums));
    }

    static int findNum (int[] arr) {
        int count = 0;
        for (int num : arr) {

            // if ((int)(Math.log10(num)+1)%2 == 0) {
            //    count++; }

            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        if (digits(num) % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digits (int num) {
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;
        while(num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
