package com.s2e.courseservice.controller;

import com.s2e.courseservice.model.Course;
import com.s2e.courseservice.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping
    Collection<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    @GetMapping("/{id}")
    Optional<Course> getCourseById(@PathVariable("id") int id){
        return courseRepository.findById(id);
    }

    @PostMapping("/")
    Course saveCourse(@RequestBody Course course){
        return courseRepository.save(course);
    }

}
