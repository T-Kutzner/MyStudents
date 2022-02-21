package de.neuefische.mystudents.interfaces;

public class Main {

    public static void main(String[] args) {

        GeschichtsStudent gs = new GeschichtsStudent();
        InformatikStudent is = new InformatikStudent();

        System.out.println(gs.getCourse());
        System.out.println(is.getCourse());
    }
}
