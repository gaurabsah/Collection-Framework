package com.collectionframework.ComparatorInterface;

import java.util.Comparator;

public class StudentDetails implements Comparator<StudentDetails> {
    private String name;
    private int rollNo;

    public StudentDetails(){

    }

    public StudentDetails(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "StudentsDetail{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }


    @Override
    public int compare(StudentDetails o1, StudentDetails o2) {
        return o1.name.compareTo(o2.name);
    }
}
