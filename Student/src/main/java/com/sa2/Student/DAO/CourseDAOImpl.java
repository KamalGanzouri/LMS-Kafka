package com.sa2.Student.DAO;

import com.sa2.Student.Entity.Course;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseDAOImpl implements  CourseDAO{
    private final EntityManager entityManager;

    public CourseDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void postCourse(Course course){
        entityManager.persist(course);
    }

    @Override
    public Course getCourse(int id) {
        Course course = entityManager.find(Course.class,id);
        if (course==null){
            System.out.println("This Course id isn't in database");
        }else {
            System.out.println(course);
        }
        return course;
    }

    @Override
    @Transactional
    public void deleteCourse(Course course) {
        Course tempCourse = getCourse(course.getId());
        if (tempCourse!=null){
            System.out.println("Course deleted");
            entityManager.remove(tempCourse);
        }
    }
    @Override
    @Transactional
    public List<Course> getCourses() {
        List<Course> courses = entityManager.createQuery("from Course ", Course.class).getResultList();
        System.out.println(courses);
        return courses;
    }
}
