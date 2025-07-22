package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;


public class StudentServiceTests {
    @Test
    public void getStudentTest(){

        StudentService ss = new StudentService();
        // Student s = new Student(10, "Krishna");
        // ss.addStudent(s);
        List<Student> los = ss.getStudent();

        boolean result = los.isEmpty();
        assertTrue(result,"Student is not present");
        assertTrue(() -> result, "Not Empty");
        // assertTrue(result, " is present in list");
    }

}
