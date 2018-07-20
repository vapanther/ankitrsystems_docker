package com.Producer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ProducerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}
}
