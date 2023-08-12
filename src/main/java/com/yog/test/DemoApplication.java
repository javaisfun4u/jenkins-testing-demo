package com.yog.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {

	public static Logger log = LoggerFactory.getLogger(DemoApplication.class);

	@PostConstruct
	private void init() {
		log.info("App started............");
	}

	public static void main(String[] args) {
		log.info("App executed............");

		SpringApplication.run(DemoApplication.class, args);
	}

}
