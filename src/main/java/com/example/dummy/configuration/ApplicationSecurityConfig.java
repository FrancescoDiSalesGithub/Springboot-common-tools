package com.example.dummy.configuration;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import org.springframework.security.core.userdetails.User;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;


@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter
{
    @Autowired
    DataSource dataSource;


    @Override
    protected void configure( AuthenticationManagerBuilder auth) throws Exception
    {
        /*
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .withUser(
                        User.withUsername("root")
                        .password("root")
                        .roles("ADMIN")
                        )
                .withUser(
                        User.withUsername("user")
                        .password("user")
                        .roles("USER")
                );*/

        auth.inMemoryAuthentication().withUser("root").roles("ADMIN").password(this.getPasswordEncoder().encode("root"));
        auth.inMemoryAuthentication().withUser("user").roles("USER").password(this.getPasswordEncoder().encode("user"));
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        http.authorizeRequests().
                antMatchers("/home").permitAll()
                .antMatchers("/user").hasAnyRole("USER","ADMIN")
                .antMatchers("/admin").hasRole("ADMIN").and().formLogin();
    }

    @Bean
    public PasswordEncoder getPasswordEncoder()
    {
        return new BCryptPasswordEncoder(10);
    }

}
