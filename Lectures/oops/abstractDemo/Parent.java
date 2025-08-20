package com.oops.abstractDemo;
// we cannot have final abstract class
public abstract class Parent {
    int age;

    final int VALUE;
    public Parent(int age) {
        this.age = age;
        VALUE = 24544;
    }

    static void hello(){
        System.out.println("Hey");
    }
    // abstract(can be overridden) static(cannot be overridden) methods cannot be created but static methods can be created in abstract classes

    void normal() {
        System.out.println("This is a normal method");
    }

//    abstract Parent();  we cannot create abstract constructors
    abstract void career();
    abstract void partner();
}
