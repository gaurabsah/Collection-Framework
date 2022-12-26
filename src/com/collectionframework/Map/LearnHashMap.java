package com.collectionframework.Map;

import java.util.HashMap;
import java.util.Map;

/*
It stores key-value pair.
Key must be unique.
 */

public class LearnHashMap {
    public static void main(String[] args) {
        Map<String,Integer> numbers = new HashMap<>();
        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("three",3);
        numbers.put("four",4);

        System.out.println(numbers);

        numbers.put("two",23); // it will override the value of key "two"

        System.out.println(numbers);

        numbers.putIfAbsent("four",44);  // it will not override since key "four" is already present in map
        System.out.println(numbers);

        numbers.putIfAbsent("five",55); // it will add key "five" into the map because key="five" is not present in map.
        System.out.println(numbers);

        System.out.println(numbers.containsKey("two")); // returns true if key is present in hashmap

        System.out.println(numbers.containsValue(55));  // returns true if value is present in hashmap

//        Iterating hashmap

        for(Map.Entry<String,Integer> hm:numbers.entrySet()){
            System.out.println("After Iteration: "+hm); //this will return key-value pair

            System.out.println("Key: "+hm.getKey());  // this will return key.
            System.out.println("Value: "+hm.getValue());  // this will return value
        }
    }
}
