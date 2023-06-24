package com.sa2.Student.Controller;

import com.sa2.Student.Entity.Course;
import com.sa2.Student.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }
    @GetMapping
    public List<Course> getCourses(){
        System.out.print("getCourses:: ");
        return courseService.getCourses();
    }
    @GetMapping("/{id}")
    public Course getCourse(@PathVariable int id){
        System.out.print("getCourse:: ");
        return courseService.getCourse(id);
    }

}
