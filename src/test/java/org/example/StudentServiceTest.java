package org.example;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class StudentServiceTest {

    @Test
    public void getStudentsTest(){

        StudentService studentService = new StudentService();

        Student student = new Student(1, "Moe");

         List<Student> listOfStudents = studentService.getAllStudents();
         studentService.addStudent(student);

         boolean actualResults = listOfStudents.isEmpty();

         assertTrue(actualResults);
    }

}