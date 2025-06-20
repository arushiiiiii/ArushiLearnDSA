public class Shadowing {
    static int x = 90;     // static is used because it is used inside the static function.
                           // this will be shadowed at line 8.
    public static void main(String[] args) {
        System.out.println(x);     //90
        int x;     // the class variable at line 4 is shadowed by this.
//        System.out.println(x);     // scope will begin when value is initialised.
        x = 40;
        System.out.println(x);     //40
        fun();     // this will print 90 because it won't be using the values of identifiers inside the main function.
    }

    static void fun() {
        System.out.println(x);
    }
}
