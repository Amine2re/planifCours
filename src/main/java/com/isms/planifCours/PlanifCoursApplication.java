package com.isms.planifCours;

import com.isms.planifCours.domain.RegisterRequest;
import com.isms.planifCours.domain.User;
import com.isms.planifCours.domain.repository.UserRepository;
import com.isms.planifCours.services.AuthenticationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static com.isms.planifCours.domain.Role.ADMIN;
import static com.isms.planifCours.domain.Role.MANAGER;

@SpringBootApplication
@ComponentScan(basePackages = "com.isms.planifCours.*")
public class PlanifCoursApplication {

	private UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(PlanifCoursApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthenticationService service
	) {
		return args -> {
			var admin = RegisterRequest.builder()
					.firstname("Mouhamadoul")
					.lastname("Toure")
					.email("mouhamadoul2re@mail.com")
					.password("password")
					.role(ADMIN)
					.build();
			System.out.println("Admin token: " + service.register(admin).getAccessToken());

		/*	var manager = RegisterRequest.builder()
					.firstname("Admin")
					.lastname("Admin")
					.email("manager@mail.com")
					.password("password")
					.role(MANAGER)
					.build();
			System.out.println("Manager token: " + service.register(manager).getAccessToken());*/

		};
	}
}
