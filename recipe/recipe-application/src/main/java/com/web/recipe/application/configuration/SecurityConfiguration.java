package com.web.recipe.application.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	http
    		.csrf().disable()
        	.authorizeRequests()
        	 	.antMatchers("/css/**").permitAll()
        	 	.antMatchers("/register").permitAll()
        	 	.antMatchers("/registermethod").permitAll()
        	 	.anyRequest().authenticated()        	 
	    	.and()
	    	 	.csrf().ignoringAntMatchers("/h2-console/**", "/registermethod", "/addrecipe")
		 	.and()
	    		.headers().frameOptions().sameOrigin() // h2-console access
			.and()
        .formLogin()
	        	.loginPage("/login").permitAll()
	        .and()
		        .logout().permitAll();
    }
    
    @Bean
    public PasswordEncoder passwordEncode() {
    	return new BCryptPasswordEncoder(12);
    }
}
