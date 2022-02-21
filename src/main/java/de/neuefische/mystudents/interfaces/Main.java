package de.neuefische.mystudents.interfaces;

public class Main {

    public static void main(String[] args) {

        GeschichtsStudent gs = new GeschichtsStudent();
        InformatikStudent is = new InformatikStudent();
        Student student = new GeschichtsStudent();

        System.out.println(gs.getCourse());
        System.out.println(is.getCourse());
        System.out.println(student.getCourse());

        System.out.println(course(is));
    }

    public static String course(Student student) {
        return student.getCourse();
    }
}