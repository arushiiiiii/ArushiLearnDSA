package com.stacks_queues;

import java.util.*;

public class InBuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(23);
        stack.push(6);
        stack.push(87);
        stack.push(5);

        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(8);
        queue.add(4);
        queue.add(12);
        queue.add(2);

        System.out.println(queue.peek());

        System.out.println(queue.remove());
        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>(); // on deque(deck), operations can be performed on both the ends
        deque.add(23);
        deque.addFirst(6);
        deque.addLast(2);
        deque.removeFirst();

        System.out.println(deque);
    }
}
