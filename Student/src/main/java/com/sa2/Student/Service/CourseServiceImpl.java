package com.sa2.Student.Service;

import com.sa2.Student.DAO.CourseDAO;
import com.sa2.Student.Entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    private final CourseDAO courseDAO;

    public CourseServiceImpl(CourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }

    @Override
    public void postCourse(Course course) { courseDAO.postCourse(course); }

    @Override
    public void deleteCourse(Course course) {
        courseDAO.deleteCourse(course);
    }
    @Override
    public Course getCourse(int id){
        return courseDAO.getCourse(id);
    }

    @Override
    public List<Course> getCourses() {
        return courseDAO.getCourses();
    }
}
