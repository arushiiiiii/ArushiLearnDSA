package com.oops.cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1, 2, 3, 4};
    }
// the below statements are not required now
//    public Human(Human other) {
//        this.age = other.age;
//        this.name = other.name;
//    }


//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        // this is shallow copy
//        // for primitives it creates a new copy but for non-primitives like arrays, strings, etc it will not create a new copy instead point to the given(previous) object only
//        // this is not the pure copy of the object
//        // therefore a change in the twin object will also change the real object
//        return super.clone();
//    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        // this is a deep copy
        Human twin = (Human)super.clone(); // this is actually shallow copy
        // making a deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
