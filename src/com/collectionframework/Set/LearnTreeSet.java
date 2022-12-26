package com.collectionframework.Set;

import java.util.Set;
import java.util.TreeSet;

/*
It implements Binary Search Tree.
It stores elements in sorted form.
It does not contain duplicate element.
 */

public class LearnTreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(13);
        set.add(7);
        set.add(77);
        set.add(55);

        System.out.println(set);

        set.remove(77);
        System.out.println(set);

        System.out.println(set.contains(77)); // returns false

        System.out.println(set.isEmpty());  // returns false

        System.out.println(set.size());

        set.clear();
        System.out.println(set);
    }
}
