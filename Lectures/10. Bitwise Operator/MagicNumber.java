public class MagicNumber {
    public static void main(String[] args) {
        int n = 5;
        int ans = 0;
        int base = 5;
        while (n > 0) {
            int lastDig = n & 1;
            n = n >> 1;
            ans += lastDig * base;
            base = base * 5;
        }
        System.out.println(ans);
    }
}
