package com.collectionframework.Set;

/*
Does not contain duplicate elements
It stores elements in unordered.
 */

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
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
