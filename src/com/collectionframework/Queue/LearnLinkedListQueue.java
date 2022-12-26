package com.collectionframework.Queue;

/*
FIFO : First In First Out
Queue contains duplicate elements
 */

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(13);
        queue.offer(12);
        queue.offer(14);

        System.out.println(queue);

        System.out.println(queue.poll()); // return first element and removes from Queue

        System.out.println(queue);

        System.out.println(queue.peek()); // returns the next element which is in queue
    }
}
