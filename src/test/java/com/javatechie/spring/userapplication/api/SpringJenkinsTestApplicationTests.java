package com.javatechie.spring.userapplication.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringJenkinsTestApplicationTests {

	 Logger logger=LoggerFactory.getLogger(SpringJenkinsTestApplicationTests.class);
	@Test
	public void contextLoads() {
       logger.info("I am in SpringJenkinsTestApplicationTests");
       
       logger.info("I am in SpringJenkinsTestApplicationTests 1111");
       assertEquals(true, true);
	}

}
