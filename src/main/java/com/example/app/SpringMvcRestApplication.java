package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication( scanBasePackages = {"com.example"})
@EntityScan("com.example.*")
@EnableJpaRepositories("com.example.*")
public class SpringMvcRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcRestApplication.class, args);
    }
}

