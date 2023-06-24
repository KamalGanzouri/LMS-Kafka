package com.sa2.Instructor.DAO;

import com.sa2.Instructor.Entity.Instructor;

import java.util.List;

public interface InstructorDAO {
    void postInstructor (Instructor instructor);
    Instructor getInstructor(int id);
    List<Instructor> getInstructors();
    void deleteInstructor (int id);
}
