package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.example.model")
@EnableJpaRepositories("com.example.repository")
@ComponentScan(value={"com.example.serviceimpl","com.example.controller"})
public class SpringMvcRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcRestApplication.class, args);
	}

}
