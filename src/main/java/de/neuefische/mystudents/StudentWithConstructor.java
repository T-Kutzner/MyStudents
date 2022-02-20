package de.neuefische.mystudents;

import java.util.Objects;

public class StudentWithConstructor {

    private String firstName;
    private String lastName;
    private String matrikelNummer;


    StudentWithConstructor(String firstName, String lastName, String matrikelNummer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.matrikelNummer = matrikelNummer;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMatrikelNummer() {
        return matrikelNummer;
    }


    public void setLastName(String lastName){
        this.lastName = lastName;
    }


    public String studentTString() {
        return "{firstname: " + getFirstName() +
                ", lastname: " + getLastName() +
                ", matrikelnumber: " + getMatrikelNummer() + "}";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentWithConstructor that = (StudentWithConstructor) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(matrikelNummer, that.matrikelNummer);
    }


    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, matrikelNummer);
    }
}
