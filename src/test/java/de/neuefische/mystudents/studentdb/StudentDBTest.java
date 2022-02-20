package de.neuefische.mystudents.studentdb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class StudentDBTest {

    @Test
    void shouldGiveAListOfAllCreatedStudents() {
        // given
        Student[] students = {  new Student(1, "Tanja Kutzner"),
                                new Student(2, "Moritz Krebbel"),
                                new Student(3, "Theo Eisen")    };

        StudentDB studentDB = new StudentDB(students);

        // when
        Student[] actual = studentDB.list();

        // then
        Assertions.assertArrayEquals(students, actual);
    }

    @Test
    void shouldGetCreatedStudentsInArrayAsStringList() {

        // given
        Student[] students = {new Student(1, "Tanja Kutzner"),
                new Student(2, "Moritz Krebbel"),
                new Student(3, "Theo Eisen")};

        StudentDB studentDB = new StudentDB(students);

        // when
        String actual = studentDB.toString();
        System.out.println(studentDB.toString());

        // then
        Assertions.assertEquals(1, students[0].getiD());
        Assertions.assertEquals("Tanja Kutzner", students[0].getName());
        Assertions.assertEquals("[{iD: 1, name: Tanja Kutzner}, {iD: 2, name: Moritz Krebbel}, {iD: 3, name: Theo Eisen}]", actual);
    }

    @Test
    void shouldGetRandomStudent() {

        // given
        Student[] students = {  new Student(1, "Tanja Kutzner"),
                                new Student(2, "Moritz Krebbel"),
                                new Student(3, "Theo Eisen")};

        StudentDB studentDB = new StudentDB(students);

        // when
        Student actualStudent = studentDB.randomStudent(students);

        // then
        Assertions.assertNotNull(actualStudent);
    }


    @Test
    void shouldGetOneStudentAddedToCreatedStudents() {

        // given
        Student[] students = {  new Student(1, "Tanja Kutzner"),
                                new Student(2, "Moritz Krebbel")};

        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.addStudent(new Student(4, "Theo Eisen"));

        Student[] actualStudents = studentDB.list();

        // then
        Student[] expected = {  new Student(1, "Tanja Kutzner"),
                                new Student(2, "Moritz Krebbel"),
                                new Student(4, "Theo Eisen")    };

        Assertions.assertArrayEquals(expected, actualStudents);
    }

    @Test
    void shouldGetDeleteFirstFromCreatedStudents() {

        // given
        Student[] students = {  new Student(1, "Tanja Kutzner"),
                                new Student(2, "Moritz Krebbel"),
                                new Student(3, "Theo Eisen")    };

        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.deleteStudent(0);

        Student[] actualStudents = studentDB.list();

        // then
        Student[] expected = {  new Student(2, "Moritz Krebbel"),
                                new Student(3, "Theo Eisen")    };

        Assertions.assertArrayEquals(expected, actualStudents);
    }

    @Test
    void shouldGetDeleteMiddleFromCreatedStudents() {

        // given
        Student[] students = {  new Student(1, "Tanja Kutzner"),
                                new Student(2, "Moritz Krebbel"),
                                new Student(3, "Theo Eisen")    };

        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.deleteStudent(1);

        Student[] actualStudents = studentDB.list();

        // then
        Student[] expected = {  new Student(1, "Tanja Kutzner"),
                                new Student(3, "Theo Eisen")    };

        Assertions.assertArrayEquals(expected, actualStudents);
    }

    @Test
    void shouldGetDeleteLastFromCreatedStudents() {

        // given
        Student[] students = {  new Student(1, "Tanja Kutzner"),
                                new Student(2, "Moritz Krebbel"),
                                new Student(3, "Theo Eisen")    };

        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.deleteStudent(2);

        Student[] actualStudents = studentDB.list();

        // then
        Student[] expected = {  new Student(1, "Tanja Kutzner"),
                                new Student(2, "Moritz Krebbel")    };

        Assertions.assertArrayEquals(expected, actualStudents);
    }
}