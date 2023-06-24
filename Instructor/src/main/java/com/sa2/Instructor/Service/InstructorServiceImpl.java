package com.sa2.Instructor.Service;

import com.sa2.Instructor.DAO.InstructorDAO;
import com.sa2.Instructor.Entity.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorServiceImpl implements InstructorService{
    InstructorDAO instructorDAO;

    @Autowired
    public InstructorServiceImpl(InstructorDAO instructorDAO) {
        this.instructorDAO = instructorDAO;
    }

    public void postInstructor (Instructor instructor){
        instructorDAO.postInstructor(instructor);
    }
    public Instructor getInstructor(int id){
        return instructorDAO.getInstructor(id);
    }
    public List<Instructor> getInstructors(){
        return instructorDAO.getInstructors();
    }
    public void deleteInstructor (int id){
        instructorDAO.deleteInstructor(id);
    }


}
