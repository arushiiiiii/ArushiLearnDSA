import java.util.Scanner;

public class StringsExample {
    public static void main (String[] args) {

//        System.out.println(greet());


      Scanner sc = new Scanner(System.in);
      String naam = sc.next();
      String personalised = myGreet(naam);
        System.out.println(personalised);
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greet() {
        String greeting = "How are you?";
        return greeting;
    }
}
