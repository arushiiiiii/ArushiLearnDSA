public class Main {
    public static void main(String[] args) {
        // Print numbers from 1 to 5
        print(1);
    }
    static void print (int n) {
        // base condition
        if (n > 5) {
            return;
        }
        System.out.println(n);
        // recursive call
        // if you are calling a function again and again, you can treat it as a separate call in a stack.

        // this is called tail recursion
        // this is the last function call
        print(n + 1);
    }
}