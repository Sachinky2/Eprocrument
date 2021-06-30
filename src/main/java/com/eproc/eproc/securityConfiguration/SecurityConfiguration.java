package com.eproc.eproc.securityConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//set your configuration on the auth object
		
		auth.inMemoryAuthentication()
			.withUser("admin")
			.password("admin")
			.roles("ADMIN")
			.and()
			.withUser("seller")
			.password("seller")
			.roles("USER");
			
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		
		//Need to replace the password Encoder in future
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		
		http.csrf().disable().authorizeRequests()
		.antMatchers(HttpMethod.POST,"/users")
		.permitAll()
		.anyRequest().authenticated();
//		http.authorizeRequests()
//		.antMatchers("/").permitAll();
//			.antMatchers("/**").hasRole("ADMIN")
//			.antMatchers("/**").permitAll()
//			.and().formLogin();
	}
}
