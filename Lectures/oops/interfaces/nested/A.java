package com.oops.interfaces.nested;

public class A {
    // nested interface
    // The nested interfacee can be declared as public, private or protected but top level interface needs to be default or public
    public interface NestedInterface {
        boolean isOdd(int num);
    }
}
class B implements A.NestedInterface {

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}