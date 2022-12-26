package com.collectionframework.Queue;

/*
Implements heap DS
 */

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

//        MIN_ELEMENT

        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(22);
        pq.offer(12);
        pq.offer(40);
        pq.offer(36);

        System.out.println(pq);

        System.out.println(pq.peek());

        pq.poll();

        System.out.println(pq);

        System.out.println(pq.peek());

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

//        if you want to reverse the order of peek then i.e MAX_ELEMENT

        Queue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        pq1.offer(22);
        pq1.offer(12);
        pq1.offer(40);
        pq1.offer(36);

        System.out.println(pq1);

        System.out.println(pq1.peek());

        pq1.poll();

        System.out.println(pq1);

        System.out.println(pq1.peek());
    }
}
