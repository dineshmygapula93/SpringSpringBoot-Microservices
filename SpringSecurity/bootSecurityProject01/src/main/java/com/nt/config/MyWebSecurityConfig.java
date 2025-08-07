  package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class MyWebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		/*
		 * auth.inMemoryAuthentication().withUser("Raja").password("{noop}raja").roles(
		 * "Customer").disabled(true);
		 * auth.inMemoryAuthentication().withUser("Rajesh").password("{noop}rajesh").
		 * roles("Manager", "Customer");
		 * auth.inMemoryAuthentication().withUser("Suresh").password("{noop}suresh").
		 * roles("Manager");
		 * auth.inMemoryAuthentication().withUser("Nagesh").password("{noop}nagesh").
		 * roles("Visitor");
		 */
		auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("Raja").password("$2a$10$PPT9PmT4b8wcgLpjBU6PCuRhIGR5azm3dq3oiaHR1jSw/ns1baJPK").roles("Customer").disabled(true);
		auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("Rajesh").password("$2a$10$/qtpo3R.3rY7p24YaQO2jO0JzhP4rfmzps4a8p3XHKAbtKEtzKsyO").roles("Manager", "Customer");
		auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("Suresh").password("$2a$10$NExoxiXA7CWJWRNmrLV31.7uocBd4iQPi0BTGi1mBfrcfoM/VBc5q").roles("Manager");
		auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("Nagesh").password("$2a$10$N93OzNn/wB0zZf4.K67W5.6C6n3hhdVVWDeeNkWV2RM7QvvQqOax2").roles("Visitor");
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests().antMatchers("/").permitAll().antMatchers("/offers").authenticated()
				.antMatchers("/balance").hasAnyRole("Manager", "Customer").antMatchers("/loan").hasAnyRole("Manager")
				// .and().httpBasic()
				.and().formLogin().and().logout().and().exceptionHandling().accessDeniedPage("/denied").and()
				.sessionManagement().maximumSessions(2).maxSessionsPreventsLogin(true);
	}
}
