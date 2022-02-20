package de.neuefische.mystudents.studentdb;

import java.util.Objects;

public class Student {

    private int iD;
    private String name;


    Student(int iD, String name) {
        this.iD = iD;
        this.name = name;
    }


    public int getiD() {
        return iD;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "{iD: " + iD + ", name: " + name + "}";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return iD == student.iD && Objects.equals(name, student.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(iD, name);
    }
}
