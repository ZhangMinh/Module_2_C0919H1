package com.codegym.quanlytinh_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.codegym.quanlytinh_jpa.repository")
@SpringBootApplication
public class QuanlytinhJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run ( QuanlytinhJpaApplication.class, args );
    }

}
