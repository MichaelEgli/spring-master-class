package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.properties.SomeExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
// app.properties
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsPropertiesApplication.class);

	public static void main(String[] args) {

		System.out.println("Egli Properties");

		try (ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class)) {

			SomeExternalService service = applicationContext.getBean(SomeExternalService.class);

			LOGGER.info("{} service", service);
			System.out.println("url: " + service.returnServiceURL());
		}
	}
}
