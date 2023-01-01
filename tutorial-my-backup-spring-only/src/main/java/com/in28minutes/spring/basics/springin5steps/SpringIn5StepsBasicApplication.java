package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {

	// What are the beans? => @Component (BinarySearchImpl, BubbleSortAlgorithm)
	// What are the dependencies of a bean? => @Autowired (Interface sortAlgorithm)
	// What to search for beans => no need in this case because all beans/components are the package (and subpackages) of the main application class containing the @SpringBootApplication annotation

	public static void main(String[] args) {
		System.out.println("Egli");
		// try makes sure the application contexts is closed in case of an exception
		try (ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class)) {

			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
			int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
			System.out.println("binarySearch: " + binarySearch);
			System.out.println("binarySearch1: " + binarySearch1);
		}
	}
}
