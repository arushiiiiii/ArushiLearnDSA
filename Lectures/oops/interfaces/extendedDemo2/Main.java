package com.oops.interfaces.extendedDemo2;

public class Main implements A, B {
// if each interface provide some default method, then we get an error
    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
    }
}
