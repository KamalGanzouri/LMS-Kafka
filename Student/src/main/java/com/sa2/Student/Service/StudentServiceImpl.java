package com.sa2.Student.Service;

import com.sa2.Student.DAO.StudentDAO;
import com.sa2.Student.Entity.Course;
import com.sa2.Student.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    private final StudentDAO studentDAO;

    @Autowired
    public StudentServiceImpl(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public void postStudent(Student student) {
        studentDAO.postStudent(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentDAO.deleteStudent(id);
    }

    @Override
    public Student getStudent(int id) {
        return studentDAO.getStudent(id);
    }

    @Override
    public List<Student> getStudents() {
        return studentDAO.getStudents();
    }


}
