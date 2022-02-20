package de.neuefische.mystudents;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void shouldGetTanjaAsFirstNameAfterSetTanja() {

        // given
        Student student = new Student();
        student.setFirstName("Tanja");

        // when
        String testStudent = student.getFirstName();

        // then
        Assertions.assertEquals("Tanja", testStudent);
    }


    @Test
    void shouldGetKutznerAsLastNameAfterSetKutzner() {

        // given
        Student student = new Student();
        student.setLastName("Kutzner");

        // when
        String testStudent = student.getLastName();

        // then
        Assertions.assertEquals("Kutzner", testStudent);
    }


    @Test
    void shouldGet511968AsMatrikelNummerAfterSet511968() {

        // given
        Student student = new Student();
        student.setMatrikelNummer("511968");

        // when
        String testStudent = student.getMatrikelNummer();

        // then
        Assertions.assertEquals("511968", testStudent);
    }
}