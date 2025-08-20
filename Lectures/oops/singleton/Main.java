package com.oops.singleton;

import com.oops.access.A;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

        // all three reference variables are pointing to just one object.

        A a = new A(10, "abcd");
        a.getNum();
    }
}
