public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fiboFormula(50));
    }
    static int fibo(int n) {
        // base condition
        if (n < 2) {
            return n;
        }

        // here it is not directly returning instead it first requires addition and then returns.
        // therefore not tail recursion
        return fibo(n - 1) + fibo(n - 2);
    }

    static int fiboFormula(int n) {
        return (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n));
    }
}
