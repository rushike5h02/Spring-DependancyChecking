package com.none;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("none.xml");
		
		Employee employee = (Employee) context.getBean("e");
		
		employee.getAllEmployee();


	}

}
