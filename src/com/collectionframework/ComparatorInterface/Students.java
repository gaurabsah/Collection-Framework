package com.collectionframework.ComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Students {
    public static void main(String[] args) {
        List<StudentDetails> student = new ArrayList<>();
        student.add(new StudentDetails("Gaurab",101));
        student.add(new StudentDetails("Saurab",103));
        student.add(new StudentDetails("Ram",1001));
        student.add(new StudentDetails("Sita",102));

        System.out.println("Before Sorting: "+student);
        Collections.sort(student, new StudentDetails());
        System.out.println("After Sorting: "+student);
    }
}
