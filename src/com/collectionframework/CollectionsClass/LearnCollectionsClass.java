package com.collectionframework.CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionsClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(22);
        list.add(34);
        list.add(44);
        list.add(22);

        System.out.println("MIN_ELEMENT: "+Collections.min(list));

        System.out.println("MAX_ELEMENT: "+Collections.max(list));

        // 22 is occuring twice so it will return 2
        System.out.println("COUNT_ELEMENT_OCCURRENCE: "+Collections.frequency(list,22));

        Collections.sort(list);
        System.out.println("Sorted List in Ascending Order: "+list);

        Collections.sort(list,Comparator.reverseOrder());
        System.out.println("Sorted List in Descending Order: "+list);
    }
}
