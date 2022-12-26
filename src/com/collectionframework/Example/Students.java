package com.collectionframework.Example;

import java.util.HashSet;
import java.util.Set;

public class Students {
    public static void main(String[] args) {

        Set<StudentsDetail> student = new HashSet<>();
        student.add(new StudentsDetail("Gaurab",101));
        student.add(new StudentsDetail("Saurab",103));
        student.add(new StudentsDetail("Ram",1001));
        student.add(new StudentsDetail("Sita",101));

        System.out.println(student);
    }
}
