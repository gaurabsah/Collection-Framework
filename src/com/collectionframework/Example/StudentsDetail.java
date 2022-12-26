package com.collectionframework.Example;

import java.util.Objects;

public class StudentsDetail {
    private String name;
    private int rollNo;

    public StudentsDetail(){

    }

    public StudentsDetail(String name, int rollNo) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentsDetail that = (StudentsDetail) o;
        return rollNo == that.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }
}
