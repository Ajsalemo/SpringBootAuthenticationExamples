package com.server.springbootauth0mysql.Authentication;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
      .mvcMatchers(HttpMethod.GET, "/").permitAll() // GET requests don't need auth
      .anyRequest()
      .authenticated()
      .and()
      .oauth2ResourceServer()
      .jwt();
  }
}