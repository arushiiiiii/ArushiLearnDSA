package com.oops.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            divide(a, b);
//            throw new Exception("just for fun");

            String name = "abc";
            if (name.equals("abc")) {
                throw new MyException("name not found");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) { // arithmeticException is a subclass of exception. therefore Exception should not be at first catch if there are more than one catch statements because every exception comes under the exception class.
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("normal exception");
        } finally {
            System.out.println("this will always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Do not divide by 0");
        }
        return a / b;
    }
}
