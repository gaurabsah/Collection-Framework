package com.collectionframework.List;

/*
LIFO :- Last In First Out
 */

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Cow");
        animals.push("Dog");
        animals.push("Cat");

        System.out.println("Stacks: "+animals);

        System.out.println(animals.peek());  // returns last added element which will be at top

        animals.pop();  // remove the top element i.e. lastly added element

        System.out.println("Stacks: "+animals);

        System.out.println(animals.peek());
    }
}
