import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,5,1,6,8,4};

        System.out.println(checkPythagorean(arr) ? "True" : "False");
    }

    static boolean checkPythagorean(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    int x = arr[i] * arr[i];
                    int y = arr[j] * arr[j];
                    int z = arr[k] * arr[k];

                    if(x == y + z || y == x + z || z == x + y) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
