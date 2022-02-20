package de.neuefische.mystudents.studentdb;

public class StudentDB {

    private Student[] students;


    StudentDB(Student[] students){
        this.students = students;
    }


    public Student[] list(){
        return students;
    }


    @Override
    public String toString() {

        String studentList = "[";

        for (int i = 0; i < students.length; i++) {

            studentList += i < students.length - 1 ? (students[i] + ", ") : students[i];
        }

        studentList += "]";

        return studentList;
    }


    public Student randomStudent(Student[] students){

        return students[(int) (students.length * Math.random())];
    }


    public void addStudent(Student student){

        Student[] newStudents = new Student[students.length + 1];

        for (int i = 0; i < newStudents.length - 1; i++) {

            newStudents[i] = this.students[i];
        }
        newStudents[newStudents.length - 1] = student;

        this.students = newStudents;
    }


    public void deleteStudent(int index) {

        Student[] newStudents = new Student[students.length - 1];

        for (int i = 0; i < index; i++) {

            newStudents[i] = this.students[i];
        }

        for (int i = index + 1; i < students.length; i++) {
            newStudents[i-1] = this.students[i];
        }

        this.students = newStudents;
    }
}



