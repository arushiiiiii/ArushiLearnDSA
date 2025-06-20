public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Arushi";
        {
//            int a = 30;     // already initialised outside the block inside the same method, hence you cannot initialise again.
            a = 23;     // we can reassign the original ref variable to some other value.
            System.out.println(a);
            int c = 66;
            name = "Kunal";
            System.out.println(name);
            // values initialised inside the block cannot be accessed outside of it
        }
        int c = 64;
        System.out.println(a);     // here the value of a and name are reassigned ones.
        System.out.println(name);
        System.out.println(c);     // cannot use outside the block.

        // scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
            a = 155;
        }
//        System.out.println(num);   // here the value of num can't be assessed outside of the for loop.
        random(33);
    }

    static void random(int marks) {
        int num = 35;
        System.out.println(num);
        System.out.println(marks);
    }
}