package com.gcit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LmsApplication {
	private static final Logger logger = LoggerFactory.getLogger(LmsApplication.class);

	public static void main(String[] args) {
		logger.debug("this is a log message from the main class");
		SpringApplication.run(LmsApplication.class, args);
	}
}
