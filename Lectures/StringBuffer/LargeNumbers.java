import java.math.BigDecimal;
import java.math.BigInteger;

public class LargeNumbers {
    public static void main(String[] args) {
        BD();
    }
    static void BD() {
        double x = 0.03;
        double y = 0.04;
        double ans = y-x;
        System.out.println(ans);

        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");
        BigDecimal ans2 = Y.subtract(X);
        System.out.println(ans2);

        BigDecimal a = new BigDecimal("34651936.46565786746");
        BigDecimal b = new BigDecimal("354906407605.06453246564");

        // OPERATIONS
        System.out.println(b.add(a));
        System.out.println(b.subtract(a));
        System.out.println(b.pow(2));
        System.out.println(b.negate());

        // constants
        BigDecimal con = BigDecimal.ONE;
    }

    static void BI() {
        // primitive type
        int a = 30;
        int b = 67;

        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(323346547);  // convert int/long to BI.  // this has to be in the range of integer
        int c = B.intValue();  // converts BI to int
        BigInteger C = new BigInteger("2323534656744567");  // for passing large numbers , use strings

        // constants
        BigInteger D = BigInteger.TEN;

        // addition
        BigInteger s = A.add(C);  // we can't add directly because these are objects
        BigInteger m = C.multiply(B);
        BigInteger sub = C.subtract(A);
        BigInteger d = C.divide(B);
        BigInteger rem = C.remainder(A);

        if (A.compareTo(C) < 0) {
            System.out.println("Oo");
        }

        System.out.println(d);
    }
}
