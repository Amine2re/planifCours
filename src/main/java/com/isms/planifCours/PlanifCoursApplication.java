package com.isms.planifCours;

import com.isms.planifCours.domain.User;
import com.isms.planifCours.domain.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@ComponentScan(basePackages = "com.isms.planifCours.*")
public class PlanifCoursApplication implements Runnable{

	private UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(PlanifCoursApplication.class, args);
	}

	@Override
	public void run() {
		System.out.println("run executed ....");
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String password = passwordEncoder.encode("nam2020");

		User newUser = new User("mouhamadoul2re@hotmail.com", password);
		User savedUser = userRepository.save(newUser);
	}
}
