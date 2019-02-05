package com.ihatebrooms.dnd.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@SpringBootApplication
@ComponentScan(basePackages = {"com.ihatebrooms.dnd"})
@EnableJpaRepositories("com.ihatebrooms.dnd.model.repository")
@EntityScan("com.ihatebrooms.dnd.model.schema")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}