package com.qa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@PropertySource("classpath:application.properties")
@EnableJpaRepositories

public class App 
{
    public static void main(String[] args ) {

            SpringApplication.run(App.class, args);
    }
}
