package com.sa2.Instructor.Service.Producer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sa2.Instructor.Entity.Course;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {
    private static final String courseTopic = "course";
    private final ObjectMapper objectMapper;
    private final KafkaTemplate<String,String> kafkaTemplate;

    public Producer(ObjectMapper objectMapper, KafkaTemplate<String, String> kafkaTemplate) {
        this.objectMapper = objectMapper;
        this.kafkaTemplate = kafkaTemplate;
    }

    public void addCourse(Course course)throws JsonProcessingException {

        String courseAsMessage = objectMapper.writeValueAsString(course);
        kafkaTemplate.send(courseTopic, courseAsMessage);

    }

    public void deleteCourse(Course course)throws JsonProcessingException {
        String courseAsMessage = objectMapper.writeValueAsString(course);
        kafkaTemplate.send(courseTopic, courseAsMessage);
    }
}
