package de.neuefische.mystudents;

import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;
    private String matrikelNummer;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMatrikelNummer() {
        return matrikelNummer;
    }

     public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setMatrikelNummer(String matrikelNummer) {
        this.matrikelNummer = matrikelNummer;
    }
}
