package com.s2e.studentcourseservice.repository;

import com.s2e.studentcourseservice.model.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCourseRepository extends JpaRepository<StudentCourse, Integer> {

}
