package com.javatechie.spring.userapplication.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsTestApplication {
 //Logger logger=LoggerFactory.getLogger(SpringJenkinsTestApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsTestApplication.class, args);
	}
	@PostConstruct
	public void printData()
	{
		logger.info("I am in printData");
		logger.info("I am in printData");
	}

}
