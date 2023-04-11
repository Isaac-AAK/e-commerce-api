package com.iaktech.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.iaktech.*"})
@EntityScan(basePackages = {"com.iaktech.*"})
@EnableJpaRepositories(basePackages ={"com.iaktech.*"} )
public class ECommerceApplication {

	public static void main(String[] args) {
	 SpringApplication.run(ECommerceApplication.class, args);
	}

}
