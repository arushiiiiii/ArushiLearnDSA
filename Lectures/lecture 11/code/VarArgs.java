import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        demo(2,4,6,8);
        demo("Arushi", "Shiva");
        multiple(3, 5, "Any name");
        fun();
    }

    static void demo(int ...v) {     // you can use anything instead of v.
        System.out.println(Arrays.toString(v));     // Arrays.toString() needs to be added and Arrays also need to be imported to the program. since the number of arguments are not defined therefore the input will go in array form and to print it you must convert it into a string first.
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {    // variable args will be added at the end only.
        System.out.println(a + " " + b + Arrays.toString(v));
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
