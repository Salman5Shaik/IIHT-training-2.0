package com.mvc.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mvc/collection/CollectionConfig.xml");
		
		Employee emp1 = (Employee) context.getBean("employee1");
		System.out.println(emp1.getEmployeeName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getCourses());
		System.out.println(emp1.getAddresses());
		System.out.println(emp1.getProps());

	}

}