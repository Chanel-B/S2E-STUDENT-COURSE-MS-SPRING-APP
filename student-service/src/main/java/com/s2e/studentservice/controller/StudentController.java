package com.s2e.studentservice.controller;

import com.s2e.studentservice.model.Student;
import com.s2e.studentservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping()
    public Collection<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @PostMapping("/")
    public Student studentService(@RequestBody Student student){// requestbody to save the data in our database
        return (Student) studentRepository.save(student);
    }

    //find student by id
    @GetMapping("/{id}")
    public Optional<Student> findStudentById(@PathVariable("id") int id){
        return studentRepository.findById(id);
    }

}
