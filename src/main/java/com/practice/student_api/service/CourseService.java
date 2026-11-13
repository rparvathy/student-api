package com.practice.student_api.service;

import com.practice.student_api.entity.Course;
import com.practice.student_api.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }
    public Course addCourse(Course course){
        return courseRepository.save(course);
    }

}
