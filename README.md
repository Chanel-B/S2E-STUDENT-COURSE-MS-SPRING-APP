# S2E-STUDENT-COURSE-MS-SPRING-APP

This Project associate students to the different course they study.

STUDENT COURSE 
	WITH SPRING BOOT JPA

 		*MICROSERVICES 

 			-STUDENT SERVICE
 			-COURSE SERVICE
 			-STUDENT-COURSE SERVICE
 			-API-SERVICE
 			-REGITRY SERVICE

 		* DEPENDENCIES

 			-Spring Web (WEB)
 			-Spring Data JPA (SQL)
 			-H2 Database (SQL)
 			-Lombok (DEVELOPER TOOLS)
 			-Eureka Discovery Client (SPRING CLOUD DISCOVERY)

 		*RELATIONS
	 					one       many         one         one
	 		STUDENT -- ( 1 ) ----( n )-- X -- ( 1 ) --X-- ( 1 ) -- STUDENT-COURSE

	 						   one       many         one         one
	 		STUDENT-COURSE -- ( 1 ) ----( 1 )-- X -- ( n ) --X-- ( 1 ) -- COURSE 

	 	*ATTRIBUTES
	 		
	 		$STUDENT
	 			-id
	 			-name
	 			-surname
	 			-mail
	 			-studentcourseId

	 		$STUDENT-COURSE
	 			-id
	 			-studentId
	 			-courseId

	 		$COURSE
	 			-id
	 			-name
	 			-description
	 			-credits
	 			-studentcourseId
	 	*PORTS
	 		-STUDENT SERVICE			= 8880
	 		-REGISTRY-SERVICE 			= 8881
	 		-STUDENT-COURSE SERVICE 	= 8882
	 		-COURSE SERVICE				= 8883
	 		-API-SERVICE 				= 8884

TODO 
	-Add data.sql STUDENT-COURSE SERVICE
	-Create communication to external service
	-Try all service with API-GATEWAY service


