package com.sa2.Student.Controller;

import com.sa2.Student.Entity.Student;
import com.sa2.Student.Service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id) {
        return studentService.getStudent(id);
    }
    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
    @PostMapping
    public void postStudent(Student student){
        studentService.postStudent(student);
    }
    @DeleteMapping("/{id}")
    public void  deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }


}
