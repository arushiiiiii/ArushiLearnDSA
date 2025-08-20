package com.oops.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();
        son.partner();

        son.normal();

        Parent daughter = new Daughter(28);
        daughter.career();
        daughter.partner();

        Parent.hello();

//        Parent mom = new Parent(45);  you cannot create objects of an abstract class
    }
}
