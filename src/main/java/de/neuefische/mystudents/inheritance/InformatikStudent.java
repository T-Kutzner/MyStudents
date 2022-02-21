package de.neuefische.mystudents.inheritance;

public class InformatikStudent extends Student {

    private int module = 5;

/*
    @Override
    public String whichDrink() {

        return "beer";
 */

    @Override
    public int anzahlModule() {

        return module;
    }
}
