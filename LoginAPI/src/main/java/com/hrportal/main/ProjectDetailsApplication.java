package com.hrportal.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectDetailsApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProjectDetailsApplication.class, args);
		System.out.println("spring boot deployed successfully");
	}
}
