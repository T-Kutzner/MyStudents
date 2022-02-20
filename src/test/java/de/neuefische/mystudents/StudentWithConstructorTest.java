package de.neuefische.mystudents;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class StudentWithConstructorTest {

    @Test
    void shouldGetTheCreatedDatesOutOfTheConstructor() {

        // given
        StudentWithConstructor student = new StudentWithConstructor("Tanja", "Kutzner", "511968");

        // then
        Assertions.assertEquals("Tanja", student.getFirstName());
        Assertions.assertEquals("Kutzner", student.getLastName());
        Assertions.assertEquals("511968", student.getMatrikelNummer());
    }

    @Test
    void shouldGetKrebbelAsLastNameAfterChanging() {

        // given
        StudentWithConstructor student = new StudentWithConstructor("Tanja", "Kutzner", "511968");
        student.setLastName("Krebbel");

        // when
        String testStudent = student.getLastName();

        // then
        Assertions.assertEquals("Krebbel", testStudent);
    }

    @Test
    void shouldGetWholeDataOfCreatedStudentAsString(){

        // given
        StudentWithConstructor student = new StudentWithConstructor("Tanja", "Kutzner", "511968");

        // when
        String testStudent = student.studentTString();

        // then
        Assertions.assertEquals("{firstname: Tanja, lastname: Kutzner, matrikelnumber: 511968}", testStudent);
    }
}