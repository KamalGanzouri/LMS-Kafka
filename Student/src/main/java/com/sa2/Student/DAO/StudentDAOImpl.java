package com.sa2.Student.DAO;

import com.sa2.Student.Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{
    private final EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void postStudent(Student student) {
        entityManager.persist(student);
    }

    @Override
    @Transactional
    public void deleteStudent(int id) {
        Student student = getStudent(id);
        if (student!=null){
            System.out.println("Deleted student: " + student);
            entityManager.remove(student);
        }

    }

    @Override
    @Transactional
    public Student getStudent(int id) {
        Student student = entityManager.find(Student.class,id);
        if (student==null){
            System.out.println("This student id isn't in database");
        }else {
            System.out.println("Retrieved student: " + student);
        }
        return student;
    }

    @Override
    @Transactional
    public List<Student> getStudents() {
        return entityManager.createQuery("from Student ", Student.class).getResultList();
    }
}
