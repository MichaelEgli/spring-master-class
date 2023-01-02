package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {

		System.out.println("Egli Scope");

		try (ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsScopeApplication.class)) {

			PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
			PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

			LOGGER.info("{} person", personDAO);
			LOGGER.info("{} person.getJdbcConnection", personDAO.getJdbcConnection());

			LOGGER.info("{} person2", personDAO2);
			LOGGER.info("{} person2.getJdbcConnection", personDAO2.getJdbcConnection());
		}
	}
}
