public class ReverseNum {
    public static void main(String[] args) {
        System.out.println(reverse1(1234));
        System.out.println(reverse2(1234));
    }


    static int sum = 0;
    static int reverse1(int n) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse1(n / 10);
        return sum;
    }

    static int reverse2(int n){
        if (n == 0) {
            return 0;
        }
        int arg = helper(n) - 1;
        return (int)((n % 10) * Math.pow(10, arg) + reverse2(n / 10));
    }
    static int helper(int n) {
        int ans = (int)(Math.log10(n)) + 1;
        return ans;
    }
}
