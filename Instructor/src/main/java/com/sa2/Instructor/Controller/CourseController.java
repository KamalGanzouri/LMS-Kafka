package com.sa2.Instructor.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sa2.Instructor.Entity.Course;
import com.sa2.Instructor.Service.Producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController {

    private  final Producer producer;

    @Autowired
    public CourseController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping
    public void addCourse (Course course) throws JsonProcessingException {
        producer.addCourse(course);
    }
    @DeleteMapping("/{id}")
    public void deleteCourse (@PathVariable int id) throws JsonProcessingException {
        Course course = new Course(id);
        producer.deleteCourse(course);
    }
}
