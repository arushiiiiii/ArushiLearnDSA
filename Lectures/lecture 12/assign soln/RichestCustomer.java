import java.util.Scanner;

public class RichestCustomer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of customers: ");
        int i = sc.nextInt();
        System.out.println("Enter the number of banks: ");
        int b = sc.nextInt();
        int[][] arr = new int[i][b];
        System.out.println("Enter the amount of money for each customer in each bank: ");
        for (int j = 0; j < i; j++) {  // j is the customer
            for (int k = 0; k < b; k++) {  // k is the bank
                arr[j][k] = sc.nextInt();
            }
        }
        System.out.println("The maximum wealth is: " + maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                total += accounts[i][j];
            }
            if (total > max) {
                max = total;
            }
        }
        return max;
    }
}
