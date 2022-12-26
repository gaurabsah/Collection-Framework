package com.collectionframework.List;

import java.util.ArrayList;

public class LearnArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(12);
        aList.add(11);
        aList.add(12);
        aList.add(11);
        aList.add(14);

        /*
         List contains duplicate elements
         ArrayList doesn't have fixed size i.e. it dynamic in nature
         */

        System.out.println(aList);
    }

}
