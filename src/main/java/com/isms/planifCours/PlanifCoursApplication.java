package com.isms.planifCours;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;




@SpringBootApplication
@ComponentScan(basePackages = "com.isms.planifCours.*")
public class PlanifCoursApplication {


	public static void main(String[] args) {
		SpringApplication.run(PlanifCoursApplication.class, args);
	}

}
