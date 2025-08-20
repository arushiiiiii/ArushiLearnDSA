package com.oops.interfaces.extendedDemo2;

public interface A {
    // static interface methods should always have a body because static don't depend on objects and objects can be inherited and inheritance means you can override. therefore static methods cannot be overridden and hence need a body
//    static void greeting(); not allowed

    // call via the interface name
    static void greeting() {
        System.out.println("Heyaa");
    }

    default void fun() {
        System.out.println("I am in A");
    }
}
