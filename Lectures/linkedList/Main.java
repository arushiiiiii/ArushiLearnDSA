package com.linkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(2);
        list.insertFirst(0);
        list.insertLast(5);
        list.insert(23, 5);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        System.out.println(list.findNode(4));
        list.insertRec(24, 1);
        list.display();


//
//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(2);
//        list.insertFirst(0);
//        list.insertLast(21);
//        list.insertAfter(0, 44);
//        list.display();


//        CLL list = new CLL();
//        list.insert(2);
//        list.insert(3);
//        list.insert(5);
//        list.insert(7);
//        list.insert(9);
//        list.delete(5);
//        list.display();
    }
}