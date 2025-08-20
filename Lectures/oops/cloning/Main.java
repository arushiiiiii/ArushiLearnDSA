package com.oops.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human a = new Human(18, "Priya");
//        Human twin = new Human(a);

        Human twin = (Human)a.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 0;
        System.out.println(Arrays.toString(a.arr));
        System.out.println(Arrays.toString(twin.arr));
    }
}
