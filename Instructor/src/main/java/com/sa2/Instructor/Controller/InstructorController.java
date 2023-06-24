package com.sa2.Instructor.Controller;

import com.sa2.Instructor.Entity.Instructor;
import com.sa2.Instructor.Service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instructor")
public class InstructorController {
    private final InstructorService instructorService;

    @Autowired
    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }
    @GetMapping("/{id}")
    public Instructor getInstructor(@PathVariable int id){
        return instructorService.getInstructor(id);
    }
    @GetMapping
    public List<Instructor> getInstructors(){
        return instructorService.getInstructors();
    }
    @PostMapping
    public void postInstructor (Instructor instructor){
        instructorService.postInstructor(instructor);
    }
    @DeleteMapping("/{id}")
    public void deleteInstructor (@PathVariable int id){
        instructorService.deleteInstructor(id);
    }
}
