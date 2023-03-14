package com.jsp.STUDENT.CRUD.REST.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.boot.controller")
@EntityScan(basePackages = "com.example.entity")
@EnableJpaRepositories(basePackages = "com.example.repository")
public class StudentCrudRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentCrudRestApiApplication.class, args);
	}

}
