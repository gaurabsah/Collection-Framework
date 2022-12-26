package com.collectionframework.ArraysClass;

import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,9,33,77,99};

        int index = Arrays.binarySearch(arr,77);
        System.out.println("The Key is present at: "+index);

        int[] numbers = {77,99,44,22,66,33,11};
        Arrays.sort(numbers);  // it implements quicksort
        System.out.println(Arrays.toString(numbers));


    }
}
