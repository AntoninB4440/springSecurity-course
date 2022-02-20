package com.antonin.springSecurity.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
                authorizeRequests()
                .antMatchers("/","index","/css/*","/js/*").permitAll()//Authorize request to be made
                .anyRequest() //AnyRequest made
                .authenticated() //must be authenticated
                .and()
                .httpBasic(); //Using Basic Authentication
    }
}
