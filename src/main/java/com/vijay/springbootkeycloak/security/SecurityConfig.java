package com.vijay.springbootkeycloak.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http.csrf(t -> t.disable());
		
		http.authorizeHttpRequests(authorize -> {
			authorize.anyRequest().authenticated();
		});
		
		// Part 1
		/*
		 * http.oauth2ResourceServer(t -> { t.jwt(Customizer.withDefaults()); });
		 */
		
		// Part 2
		http.oauth2ResourceServer(t -> {
			t.opaqueToken(Customizer.withDefaults());
		});
		
		
		
		http.sessionManagement(
				t -> t.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		return http.build();
	}
}
