package com.sa2.Student.DAO;

import com.sa2.Student.Entity.Course;

import java.util.List;

public interface CourseDAO {
    void postCourse(Course course);

    Course getCourse(int id);
    void deleteCourse(Course course);
    List<Course> getCourses();
}
