package com.example.demomicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DemomicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemomicroserviceApplication.class, args);
	}

}
