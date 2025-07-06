public class UniqueNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,8,4,3,2,2,8,4,8};
        System.out.println("Unique Number:" + ans(arr));
    }
    private static int ans(int[] arr) {
        int result = 0;
        for(int i = 0; i < 32; i++) {
            int sum = 0;
            int mask = 1 << i;
            for (int num : arr) {
                if ((num & mask) != 0) {
                    sum++;
                }
            }
            if (sum % 3 != 0) {
                result |= mask;
            }
        }
        return result;
    }
}
