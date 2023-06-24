package com.sa2.Instructor.DAO;

import com.sa2.Instructor.Entity.Instructor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InstructorDAOImpl implements InstructorDAO{
    private final EntityManager entityManager;

    @Autowired
    public InstructorDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Transactional
    public void postInstructor (Instructor instructor){
        entityManager.persist(instructor);
    }
    @Transactional
    public Instructor getInstructor(int id){
        Instructor instructor = entityManager.find(Instructor.class,id);
        if (instructor==null){
            System.out.println("This Course id isn't in database");
            return null;
        }else
            return instructor;
    }
    @Transactional
    public List<Instructor> getInstructors(){
        TypedQuery<Instructor> query = entityManager.createQuery("from Instructor",Instructor.class);
        return query.getResultList();
    }
    @Transactional
    public void deleteInstructor (int id){
        Instructor instructor = getInstructor(id);
        if (instructor==null){

        }else
            entityManager.remove(instructor);
    }

}
