package com.oops.staticExample;

public class Main {
    public static void main(String[] args) {
        Human arushi = new Human(20, "Arushi Gupta", 0, false);
        System.out.println(arushi.population);
        Human shruti = new Human(21, "Shruti Singh", 0, false);

        System.out.println(arushi.name);
        System.out.println(arushi.population);
        System.out.println(Human.population);
    }
}