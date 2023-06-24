package com.sa2.Student.Service;

import com.sa2.Student.Entity.Course;
import com.sa2.Student.Entity.Student;

import java.util.List;

public interface StudentService {

    void postStudent(Student student);
    void deleteStudent(int id);
    Student getStudent(int id);
    List<Student> getStudents ();
}
