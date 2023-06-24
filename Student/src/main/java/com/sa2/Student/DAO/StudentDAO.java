package com.sa2.Student.DAO;

import com.sa2.Student.Entity.Course;
import com.sa2.Student.Entity.Student;

import java.util.List;

public interface StudentDAO {
    void postStudent(Student student);
    void deleteStudent(int id);
    Student getStudent(int id);
    List<Student> getStudents ();


}
