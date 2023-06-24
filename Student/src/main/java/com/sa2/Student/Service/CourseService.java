package com.sa2.Student.Service;

import com.sa2.Student.Entity.Course;

import java.util.List;

public interface CourseService {
    void postCourse(Course course);
    void deleteCourse(Course course);
    Course getCourse(int id);
    List<Course> getCourses();
}
