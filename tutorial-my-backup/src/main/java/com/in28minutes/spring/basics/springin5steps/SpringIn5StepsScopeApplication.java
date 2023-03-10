package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {

		System.out.println("Egli Scope");

		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);

		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{} person", personDAO);
		LOGGER.info("{} person.getJdbcConnection", personDAO.getJdbcConnection());

		LOGGER.info("{} person2", personDAO2);
		LOGGER.info("{} person2.getJdbcConnection", personDAO2.getJdbcConnection());
	}

}
