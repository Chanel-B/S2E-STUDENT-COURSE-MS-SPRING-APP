package com.s2e.studentcourseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StudentCourseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentCourseServiceApplication.class, args);
		System.out.println("Student-Course Service Running...");
	}

}
