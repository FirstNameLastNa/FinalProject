package com.cerner.FinalProject.SecurityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public UserDetailsService userDetailsService() {

        User.UserBuilder users = User.withDefaultPasswordEncoder();
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(users.username("user").password("cerner").roles("USER").build());
        manager.createUser(users.username("admin").password("cerner").roles("USER", "ADMIN").build());
        return manager;

    }
    
    protected void configure(HttpSecurity http) throws Exception {

        http			
                .httpBasic()
                .and()
                .authorizeRequests()
                //.antMatchers(HttpMethod.GET, "/statements/**").permitAll()
                //.antMatchers(HttpMethod.POST, "/statements/**").permitAll()
                .antMatchers(HttpMethod.GET, "/statements/**").hasRole("USER")
                .antMatchers(HttpMethod.POST, "/statements/**").hasRole("ADMIN")
                .and()
                .csrf().disable()
                .formLogin().disable();
    }
}