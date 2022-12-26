package com.collectionframework.Set;

/*
Does not contain duplicate elements
It stores elements in ordered.
 */

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
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
