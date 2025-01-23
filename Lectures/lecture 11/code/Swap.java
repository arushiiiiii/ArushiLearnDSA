public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(swap(a, b));   // here the swapped value of a is printed.
        System.out.println(a + " " + b);  // inside the function the value is swapped but here the value of a and b inside the main function is printed.

        String name = "Kunal Kushwaha";
        changeName(name);
        System.out.println(name);  // same thing is happening here also.
    }

    static void changeName(String naam) {
        naam = "Arushi Gupta";  // creating a new object
    }

    static int swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        return num1;
        // This function will swap the value inside the function. (valid only in this function scope)
    }
}
