package com.GestionEmploye.Gest.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    	PasswordEncoder encoder = passwordEncoder();
         
    	
    	auth
          .inMemoryAuthentication()
          .withUser("admin")
          .password(encoder.encode("admin"))
          .roles("ADMIN");
    }
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			    .authorizeRequests()
				.anyRequest().authenticated()
				.and()
			    .formLogin()
//     			.loginPage("/login")
				.permitAll()
				.and()
			    .logout()
				.permitAll();
	}

	@Bean 
	protected PasswordEncoder passwordEncoder() { 
	    return new BCryptPasswordEncoder(); 
	}

}
