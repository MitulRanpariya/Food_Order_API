package com.project.Online.Food.Ordering.backend.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/**").permitAll() // Allow public access to /api/*
                .anyRequest().authenticated()) // Secure other endpoints
            .csrf(csrf -> csrf.disable()); // Disable CSRF for testing
        return http.build();
    }
}
