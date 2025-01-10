package com.backend.Backend.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.backend.Backend.model.Role;
import com.backend.Backend.model.User;
import com.backend.Backend.repository.UserRepository;

@Configuration
public class TestData {
  @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            var user = User.builder()
                    .email("test@test.com")
                    .password(passwordEncoder.encode("test123"))
                    .role(Role.USER)
                    .build();
            
            userRepository.save(user);
        };
    }
}
