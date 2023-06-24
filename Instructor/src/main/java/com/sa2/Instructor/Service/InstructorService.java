package com.sa2.Instructor.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sa2.Instructor.Entity.Course;
import com.sa2.Instructor.Entity.Instructor;

import java.util.List;

public interface InstructorService {
    void postInstructor (Instructor instructor);
    Instructor getInstructor(int id);
    List<Instructor> getInstructors();
    void deleteInstructor (int id);
}