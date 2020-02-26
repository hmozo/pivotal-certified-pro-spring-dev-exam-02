package com.appress.cems.scopes;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.appress.cems.config.AppConfig;

public class AppConfigTest {

	private Logger logger= LoggerFactory.getLogger(AppConfigTest.class);
	
	@Test
	void testBeanLifecycle() {
		ConfigurableApplicationContext ctx= 
				new AnnotationConfigApplicationContext(AppConfig.class);
		ctx.registerShutdownHook();
		
		Employee employee= ctx.getBean(Employee.class);
		assertNotNull(employee);
		
		Salary salary= employee.getSalary();
		assertNotNull(salary);
		logger.info("Salary bean actual type: {}", salary.getClass().toString());

		logger.info("Salary: {}", salary.getAmount());
		logger.info("Salary: {}", salary.getAmount());
		logger.info("Salary: {}", salary.getAmount());
	}
}
