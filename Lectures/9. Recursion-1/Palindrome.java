public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palin(1233221));
    }

    static boolean palin(int n) {
        return n == rev(n);
    }

    static int rev(int n){
        if (n == 0) {
            return 0;
        }
        int arg = helper(n) - 1;
        return (int)((n % 10) * Math.pow(10, arg) + rev(n / 10));
    }
    static int helper(int n) {
        int ans = (int)(Math.log10(n)) + 1;
        return ans;
    }
}
