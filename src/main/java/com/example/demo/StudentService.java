package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> sts = new ArrayList<>();

    public List<Student> getStudent(){
        return this.sts;
    }

    public void addStudent(Student student){
        sts.add(student);
    }
}
