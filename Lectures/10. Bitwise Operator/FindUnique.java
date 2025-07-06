public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 8, 2, 6, 5, 8, 3};
        System.out.println(ans(arr));
    }
    private static int ans(int[] arr) {
        int unique = 0;
        for(int num : arr) {
            unique ^= num;
        }
        return unique;
    }
}
// There operators are associative also. therefore a^b^c = b^a^c.
// Also a^a == 0
