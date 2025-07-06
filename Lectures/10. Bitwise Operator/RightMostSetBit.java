public class RightMostSetBit {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(ans(n));
    }
    private static int ans(int n) {
        int pos = 1;
        int bitMask = 1;
        while(n > 0) {
            if ((n & bitMask) != 0) {
                return pos;
            }
            else {
                pos++;
                bitMask = bitMask << 1;
            }
        }
        return -1;
    }
}
