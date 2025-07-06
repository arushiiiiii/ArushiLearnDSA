public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }

    static int sum (int n) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        return rem + sum(n / 10);
    }
}
