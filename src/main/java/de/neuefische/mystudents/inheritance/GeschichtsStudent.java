package de.neuefische.mystudents.inheritance;

public class GeschichtsStudent extends Student {

    private int module = 3;

    @Override
    public String whichDrink() {

        return "whine";
    }

    @Override
    public int anzahlModule() {

        return module;
    }
}
