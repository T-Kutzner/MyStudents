package de.neuefische.mystudents.inheritance;

public class Main {

    public static void main(String[] args) {
        InformatikStudent tanja = new InformatikStudent();
        GeschichtsStudent steffi = new GeschichtsStudent();

        System.out.println(tanja.whichDrink());
        System.out.println(steffi.whichDrink());
        System.out.println(tanja.anzahlModule());
        System.out.println(steffi.anzahlModule());
    }
}
