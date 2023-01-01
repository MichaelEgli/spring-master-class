package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class SpringIn5StepsXmlContextApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXmlContextApplication.class);

	public static void main(String[] args) {

		System.out.println("Egli XML");

		try (ClassPathXmlApplicationContext applicationContext = new
				ClassPathXmlApplicationContext("applicationContext.xml")) {

			XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);

			LOGGER.info("{} person", personDAO);
			LOGGER.info("{} person.getJdbcConnection", personDAO.getXmlJdbcConnection());
		}
	}
}
