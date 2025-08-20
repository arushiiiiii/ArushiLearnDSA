package com.oops.generics;

import java.util.Arrays;
import java.util.List;

// here T should either be Number or its subclasses
public class WildcardExample<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;  // also working as index value

    public WildcardExample() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list) {
        // Anything

        // If we don't write ? extends with Number then only Number type can be passed and not the subclasses
    }
    public void add (T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T removed() {
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T)(data[index]);
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        WildcardExample<Integer> list = new WildcardExample(); // Now we cannot use string or any other type. only the type which comes under Number can be used.
        for (int i = 0; i < 12; i++) {
            list.add(2 * i);
        }

        System.out.println(list);
    }
}
