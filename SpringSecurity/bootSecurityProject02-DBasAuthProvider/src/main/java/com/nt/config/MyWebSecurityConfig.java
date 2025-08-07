package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class MyWebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource ds;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.jdbcAuthentication().dataSource(ds).passwordEncoder(new BCryptPasswordEncoder())
				.usersByUsernameQuery("select uname ,password,status from users where uname=?")
				.authoritiesByUsernameQuery("select uname ,role from user_roles where uname=?");
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests().antMatchers("/").permitAll()
		   .antMatchers("/offers").authenticated()
		   .antMatchers("/balance").hasAnyAuthority("Manager", "Customer")
		   .antMatchers("/loan").hasAnyAuthority("Manager")
		// .and().httpBasic()
		   .and().formLogin()
		   .and().rememberMe()
		   .and().logout()
		   .and().exceptionHandling().accessDeniedPage("/denied")
		   .and().sessionManagement().maximumSessions(2).maxSessionsPreventsLogin(true);
	}
}
