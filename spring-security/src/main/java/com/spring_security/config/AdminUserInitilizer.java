package com.spring_security.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.spring_security.entity.Users;
import com.spring_security.repository.UserDetailsRepository;

@Component
public class AdminUserInitilizer {

	@Bean
	public CommandLineRunner createAdminUser(UserDetailsRepository userRepository, PasswordEncoder passwordEncoder) {
		return args -> {
			if (userRepository.findByUsername("admin").isEmpty()) {
				Users admin = new Users();
				admin.setUsername("admin");
				admin.setPassword(passwordEncoder.encode("admin"));
				admin.setRole("ROLE_ADMIN");
				
				userRepository.save(admin);
				System.out.println("Default admin user created");
			}
		};
	}
	
}
