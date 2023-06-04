package com.isms.planifCours;

import com.isms.planifCours.domain.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.isms.planifCours.*")
public class PlanifCoursApplication {

	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(PlanifCoursApplication.class, args);
	}
}
