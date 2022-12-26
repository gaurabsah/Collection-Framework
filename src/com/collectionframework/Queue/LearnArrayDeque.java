package com.collectionframework.Queue;

import java.util.ArrayDeque;

/*
In ArrayDeque, you can add and remove elements from both side i.e start and end
 */
public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(12);
        adq.offerFirst(20);
        adq.offerLast(7);
        adq.offer(77);

        System.out.println(adq);
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("Poll "+adq);

        System.out.println(adq.pollFirst());
        System.out.println("Poll First "+adq);

        System.out.println(adq.pollLast());
        System.out.println("Poll Last "+adq);
    }
}
