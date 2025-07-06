public class CountZeros {
    public static void main(String[] args) {
        System.out.println(zeros(305030200));
    }
    static int zeros(int n) {
        return helper(n, 0);
    }

    static int helper (int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, c + 1);
        }
        return helper(n / 10, c);
    }
}
