package com.product.sale.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AdminConfig {
	@Bean
	public UserDetailsService userDetailService(PasswordEncoder encoder) {

		UserDetails admin = User.withUsername("Admin").password(encoder.encode("Admin1234")).roles("ADMIN").build();
		UserDetails user = User.withUsername("User").password(encoder.encode("User1234")).roles("USER").build();

		return new InMemoryUserDetailsManager(admin, user);

	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http.csrf().disable().authorizeHttpRequests().requestMatchers("/product/get", "/product/getById/**")
				.permitAll().and().authorizeHttpRequests().requestMatchers("/product/**").authenticated().and()
				.formLogin().and().build();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
