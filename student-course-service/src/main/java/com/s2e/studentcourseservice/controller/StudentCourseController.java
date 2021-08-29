package com.s2e.studentcourseservice.controller;

import com.s2e.studentcourseservice.model.StudentCourse;
import com.s2e.studentcourseservice.repository.StudentCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/studentcourses")
public class StudentCourseController {

    @Autowired
    StudentCourseRepository studentCourseRepository;

    @GetMapping
    Collection<StudentCourse> getAllStudentCourse(){
        return studentCourseRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<StudentCourse> getStudentCourseById(@PathVariable("id") int id){
        return studentCourseRepository.findById(id);
    }

    @PostMapping("/")
    StudentCourse saveStudentCourse(@RequestBody StudentCourse studentCourse){
        return studentCourseRepository.save(studentCourse);
    }

}
