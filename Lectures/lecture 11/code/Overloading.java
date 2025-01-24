public class Overloading {
    public static void main(String[] args) {
        int ans = sum(3, 5, 7);     // here there are three arguments passed, therefore the function with three arguments will be compiled.
        System.out.println(ans);

        fun(8);
//        fun("Arushi");     // If there are multiple functions with the same name, then the function with matching argument type will be compiled.
    }                        // this is called Overloading.

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println("First one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}
