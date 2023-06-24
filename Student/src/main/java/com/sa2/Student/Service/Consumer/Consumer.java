package com.sa2.Student.Service.Consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sa2.Student.Entity.Course;
import com.sa2.Student.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
public class Consumer {
    private static final String courseTopic = "course";
    private final ObjectMapper objectMapper;

    private final CourseService courseService;
    @Autowired
    public Consumer(ObjectMapper objectMapper, CourseService courseService) {
        this.objectMapper = objectMapper;
        this.courseService = courseService;
    }
    @KafkaListener(topics = courseTopic)
    public void consumerMessage(String message)throws JsonProcessingException {
        Course course = objectMapper.readValue(message,Course.class);
        if(course.getId()!= 0){
            System.out.print("deleteCourse:: ");
            System.out.println("Instructor wants to delete course with this id: " + course.getId());
            courseService.deleteCourse(course);
        }else {
            System.out.print("postCourse:: ");
            System.out.println("Instructor added this course: " + course);
            courseService.postCourse(course);
        }

    }
}
