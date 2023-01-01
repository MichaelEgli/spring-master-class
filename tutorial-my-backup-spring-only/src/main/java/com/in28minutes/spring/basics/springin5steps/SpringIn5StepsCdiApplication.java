package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);

	public static void main(String[] args) {

		System.out.println("Egli Cdi");

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsCdiApplication.class);

		SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);

		LOGGER.info("{} cdi business, {}", business, business.getSomeCDIDAO());

	}

}
