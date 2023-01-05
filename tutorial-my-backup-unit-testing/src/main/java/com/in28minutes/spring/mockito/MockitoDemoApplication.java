package com.in28minutes.spring.mockito;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MockitoDemoApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(MockitoDemoApplication.class);

	public static void main(String[] args) {

		System.out.println("Egli Mockito");

		try (ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(MockitoDemoApplication.class)) {

			LOGGER.info("{} hello");
		}
	}
}
