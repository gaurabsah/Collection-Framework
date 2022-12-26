package com.collectionframework.List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


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


        /*
        you can declare ArrayList in another way as well
        Here List is a interface and ArrayList is a class
         */

        List<String> list = new ArrayList<>();
        list.add("Gaurab");
        list.add("Saurab");
        list.add("Gaurab");
        list.add("Ram");
        list.add("Sita");
        list.add("Shyam");

        System.out.println(list);

        list.add(0,"adding element at 0th index");
        System.out.println(list);

        List<String> l =list.stream().distinct().collect(Collectors.toList());
        System.out.println(l); // it will remove duplicate element present in list

        list.remove(0);
        System.out.println(list); // this will remove the element at index 0

        boolean bool = list.contains("Gaurab");
        System.out.println(bool);   // this will check if the list contains the following element or not

        list.clear();
        System.out.println(list); // this will clear/empty the list
    }

}
